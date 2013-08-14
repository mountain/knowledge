(ns entities.elsa-einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Elsa Einstein")

(name-as-in "Elsa Einstein" "" "zh-hant")
(name-as-in "Elsa Einstein" "" "zh-hans")
(name-as-in "Elsa Einstein" "Эльза Эйнштейн" "ru")
(name-as-in "Elsa Einstein" "Elsa Einstein" "pt")
(name-as-in "Elsa Einstein" "Elsa Einstein" "fr")
(name-as-in "Elsa Einstein" "Elsa Einstein" "es")
(name-as-in "Elsa Einstein" "" "ja")
(name-as-in "Elsa Einstein" "Elsa Einstein" "de")
(name-as-in "Elsa Einstein" "Elsa Einstein" "en")

(descr-as-in "Elsa Einstein" "" "zh-hant")
(descr-as-in "Elsa Einstein" "" "zh-hans")
(descr-as-in "Elsa Einstein" "" "ru")
(descr-as-in "Elsa Einstein" "" "pt")
(descr-as-in "Elsa Einstein" "" "fr")
(descr-as-in "Elsa Einstein" "" "es")
(descr-as-in "Elsa Einstein" "" "ja")
(descr-as-in "Elsa Einstein" "zweite Frau von Albert Einstein" "de")
(descr-as-in "Elsa Einstein" "" "en")

(fact claim "Elsa Einstein" "lccn-identifier" "no97035877")

(fact claim "Elsa Einstein" "viaf-identifier" "31600989")

(fact claim "Elsa Einstein" "gnd-identifier" "116425741")

(fact claim "Elsa Einstein" "main-type-gnd" "person")

(fact claim "Elsa Einstein" "place-of-death" "Princeton")

(fact claim "Elsa Einstein" "sex" "female")

(fact claim "Elsa Einstein" "spouse" "Albert Einstein")

(fact claim "Elsa Einstein" "country-of-citizenship" "Germany")

(fact claim "Elsa Einstein" "image" "Bundesarchiv Bild 102-00486A, Elsa Einstein.jpg")

(fact claim "Elsa Einstein" "place-of-birth" "Hechingen")

