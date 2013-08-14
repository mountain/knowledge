(ns clazzes.matteucci-medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Matteucci Medal")

(name-as-in "Matteucci Medal" "" "zh-hant")
(name-as-in "Matteucci Medal" "" "zh-hans")
(name-as-in "Matteucci Medal" "Медаль Маттеуччи" "ru")
(name-as-in "Matteucci Medal" "Medalha Matteucci" "pt")
(name-as-in "Matteucci Medal" "Médaille Matteucci" "fr")
(name-as-in "Matteucci Medal" "Medalla Matteucci" "es")
(name-as-in "Matteucci Medal" "マテウチ・メダル" "ja")
(name-as-in "Matteucci Medal" "Matteucci-Medaille" "de")
(name-as-in "Matteucci Medal" "Matteucci Medal" "en")

(descr-as-in "Matteucci Medal" "" "zh-hant")
(descr-as-in "Matteucci Medal" "" "zh-hans")
(descr-as-in "Matteucci Medal" "" "ru")
(descr-as-in "Matteucci Medal" "" "pt")
(descr-as-in "Matteucci Medal" "" "fr")
(descr-as-in "Matteucci Medal" "" "es")
(descr-as-in "Matteucci Medal" "" "ja")
(descr-as-in "Matteucci Medal" "" "de")
(descr-as-in "Matteucci Medal" "" "en")

