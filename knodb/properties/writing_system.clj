(ns properties.writing_system
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "writing-system")

(name-as-in "writing-system" "書寫系統" "zh-hk")
(name-as-in "writing-system" "alfabeto" "pt")
(name-as-in "writing-system" "writing system" "en")
(name-as-in "writing-system" "système d'écriture" "fr")
(name-as-in "writing-system" "書寫系統" "zh-tw")
(name-as-in "writing-system" "Alphabet" "de")
(name-as-in "writing-system" "письменность" "ru")
(name-as-in "writing-system" "alfabeto" "es")
(name-as-in "writing-system" "文字体系" "ja")
(name-as-in "writing-system" "书写系统" "zh-cn")
(name-as-in "writing-system" "书写系统" "zh-sg")

(descr-as-in "writing-system" "" "zh-hk")
(descr-as-in "writing-system" "sistema de escrita usado pela linguagem" "pt")
(descr-as-in "writing-system" "alphabet, character set or other system of writing used by subject language" "en")
(descr-as-in "writing-system" "système d'écriture utilisé par la langue" "fr")
(descr-as-in "writing-system" "" "zh-tw")
(descr-as-in "writing-system" "Schreibsystem, das für eine Sprache oder ein Schriftwerk benutzt wird" "de")
(descr-as-in "writing-system" "письменность, используемая языком" "ru")
(descr-as-in "writing-system" "sistema de escritura empleado por el idioma" "es")
(descr-as-in "writing-system" "その言語で使用されている文字体系" "ja")
(descr-as-in "writing-system" "" "zh-cn")
(descr-as-in "writing-system" "" "zh-sg")

