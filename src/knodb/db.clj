(ns knodb.db
  (:use pldb))

; dictionaries for names and descriptions in different languages
(def langs [:en :de :ja :es :fr :pt :ru :zh-hans :zh-hant])
(def names (zipmap langs (map #(atom {}) langs)))
(def descrs (zipmap langs (map #(atom {}) langs)))

; Follow OWL's terminology
; http://www.w3.org/TR/owl-guide/
; http://en.wikipedia.org/wiki/Web_Ontology_Language
(pldb/db-rel individual name)
(pldb/db-rel class name)
(pldb/db-rel property name)
(pldb/db-rel statement subj pred obj)

; try to express qualifiers and statements with qualifiers
(pldb/db-rel qualifier name)
(pldb/db-rel statement-with subj pred obj qualif)

(defn Individual [id names descrs & more]
  (individual id)
  (doseq [[lang lname] (apply array-map names)]
    (swap! (get names lang) assoc id lname))
  (doseq [[lang ldescr] (apply array-map descrs)]
    (swap! (get descrs lang) assoc id ldescr)))

(defn Class [id names descrs & more]
  (class id)
  (doseq [[lang lname] (apply array-map names)]
    (swap! (get names lang) assoc id lname))
  (doseq [[lang ldescr] (apply array-map descrs)]
    (swap! (get descrs lang) assoc id ldescr)))

(defn Property [id names descrs kinds & more]
  (property id)
  (doseq [[lang lname] (apply array-map names)]
    (swap! (get names lang) assoc id lname))
  (doseq [[lang ldescr] (apply array-map descrs)]
    (swap! (get descrs lang) assoc id ldescr)))
