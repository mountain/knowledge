(ns properties.language_family
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "language-family")

(name-as-in "language-family" "語系" "zh-hant")
(name-as-in "language-family" "语系" "zh-hans")
(name-as-in "language-family" "языковая семья" "ru")
(name-as-in "language-family" "família linguística" "pt")
(name-as-in "language-family" "famille de langues" "fr")
(name-as-in "language-family" "familia de lenguas" "es")
(name-as-in "language-family" "語族" "ja")
(name-as-in "language-family" "Sprachfamilie" "de")
(name-as-in "language-family" "language family" "en")

(descr-as-in "language-family" "" "zh-hant")
(descr-as-in "language-family" "" "zh-hans")
(descr-as-in "language-family" "" "ru")
(descr-as-in "language-family" "" "pt")
(descr-as-in "language-family" "classification d'une langue ou d'une famille de langue" "fr")
(descr-as-in "language-family" "grupo de lenguas con un origen histórico común y emparentadas filogenéticamente" "es")
(descr-as-in "language-family" "言語分類における語族。通常は階層構造の中に位置付けられるが、その階層は常に明確に区別できるとは限らない。このため、1つの言語に複数の語族が割り当てられることがある。" "ja")
(descr-as-in "language-family" "" "de")
(descr-as-in "language-family" "classification of a language or language family. This is usually in a hierarchy, but the levels are not always clearly distinguished, so this may occur more than once for a language" "en")

