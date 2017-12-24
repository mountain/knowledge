(ns clazzes.university_of_bern
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "University of Bern")

(name-as-in "University of Bern" "伯爾尼大學" "zh-hk")
(name-as-in "University of Bern" "Universidade de Berna" "pt")
(name-as-in "University of Bern" "University of Bern" "en")
(name-as-in "University of Bern" "université de Berne" "fr")
(name-as-in "University of Bern" "" "zh-tw")
(name-as-in "University of Bern" "Universität Bern" "de")
(name-as-in "University of Bern" "Бернский университет" "ru")
(name-as-in "University of Bern" "Universidad de Berna" "es")
(name-as-in "University of Bern" "ベルン大学" "ja")
(name-as-in "University of Bern" "伯恩大学" "zh-cn")
(name-as-in "University of Bern" "" "zh-sg")

(descr-as-in "University of Bern" "" "zh-hk")
(descr-as-in "University of Bern" "" "pt")
(descr-as-in "University of Bern" "university in the Swiss capital of Bern" "en")
(descr-as-in "University of Bern" "" "fr")
(descr-as-in "University of Bern" "" "zh-tw")
(descr-as-in "University of Bern" "Universität in der Schweiz" "de")
(descr-as-in "University of Bern" "" "ru")
(descr-as-in "University of Bern" "" "es")
(descr-as-in "University of Bern" "" "ja")
(descr-as-in "University of Bern" "" "zh-cn")
(descr-as-in "University of Bern" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "University of Bern" "country" "Q39")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.university_of_bern"])
(fact claim "University of Bern" "commons-category" "University of Bern")

(refer-to ["properties.viaf_id"])
(fact claim "University of Bern" "viaf-id" "149716026")

(refer-to ["properties.headquarters_location"])
(fact claim "University of Bern" "headquarters-location" "Q1589476")

(refer-to ["properties.ipv6_routing_prefix"])
(fact claim "University of Bern" "ipv6-routing-prefix" "2001:620:400::/48")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "University of Bern" "located-in-the-administrative-territorial-entity" "Q70")

(refer-to ["properties.topics_main_category"])
(fact claim "University of Bern" "topic's-main-category" "Q8882782")

(refer-to ["properties.doi"])
(fact claim "University of Bern" "doi" "10.13039/100009068")

(refer-to ["properties.category_for_alumni_of_educational_institution"])
(fact claim "University of Bern" "category-for-alumni-of-educational-institution" "Q8882784")

(refer-to ["properties.sudoc_authorities"])
(fact claim "University of Bern" "sudoc-authorities" "027909220")

(refer-to ["properties.hds_id"])
(fact claim "University of Bern" "hds-id" "10972")

(refer-to ["properties.bnf_id"])
(fact claim "University of Bern" "bnf-id" "11984981s")

(refer-to ["properties.member_of"])
(fact claim "University of Bern" "member-of" "Q19861084")

(refer-to ["properties.freebase_id"])
(fact claim "University of Bern" "freebase-id" "/m/04c293")

(refer-to ["properties.inception"])
(fact claim "University of Bern" "inception" "+1834-01-01T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "University of Bern" "isni" "0000 0001 0726 5157")

(refer-to ["properties.official_website"])
(fact claim "University of Bern" "official-website" "http://www.unibe.ch")

(refer-to ["properties.gnd_id"])
(fact claim "University of Bern" "gnd-id" "2023768-6")

(refer-to ["properties.logo_image"])
(fact claim "University of Bern" "logo-image" "Logo Universität Bern.svg")

(refer-to ["properties.instance_of"])
(fact claim "University of Bern" "instance-of" "Q1767829")
(fact claim "University of Bern" "instance-of" "Q3918")

(refer-to ["properties.employees"])
(fact claim "University of Bern" "employees" "quantity")

(refer-to ["properties.image"])
(fact claim "University of Bern" "image" "Universität Bern.JPG")

(refer-to ["properties.grid_id"])
(fact claim "University of Bern" "grid-id" "grid.5734.5")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "University of Bern" "library-of-congress-authority-id" "n80022884")

(refer-to ["properties.quora_topic_id"])
(fact claim "University of Bern" "quora-topic-id" "University-of-Bern")

(refer-to ["properties.subsidiary"])
(fact claim "University of Bern" "subsidiary" "Q45131726")

(refer-to ["properties.openmlol_author_id"])
(fact claim "University of Bern" "openmlol-author-id" "166583")
