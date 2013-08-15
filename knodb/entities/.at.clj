(ns entities..at
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic
         types
         properties))

(fact "term" ".at")

(fact instance-of ".at" "country code top-level domain")

(fact country ".at" "Austria")

(fact main-type-gnd ".at" "term")

