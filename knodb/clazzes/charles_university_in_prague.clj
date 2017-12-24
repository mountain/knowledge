(ns clazzes.charles_university_in_prague
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Charles University in Prague")

(name-as-in "Charles University in Prague" "" "zh-hk")
(name-as-in "Charles University in Prague" "Universidade Carolina" "pt")
(name-as-in "Charles University in Prague" "Charles University in Prague" "en")
(name-as-in "Charles University in Prague" "université Charles de Prague" "fr")
(name-as-in "Charles University in Prague" "" "zh-tw")
(name-as-in "Charles University in Prague" "Karls-Universität Prag" "de")
(name-as-in "Charles University in Prague" "Карлов университет" "ru")
(name-as-in "Charles University in Prague" "Universidad Carolina" "es")
(name-as-in "Charles University in Prague" "プラハ・カレル大学" "ja")
(name-as-in "Charles University in Prague" "布拉格查尔斯大学" "zh-cn")
(name-as-in "Charles University in Prague" "" "zh-sg")

(descr-as-in "Charles University in Prague" "" "zh-hk")
(descr-as-in "Charles University in Prague" "" "pt")
(descr-as-in "Charles University in Prague" "oldest and largest university in the Czech Republic" "en")
(descr-as-in "Charles University in Prague" "université tchèque, fondée à Prague le 7 avril 1348" "fr")
(descr-as-in "Charles University in Prague" "" "zh-tw")
(descr-as-in "Charles University in Prague" "älteste und größte Universität Tschechiens" "de")
(descr-as-in "Charles University in Prague" "университет в Праге, Чехия: главный университет Чехии и старейший университет Центральной Европы" "ru")
(descr-as-in "Charles University in Prague" "universidad fundada en 1348 en Praga actualmente en la República Checa" "es")
(descr-as-in "Charles University in Prague" "" "ja")
(descr-as-in "Charles University in Prague" "" "zh-cn")
(descr-as-in "Charles University in Prague" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Charles University in Prague" "country" "Q213")

(refer-to ["properties.commons_gallery"])
(refer-to ["clazzes.charles_university_in_prague"])
(fact claim "Charles University in Prague" "commons-gallery" "Charles University in Prague")

(refer-to ["properties.great_russian_encyclopedia_online_id"])
(fact claim "Charles University in Prague" "great-russian-encyclopedia-online-id" "2047610")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.charles_university_in_prague"])
(fact claim "Charles University in Prague" "commons-category" "Charles University in Prague")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Charles University in Prague" "encyclopædia-britannica-online-id" "topic/Charles-University")

(refer-to ["properties.viaf_id"])
(fact claim "Charles University in Prague" "viaf-id" "271827209")

(refer-to ["properties.people_australia_id"])
(fact claim "Charles University in Prague" "people-australia-id" "1440337")

(refer-to ["properties.language_used"])
(fact claim "Charles University in Prague" "language-used" "Q9056")

(refer-to ["properties.headquarters_location"])
(fact claim "Charles University in Prague" "headquarters-location" "Q1085")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Charles University in Prague" "located-in-the-administrative-territorial-entity" "Q1085")

(refer-to ["properties.topics_main_category"])
(fact claim "Charles University in Prague" "topic's-main-category" "Q8967579")

(refer-to ["properties.founded_by"])
(fact claim "Charles University in Prague" "founded-by" "Q155669")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "Charles University in Prague" "permanent-duplicated-item" "Q23016489")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Charles University in Prague" "nkcr-aut-id" "kn20010710036")

(refer-to ["properties.doi"])
(fact claim "Charles University in Prague" "doi" "10.13039/100007397")

(refer-to ["properties.category_for_employees_of_the_organization"])
(fact claim "Charles University in Prague" "category-for-employees-of-the-organization" "Q7996020")

(refer-to ["properties.category_for_alumni_of_educational_institution"])
(fact claim "Charles University in Prague" "category-for-alumni-of-educational-institution" "Q6456694")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Charles University in Prague" "sudoc-authorities" "069566992")

(refer-to ["properties.bnf_id"])
(fact claim "Charles University in Prague" "bnf-id" "12080711p")

(refer-to ["properties.member_of"])
(fact claim "Charles University in Prague" "member-of" "Q211620")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Charles University in Prague" "national-library-of-israel-id" "000134576")

(refer-to ["properties.freebase_id"])
(fact claim "Charles University in Prague" "freebase-id" "/m/09hgk")

(refer-to ["properties.ringgold_id"])
(fact claim "Charles University in Prague" "ringgold-id" "37740")

(refer-to ["properties.coordinate_location"])
(fact claim "Charles University in Prague" "coordinate-location" "lng 14.4037 lat 50.0884 alt ")

(refer-to ["properties.nla_australia_id"])
(fact claim "Charles University in Prague" "nla-australia-id" "36750083")

(refer-to ["properties.inception"])
(fact claim "Charles University in Prague" "inception" "+1348-04-07T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Charles University in Prague" "isni" "0000 0001 1957 4408")
(fact claim "Charles University in Prague" "isni" "0000 0004 1937 116X")

(refer-to ["properties.official_website"])
(fact claim "Charles University in Prague" "official-website" "http://www.cuni.cz/")

(refer-to ["properties.gnd_id"])
(fact claim "Charles University in Prague" "gnd-id" "3511-7")

(refer-to ["properties.logo_image"])
(fact claim "Charles University in Prague" "logo-image" "Charles-University-symbol-4.png")

(refer-to ["properties.instance_of"])
(fact claim "Charles University in Prague" "instance-of" "Q3918")

(refer-to ["properties.bne_id"])
(fact claim "Charles University in Prague" "bne-id" "XX128132")

(refer-to ["properties.selibr"])
(fact claim "Charles University in Prague" "selibr" "244674")

(refer-to ["properties.ipv4_routing_prefix"])
(fact claim "Charles University in Prague" "ipv4-routing-prefix" "212.24.153.128/27")
(fact claim "Charles University in Prague" "ipv4-routing-prefix" "195.113.245.0/24")

(refer-to ["properties.image"])
(fact claim "Charles University in Prague" "image" "Prague Charles University.JPG")

(refer-to ["properties.bhl_creator_id"])
(fact claim "Charles University in Prague" "bhl-creator-id" "135302")

(refer-to ["properties.ptbnp_id"])
(fact claim "Charles University in Prague" "ptbnp-id" "458850")

(refer-to ["properties.grid_id"])
(fact claim "Charles University in Prague" "grid-id" "grid.4491.8")

(refer-to ["properties.ulan_id"])
(fact claim "Charles University in Prague" "ulan-id" "500308208")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Charles University in Prague" "library-of-congress-authority-id" "n80038495")

(refer-to ["properties.quora_topic_id"])
(fact claim "Charles University in Prague" "quora-topic-id" "Charles-University-in-Prague")

(refer-to ["properties.rector"])
(fact claim "Charles University in Prague" "rector" "Q15830272")
(fact claim "Charles University in Prague" "rector" "Q12059354")
(fact claim "Charles University in Prague" "rector" "Q23908468")
(fact claim "Charles University in Prague" "rector" "Q133637")
(fact claim "Charles University in Prague" "rector" "Q11174282")
(fact claim "Charles University in Prague" "rector" "Q12028393")
(fact claim "Charles University in Prague" "rector" "Q12048562")
(fact claim "Charles University in Prague" "rector" "Q10857770")

(refer-to ["properties.subsidiary"])
(fact claim "Charles University in Prague" "subsidiary" "Q3563550")
(fact claim "Charles University in Prague" "subsidiary" "Q45132566")

(refer-to ["properties.named_after"])
(fact claim "Charles University in Prague" "named-after" "Q155669")
