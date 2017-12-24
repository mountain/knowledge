(ns clazzes.alte_kantonsschule_aarau
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Alte Kantonsschule Aarau")

(name-as-in "Alte Kantonsschule Aarau" "" "zh-hk")
(name-as-in "Alte Kantonsschule Aarau" "" "pt")
(name-as-in "Alte Kantonsschule Aarau" "Alte Kantonsschule Aarau" "en")
(name-as-in "Alte Kantonsschule Aarau" "ancienne école cantonale d'Aarau" "fr")
(name-as-in "Alte Kantonsschule Aarau" "" "zh-tw")
(name-as-in "Alte Kantonsschule Aarau" "Alte Kantonsschule" "de")
(name-as-in "Alte Kantonsschule Aarau" "" "ru")
(name-as-in "Alte Kantonsschule Aarau" "" "es")
(name-as-in "Alte Kantonsschule Aarau" "アルテ・カントンシューレ・アーラウ" "ja")
(name-as-in "Alte Kantonsschule Aarau" "" "zh-cn")
(name-as-in "Alte Kantonsschule Aarau" "" "zh-sg")

(descr-as-in "Alte Kantonsschule Aarau" "" "zh-hk")
(descr-as-in "Alte Kantonsschule Aarau" "" "pt")
(descr-as-in "Alte Kantonsschule Aarau" "" "en")
(descr-as-in "Alte Kantonsschule Aarau" "" "fr")
(descr-as-in "Alte Kantonsschule Aarau" "" "zh-tw")
(descr-as-in "Alte Kantonsschule Aarau" "" "de")
(descr-as-in "Alte Kantonsschule Aarau" "" "ru")
(descr-as-in "Alte Kantonsschule Aarau" "" "es")
(descr-as-in "Alte Kantonsschule Aarau" "" "ja")
(descr-as-in "Alte Kantonsschule Aarau" "" "zh-cn")
(descr-as-in "Alte Kantonsschule Aarau" "" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.switzerland"])
(fact claim "Alte Kantonsschule Aarau" "country" "Switzerland")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.alte_kantonsschule_aarau"])
(fact claim "Alte Kantonsschule Aarau" "commons-category" "Alte Kantonsschule Aarau")

(refer-to ["properties.viaf_id"])
(fact claim "Alte Kantonsschule Aarau" "viaf-id" "155408181")

(refer-to ["properties.ipv6_routing_prefix"])
(fact claim "Alte Kantonsschule Aarau" "ipv6-routing-prefix" "2a01:8b00:1000::/48")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Alte Kantonsschule Aarau" "located-in-the-administrative-territorial-entity" "Q11972")
(fact claim "Alte Kantonsschule Aarau" "located-in-the-administrative-territorial-entity" "Q14274")

(refer-to ["properties.heritage_designation"])
(fact claim "Alte Kantonsschule Aarau" "heritage-designation" "Q8274529")

(refer-to ["properties.coordinate_location"])
(fact claim "Alte Kantonsschule Aarau" "coordinate-location" "lng 8.0525 lat 47.3933 alt ")
(fact claim "Alte Kantonsschule Aarau" "coordinate-location" "lng 8.05321372 lat 47.39333869 alt ")

(refer-to ["properties.location"])
(fact claim "Alte Kantonsschule Aarau" "location" "Q14274")

(refer-to ["properties.official_website"])
(fact claim "Alte Kantonsschule Aarau" "official-website" "http://www.alte-kanti-aarau.ch/")

(refer-to ["properties.instance_of"])
(fact claim "Alte Kantonsschule Aarau" "instance-of" "Q1728107")
(fact claim "Alte Kantonsschule Aarau" "instance-of" "Q1244442")
(fact claim "Alte Kantonsschule Aarau" "instance-of" "Q811979")

(refer-to ["properties.located_at_street_address"])
(fact claim "Alte Kantonsschule Aarau" "located-at-street-address" "Bahnhofstrasse 91")

(refer-to ["properties.image"])
(fact claim "Alte Kantonsschule Aarau" "image" "Alte Kantonsschule Aarau.jpg")

(refer-to ["properties.pcp_reference_number"])
(fact claim "Alte Kantonsschule Aarau" "pcp-reference-number" "7")

(refer-to ["properties.quora_topic_id"])
(fact claim "Alte Kantonsschule Aarau" "quora-topic-id" "Alte-Kantonsschule-Aarau")
