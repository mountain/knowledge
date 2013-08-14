(ns clazzes.franklin-medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Franklin Medal")

(name-as-in "Franklin Medal" "" "zh-hant")
(name-as-in "Franklin Medal" "" "zh-hans")
(name-as-in "Franklin Medal" "Медаль Франклина" "ru")
(name-as-in "Franklin Medal" "Medalha Franklin" "pt")
(name-as-in "Franklin Medal" "Médaille Franklin" "fr")
(name-as-in "Franklin Medal" "" "es")
(name-as-in "Franklin Medal" "フランクリン・メダル" "ja")
(name-as-in "Franklin Medal" "Franklin-Medaille" "de")
(name-as-in "Franklin Medal" "Franklin Medal" "en")

(descr-as-in "Franklin Medal" "" "zh-hant")
(descr-as-in "Franklin Medal" "" "zh-hans")
(descr-as-in "Franklin Medal" "" "ru")
(descr-as-in "Franklin Medal" "" "pt")
(descr-as-in "Franklin Medal" "" "fr")
(descr-as-in "Franklin Medal" "" "es")
(descr-as-in "Franklin Medal" "" "ja")
(descr-as-in "Franklin Medal" "Wissenschaftspreis des Franklin Instituts in Philadelphia, USA" "de")
(descr-as-in "Franklin Medal" "science award by the Franklin Institute, Philadelphia" "en")

(fact claim "Franklin Medal" "subclass-of" "award")

(fact claim "Franklin Medal" "named-after" "Benjamin Franklin")

