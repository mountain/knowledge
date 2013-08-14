(ns properties.writing-system
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "writing-system")

(name-as-in "writing-system" "文字" "zh-hant")
(name-as-in "writing-system" "文字" "zh-hans")
(name-as-in "writing-system" "алфавит" "ru")
(name-as-in "writing-system" "alfabeto" "pt")
(name-as-in "writing-system" "alphabet" "fr")
(name-as-in "writing-system" "alfabeto" "es")
(name-as-in "writing-system" "文字体系" "ja")
(name-as-in "writing-system" "Alphabet" "de")
(name-as-in "writing-system" "writing system" "en")

(descr-as-in "writing-system" "" "zh-hant")
(descr-as-in "writing-system" "" "zh-hans")
(descr-as-in "writing-system" "алфавит, используемый языком" "ru")
(descr-as-in "writing-system" "sistema de escrita usado pela linguagem" "pt")
(descr-as-in "writing-system" "système d'écriture utilisé par la langue" "fr")
(descr-as-in "writing-system" "sistema de escritura empleado por el idioma" "es")
(descr-as-in "writing-system" "その言語で使用されている文字体系" "ja")
(descr-as-in "writing-system" "Alphabet, welches von einer Sprache benutzt wird" "de")
(descr-as-in "writing-system" "alphabet, character set or other system of writing used by subject language" "en")

