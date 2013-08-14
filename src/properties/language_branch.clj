(ns properties.language_branch
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "language-branch")

(name-as-in "language-branch" "" "zh-hant")
(name-as-in "language-branch" "" "zh-hans")
(name-as-in "language-branch" "языковая ветвь" "ru")
(name-as-in "language-branch" "tronco linguístico" "pt")
(name-as-in "language-branch" "branche de langues" "fr")
(name-as-in "language-branch" "rama lingüística" "es")
(name-as-in "language-branch" "語派" "ja")
(name-as-in "language-branch" "Sprachzweig" "de")
(name-as-in "language-branch" "language branch" "en")

(descr-as-in "language-branch" "" "zh-hant")
(descr-as-in "language-branch" "" "zh-hans")
(descr-as-in "language-branch" "ветвь языка согласно лингвистической классификации" "ru")
(descr-as-in "language-branch" "" "pt")
(descr-as-in "language-branch" "branche de langues selon une classification linguistique" "fr")
(descr-as-in "language-branch" "" "es")
(descr-as-in "language-branch" "言語分類における語派" "ja")
(descr-as-in "language-branch" "" "de")
(descr-as-in "language-branch" "linguistic classification branch to which subject belongs" "en")

