(ns clazzes.college_town
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "college town")

(name-as-in "college town" "" "zh-hant")
(name-as-in "college town" "" "zh-hans")
(name-as-in "college town" "" "ru")
(name-as-in "college town" "" "pt")
(name-as-in "college town" "Ville universitaire" "fr")
(name-as-in "college town" "" "es")
(name-as-in "college town" "学術都市" "ja")
(name-as-in "college town" "Universitätsstadt" "de")
(name-as-in "college town" "college town" "en")

(descr-as-in "college town" "" "zh-hant")
(descr-as-in "college town" "" "zh-hans")
(descr-as-in "college town" "" "ru")
(descr-as-in "college town" "" "pt")
(descr-as-in "college town" "" "fr")
(descr-as-in "college town" "" "es")
(descr-as-in "college town" "" "ja")
(descr-as-in "college town" "Stadt mit Sitz einer Universität" "de")
(descr-as-in "college town" "community dominated by its university population" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "college town" "main-type-gnd" "term")
