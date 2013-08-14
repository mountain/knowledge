(ns properties.lccn-identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "lccn-identifier")

(name-as-in "lccn-identifier" "LCCN" "zh-hant")
(name-as-in "lccn-identifier" "LCCN" "zh-hans")
(name-as-in "lccn-identifier" "идентификатор LCCN" "ru")
(name-as-in "lccn-identifier" "número de controlo da Biblioteca do Congresso" "pt")
(name-as-in "lccn-identifier" "identifiant bibliothèque du Congrès" "fr")
(name-as-in "lccn-identifier" "identificador de la Biblioteca del Congreso" "es")
(name-as-in "lccn-identifier" "LCCN" "ja")
(name-as-in "lccn-identifier" "LCCN" "de")
(name-as-in "lccn-identifier" "LCCN identifier" "en")

(descr-as-in "lccn-identifier" "美國國會圖書館控制號" "zh-hant")
(descr-as-in "lccn-identifier" "美国国会图书馆控制号" "zh-hans")
(descr-as-in "lccn-identifier" "" "ru")
(descr-as-in "lccn-identifier" "número identificativo proporcionado pela Biblioteca do Congresso dos Estados Unidos (usado apenas para controlo de autoridade)" "pt")
(descr-as-in "lccn-identifier" "indentifiant attribué au donnée d'autorité par la Bibliothèque du Congrès" "fr")
(descr-as-in "lccn-identifier" "número identificativo proporcionado por la Biblioteca del Congreso de los Estados Unidos" "es")
(descr-as-in "lccn-identifier" "米国議会図書館の管理番号" "ja")
(descr-as-in "lccn-identifier" "Library of Congress Control Number (nur für Normdaten)" "de")
(descr-as-in "lccn-identifier" "Library of Congress Name Authority File (only for authority control)" "en")

