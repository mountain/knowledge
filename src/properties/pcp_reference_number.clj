(ns properties.pcp_reference_number
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "pcp-reference-number")

(name-as-in "pcp-reference-number" "" "zh-hant")
(name-as-in "pcp-reference-number" "" "zh-hans")
(name-as-in "pcp-reference-number" "идентификатор KGS" "ru")
(name-as-in "pcp-reference-number" "" "pt")
(name-as-in "pcp-reference-number" "identifiant PBC" "fr")
(name-as-in "pcp-reference-number" "identificador KGS" "es")
(name-as-in "pcp-reference-number" "KGS識別子" "ja")
(name-as-in "pcp-reference-number" "KGS-DS-Nummer" "de")
(name-as-in "pcp-reference-number" "PCP reference number" "en")

(descr-as-in "pcp-reference-number" "" "zh-hant")
(descr-as-in "pcp-reference-number" "" "zh-hans")
(descr-as-in "pcp-reference-number" "" "ru")
(descr-as-in "pcp-reference-number" "" "pt")
(descr-as-in "pcp-reference-number" "identifiant PBC pour les biens culturels d'importance nationale et régionale en Suisse" "fr")
(descr-as-in "pcp-reference-number" "identificador para bienes culturales en Suiza" "es")
(descr-as-in "pcp-reference-number" "スイスの文化財の識別子" "ja")
(descr-as-in "pcp-reference-number" "Identifizierungsnummer des Kulturgüterschutzes in der Schweiz" "de")
(descr-as-in "pcp-reference-number" "identifier for cultural properties in Switzerland" "en")

