(ns entities.person
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic
         meta.types
         meta.properties))

(fact Term "person")

(fact main-type-gnd "person" "term")

(fact mesh-code "person" "M")

