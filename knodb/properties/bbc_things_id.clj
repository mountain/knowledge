(ns properties.bbc_things_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "bbc-things-id")

(name-as-in "bbc-things-id" "" "zh-hk")
(name-as-in "bbc-things-id" "" "pt")
(name-as-in "bbc-things-id" "BBC Things ID" "en")
(name-as-in "bbc-things-id" "identifiant BBC Things" "fr")
(name-as-in "bbc-things-id" "" "zh-tw")
(name-as-in "bbc-things-id" "BBC Things-ID" "de")
(name-as-in "bbc-things-id" "код BBC Things" "ru")
(name-as-in "bbc-things-id" "Identificador BBC Things" "es")
(name-as-in "bbc-things-id" "" "ja")
(name-as-in "bbc-things-id" "" "zh-cn")
(name-as-in "bbc-things-id" "" "zh-sg")

(descr-as-in "bbc-things-id" "" "zh-hk")
(descr-as-in "bbc-things-id" "" "pt")
(descr-as-in "bbc-things-id" "identifier in the BBC Things database" "en")
(descr-as-in "bbc-things-id" "identifiant dans la base de données BBC Things" "fr")
(descr-as-in "bbc-things-id" "" "zh-tw")
(descr-as-in "bbc-things-id" "Identifikationsnummer in Datenbank BBC Things (bbc.co.uk/things/)" "de")
(descr-as-in "bbc-things-id" "" "ru")
(descr-as-in "bbc-things-id" "identificador en la base de datos de BBC Things" "es")
(descr-as-in "bbc-things-id" "" "ja")
(descr-as-in "bbc-things-id" "" "zh-cn")
(descr-as-in "bbc-things-id" "" "zh-sg")

