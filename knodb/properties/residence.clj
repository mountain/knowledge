(ns properties.residence
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "residence")

(name-as-in "residence" "" "zh-hant")
(name-as-in "residence" "" "zh-hans")
(name-as-in "residence" "" "ru")
(name-as-in "residence" "" "pt")
(name-as-in "residence" "résidence" "fr")
(name-as-in "residence" "residencia" "es")
(name-as-in "residence" "" "ja")
(name-as-in "residence" "Wohnsitz" "de")
(name-as-in "residence" "residence" "en")

(descr-as-in "residence" "" "zh-hant")
(descr-as-in "residence" "" "zh-hans")
(descr-as-in "residence" "" "ru")
(descr-as-in "residence" "" "pt")
(descr-as-in "residence" "" "fr")
(descr-as-in "residence" "lugar donde una persona reside o ha residido" "es")
(descr-as-in "residence" "" "ja")
(descr-as-in "residence" "Ort, an dem die Person einen Wohnsitz hat oder hatte" "de")
(descr-as-in "residence" "the place where the person is, or has been, resident" "en")

