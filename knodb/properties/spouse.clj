(ns properties.spouse
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "spouse")

(name-as-in "spouse" "配偶" "zh-hant")
(name-as-in "spouse" "配偶" "zh-hans")
(name-as-in "spouse" "супруг(а)" "ru")
(name-as-in "spouse" "cônjuge" "pt")
(name-as-in "spouse" "conjoint" "fr")
(name-as-in "spouse" "cónyuge" "es")
(name-as-in "spouse" "配偶者" "ja")
(name-as-in "spouse" "Ehepartner" "de")
(name-as-in "spouse" "spouse" "en")

(descr-as-in "spouse" "" "zh-hant")
(descr-as-in "spouse" "" "zh-hans")
(descr-as-in "spouse" "" "ru")
(descr-as-in "spouse" "o sujeito tem como objeto o seu cônjuge (homem ou mulher)" "pt")
(descr-as-in "spouse" "lien familial" "fr")
(descr-as-in "spouse" "el sujeto tuvo como cónyuge al objeto" "es")
(descr-as-in "spouse" "その項目は主題に対し配偶者（男性または女性）" "ja")
(descr-as-in "spouse" "weiterer Teil der gefestigten Lebensgemeinschaft" "de")
(descr-as-in "spouse" "the subject has the object as their spouse (husband, wife, etc.)" "en")

