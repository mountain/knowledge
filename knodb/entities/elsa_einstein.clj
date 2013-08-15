(ns entities.elsa_einstein
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


(refer-to ["properties.lccn_identifier"])
(fact claim "Elsa Einstein" "lccn-identifier" "no97035877")

(refer-to ["properties.viaf_identifier"])
(fact claim "Elsa Einstein" "viaf-identifier" "31600989")

(refer-to ["properties.gnd_identifier"])
(fact claim "Elsa Einstein" "gnd-identifier" "116425741")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Elsa Einstein" "main-type-gnd" "person")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.princeton"])
(fact claim "Elsa Einstein" "place-of-death" "Princeton")

(refer-to ["properties.sex"])
(refer-to ["clazzes.female"])
(fact claim "Elsa Einstein" "sex" "female")

(refer-to ["properties.spouse"])
(refer-to ["entities.albert_einstein"])
(fact claim "Elsa Einstein" "spouse" "Albert Einstein")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.germany"])
(fact claim "Elsa Einstein" "country-of-citizenship" "Germany")

(refer-to ["properties.image"])
(fact claim "Elsa Einstein" "image" "Bundesarchiv Bild 102-00486A, Elsa Einstein.jpg")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.hechingen"])
(fact claim "Elsa Einstein" "place-of-birth" "Hechingen")
