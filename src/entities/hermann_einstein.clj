(ns entities.hermann-einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic
         types
         properties))

(fact Person "Hermann Einstein")

(fact place-of-birth "Hermann Einstein" "Bad Buchau")

(fact place-of-death "Hermann Einstein" "Milan")

(fact main-type-gnd "Hermann Einstein" "person")

(fact sex "Hermann Einstein" "male")

(fact child "Hermann Einstein" "Albert Einstein")

(fact country-of-citizenship "Hermann Einstein" "Germany")

