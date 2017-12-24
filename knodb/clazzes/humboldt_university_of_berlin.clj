(ns clazzes.humboldt_university_of_berlin
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Humboldt University of Berlin")

(name-as-in "Humboldt University of Berlin" "柏林洪堡大學" "zh-hk")
(name-as-in "Humboldt University of Berlin" "Universidade Humboldt de Berlim" "pt")
(name-as-in "Humboldt University of Berlin" "Humboldt University of Berlin" "en")
(name-as-in "Humboldt University of Berlin" "université Humboldt de Berlin" "fr")
(name-as-in "Humboldt University of Berlin" "柏林洪堡大學" "zh-tw")
(name-as-in "Humboldt University of Berlin" "Humboldt-Universität zu Berlin" "de")
(name-as-in "Humboldt University of Berlin" "Берлинский университет" "ru")
(name-as-in "Humboldt University of Berlin" "Universidad Humboldt de Berlín" "es")
(name-as-in "Humboldt University of Berlin" "フンボルト大学ベルリン" "ja")
(name-as-in "Humboldt University of Berlin" "柏林洪堡大学" "zh-cn")
(name-as-in "Humboldt University of Berlin" "柏林洪堡大学" "zh-sg")

(descr-as-in "Humboldt University of Berlin" "" "zh-hk")
(descr-as-in "Humboldt University of Berlin" "" "pt")
(descr-as-in "Humboldt University of Berlin" "university in Berlin, Germany" "en")
(descr-as-in "Humboldt University of Berlin" "université allemande" "fr")
(descr-as-in "Humboldt University of Berlin" "" "zh-tw")
(descr-as-in "Humboldt University of Berlin" "deutsche Hochschule" "de")
(descr-as-in "Humboldt University of Berlin" "университет в Берлине" "ru")
(descr-as-in "Humboldt University of Berlin" "" "es")
(descr-as-in "Humboldt University of Berlin" "" "ja")
(descr-as-in "Humboldt University of Berlin" "" "zh-cn")
(descr-as-in "Humboldt University of Berlin" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Humboldt University of Berlin" "country" "Q183")

(refer-to ["properties.commons_gallery"])
(fact claim "Humboldt University of Berlin" "commons-gallery" "Humboldt-Universität Berlin")

(refer-to ["properties.commons_category"])
(fact claim "Humboldt University of Berlin" "commons-category" "Humboldt-Universität zu Berlin")

(refer-to ["properties.bav_id"])
(fact claim "Humboldt University of Berlin" "bav-id" "ADV11107967")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Humboldt University of Berlin" "encyclopædia-britannica-online-id" "topic/Humboldt-University-of-Berlin")

(refer-to ["properties.viaf_id"])
(fact claim "Humboldt University of Berlin" "viaf-id" "162898525")

(refer-to ["properties.language_used"])
(fact claim "Humboldt University of Berlin" "language-used" "Q188")

(refer-to ["properties.headquarters_location"])
(fact claim "Humboldt University of Berlin" "headquarters-location" "Q160899")
(fact claim "Humboldt University of Berlin" "headquarters-location" "Q677514")

(refer-to ["properties.ipv6_routing_prefix"])
(fact claim "Humboldt University of Berlin" "ipv6-routing-prefix" "2001:638:813::/48")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Humboldt University of Berlin" "located-in-the-administrative-territorial-entity" "Q64")

(refer-to ["properties.budget"])
(fact claim "Humboldt University of Berlin" "budget" "quantity")

(refer-to ["properties.babelnet_id"])
(fact claim "Humboldt University of Berlin" "babelnet-id" "02431412n")

(refer-to ["properties.topics_main_category"])
(fact claim "Humboldt University of Berlin" "topic's-main-category" "Q6974725")

(refer-to ["properties.geonames_id"])
(fact claim "Humboldt University of Berlin" "geonames-id" "6944074")

(refer-to ["properties.founded_by"])
(fact claim "Humboldt University of Berlin" "founded-by" "Q77888")

(refer-to ["properties.doi"])
(fact claim "Humboldt University of Berlin" "doi" "10.13039/501100006211")

(refer-to ["properties.category_for_alumni_of_educational_institution"])
(fact claim "Humboldt University of Berlin" "category-for-alumni-of-educational-institution" "Q7445797")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Humboldt University of Berlin" "sudoc-authorities" "026453584")

(refer-to ["properties.elevation_above_sea_level"])
(fact claim "Humboldt University of Berlin" "elevation-above-sea-level" "quantity")

(refer-to ["properties.bnf_id"])
(fact claim "Humboldt University of Berlin" "bnf-id" "118698965")

(refer-to ["properties.member_of"])
(fact claim "Humboldt University of Berlin" "member-of" "Q2514863")

(refer-to ["properties.follows"])
(fact claim "Humboldt University of Berlin" "follows" "Q20265570")

(refer-to ["properties.freebase_id"])
(fact claim "Humboldt University of Berlin" "freebase-id" "/m/01stzp")

(refer-to ["properties.coordinate_location"])
(fact claim "Humboldt University of Berlin" "coordinate-location" "lng 13.393333333333 lat 52.518055555556 alt ")

(refer-to ["properties.nla_australia_id"])
(fact claim "Humboldt University of Berlin" "nla-australia-id" "36547280")

(refer-to ["properties.inception"])
(fact claim "Humboldt University of Berlin" "inception" "+1949-02-08T00:00:00Z")

(refer-to ["properties.students_count"])
(fact claim "Humboldt University of Berlin" "students-count" "quantity")
(fact claim "Humboldt University of Berlin" "students-count" "quantity")
(fact claim "Humboldt University of Berlin" "students-count" "quantity")

(refer-to ["properties.isni"])
(fact claim "Humboldt University of Berlin" "isni" "0000 0001 2248 7639")

(refer-to ["properties.official_website"])
(fact claim "Humboldt University of Berlin" "official-website" "http://www.hu-berlin.de/")

(refer-to ["properties.gnd_id"])
(fact claim "Humboldt University of Berlin" "gnd-id" "1220138-8")

(refer-to ["properties.logo_image"])
(fact claim "Humboldt University of Berlin" "logo-image" "Huberlin-logo.svg")

(refer-to ["properties.has_part"])
(fact claim "Humboldt University of Berlin" "has-part" "Q1525910")
(fact claim "Humboldt University of Berlin" "has-part" "Q1407819")
(fact claim "Humboldt University of Berlin" "has-part" "Q28734878")

(refer-to ["properties.instance_of"])
(fact claim "Humboldt University of Berlin" "instance-of" "Q1767829")
(fact claim "Humboldt University of Berlin" "instance-of" "Q15734684")
(fact claim "Humboldt University of Berlin" "instance-of" "Q875538")

(refer-to ["properties.legal_form"])
(fact claim "Humboldt University of Berlin" "legal-form" "Q15734684")

(refer-to ["properties.part_of"])
(fact claim "Humboldt University of Berlin" "part-of" "Q1622259")

(refer-to ["properties.employees"])
(fact claim "Humboldt University of Berlin" "employees" "quantity")

(refer-to ["properties.selibr"])
(fact claim "Humboldt University of Berlin" "selibr" "117918")

(refer-to ["properties.image"])
(fact claim "Humboldt University of Berlin" "image" "Berlin, Mitte, Unter den Linden, Hauptgebäude der Humboldt-Universität 02.jpg")

(refer-to ["properties.official_name"])
(fact claim "Humboldt University of Berlin" "official-name" "monolingualtext")

(refer-to ["properties.native_label"])
(fact claim "Humboldt University of Berlin" "native-label" "monolingualtext")

(refer-to ["properties.grid_id"])
(fact claim "Humboldt University of Berlin" "grid-id" "grid.7468.d")

(refer-to ["properties.motto_text"])
(fact claim "Humboldt University of Berlin" "motto-text" "monolingualtext")

(refer-to ["properties.ulan_id"])
(fact claim "Humboldt University of Berlin" "ulan-id" "500299900")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Humboldt University of Berlin" "library-of-congress-authority-id" "n79148985")

(refer-to ["properties.quora_topic_id"])
(fact claim "Humboldt University of Berlin" "quora-topic-id" "Humboldt-University-of-Berlin")

(refer-to ["properties.rector"])
(fact claim "Humboldt University of Berlin" "rector" "Q1618020")
(fact claim "Humboldt University of Berlin" "rector" "Q1085485")
(fact claim "Humboldt University of Berlin" "rector" "Q1717493")
(fact claim "Humboldt University of Berlin" "rector" "Q1581342")
(fact claim "Humboldt University of Berlin" "rector" "Q1902103")
(fact claim "Humboldt University of Berlin" "rector" "Q121809")
(fact claim "Humboldt University of Berlin" "rector" "Q101348")
(fact claim "Humboldt University of Berlin" "rector" "Q57497")
(fact claim "Humboldt University of Berlin" "rector" "Q85295")
(fact claim "Humboldt University of Berlin" "rector" "Q72966")
(fact claim "Humboldt University of Berlin" "rector" "Q68697")
(fact claim "Humboldt University of Berlin" "rector" "Q84593")
(fact claim "Humboldt University of Berlin" "rector" "Q74807")
(fact claim "Humboldt University of Berlin" "rector" "Q9021")
(fact claim "Humboldt University of Berlin" "rector" "Q1792347")
(fact claim "Humboldt University of Berlin" "rector" "Q61863")
(fact claim "Humboldt University of Berlin" "rector" "Q90646")
(fact claim "Humboldt University of Berlin" "rector" "Q76756")
(fact claim "Humboldt University of Berlin" "rector" "Q64584")
(fact claim "Humboldt University of Berlin" "rector" "Q76894")
(fact claim "Humboldt University of Berlin" "rector" "Q124165")
(fact claim "Humboldt University of Berlin" "rector" "Q57125")
(fact claim "Humboldt University of Berlin" "rector" "Q86963")
(fact claim "Humboldt University of Berlin" "rector" "Q1386905")
(fact claim "Humboldt University of Berlin" "rector" "Q92113")
(fact claim "Humboldt University of Berlin" "rector" "Q86633")
(fact claim "Humboldt University of Berlin" "rector" "Q74426")
(fact claim "Humboldt University of Berlin" "rector" "Q67561")
(fact claim "Humboldt University of Berlin" "rector" "Q69526")
(fact claim "Humboldt University of Berlin" "rector" "Q61766")
(fact claim "Humboldt University of Berlin" "rector" "Q73108")
(fact claim "Humboldt University of Berlin" "rector" "Q96406")
(fact claim "Humboldt University of Berlin" "rector" "Q103919")
(fact claim "Humboldt University of Berlin" "rector" "Q61570")
(fact claim "Humboldt University of Berlin" "rector" "")
(fact claim "Humboldt University of Berlin" "rector" "Q2582001")
(fact claim "Humboldt University of Berlin" "rector" "Q99108")
(fact claim "Humboldt University of Berlin" "rector" "Q61151")
(fact claim "Humboldt University of Berlin" "rector" "Q1323921")
(fact claim "Humboldt University of Berlin" "rector" "Q1610894")
(fact claim "Humboldt University of Berlin" "rector" "Q2544315")
(fact claim "Humboldt University of Berlin" "rector" "Q2547357")
(fact claim "Humboldt University of Berlin" "rector" "Q1302790")
(fact claim "Humboldt University of Berlin" "rector" "Q15446488")
(fact claim "Humboldt University of Berlin" "rector" "Q15429071")
(fact claim "Humboldt University of Berlin" "rector" "Q1664773")

(refer-to ["properties.named_after"])
(fact claim "Humboldt University of Berlin" "named-after" "Q77888")
(fact claim "Humboldt University of Berlin" "named-after" "Q6694")
