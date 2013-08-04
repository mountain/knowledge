(ns entities.franklin-medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic
         types
         properties))

(fact "term" "Franklin Medal")

(fact subclass-of "Franklin Medal" "award")

(fact named-after "Franklin Medal" "Benjamin Franklin")

