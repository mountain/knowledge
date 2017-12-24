(ns clazzes.eth_zurich
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "ETH Zurich")

(name-as-in "ETH Zurich" "" "zh-hk")
(name-as-in "ETH Zurich" "Instituto Federal de Tecnologia de Zurique" "pt")
(name-as-in "ETH Zurich" "ETH Zurich" "en")
(name-as-in "ETH Zurich" "École polytechnique fédérale de Zurich" "fr")
(name-as-in "ETH Zurich" "" "zh-tw")
(name-as-in "ETH Zurich" "ETH Zürich" "de")
(name-as-in "ETH Zurich" "Швейцарская высшая техническая школа Цюриха" "ru")
(name-as-in "ETH Zurich" "Escuela Politécnica Federal de Zúrich" "es")
(name-as-in "ETH Zurich" "チューリッヒ工科大学" "ja")
(name-as-in "ETH Zurich" "" "zh-cn")
(name-as-in "ETH Zurich" "" "zh-sg")

(descr-as-in "ETH Zurich" "" "zh-hk")
(descr-as-in "ETH Zurich" "" "pt")
(descr-as-in "ETH Zurich" "Swiss Federal Institute of Technology in Zurich" "en")
(descr-as-in "ETH Zurich" "université technique de renommée internationale située à Zurich, en Suisse" "fr")
(descr-as-in "ETH Zurich" "" "zh-tw")
(descr-as-in "ETH Zurich" "Technisch-naturwissenschaftliche Hochschule in Zürich, Schweiz" "de")
(descr-as-in "ETH Zurich" "высшее учебное заведение в городе Цюрих, Швейцария" "ru")
(descr-as-in "ETH Zurich" "universidad pública pionera en investigaciones en Europa" "es")
(descr-as-in "ETH Zurich" "" "ja")
(descr-as-in "ETH Zurich" "" "zh-cn")
(descr-as-in "ETH Zurich" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "ETH Zurich" "country" "Q39")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.eth_zurich"])
(fact claim "ETH Zurich" "commons-category" "ETH Zurich")

(refer-to ["properties.viaf_id"])
(fact claim "ETH Zurich" "viaf-id" "125099638")

(refer-to ["properties.headquarters_location"])
(fact claim "ETH Zurich" "headquarters-location" "Q14565994")
(fact claim "ETH Zurich" "headquarters-location" "Q72")

(refer-to ["properties.ipv6_routing_prefix"])
(fact claim "ETH Zurich" "ipv6-routing-prefix" "2001:620:8::/48")
(fact claim "ETH Zurich" "ipv6-routing-prefix" "2001:67c:10ec::/48")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "ETH Zurich" "located-in-the-administrative-territorial-entity" "Q72")

(refer-to ["properties.heritage_designation"])
(fact claim "ETH Zurich" "heritage-designation" "Q8274529")

(refer-to ["properties.topics_main_category"])
(fact claim "ETH Zurich" "topic's-main-category" "Q8396084")

(refer-to ["properties.geonames_id"])
(fact claim "ETH Zurich" "geonames-id" "6930856")

(refer-to ["properties.doi"])
(fact claim "ETH Zurich" "doi" "10.13039/501100003006")

(refer-to ["properties.sudoc_authorities"])
(fact claim "ETH Zurich" "sudoc-authorities" "026615002")

(refer-to ["properties.elevation_above_sea_level"])
(fact claim "ETH Zurich" "elevation-above-sea-level" "quantity")

(refer-to ["properties.bnf_id"])
(fact claim "ETH Zurich" "bnf-id" "11882844n")

(refer-to ["properties.member_of"])
(fact claim "ETH Zurich" "member-of" "Q19861084")

(refer-to ["properties.freebase_id"])
(fact claim "ETH Zurich" "freebase-id" "/m/01dyk8")

(refer-to ["properties.coordinate_location"])
(fact claim "ETH Zurich" "coordinate-location" "lng 8.54805 lat 47.3763 alt ")

(refer-to ["properties.leader"])
(fact claim "ETH Zurich" "leader" "Q6554677")

(refer-to ["properties.inception"])
(fact claim "ETH Zurich" "inception" "+1855-00-00T00:00:00Z")

(refer-to ["properties.students_count"])
(fact claim "ETH Zurich" "students-count" "quantity")

(refer-to ["properties.isni"])
(fact claim "ETH Zurich" "isni" "0000 0001 2156 2780")

(refer-to ["properties.official_website"])
(fact claim "ETH Zurich" "official-website" "http://www.ethz.ch/")

(refer-to ["properties.gnd_id"])
(fact claim "ETH Zurich" "gnd-id" "2023928-2")

(refer-to ["properties.logo_image"])
(fact claim "ETH Zurich" "logo-image" "ETH Zürich wordmark.svg")

(refer-to ["properties.has_part"])
(fact claim "ETH Zurich" "has-part" "Q684773")

(refer-to ["properties.instance_of"])
(fact claim "ETH Zurich" "instance-of" "Q1371037")
(fact claim "ETH Zurich" "instance-of" "Q3918")

(refer-to ["properties.image"])
(fact claim "ETH Zurich" "image" "ETH Zurich from Polyterrace.jpg")

(refer-to ["properties.official_name"])
(fact claim "ETH Zurich" "official-name" "monolingualtext")

(refer-to ["properties.item_operated"])
(fact claim "ETH Zurich" "item-operated" "Q19962703")

(refer-to ["properties.native_label"])
(fact claim "ETH Zurich" "native-label" "monolingualtext")

(refer-to ["properties.grid_id"])
(fact claim "ETH Zurich" "grid-id" "grid.5801.c")

(refer-to ["properties.archives_at"])
(fact claim "ETH Zurich" "archives-at" "Q39934978")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "ETH Zurich" "library-of-congress-authority-id" "n80126021")

(refer-to ["properties.quora_topic_id"])
(fact claim "ETH Zurich" "quora-topic-id" "ETH-Zurich")

(refer-to ["properties.rector"])
(fact claim "ETH Zurich" "rector" "Q1985463")
