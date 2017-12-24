(ns codegen.crawler
  (:require [clj-http.client :as http])
  (:require [clj-http.cookies :as cookies])
  (:require [cheshire.core :refer :all])
  (:require [clojure.string :as string])
  (:require [codegen.parser :as parser])
  (:require [codegen.generator :as gen]))

(def cs (cookies/cookie-store))

(def ftable (atom {}))

(defn register [t f]
  (swap! ftable assoc t f))

(defn func-for [kind]
  (if-let [entry (find @ftable kind)]
    (val entry)
    (do
      (println "-----------------\n" kind "\n-----------------" )
      #(parser/get-type %2))))

(def namecache (atom {}))

(def languages ["en" "de" "ja" "es" "fr" "pt" "ru" "zh-cn" "zh-sg" "zh-tw" "zh-hk"])

(defn fetch [id]
  (if-not (nil? id)
    (let [{:keys [status headers body error] :as resp}
          (http/get (str "https://www.wikidata.org/wiki/Special:EntityData/" (string/capitalize id) ".json") {:cookie-store cs})]
      (if-not error (do (println "get" id) (get-in (parse-string body) ["entities" id]))))))

(defn resolve-entity [generator writer default depth id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if-let [tn (generator depth id)]
      (do (writer depth tn) tn)
      default)))

(defn visit-claims [depth claim-array]
  (vec (doall (for [claim claim-array]
    (let [kind (parser/get-type claim)]
      ((func-for kind) depth claim))))))

(defn visit-property [depth id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if (> depth 6)
      id
      (let [data   (fetch id)
            name    (parser/get-name "en" data)
            names   (parser/get-names languages data)
            descrs  (parser/get-descrs languages data)]
        (swap! namecache assoc id name)
        (gen/set-package name "properties")
        (gen/write-properties depth name names descrs)
        name))))

(defn expand-claims [depth name claims]
  (for [idclaim claims]
    (let [pkey (visit-property depth (key idclaim))
          pval (visit-claims depth (val idclaim))]
      (println name "\t-\t" pkey  "\t-\t" pval)
    [pkey pval])))

(defn visit-entity [depth id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if (> depth 3)
      id
      (let [data    (fetch id)
            name    (parser/get-name "en" data)
            names   (parser/get-names languages data)
            descrs  (parser/get-descrs languages data)
            kid     (parser/kind-of data)
            kind    (resolve-entity visit-entity gen/write-kinds "term" (inc depth) kid)
            cids    (parser/clazzes-of data)
            clazzes (map #(resolve-entity visit-entity gen/write-clazz %1 (inc depth) %1) cids)
            pids    (parser/parents-of data)
            parents (map #(resolve-entity visit-entity gen/write-clazz %1 (inc depth) %1) pids)
            claims  (expand-claims (inc (inc depth)) name (get data "claims"))]
        (if-not (nil? name)
          (do
            (swap! namecache assoc id name)
            (if-not (or (= kind "Term") (not (empty parents)))
              (do
                (gen/set-package name "entities")
                (gen/write-entity depth name names descrs kind clazzes claims))
              (do
                (gen/set-package name "clazzes")
                (gen/write-clazz depth name names descrs kind parents claims)))
            name)
          name)))))

(register "time" #(parser/get-time %2))
(register "globecoordinate"  #(parser/get-geo-pos %2))
(register "string" #(parser/get-value %2))
(register "wikibase-entityid" #(visit-entity %1 (parser/get-entity-id %2)))

