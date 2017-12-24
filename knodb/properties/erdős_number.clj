(ns properties.erdős_number
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "erdős-number")

(name-as-in "erdős-number" "" "zh-hk")
(name-as-in "erdős-number" "número de Erdős" "pt")
(name-as-in "erdős-number" "Erdős number" "en")
(name-as-in "erdős-number" "nombre d'Erdős" "fr")
(name-as-in "erdős-number" "" "zh-tw")
(name-as-in "erdős-number" "Erdős-Zahl" "de")
(name-as-in "erdős-number" "число Эрдёша" "ru")
(name-as-in "erdős-number" "número de Erdős" "es")
(name-as-in "erdős-number" "エルデシュ数" "ja")
(name-as-in "erdős-number" "" "zh-cn")
(name-as-in "erdős-number" "" "zh-sg")

(descr-as-in "erdős-number" "" "zh-hk")
(descr-as-in "erdős-number" "" "pt")
(descr-as-in "erdős-number" "the collaborative distance between mathematician Paul Erdős and another person. Use point in time (P585) as qualifier and should be used with a source." "en")
(descr-as-in "erdős-number" "distance relationnelle entre le mathématicien Paul Erdős et un autre chercheur en mathématiques" "fr")
(descr-as-in "erdős-number" "" "zh-tw")
(descr-as-in "erdős-number" "Distanz im Graphen der Koautorenschaft bezogen auf den Mathematiker Paul Erdős" "de")
(descr-as-in "erdős-number" "метод определения кратчайшего пути соавторства до венгерского математика Пала Эрдёша" "ru")
(descr-as-in "erdős-number" "" "es")
(descr-as-in "erdős-number" "" "ja")
(descr-as-in "erdős-number" "" "zh-cn")
(descr-as-in "erdős-number" "" "zh-sg")

