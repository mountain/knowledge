(ns properties.ietf_language_tag
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "ietf-language-tag")

(name-as-in "ietf-language-tag" "IETF語言標籤" "zh-hk")
(name-as-in "ietf-language-tag" "código de língua IETF" "pt")
(name-as-in "ietf-language-tag" "IETF language tag" "en")
(name-as-in "ietf-language-tag" "code de langue IETF" "fr")
(name-as-in "ietf-language-tag" "IETF語言標籤" "zh-tw")
(name-as-in "ietf-language-tag" "IETF-Code" "de")
(name-as-in "ietf-language-tag" "код IETF" "ru")
(name-as-in "ietf-language-tag" "código de idioma IETF" "es")
(name-as-in "ietf-language-tag" "IETF言語タグ" "ja")
(name-as-in "ietf-language-tag" "IETF语言标签" "zh-cn")
(name-as-in "ietf-language-tag" "IETF语言标签" "zh-sg")

(descr-as-in "ietf-language-tag" "" "zh-hk")
(descr-as-in "ietf-language-tag" "" "pt")
(descr-as-in "ietf-language-tag" "identifier for a language per the Internet Engineering Task Force" "en")
(descr-as-in "ietf-language-tag" "identifiant d'une langue selon l'Internet Engineering Task Force" "fr")
(descr-as-in "ietf-language-tag" "" "zh-tw")
(descr-as-in "ietf-language-tag" "Sprach-Code der Internet Engineering Task Force" "de")
(descr-as-in "ietf-language-tag" "идентификатор языка, присвоенный Инженерным советом Интернета" "ru")
(descr-as-in "ietf-language-tag" "" "es")
(descr-as-in "ietf-language-tag" "その言語のIETF言語タグ" "ja")
(descr-as-in "ietf-language-tag" "" "zh-cn")
(descr-as-in "ietf-language-tag" "" "zh-sg")

