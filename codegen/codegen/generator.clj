(ns codegen.generator
  (:require [http.async.client :as http])
  (:require [cheshire.core :refer :all])
  (:require [clojure.string :as string]))

(defn fname [name]
  (.replaceAll
    (.replaceAll
      (.replaceAll
        (.replaceAll
          (.replaceAll
            (.replaceAll
              (.replaceAll
                (.replaceAll
                  (.replaceAll (.toLowerCase name) " " "_")
                "\\(" "")
              "\\)" "")
            "," "")
          "/" "_")
        "\\." "_")
      "\\+" "_")
    ":" "_")
  "^class$" "clazz"))

(defn dname [name]
  (.replaceAll
    (.replaceAll
      (.replaceAll
        (.replaceAll
          (.replaceAll
            (.replaceAll
              (.replaceAll
                (.replaceAll
                  (.replaceAll (.toLowerCase name) " " "-")
                "\\(" "")
              "\\)" "")
            "," "")
          "/" "_")
        "\\." "_")
      "\\+" "_")
    ":" "_")
  "^class$" "clazz"))

(defn tname [name]
  (string/capitalize (dname name)))

(defn write-types [depth type]
  (if-not (or (> depth 1) (nil? type))
    (with-open [w (clojure.java.io/writer  "src/meta/types.clj" :append true)]
      (.write w (str "\n(defrel " (tname type) " name)\n")))))

(defn write-properties [depth property subject object]
  (if-not (or (> depth 2) (nil? property))
    (with-open [w (clojure.java.io/writer  "src/meta/properties.clj" :append true)]
      (.write w (str "\n(defrel " (dname property) " " subject " " object ")\n")))))

(defn write-entity [depth name type statements]
  (if-not (or (> depth 1) (nil? name) (nil? type))
    (with-open [w (clojure.java.io/writer  (str "src/entities/" (fname name) ".clj") :append false)]
      (.write w (str "(ns entities." (dname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic\n")
      (.write w "         meta.types\n")
      (.write w "         meta.properties))\n\n")
      (.write w (str "(fact " (tname type) " \"" name "\")\n\n"))
      (doseq [stat statements]
        (doseq [fact (second stat)]
          (.write w (str "(fact " (dname (first stat)) " \"" name "\" \"" fact "\")\n\n")))))))

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
  (let [id (get-in claim ["mainsnak" "datavalue" "value" "numeric-id"])
        prefix "q"]
    (str prefix id)))

(defn type-id-of [data]
  (get-entity-id (first (get-in data ["claims" "p107"]))))

(def ftable (atom {}))

(defn register [t f]
  (swap! ftable assoc t f))

(defn func-for [type]
  (if-let [entry (find @ftable type)]
    (val entry)
    (do
      (println "-----------------\n" type "\n-----------------" )
      #(get-type %3))))

(def namecache (atom {}))

(defn fetch [lang id]
  (with-open [client (http/create-client)]
    (let [response (http/GET client
        (str "http://www.wikidata.org/w/api.php?action=wbgetentities&ids=" id "&format=json&languages=" lang))]
      (get-in (parse-string (-> response
        http/await
        http/string)) ["entities" id]))))

(defn genv [depth lang claim-array]
  (vec (doall (for [claim claim-array]
    (let [type (get-type claim)]
      ((func-for type) depth lang claim))))))

(defn genp [depth lang id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if (> depth 2)
      id
      (let [data   (fetch lang id)
            name   (get-in data ["labels" lang "value"])
            descr  (get-in data ["descriptions" lang"value"])]
        (swap! namecache assoc id name)
        (write-properties depth name "subj" "obj")
        name))))

(defn genq [depth lang id]
  (if-let [entry (find @namecache id)]
    (val entry)
    (if (> depth 2)
      id
      (let [data   (fetch lang id)
            label  (get (get (get data "labels") lang) "value")
            descr  (get (get (get data "descriptions") lang) "value")
            name   (if-not (nil? label) label (get-in data ["sitelinks" (str lang "wiki") "title"]))
            tid    (type-id-of data)
            type   (if-let [tentry (find @namecache tid)]
                     (val tentry)
                     (let [tn (genq (inc depth) lang tid)]
                       (write-types depth tn)
                       (if tn tn "term")))
            claims (get data "claims")]
        (swap! namecache assoc id name)
        (write-entity depth name type (for [idclaim claims]
          (let [pkey (genp (inc depth) lang (key idclaim))
                pval (genv (inc depth) lang (val idclaim))]
            (println name "\t-\t" pkey  "\t-\t" pval)
            [pkey pval])))
        name))))

(register "time" #(get-time %3))
(register "globecoordinate"  #(get-geo-pos %3))
(register "string" #(get-value %3))
(register "wikibase-entityid" #(genq %1 %2 (get-entity-id %3)))

