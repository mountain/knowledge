(ns properties.country_calling_code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "country-calling-code")

(name-as-in "country-calling-code" "國際電話區號" "zh-hant")
(name-as-in "country-calling-code" "国际电话区号" "zh-hans")
(name-as-in "country-calling-code" "телефонный код страны" "ru")
(name-as-in "country-calling-code" "prefixo telefónico internacional" "pt")
(name-as-in "country-calling-code" "indicatif téléphonique national" "fr")
(name-as-in "country-calling-code" "prefijo telefónico internacional" "es")
(name-as-in "country-calling-code" "国番号（国際電話）" "ja")
(name-as-in "country-calling-code" "internationale Telefonvorwahl" "de")
(name-as-in "country-calling-code" "country calling code" "en")

(descr-as-in "country-calling-code" "" "zh-hant")
(descr-as-in "country-calling-code" "" "zh-hans")
(descr-as-in "country-calling-code" "" "ru")
(descr-as-in "country-calling-code" "" "pt")
(descr-as-in "country-calling-code" "indicatif téléphonique d'un pays après le préfixe de l'indicatif téléphonique international (valeur précédée par +)" "fr")
(descr-as-in "country-calling-code" "" "es")
(descr-as-in "country-calling-code" "国際プレフィックスに続く、国ごとに決められている番号" "ja")
(descr-as-in "country-calling-code" "der Telefonnummer vorangestellte landesspezifische Nummer" "de")
(descr-as-in "country-calling-code" "dialed on phone for a country after the international dialing prefix (precede value by +)" "en")

