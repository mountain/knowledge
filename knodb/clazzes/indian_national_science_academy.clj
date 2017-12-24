(ns clazzes.indian_national_science_academy
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Indian National Science Academy")

(name-as-in "Indian National Science Academy" "" "zh-hk")
(name-as-in "Indian National Science Academy" "" "pt")
(name-as-in "Indian National Science Academy" "Indian National Science Academy" "en")
(name-as-in "Indian National Science Academy" "Indian National Science Academy" "fr")
(name-as-in "Indian National Science Academy" "" "zh-tw")
(name-as-in "Indian National Science Academy" "Indian National Science Academy" "de")
(name-as-in "Indian National Science Academy" "Индийская национальная академия наук" "ru")
(name-as-in "Indian National Science Academy" "" "es")
(name-as-in "Indian National Science Academy" "" "ja")
(name-as-in "Indian National Science Academy" "" "zh-cn")
(name-as-in "Indian National Science Academy" "" "zh-sg")

(descr-as-in "Indian National Science Academy" "" "zh-hk")
(descr-as-in "Indian National Science Academy" "" "pt")
(descr-as-in "Indian National Science Academy" "organization" "en")
(descr-as-in "Indian National Science Academy" "" "fr")
(descr-as-in "Indian National Science Academy" "" "zh-tw")
(descr-as-in "Indian National Science Academy" "Indische Organisation" "de")
(descr-as-in "Indian National Science Academy" "" "ru")
(descr-as-in "Indian National Science Academy" "" "es")
(descr-as-in "Indian National Science Academy" "" "ja")
(descr-as-in "Indian National Science Academy" "" "zh-cn")
(descr-as-in "Indian National Science Academy" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Indian National Science Academy" "country" "Q668")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Indian National Science Academy" "located-in-the-administrative-territorial-entity" "Q987")

(refer-to ["properties.topics_main_category"])
(fact claim "Indian National Science Academy" "topic's-main-category" "Q19826171")

(refer-to ["properties.doi"])
(fact claim "Indian National Science Academy" "doi" "10.13039/100008605")

(refer-to ["properties.isni"])
(fact claim "Indian National Science Academy" "isni" "0000 0001 2188 4288")

(refer-to ["properties.official_website"])
(fact claim "Indian National Science Academy" "official-website" "http://www.insaindia.org.in/index.php")

(refer-to ["properties.instance_of"])
(fact claim "Indian National Science Academy" "instance-of" "Q43229")

(refer-to ["properties.doi_prefix"])
(fact claim "Indian National Science Academy" "doi-prefix" "10.16943")

(refer-to ["properties.grid_id"])
(fact claim "Indian National Science Academy" "grid-id" "grid.467648.f")
