(ns properties.part_of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "part-of")

(name-as-in "part-of" "屬於" "zh-hant")
(name-as-in "part-of" "构成" "zh-hans")
(name-as-in "part-of" "часть от" "ru")
(name-as-in "part-of" "parte de" "pt")
(name-as-in "part-of" "partie de" "fr")
(name-as-in "part-of" "forma parte de" "es")
(name-as-in "part-of" "全体" "ja")
(name-as-in "part-of" "ist Teil von" "de")
(name-as-in "part-of" "part of" "en")

(descr-as-in "part-of" "是…的一部分" "zh-hant")
(descr-as-in "part-of" "是…的一部分" "zh-hans")
(descr-as-in "part-of" "меронимическое отношение" "ru")
(descr-as-in "part-of" "" "pt")
(descr-as-in "part-of" "le sujet est une partie de l'objet" "fr")
(descr-as-in "part-of" "es parte del elemento" "es")
(descr-as-in "part-of" "この項目を一部分とする全体" "ja")
(descr-as-in "part-of" "Bestandteil einer Menge" "de")
(descr-as-in "part-of" "this item is a part of that item" "en")

