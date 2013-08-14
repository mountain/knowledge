(ns clazzes.german
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "German")

(name-as-in "German" "" "zh-hant")
(name-as-in "German" "德语" "zh-hans")
(name-as-in "German" "немецкий язык" "ru")
(name-as-in "German" "língua alemã" "pt")
(name-as-in "German" "allemand" "fr")
(name-as-in "German" "alemán" "es")
(name-as-in "German" "ドイツ語" "ja")
(name-as-in "German" "Deutsch" "de")
(name-as-in "German" "German" "en")

(descr-as-in "German" "" "zh-hant")
(descr-as-in "German" "" "zh-hans")
(descr-as-in "German" "германский язык индоевропейской семьи" "ru")
(descr-as-in "German" "língua falada principalmente na Alemanha" "pt")
(descr-as-in "German" "langue germanique" "fr")
(descr-as-in "German" "lengua indoeuropea" "es")
(descr-as-in "German" "言語" "ja")
(descr-as-in "German" "germanische Sprache, die in und um Deutschland gesprochen wird" "de")
(descr-as-in "German" "West Germanic language" "en")

(fact claim "German" "iso-639-3" "deu")

(fact claim "German" "language-family" "Indo-European languages")

(fact claim "German" "gost-7_75-97-code" "нем 481")

(fact claim "German" "wikimedia-language-code" "de")

(fact claim "German" "main-type-gnd" "term")

(fact claim "German" "iso-639-1" "de")

(fact claim "German" "iso-639-2" "deu")

(fact claim "German" "iso-639-2" "ger")

(fact claim "German" "bncf-thesaurus" "186")

(fact claim "German" "instance-of" "language")

(fact claim "German" "writing-system" "Latin script alphabet")

(fact claim "German" "language-group" "West Germanic languages")

(fact claim "German" "language-branch" "Germanic languages")

(fact claim "German" "commons-category" "German language")

