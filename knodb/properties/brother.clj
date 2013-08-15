(ns properties.brother
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "brother")

(name-as-in "brother" "兄弟" "zh-hant")
(name-as-in "brother" "兄弟" "zh-hans")
(name-as-in "brother" "брат" "ru")
(name-as-in "brother" "irmão" "pt")
(name-as-in "brother" "frère" "fr")
(name-as-in "brother" "hermano" "es")
(name-as-in "brother" "兄弟" "ja")
(name-as-in "brother" "Bruder" "de")
(name-as-in "brother" "brother" "en")

(descr-as-in "brother" "" "zh-hant")
(descr-as-in "brother" "" "zh-hans")
(descr-as-in "brother" "брат персоны" "ru")
(descr-as-in "brother" "" "pt")
(descr-as-in "brother" "le sujet a pour frère l'objet" "fr")
(descr-as-in "brother" "el sujeto tuvo como hermano al objeto" "es")
(descr-as-in "brother" "その項目は主題に対し兄または弟" "ja")
(descr-as-in "brother" "Verwandter männlichen Geschlechts, der dieselben Eltern hat" "de")
(descr-as-in "brother" "subject has the object as their brother" "en")

