(ns entities.physicist
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic
         types
         properties))

(fact "term" "physicist")

(fact main-type-gnd "physicist" "term")

(fact subclass-of "physicist" "scientist")

(fact instance-of "physicist" "profession")

(fact field-of-this-profession "physicist" "physics")

(fact commons-category "physicist" "Physicists")

(fact bncf-thesaurus "physicist" "28902")

