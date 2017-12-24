(ns properties.yso_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "yso-id")

(name-as-in "yso-id" "" "zh-hk")
(name-as-in "yso-id" "" "pt")
(name-as-in "yso-id" "YSO ID" "en")
(name-as-in "yso-id" "identifiant YSO" "fr")
(name-as-in "yso-id" "" "zh-tw")
(name-as-in "yso-id" "YSO ID" "de")
(name-as-in "yso-id" "код YSO" "ru")
(name-as-in "yso-id" "identificador YSO" "es")
(name-as-in "yso-id" "" "ja")
(name-as-in "yso-id" "" "zh-cn")
(name-as-in "yso-id" "" "zh-sg")

(descr-as-in "yso-id" "" "zh-hk")
(descr-as-in "yso-id" "" "pt")
(descr-as-in "yso-id" "identifier for a concept in the General Finnish Upper Ontology YSO" "en")
(descr-as-in "yso-id" "identifiant pour un concept dans le General Finnish Ontology YSO" "fr")
(descr-as-in "yso-id" "" "zh-tw")
(descr-as-in "yso-id" "" "de")
(descr-as-in "yso-id" "General Finnish Upper Ontology YSO" "ru")
(descr-as-in "yso-id" "" "es")
(descr-as-in "yso-id" "" "ja")
(descr-as-in "yso-id" "" "zh-cn")
(descr-as-in "yso-id" "" "zh-sg")

