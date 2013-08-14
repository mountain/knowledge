(ns clazzes.term
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "term")

(name-as-in "term" "術語" "zh-hant")
(name-as-in "term" "术语" "zh-hans")
(name-as-in "term" "концепция" "ru")
(name-as-in "term" "termo" "pt")
(name-as-in "term" "terme" "fr")
(name-as-in "term" "término" "es")
(name-as-in "term" "用語" "ja")
(name-as-in "term" "Begriff" "de")
(name-as-in "term" "term" "en")

(descr-as-in "term" "在某個特定背景下有特定意義的詞或表達式（用於屬性:P107“GND 類別“）" "zh-hant")
(descr-as-in "term" "在某个特定背景下有特定意义的词或表达式（用于属性:P107“GND 类别“）" "zh-hans")
(descr-as-in "term" "главный замысел, руководящая идея (также GND-тип)" "ru")
(descr-as-in "term" "tipo de entidade de nível superior no ficheiro de autoridade universal (GND)" "pt")
(descr-as-in "term" "mot ou expression" "fr")
(descr-as-in "term" "palabra o combinación de palabras" "es")
(descr-as-in "term" "特定の文脈で特定の意味を持つ単語・表現" "ja")
(descr-as-in "term" "Bedeutungsinhalt eines sprachlichen Ausdrucks" "de")
(descr-as-in "term" "word or expression that has a specific meaning in specific contexts (use with Property:P107 "main type (GND)")" "en")

(fact claim "term" "main-type-gnd" "term")

(fact claim "term" "subclass-of" "entity")

