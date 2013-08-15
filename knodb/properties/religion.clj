(ns properties.religion
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "religion")

(name-as-in "religion" "信仰" "zh-hant")
(name-as-in "religion" "信仰" "zh-hans")
(name-as-in "religion" "вероисповедание" "ru")
(name-as-in "religion" "religião" "pt")
(name-as-in "religion" "religion" "fr")
(name-as-in "religion" "religión" "es")
(name-as-in "religion" "宗教" "ja")
(name-as-in "religion" "Religionszugehörigkeit" "de")
(name-as-in "religion" "religion" "en")

(descr-as-in "religion" "" "zh-hant")
(descr-as-in "religion" "" "zh-hans")
(descr-as-in "religion" "" "ru")
(descr-as-in "religion" "religião do indivíduo (deve ser corroborada pelo próprio ou documentada por fontes históricas)" "pt")
(descr-as-in "religion" "religion de la personne (doit être affirmée publiquement par le sujet, ou documentée dans des sources historiques)" "fr")
(descr-as-in "religion" "" "es")
(descr-as-in "religion" "" "ja")
(descr-as-in "religion" "(MUSS von der Person behauptet oder durch historische Quellen dokumentiert sein)" "de")
(descr-as-in "religion" "religion of a person (MUST be claimed by the subject or documented by historical sources)" "en")

