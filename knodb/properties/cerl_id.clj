(ns properties.cerl_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "cerl-id")

(name-as-in "cerl-id" "" "zh-hk")
(name-as-in "cerl-id" "CERL ID" "pt")
(name-as-in "cerl-id" "CERL ID" "en")
(name-as-in "cerl-id" "identifiant Consortium of European Research Libraries" "fr")
(name-as-in "cerl-id" "" "zh-tw")
(name-as-in "cerl-id" "CERL-ID" "de")
(name-as-in "cerl-id" "код CERL" "ru")
(name-as-in "cerl-id" "identificador CERL" "es")
(name-as-in "cerl-id" "" "ja")
(name-as-in "cerl-id" "" "zh-cn")
(name-as-in "cerl-id" "" "zh-sg")

(descr-as-in "cerl-id" "" "zh-hk")
(descr-as-in "cerl-id" "" "pt")
(descr-as-in "cerl-id" "identifier in the Consortium of European Research Libraries thesaurus" "en")
(descr-as-in "cerl-id" "identifiant du thésaurus du Consortium of European Research Libraries" "fr")
(descr-as-in "cerl-id" "" "zh-tw")
(descr-as-in "cerl-id" "Identifikator in CERL, einem Zusammenschluss von über 60 Forschungsbibliotheken in Europa" "de")
(descr-as-in "cerl-id" "Consortium of European Research Libraries" "ru")
(descr-as-in "cerl-id" "" "es")
(descr-as-in "cerl-id" "" "ja")
(descr-as-in "cerl-id" "" "zh-cn")
(descr-as-in "cerl-id" "" "zh-sg")

