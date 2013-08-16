(ns knodb.db
  (:use pldb))

; dictionaries for names and descriptions in different languages
(def ^{:private true} langs [:en :de :ja :es :fr :pt :ru :zh-hans :zh-hant])
(def ^{:private true} names (zipmap langs (map #(atom {}) langs)))
(def ^{:private true} aliases (zipmap langs (map #(atom {}) langs)))
(def ^{:private true} descrs (zipmap langs (map #(atom {}) langs)))
(def ^{:private true} kinds #(atom {}))

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

; An empty db
(def ^{:private true} db pldb/empty-db)

; primitives to define different entities
; following OWL's terminology
(defn Individual [id names aliases descrs & more]
  ((pldb/db-fact individual id) db)
  (swap! kinds assoc id "individual")
  (doseq [[lang lname] (apply array-map names)]
    (swap! (get names lang) assoc id lname))
  (doseq [[lang lalias] (apply array-map aliases)]
    (swap! (get aliases lang) assoc id lalias))
  (doseq [[lang ldescr] (apply array-map descrs)]
    (swap! (get descrs lang) assoc id ldescr)))

(defn Class [id names aliases descrs & more]
  ((pldb/db-fact class id) db)
  (swap! kinds assoc id "class")
  (doseq [[lang lname] (apply array-map names)]
    (swap! (get names lang) assoc id lname))
  (doseq [[lang lalias] (apply array-map aliases)]
    (swap! (get aliases lang) assoc id lalias))
  (doseq [[lang ldescr] (apply array-map descrs)]
    (swap! (get descrs lang) assoc id ldescr)))

(defn Property [id names aliases descrs & more]
  ((pldb/db-fact property id) db)
  (swap! kinds assoc id "property")
  (doseq [[lang lname] (apply array-map names)]
    (swap! (get names lang) assoc id lname))
  (doseq [[lang lalias] (apply array-map aliases)]
    (swap! (get aliases lang) assoc id lalias))
  (doseq [[lang ldescr] (apply array-map descrs)]
    (swap! (get descrs lang) assoc id ldescr)))

(def ^{:private true} db pldb/empty-db)

; loading with different plocies for properties, individuals and classes
(defn- load [limits depth entry])

; claim statements with auto-loading
(defn claim [subj pred obj]
  (load pred)
  (load obj)
  (statement subj pred obj))
