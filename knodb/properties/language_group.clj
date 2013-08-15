(ns properties.language_group
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "language-group")

(name-as-in "language-group" "" "zh-hant")
(name-as-in "language-group" "" "zh-hans")
(name-as-in "language-group" "языковая группа" "ru")
(name-as-in "language-group" "grupo linguístico" "pt")
(name-as-in "language-group" "groupe de langues" "fr")
(name-as-in "language-group" "grupo de lenguas" "es")
(name-as-in "language-group" "語群" "ja")
(name-as-in "language-group" "Sprachgruppe" "de")
(name-as-in "language-group" "language group" "en")

(descr-as-in "language-group" "" "zh-hant")
(descr-as-in "language-group" "" "zh-hans")
(descr-as-in "language-group" "группа языка согласно лингвистической классификации" "ru")
(descr-as-in "language-group" "grupo linguístico segundo a classificação linguística" "pt")
(descr-as-in "language-group" "" "fr")
(descr-as-in "language-group" "" "es")
(descr-as-in "language-group" "言語分類における語群" "ja")
(descr-as-in "language-group" "" "de")
(descr-as-in "language-group" "linguistic classification group to which subject belongs" "en")

