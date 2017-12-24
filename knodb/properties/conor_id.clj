(ns properties.conor_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "conor-id")

(name-as-in "conor-id" "" "zh-hk")
(name-as-in "conor-id" "" "pt")
(name-as-in "conor-id" "CONOR ID" "en")
(name-as-in "conor-id" "identifiant CONOR" "fr")
(name-as-in "conor-id" "" "zh-tw")
(name-as-in "conor-id" "CONOR-ID" "de")
(name-as-in "conor-id" "код CONOR" "ru")
(name-as-in "conor-id" "identificador CONOR" "es")
(name-as-in "conor-id" "CONOR識別子" "ja")
(name-as-in "conor-id" "" "zh-cn")
(name-as-in "conor-id" "" "zh-sg")

(descr-as-in "conor-id" "" "zh-hk")
(descr-as-in "conor-id" "" "pt")
(descr-as-in "conor-id" "identifier in the CONOR.SI database" "en")
(descr-as-in "conor-id" "" "fr")
(descr-as-in "conor-id" "" "zh-tw")
(descr-as-in "conor-id" "Identifikationsnummer in Datenbank CONOR.SI" "de")
(descr-as-in "conor-id" "код в базе данных CONOR.SI" "ru")
(descr-as-in "conor-id" "" "es")
(descr-as-in "conor-id" "" "ja")
(descr-as-in "conor-id" "" "zh-cn")
(descr-as-in "conor-id" "" "zh-sg")

