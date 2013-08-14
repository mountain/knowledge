(ns properties.legislative-body
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "legislative-body")

(name-as-in "legislative-body" "立法機構" "zh-hant")
(name-as-in "legislative-body" "立法机构" "zh-hans")
(name-as-in "legislative-body" "законодательный орган" "ru")
(name-as-in "legislative-body" "órgão legislativo" "pt")
(name-as-in "legislative-body" "organe législatif" "fr")
(name-as-in "legislative-body" "órgano legislativo" "es")
(name-as-in "legislative-body" "立法府" "ja")
(name-as-in "legislative-body" "gesetzgebende Körperschaft" "de")
(name-as-in "legislative-body" "legislative body" "en")

(descr-as-in "legislative-body" "" "zh-hant")
(descr-as-in "legislative-body" "" "zh-hans")
(descr-as-in "legislative-body" "" "ru")
(descr-as-in "legislative-body" "" "pt")
(descr-as-in "legislative-body" "institution politique qui élu les représentants" "fr")
(descr-as-in "legislative-body" "institución política con representantes electos" "es")
(descr-as-in "legislative-body" "選挙で選ばれた代表から成る政治機関。議会や国会など。" "ja")
(descr-as-in "legislative-body" "politische Institution mit gewählten oder berufenen Vertretern wie ein Parlament oder ein Rat" "de")
(descr-as-in "legislative-body" "a political institution with elected representatives, for example a parliament/legislature or council" "en")

