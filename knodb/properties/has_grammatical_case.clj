(ns properties.has_grammatical_case
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "has-grammatical-case")

(name-as-in "has-grammatical-case" "" "zh-hk")
(name-as-in "has-grammatical-case" "tem caso gramatical" "pt")
(name-as-in "has-grammatical-case" "has grammatical case" "en")
(name-as-in "has-grammatical-case" "a comme cas grammatical" "fr")
(name-as-in "has-grammatical-case" "具有語義格" "zh-tw")
(name-as-in "has-grammatical-case" "hat grammatischen Fall" "de")
(name-as-in "has-grammatical-case" "имеет падежи" "ru")
(name-as-in "has-grammatical-case" "tiene como caso gramatical" "es")
(name-as-in "has-grammatical-case" "" "ja")
(name-as-in "has-grammatical-case" "" "zh-cn")
(name-as-in "has-grammatical-case" "" "zh-sg")

(descr-as-in "has-grammatical-case" "" "zh-hk")
(descr-as-in "has-grammatical-case" "" "pt")
(descr-as-in "has-grammatical-case" "case used in this language" "en")
(descr-as-in "has-grammatical-case" "cas utilisé dans cette langue" "fr")
(descr-as-in "has-grammatical-case" "" "zh-tw")
(descr-as-in "has-grammatical-case" "Fall, der in einer bestimmten Sprache verwendet wird" "de")
(descr-as-in "has-grammatical-case" "значения — падежи, используемые в данном языке" "ru")
(descr-as-in "has-grammatical-case" "caso gramatical usado en este idioma" "es")
(descr-as-in "has-grammatical-case" "" "ja")
(descr-as-in "has-grammatical-case" "" "zh-cn")
(descr-as-in "has-grammatical-case" "" "zh-sg")

