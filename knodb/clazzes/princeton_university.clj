(ns clazzes.princeton_university
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Princeton University")

(name-as-in "Princeton University" "普林斯頓大學" "zh-hk")
(name-as-in "Princeton University" "Universidade de Princeton" "pt")
(name-as-in "Princeton University" "Princeton University" "en")
(name-as-in "Princeton University" "université de Princeton" "fr")
(name-as-in "Princeton University" "普林斯頓大學" "zh-tw")
(name-as-in "Princeton University" "Princeton University" "de")
(name-as-in "Princeton University" "Принстонский университет" "ru")
(name-as-in "Princeton University" "Universidad de Princeton" "es")
(name-as-in "Princeton University" "プリンストン大学" "ja")
(name-as-in "Princeton University" "普林斯顿大学" "zh-cn")
(name-as-in "Princeton University" "" "zh-sg")

(descr-as-in "Princeton University" "" "zh-hk")
(descr-as-in "Princeton University" "" "pt")
(descr-as-in "Princeton University" "private Ivy League research university in Princeton, New Jersey, United States" "en")
(descr-as-in "Princeton University" "université américaine" "fr")
(descr-as-in "Princeton University" "" "zh-tw")
(descr-as-in "Princeton University" "Universität in New Jersey" "de")
(descr-as-in "Princeton University" "частный университет в Принстоне, Нью-Джерси, США" "ru")
(descr-as-in "Princeton University" "universidad de Nueva Jersey" "es")
(descr-as-in "Princeton University" "" "ja")
(descr-as-in "Princeton University" "" "zh-cn")
(descr-as-in "Princeton University" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Princeton University" "country" "Q30")

(refer-to ["properties.structurae_id_structure"])
(fact claim "Princeton University" "structurae-id-structure" "10000545")

(refer-to ["properties.carnegie_classification_of_institutions_of_higher_education"])
(fact claim "Princeton University" "carnegie-classification-of-institutions-of-higher-education" "Q23334765")
(fact claim "Princeton University" "carnegie-classification-of-institutions-of-higher-education" "Q23623487")
(fact claim "Princeton University" "carnegie-classification-of-institutions-of-higher-education" "Q23662487")
(fact claim "Princeton University" "carnegie-classification-of-institutions-of-higher-education" "Q23622828")
(fact claim "Princeton University" "carnegie-classification-of-institutions-of-higher-education" "Q23662760")
(fact claim "Princeton University" "carnegie-classification-of-institutions-of-higher-education" "Q23662432")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.princeton_university"])
(fact claim "Princeton University" "commons-category" "Princeton University")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Princeton University" "encyclopædia-britannica-online-id" "topic/Princeton-University")

(refer-to ["properties.viaf_id"])
(fact claim "Princeton University" "viaf-id" "141200041")

(refer-to ["properties.people_australia_id"])
(fact claim "Princeton University" "people-australia-id" "1063367")
(fact claim "Princeton University" "people-australia-id" "951333")

(refer-to ["properties.language_used"])
(fact claim "Princeton University" "language-used" "Q1860")

(refer-to ["properties.headquarters_location"])
(refer-to ["clazzes.princeton"])
(fact claim "Princeton University" "headquarters-location" "Princeton")

(refer-to ["properties.ipv6_routing_prefix"])
(fact claim "Princeton University" "ipv6-routing-prefix" "2a03:b600:643::/107")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(refer-to ["clazzes.princeton"])
(fact claim "Princeton University" "located-in-the-administrative-territorial-entity" "Princeton")
(fact claim "Princeton University" "located-in-the-administrative-territorial-entity" "Q138311")

(refer-to ["properties.name_assigning_authority_number"])
(fact claim "Princeton University" "name-assigning-authority-number" "88435")

(refer-to ["properties.topics_main_category"])
(fact claim "Princeton University" "topic's-main-category" "Q6974364")

(refer-to ["properties.postal_code"])
(fact claim "Princeton University" "postal-code" "08544-0070")

(refer-to ["properties.geonames_id"])
(fact claim "Princeton University" "geonames-id" "5102955")

(refer-to ["properties.tgn_id"])
(fact claim "Princeton University" "tgn-id" "7019108")

(refer-to ["properties.integrated_postsecondary_education_data_system_id"])
(fact claim "Princeton University" "integrated-postsecondary-education-data-system-id" "186131")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Princeton University" "nkcr-aut-id" "kn20051122017")

(refer-to ["properties.doi"])
(fact claim "Princeton University" "doi" "10.13039/100006734")

(refer-to ["properties.category_for_alumni_of_educational_institution"])
(fact claim "Princeton University" "category-for-alumni-of-educational-institution" "Q7002462")

(refer-to ["properties.academia_edu_institutional_id"])
(fact claim "Princeton University" "academia_edu-institutional-id" "princeton")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Princeton University" "sudoc-authorities" "026418673")

(refer-to ["properties.bnf_id"])
(fact claim "Princeton University" "bnf-id" "118669434")

(refer-to ["properties.member_of"])
(fact claim "Princeton University" "member-of" "Q49113")
(fact claim "Princeton University" "member-of" "Q19861084")
(fact claim "Princeton University" "member-of" "Q647039")
(fact claim "Princeton University" "member-of" "Q5059850")

(refer-to ["properties.freebase_id"])
(fact claim "Princeton University" "freebase-id" "/m/05zl0")

(refer-to ["properties.snac_ark_id"])
(fact claim "Princeton University" "snac-ark-id" "w63z1x39")

(refer-to ["properties.coordinate_location"])
(fact claim "Princeton University" "coordinate-location" "lng -74.65931 lat 40.34873 alt ")

(refer-to ["properties.inception"])
(fact claim "Princeton University" "inception" "+1746-01-01T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Princeton University" "isni" "0000 0001 2097 5006")
(fact claim "Princeton University" "isni" "0000 0004 1936 9078")

(refer-to ["properties.official_website"])
(fact claim "Princeton University" "official-website" "http://www.princeton.edu")

(refer-to ["properties.gnd_id"])
(fact claim "Princeton University" "gnd-id" "30381-1")

(refer-to ["properties.logo_image"])
(fact claim "Princeton University" "logo-image" "Princeton text logo.svg")

(refer-to ["properties.instance_of"])
(fact claim "Princeton University" "instance-of" "Q902104")
(fact claim "Princeton University" "instance-of" "Q15936437")
(fact claim "Princeton University" "instance-of" "Q1188663")
(fact claim "Princeton University" "instance-of" "Q23002054")

(refer-to ["properties.located_at_street_address"])
(fact claim "Princeton University" "located-at-street-address" "1 Nassau Hall, Princeton, NJ, 08544-0070")

(refer-to ["properties.ne_se_id"])
(fact claim "Princeton University" "ne_se-id" "princeton-university")

(refer-to ["properties.image"])
(fact claim "Princeton University" "image" "ClevelandTowerWatercolor20060829.jpg")

(refer-to ["properties.different_from"])
(fact claim "Princeton University" "different-from" "Q1439629")

(refer-to ["properties.nyt_topic_id"])
(fact claim "Princeton University" "nyt-topic-id" "organization/princeton-university")

(refer-to ["properties.grid_id"])
(fact claim "Princeton University" "grid-id" "grid.16750.35")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Princeton University" "library-of-congress-authority-id" "n79055384")

(refer-to ["properties.quora_topic_id"])
(fact claim "Princeton University" "quora-topic-id" "Princeton-University")

(refer-to ["properties.subsidiary"])
(fact claim "Princeton University" "subsidiary" "Q45135065")
(fact claim "Princeton University" "subsidiary" "Q45137042")

(refer-to ["properties.legal_entity_id"])
(fact claim "Princeton University" "legal-entity-id" "549300PJZYINN64GDJ90")

(refer-to ["properties.openmlol_author_id"])
(fact claim "Princeton University" "openmlol-author-id" "168314")
