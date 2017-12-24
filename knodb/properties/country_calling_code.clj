(ns properties.country_calling_code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "country-calling-code")

(name-as-in "country-calling-code" "國際電話區號" "zh-hk")
(name-as-in "country-calling-code" "prefixo telefónico internacional" "pt")
(name-as-in "country-calling-code" "country calling code" "en")
(name-as-in "country-calling-code" "indicatif téléphonique national" "fr")
(name-as-in "country-calling-code" "國際電話區號" "zh-tw")
(name-as-in "country-calling-code" "internationale Telefonvorwahl" "de")
(name-as-in "country-calling-code" "телефонный код страны" "ru")
(name-as-in "country-calling-code" "prefijo telefónico internacional" "es")
(name-as-in "country-calling-code" "国番号" "ja")
(name-as-in "country-calling-code" "国家电话区号" "zh-cn")
(name-as-in "country-calling-code" "" "zh-sg")

(descr-as-in "country-calling-code" "" "zh-hk")
(descr-as-in "country-calling-code" "" "pt")
(descr-as-in "country-calling-code" "identifier for a country - dialed on phone after the international dialing prefix (precede value by +)" "en")
(descr-as-in "country-calling-code" "indicatif téléphonique d'un pays après le préfixe de l'indicatif téléphonique international (valeur précédée par +)" "fr")
(descr-as-in "country-calling-code" "" "zh-tw")
(descr-as-in "country-calling-code" "der Telefonnummer vorangestellte landesspezifische Nummer" "de")
(descr-as-in "country-calling-code" "" "ru")
(descr-as-in "country-calling-code" "" "es")
(descr-as-in "country-calling-code" "国際電話の国際電話識別番号に続く、国ごとに決められている番号" "ja")
(descr-as-in "country-calling-code" "" "zh-cn")
(descr-as-in "country-calling-code" "" "zh-sg")

