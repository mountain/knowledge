(ns knodb.db
  (:require [clojure.core.logic.pldb :as pldb]))

; dictionaries for names and descriptions in different languages
(def ^{:private true} langs [:en :de :ja :es :fr :pt :ru :zh-cn :zh-tw])
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


; Primitives to define different entities
; following OWL's terminology
(defn Individual [id names aliases descrs & more]
  (db [individual id]))

(defn Class [id names aliases descrs & more]
  (db [class id]))

(defn Property [id names aliases descrs & more]
  (db [property id]))


; Default depth
(def ^{:private true} depth 0)

; Primitives for loading
(defn- load [limits depth entry]
  (if-not (> depth limits)
    (use entry)))

; Claim statements with auto-loading
; loading with different plocies for properties, individuals and classes
(defn claim [subj pred obj]
  (load 6 (inc depth) pred)
  (load 6 (inc (inc depth)) obj)
  (statement subj pred obj))

