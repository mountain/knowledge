(ns properties.omim_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "omim-id")

(name-as-in "omim-id" "" "zh-hk")
(name-as-in "omim-id" "identificador OMIM" "pt")
(name-as-in "omim-id" "OMIM ID" "en")
(name-as-in "omim-id" "identifiant OMIM" "fr")
(name-as-in "omim-id" "" "zh-tw")
(name-as-in "omim-id" "OMIM-ID" "de")
(name-as-in "omim-id" "идентификатор OMIM" "ru")
(name-as-in "omim-id" "identificador OMIM" "es")
(name-as-in "omim-id" "OMIM ID" "ja")
(name-as-in "omim-id" "" "zh-cn")
(name-as-in "omim-id" "" "zh-sg")

(descr-as-in "omim-id" "" "zh-hk")
(descr-as-in "omim-id" "" "pt")
(descr-as-in "omim-id" "Online Mendelian Inheritance in Man catalogue codes for diseases" "en")
(descr-as-in "omim-id" "code pour les maladies dans le catalogue en ligne « Mendelian Inheritance in Man »" "fr")
(descr-as-in "omim-id" "" "zh-tw")
(descr-as-in "omim-id" "Identifikationsnummer in der Gen-Datenbank Online Mendelian Inheritance in Man" "de")
(descr-as-in "omim-id" "номер в онлайн-каталоге заболеваний" "ru")
(descr-as-in "omim-id" "identificador de la base de datos Online Mendelian Inheritance in Man" "es")
(descr-as-in "omim-id" "オンライン・ヒトメンデル遺伝形質カタログ" "ja")
(descr-as-in "omim-id" "" "zh-cn")
(descr-as-in "omim-id" "" "zh-sg")

