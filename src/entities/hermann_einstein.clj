(ns entities.hermann_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Hermann Einstein")

(name-as-in "Hermann Einstein" "" "zh-hant")
(name-as-in "Hermann Einstein" "" "zh-hans")
(name-as-in "Hermann Einstein" "Герман Эйнштейн" "ru")
(name-as-in "Hermann Einstein" "Hermann Einstein" "pt")
(name-as-in "Hermann Einstein" "Hermann Einstein" "fr")
(name-as-in "Hermann Einstein" "Hermann Einstein" "es")
(name-as-in "Hermann Einstein" "" "ja")
(name-as-in "Hermann Einstein" "Hermann Einstein" "de")
(name-as-in "Hermann Einstein" "Hermann Einstein" "en")

(descr-as-in "Hermann Einstein" "" "zh-hant")
(descr-as-in "Hermann Einstein" "" "zh-hans")
(descr-as-in "Hermann Einstein" "" "ru")
(descr-as-in "Hermann Einstein" "" "pt")
(descr-as-in "Hermann Einstein" "homme d'affaires allemand et père d'Albert Einstein" "fr")
(descr-as-in "Hermann Einstein" "" "es")
(descr-as-in "Hermann Einstein" "" "ja")
(descr-as-in "Hermann Einstein" "deutscher Elektrotechniker und Unternehmer, Vater Albert Einsteins" "de")
(descr-as-in "Hermann Einstein" "" "en")


(refer-to ["properties.place_of_birth"])
(refer-to ["entities.bad_buchau"])
(fact claim "Hermann Einstein" "place-of-birth" "Bad Buchau")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.milan"])
(fact claim "Hermann Einstein" "place-of-death" "Milan")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Hermann Einstein" "main-type-gnd" "person")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Hermann Einstein" "sex" "male")

(refer-to ["properties.child"])
(refer-to ["entities.albert_einstein"])
(fact claim "Hermann Einstein" "child" "Albert Einstein")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.germany"])
(fact claim "Hermann Einstein" "country-of-citizenship" "Germany")
