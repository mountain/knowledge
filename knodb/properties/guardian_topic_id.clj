(ns properties.guardian_topic_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "guardian-topic-id")

(name-as-in "guardian-topic-id" "衛報專題編碼" "zh-hk")
(name-as-in "guardian-topic-id" "" "pt")
(name-as-in "guardian-topic-id" "Guardian topic ID" "en")
(name-as-in "guardian-topic-id" "identifiant Guardian du sujet d'actualité" "fr")
(name-as-in "guardian-topic-id" "衛報專題編碼" "zh-tw")
(name-as-in "guardian-topic-id" "Guardian-Themenkennung" "de")
(name-as-in "guardian-topic-id" "код темы Guardian" "ru")
(name-as-in "guardian-topic-id" "identificador Guardian de tema" "es")
(name-as-in "guardian-topic-id" "" "ja")
(name-as-in "guardian-topic-id" "卫报专题编码" "zh-cn")
(name-as-in "guardian-topic-id" "卫报专题编码" "zh-sg")

(descr-as-in "guardian-topic-id" "" "zh-hk")
(descr-as-in "guardian-topic-id" "" "pt")
(descr-as-in "guardian-topic-id" "identifier for a topic at the Guardian newspaper website" "en")
(descr-as-in "guardian-topic-id" "identifant d'un sujet sur le site internet du journal britannique The Guardian" "fr")
(descr-as-in "guardian-topic-id" "" "zh-tw")
(descr-as-in "guardian-topic-id" "Identifikator eines Themas auf der Website der Zeitung The Guardian" "de")
(descr-as-in "guardian-topic-id" "" "ru")
(descr-as-in "guardian-topic-id" "" "es")
(descr-as-in "guardian-topic-id" "" "ja")
(descr-as-in "guardian-topic-id" "" "zh-cn")
(descr-as-in "guardian-topic-id" "" "zh-sg")

