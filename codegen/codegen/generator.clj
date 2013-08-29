(ns codegen.generator
  (:require [http.async.client :as http])
  (:require [cheshire.core :refer :all])
  (:require [clojure.string :as string]))

(defn fname [label]
  (.replaceAll
    (.replaceAll
      (.replaceAll
        (.replaceAll
          (.replaceAll
            (.replaceAll
              (.replaceAll
                (.replaceAll
                  (.replaceAll
                    (.replaceAll (.toLowerCase label) " " "_")
                  "-" "_")
                "\\(" "")
              "\\)" "")
            "," "")
          "/" "_")
        "\\." "_")
      "\\+" "_")
    ":" "_")
  "^class$" "clazz"))

(defn dname [label]
  (.replaceAll
    (.replaceAll
      (.replaceAll
        (.replaceAll
          (.replaceAll
            (.replaceAll
              (.replaceAll
                (.replaceAll
                  (.replaceAll (.toLowerCase label) " " "-")
                "\\(" "")
              "\\)" "")
            "," "")
          "/" "_")
        "\\." "_")
      "\\+" "_")
    ":" "_")
  "^class$" "clazz"))

(defn rm-punct [text]
  (if-not (nil? text)
    (.replaceAll text "\"" "")))

(def pkgtable (atom {}))

(defn package-of [name] (if-let [result (find @pkgtable name)] (second result)))

(defn set-package [name pkg] (swap! pkgtable assoc name pkg))

(defn tname [label]
  (string/capitalize (dname label)))

(defn write-kinds [depth kind]
  (if-not (or (> depth 6) (nil? kind))
    (with-open [w (clojure.java.io/writer  "knodb/meta/meta.clj" :append true)]
      (.write w (str "\n(defrel " (tname kind) " name)\n")))))

(defn write-properties [depth name names descrs]
  (if-not (or (> depth 6) (nil? name))
    (with-open [w (clojure.java.io/writer  (str "knodb/properties/" (fname name) ".clj") :append false)]
      (.write w (str "(ns properties." (fname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic)\n")
      (.write w "   (:use meta.meta)")
      (.write w ")\n")
      (.write w (str "\n(fact Property \"" (dname name) "\")\n\n"))
      (doseq [[lang lname] names]
        (.write w (str "(name-as-in \"" (dname name) "\" \"" lname "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [[lang descr] descrs]
        (.write w (str "(descr-as-in \"" (dname name) "\" \"" (rm-punct descr) "\" \"" lang "\")\n")))
      (.write w "\n"))))

(defn write-clazz [depth name names descrs kind parents statements]
  (if-not (or (> depth 4) (nil? name) (nil? kind))
    (with-open [w (clojure.java.io/writer (str "knodb/clazzes/" (fname name) ".clj") :append false)]
      (.write w (str "(ns clazzes." (fname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic)\n")
      (.write w "   (:use meta.meta)")
      (.write w ")\n\n")
      (.write w (str "(fact " (tname kind) " \"" name "\")\n\n"))
      (doseq [[lang lname] names]
        (.write w (str "(name-as-in \"" name "\" \"" lname "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [[lang descr] descrs]
        (.write w (str "(descr-as-in \"" name "\" \"" (rm-punct descr) "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [stat statements]
        (.write w (str "\n(refer-to [\"properties." (fname (first stat)) "\"])\n"))
        (doseq [fact (second stat)]
          (if-not (nil? (package-of fact))
            (.write w (str "(refer-to [\"" (package-of fact) "." (fname fact) "\"])\n")))
          (.write w (str "(fact claim \"" name "\" \"" (dname (first stat)) "\" \"" fact "\")\n")))))))

(defn write-entity [depth name names descrs kind clazzes statements]
  (if-not (or (> depth 4) (nil? name) (nil? kind))
    (with-open [w (clojure.java.io/writer  (str "knodb/entities/" (fname name) ".clj") :append false)]
      (.write w (str "(ns entities." (fname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic)\n")
      (.write w "   (:use meta.meta)")
      (if-not (or (nil? clazzes) (empty clazzes))
        (do
          (.write w "\n")
          (.write w "   (:use [" (string/join " " (map #(str "clazzes." %) clazzes)) "])")))
      (if-not (or (nil? statements) (empty statements))
        (doseq [stat statements]
          (.write w "\n")
          (.write w (str "   (:use properties." (fname (first stat)) ")"))))
      (.write w ")\n\n")
      (.write w (str "(fact " (tname kind) " \"" name "\")\n\n"))
      (doseq [[lang lname] names]
        (.write w (str "(name-as-in \"" name "\" \"" lname "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [[lang descr] descrs]
        (.write w (str "(descr-as-in \"" name "\" \"" (rm-punct descr) "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [stat statements]
        (.write w (str "\n(refer-to [\"properties." (fname (first stat)) "\"])\n"))
        (doseq [fact (second stat)]
          (if-not (nil? (package-of fact))
            (.write w (str "(refer-to [\"" (package-of fact) "." (fname fact) "\"])\n")))
          (.write w (str "(fact claim \"" name "\" \"" (dname (first stat)) "\" \"" fact "\")\n")))))))

(defn get-title [lang data]
  (get-in data ["sitelinks" (str lang "wiki") "title"]))

(defn get-name [lang data]
  (if-let [name (get-in data ["labels" lang "value"])]
    name
    (get-in data ["sitelinks" (str lang "wiki") "title"])))

(defn get-names [langs data]
  (zipmap langs (map #(get-name % data) langs)))

(defn get-descrs [langs data]
  (zipmap langs (map #(get-in data ["descriptions" % "value"]) langs)))

(defn get-type [claim]
  (get-in claim ["mainsnak" "datavalue" "type"]))

(defn get-time [claim]
  (get-in claim ["mainsnak" "datavalue" "value" "time"]))

(defn get-value [claim]
  (get-in claim ["mainsnak" "datavalue" "value"]))

(defn get-geo-pos [claim]
  (let [value (get-in claim ["mainsnak" "datavalue" "value"])]
    (str
      "lng " (get value "longitude")
      " lat " (get value "latitude")
      " alt " (get value "altitude"))))

(defn get-entity-id [claim]
  (if-let [id (get-in claim ["mainsnak" "datavalue" "value" "numeric-id"])]
    (str "Q" id)))

(defn kind-of [data]
  (get-entity-id (first (get-in data ["claims" "p107"]))))

(defn clazzes-of [data]
  (map get-entity-id (get-in data ["claims" "p31"])))

(defn parents-of [data]
  (map get-entity-id (get-in data ["claims" "p279"])))

(def ftable (atom {}))

(defn register [t f]
  (swap! ftable assoc t f))

(defn func-for [kind]
  (if-let [entry (find @ftable kind)]
    (val entry)
    (do
      (println "-----------------\n" kind "\n-----------------" )
      #(get-type %2))))

(def namecache (atom {}))

(def languages ["en" "de" "ja" "es" "fr" "pt" "ru" "zh-hans" "zh-hant"])

(defn fetch [id]
  (if-not (nil? id)
    (with-open [client (http/create-client)]
      (let [response (http/GET client
        (str "https://www.wikidata.org/wiki/Special:EntityData/" (string/capitalize id) ".json"))]
        (parse-string (-> response
          http/await
          http/string))))))

(defn resolve-entity [generator writer default depth id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if-let [tn (generator depth id)]
      (do (writer depth tn) tn)
      default)))

(defn genv [depth claim-array]
  (vec (doall (for [claim claim-array]
    (let [kind (get-type claim)]
      ((func-for kind) depth claim))))))

(defn genp [depth id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if (> depth 6)
      id
      (let [data   (fetch id)
            name    (get-name "en" data)
            names   (get-names languages data)
            descrs  (get-descrs languages data)]
        (swap! namecache assoc id name)
        (set-package name "properties")
        (write-properties depth name names descrs)
        name))))

(defn expand-claims [depth name claims]
  (for [idclaim claims]
    (let [pkey (genp depth (key idclaim))
          pval (genv depth (val idclaim))]
      (println name "\t-\t" pkey  "\t-\t" pval)
    [pkey pval])))

(defn genq [depth id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if (> depth 6)
      id
      (let [data    (fetch id)
            name    (get-name "en" data)
            names   (get-names languages data)
            descrs  (get-descrs languages data)
            kid     (kind-of data)
            kind    (resolve-entity genq write-kinds "term" (inc depth) kid)
            cids    (clazzes-of data)
            clazzes (map #(resolve-entity genq write-clazz %1 (inc depth) %1) cids)
            pids    (parents-of data)
            parents (map #(resolve-entity genq write-clazz %1 (inc depth) %1) pids)
            claims  (expand-claims (inc (inc depth)) name (get data "claims"))]
        (if-not (nil? name)
          (do
            (swap! namecache assoc id name)
            (if-not (or (= kind "term") (not (empty parents)))
              (do
                (set-package name "entities")
                (write-entity depth name names descrs kind clazzes claims))
              (do
                (set-package name "clazzes")
                (write-clazz depth name names descrs kind parents claims)))
            name)
          id)))))

(register "time" #(get-time %2))
(register "globecoordinate"  #(get-geo-pos %2))
(register "string" #(get-value %2))
(register "wikibase-entityid" #(genq %1 (get-entity-id %2)))

