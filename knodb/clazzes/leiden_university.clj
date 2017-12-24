(ns clazzes.leiden_university
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Leiden University")

(name-as-in "Leiden University" "萊頓大學" "zh-hk")
(name-as-in "Leiden University" "Universidade de Leiden" "pt")
(name-as-in "Leiden University" "Leiden University" "en")
(name-as-in "Leiden University" "université de Leyde" "fr")
(name-as-in "Leiden University" "萊登大學" "zh-tw")
(name-as-in "Leiden University" "Universität Leiden" "de")
(name-as-in "Leiden University" "Лейденский университет" "ru")
(name-as-in "Leiden University" "Universidad de Leiden" "es")
(name-as-in "Leiden University" "ライデン大学" "ja")
(name-as-in "Leiden University" "莱顿大学" "zh-cn")
(name-as-in "Leiden University" "莱顿大学" "zh-sg")

(descr-as-in "Leiden University" "" "zh-hk")
(descr-as-in "Leiden University" "" "pt")
(descr-as-in "Leiden University" "university in the Netherlands" "en")
(descr-as-in "Leiden University" "université des Pays-Bas" "fr")
(descr-as-in "Leiden University" "" "zh-tw")
(descr-as-in "Leiden University" "Universität in den Niederlanden" "de")
(descr-as-in "Leiden University" "университет в Нидерландах" "ru")
(descr-as-in "Leiden University" "" "es")
(descr-as-in "Leiden University" "" "ja")
(descr-as-in "Leiden University" "" "zh-cn")
(descr-as-in "Leiden University" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Leiden University" "country" "Q55")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.leiden_university"])
(fact claim "Leiden University" "commons-category" "Leiden University")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Leiden University" "encyclopædia-britannica-online-id" "topic/State-University-of-Leiden")

(refer-to ["properties.cantic_id"])
(fact claim "Leiden University" "cantic-id" "a1120607x")

(refer-to ["properties.viaf_id"])
(fact claim "Leiden University" "viaf-id" "138979529")

(refer-to ["properties.language_used"])
(fact claim "Leiden University" "language-used" "Q1860")

(refer-to ["properties.headquarters_location"])
(fact claim "Leiden University" "headquarters-location" "Q43631")

(refer-to ["properties.ipv6_routing_prefix"])
(fact claim "Leiden University" "ipv6-routing-prefix" "2001:610:318::/48")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Leiden University" "located-in-the-administrative-territorial-entity" "Q43631")

(refer-to ["properties.babelnet_id"])
(fact claim "Leiden University" "babelnet-id" "13912457n")

(refer-to ["properties.topics_main_category"])
(fact claim "Leiden University" "topic's-main-category" "Q8587088")

(refer-to ["properties.youtube_channel_id"])
(fact claim "Leiden University" "youtube-channel-id" "UCVYvjcAFF4urHb8X5Tmt_vA")

(refer-to ["properties.founded_by"])
(fact claim "Leiden University" "founded-by" "Q78454")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Leiden University" "nkcr-aut-id" "ko2002162130")

(refer-to ["properties.doi"])
(fact claim "Leiden University" "doi" "10.13039/501100001717")

(refer-to ["properties.seal_image"])
(fact claim "Leiden University" "seal-image" "Seal Leiden University.jpg")

(refer-to ["properties.category_for_alumni_of_educational_institution"])
(fact claim "Leiden University" "category-for-alumni-of-educational-institution" "Q8587089")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Leiden University" "sudoc-authorities" "027370208")

(refer-to ["properties.instagram_username"])
(fact claim "Leiden University" "instagram-username" "universiteitleiden")

(refer-to ["properties.bnf_id"])
(fact claim "Leiden University" "bnf-id" "118690185")

(refer-to ["properties.member_of"])
(fact claim "Leiden University" "member-of" "Q211620")
(fact claim "Leiden University" "member-of" "Q19861084")
(fact claim "Leiden University" "member-of" "Q35677307")

(refer-to ["properties.freebase_id"])
(fact claim "Leiden University" "freebase-id" "/m/0lvng")

(refer-to ["properties.ringgold_id"])
(fact claim "Leiden University" "ringgold-id" "4496")

(refer-to ["properties.coordinate_location"])
(fact claim "Leiden University" "coordinate-location" "lng 4.4869488888889 lat 52.156071111111 alt ")

(refer-to ["properties.facebook_profile_id"])
(fact claim "Leiden University" "facebook-profile-id" "UniversiteitLeiden")

(refer-to ["properties.nla_australia_id"])
(fact claim "Leiden University" "nla-australia-id" "36532304")

(refer-to ["properties.inception"])
(fact claim "Leiden University" "inception" "+1575-01-01T00:00:00Z")

(refer-to ["properties.students_count"])
(fact claim "Leiden University" "students-count" "quantity")

(refer-to ["properties.researchgate_institute_id"])
(fact claim "Leiden University" "researchgate-institute-id" "Leiden_University")

(refer-to ["properties.isni"])
(fact claim "Leiden University" "isni" "0000 0001 2013 2535")
(fact claim "Leiden University" "isni" "0000 0001 2312 1970")

(refer-to ["properties.official_website"])
(fact claim "Leiden University" "official-website" "https://www.universiteitleiden.nl/en")

(refer-to ["properties.gnd_id"])
(fact claim "Leiden University" "gnd-id" "1009462-3")
(fact claim "Leiden University" "gnd-id" "1025656059")

(refer-to ["properties.has_part"])
(fact claim "Leiden University" "has-part" "Q638395")

(refer-to ["properties.instance_of"])
(fact claim "Leiden University" "instance-of" "Q3918")

(refer-to ["properties.google__id"])
(fact claim "Leiden University" "google_-id" "+UniversiteitLeiden")

(refer-to ["properties.bne_id"])
(fact claim "Leiden University" "bne-id" "XX134820")

(refer-to ["properties.employees"])
(fact claim "Leiden University" "employees" "quantity")

(refer-to ["properties.ipv4_routing_prefix"])
(fact claim "Leiden University" "ipv4-routing-prefix" "194.171.106.0/24")
(fact claim "Leiden University" "ipv4-routing-prefix" "188.200.154.48/29")

(refer-to ["properties.image"])
(fact claim "Leiden University" "image" "Leiden - Rapenburg 73.jpg")

(refer-to ["properties.twitter_username"])
(fact claim "Leiden University" "twitter-username" "UniLeiden")

(refer-to ["properties.actorenregister_id"])
(fact claim "Leiden University" "actorenregister-id" "0ecb6028-0eda-47a1-b9a6-e1aaad1f6a21")

(refer-to ["properties.official_name"])
(fact claim "Leiden University" "official-name" "monolingualtext")

(refer-to ["properties.grid_id"])
(fact claim "Leiden University" "grid-id" "grid.5132.5")

(refer-to ["properties.motto_text"])
(fact claim "Leiden University" "motto-text" "monolingualtext")

(refer-to ["properties.national_library_of_greece_id"])
(fact claim "Leiden University" "national-library-of-greece-id" "229825")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Leiden University" "library-of-congress-authority-id" "n79058414")

(refer-to ["properties.quora_topic_id"])
(fact claim "Leiden University" "quora-topic-id" "Leiden-University")

(refer-to ["properties.rector"])
(fact claim "Leiden University" "rector" "Q2878535")
