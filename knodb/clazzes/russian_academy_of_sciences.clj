(ns clazzes.russian_academy_of_sciences
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Russian Academy of Sciences")

(name-as-in "Russian Academy of Sciences" "" "zh-hk")
(name-as-in "Russian Academy of Sciences" "Academia de Ciências da Rússia" "pt")
(name-as-in "Russian Academy of Sciences" "Russian Academy of Sciences" "en")
(name-as-in "Russian Academy of Sciences" "Académie des sciences de Russie" "fr")
(name-as-in "Russian Academy of Sciences" "" "zh-tw")
(name-as-in "Russian Academy of Sciences" "Russische Akademie der Wissenschaften" "de")
(name-as-in "Russian Academy of Sciences" "Российская академия наук" "ru")
(name-as-in "Russian Academy of Sciences" "Academia de Ciencias de Rusia" "es")
(name-as-in "Russian Academy of Sciences" "ロシア科学アカデミー" "ja")
(name-as-in "Russian Academy of Sciences" "" "zh-cn")
(name-as-in "Russian Academy of Sciences" "" "zh-sg")

(descr-as-in "Russian Academy of Sciences" "" "zh-hk")
(descr-as-in "Russian Academy of Sciences" "" "pt")
(descr-as-in "Russian Academy of Sciences" "academy of sciences" "en")
(descr-as-in "Russian Academy of Sciences" "" "fr")
(descr-as-in "Russian Academy of Sciences" "" "zh-tw")
(descr-as-in "Russian Academy of Sciences" "" "de")
(descr-as-in "Russian Academy of Sciences" "ведущее научное учреждение Российской Федерации" "ru")
(descr-as-in "Russian Academy of Sciences" "organización científica nacional de Rusia" "es")
(descr-as-in "Russian Academy of Sciences" "" "ja")
(descr-as-in "Russian Academy of Sciences" "" "zh-cn")
(descr-as-in "Russian Academy of Sciences" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Russian Academy of Sciences" "country" "Q159")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.russian_academy_of_sciences"])
(fact claim "Russian Academy of Sciences" "commons-category" "Russian Academy of Sciences")

(refer-to ["properties.bav_id"])
(fact claim "Russian Academy of Sciences" "bav-id" "ADV10038547")

(refer-to ["properties.viaf_id"])
(fact claim "Russian Academy of Sciences" "viaf-id" "131888462")
(fact claim "Russian Academy of Sciences" "viaf-id" "157037807")

(refer-to ["properties.headquarters_location"])
(fact claim "Russian Academy of Sciences" "headquarters-location" "Q649")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Russian Academy of Sciences" "located-in-the-administrative-territorial-entity" "Q649")

(refer-to ["properties.topics_main_category"])
(fact claim "Russian Academy of Sciences" "topic's-main-category" "Q6547692")

(refer-to ["properties.founded_by"])
(fact claim "Russian Academy of Sciences" "founded-by" "Q8479")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "Russian Academy of Sciences" "permanent-duplicated-item" "Q25554696")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Russian Academy of Sciences" "nkcr-aut-id" "ko20010094279")

(refer-to ["properties.doi"])
(fact claim "Russian Academy of Sciences" "doi" "10.13039/501100002674")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Russian Academy of Sciences" "sudoc-authorities" "032493819")
(fact claim "Russian Academy of Sciences" "sudoc-authorities" "031398871")

(refer-to ["properties.bnf_id"])
(fact claim "Russian Academy of Sciences" "bnf-id" "12262054f")

(refer-to ["properties.freebase_id"])
(fact claim "Russian Academy of Sciences" "freebase-id" "/m/020vy3")

(refer-to ["properties.coordinate_location"])
(fact claim "Russian Academy of Sciences" "coordinate-location" "lng 37.577813888889 lat 55.710794444444 alt ")

(refer-to ["properties.nla_australia_id"])
(fact claim "Russian Academy of Sciences" "nla-australia-id" "35683698")

(refer-to ["properties.inception"])
(fact claim "Russian Academy of Sciences" "inception" "+1724-02-08T00:00:00Z")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "Russian Academy of Sciences" "gran-enciclopèdia-catalana-id" "0000438")

(refer-to ["properties.isni"])
(fact claim "Russian Academy of Sciences" "isni" "0000 0001 2192 9124")

(refer-to ["properties.official_website"])
(fact claim "Russian Academy of Sciences" "official-website" "http://www.ras.ru/")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Russian Academy of Sciences" "ndl-auth-id" "00650737")

(refer-to ["properties.gnd_id"])
(fact claim "Russian Academy of Sciences" "gnd-id" "5052646-7")

(refer-to ["properties.logo_image"])
(fact claim "Russian Academy of Sciences" "logo-image" "Ras-logo.svg")

(refer-to ["properties.has_part"])
(fact claim "Russian Academy of Sciences" "has-part" "Q4339444")
(fact claim "Russian Academy of Sciences" "has-part" "Q24932531")
(fact claim "Russian Academy of Sciences" "has-part" "Q4339441")
(fact claim "Russian Academy of Sciences" "has-part" "Q4339445")
(fact claim "Russian Academy of Sciences" "has-part" "Q4339448")
(fact claim "Russian Academy of Sciences" "has-part" "Q4339450")
(fact claim "Russian Academy of Sciences" "has-part" "Q25383155")
(fact claim "Russian Academy of Sciences" "has-part" "Q4339446")

(refer-to ["properties.described_by_source"])
(fact claim "Russian Academy of Sciences" "described-by-source" "Q2041543")

(refer-to ["properties.open_library_id"])
(fact claim "Russian Academy of Sciences" "open-library-id" "OL3427572A")

(refer-to ["properties.instance_of"])
(fact claim "Russian Academy of Sciences" "instance-of" "Q414147")

(refer-to ["properties.replaces"])
(refer-to ["clazzes.academy_of_sciences_of_the_ussr"])
(fact claim "Russian Academy of Sciences" "replaces" "Academy of Sciences of the USSR")

(refer-to ["properties.selibr"])
(fact claim "Russian Academy of Sciences" "selibr" "127521")

(refer-to ["properties.image"])
(fact claim "Russian Academy of Sciences" "image" "Golden brain.png")

(refer-to ["properties.grid_id"])
(fact claim "Russian Academy of Sciences" "grid-id" "grid.4886.2")

(refer-to ["properties.national_library_of_greece_id"])
(fact claim "Russian Academy of Sciences" "national-library-of-greece-id" "124277")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Russian Academy of Sciences" "library-of-congress-authority-id" "n81147418")

(refer-to ["properties.quora_topic_id"])
(fact claim "Russian Academy of Sciences" "quora-topic-id" "Russian-Academy-of-Sciences")

(refer-to ["properties.subsidiary"])
(fact claim "Russian Academy of Sciences" "subsidiary" "Q581272")
(fact claim "Russian Academy of Sciences" "subsidiary" "Q1810862")
(fact claim "Russian Academy of Sciences" "subsidiary" "Q133822")
