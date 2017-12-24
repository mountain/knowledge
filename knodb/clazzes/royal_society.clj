(ns clazzes.royal_society
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Royal Society")

(name-as-in "Royal Society" "皇家學會" "zh-hk")
(name-as-in "Royal Society" "Royal Society" "pt")
(name-as-in "Royal Society" "Royal Society" "en")
(name-as-in "Royal Society" "Royal Society" "fr")
(name-as-in "Royal Society" "皇家學會" "zh-tw")
(name-as-in "Royal Society" "Royal Society" "de")
(name-as-in "Royal Society" "Лондонское королевское общество" "ru")
(name-as-in "Royal Society" "Royal Society" "es")
(name-as-in "Royal Society" "王立協会" "ja")
(name-as-in "Royal Society" "皇家学会" "zh-cn")
(name-as-in "Royal Society" "皇家学会" "zh-sg")

(descr-as-in "Royal Society" "" "zh-hk")
(descr-as-in "Royal Society" "" "pt")
(descr-as-in "Royal Society" "English learned society for science" "en")
(descr-as-in "Royal Society" "Société savante londonienne" "fr")
(descr-as-in "Royal Society" "" "zh-tw")
(descr-as-in "Royal Society" "britische Gelehrtengesellschaft zur Wissenschaftspflege" "de")
(descr-as-in "Royal Society" "научное общество Великобритании" "ru")
(descr-as-in "Royal Society" "sociedad científica del Reino Unido" "es")
(descr-as-in "Royal Society" "" "ja")
(descr-as-in "Royal Society" "" "zh-cn")
(descr-as-in "Royal Society" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Royal Society" "country" "Q145")

(refer-to ["properties.award_received"])
(fact claim "Royal Society" "award-received" "Q3323451")
(fact claim "Royal Society" "award-received" "Q329157")

(refer-to ["properties.science_museum_people_id"])
(fact claim "Royal Society" "science-museum-people-id" "cp17351")

(refer-to ["properties.field_of_work"])
(fact claim "Royal Society" "field-of-work" "Q336")
(fact claim "Royal Society" "field-of-work" "Q484591")
(fact claim "Royal Society" "field-of-work" "Q7991")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.royal_society"])
(fact claim "Royal Society" "commons-category" "Royal Society")

(refer-to ["properties.bav_id"])
(fact claim "Royal Society" "bav-id" "ADV10025955")

(refer-to ["properties.cantic_id"])
(fact claim "Royal Society" "cantic-id" "a11381140")

(refer-to ["properties.viaf_id"])
(fact claim "Royal Society" "viaf-id" "157503209")

(refer-to ["properties.headquarters_location"])
(fact claim "Royal Society" "headquarters-location" "Q84")

(refer-to ["properties.spoken_text_audio"])
(fact claim "Royal Society" "spoken-text-audio" "Hy-Լոնդոնի թագավորական ընկերություն (Royal Society).ogg")

(refer-to ["properties.commons_institution_page"])
(refer-to ["clazzes.royal_society"])
(fact claim "Royal Society" "commons-institution-page" "Royal Society")

(refer-to ["properties.topics_main_category"])
(fact claim "Royal Society" "topic's-main-category" "Q6509239")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Royal Society" "nkcr-aut-id" "ko2003162204")

(refer-to ["properties.doi"])
(fact claim "Royal Society" "doi" "10.13039/501100000288")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Royal Society" "sudoc-authorities" "122560485")

(refer-to ["properties.bnf_id"])
(fact claim "Royal Society" "bnf-id" "121307601")

(refer-to ["properties.member_of"])
(fact claim "Royal Society" "member-of" "Q19861084")

(refer-to ["properties.follows"])
(fact claim "Royal Society" "follows" "Q5607577")

(refer-to ["properties.freebase_id"])
(fact claim "Royal Society" "freebase-id" "/m/02hcxm")

(refer-to ["properties.art_uk_venue_id"])
(fact claim "Royal Society" "art-uk-venue-id" "the-royal-society-7416")

(refer-to ["properties.ringgold_id"])
(fact claim "Royal Society" "ringgold-id" "61565")

(refer-to ["properties.coordinate_location"])
(fact claim "Royal Society" "coordinate-location" "lng -0.13246111111111 lat 51.505980555556 alt ")

(refer-to ["properties.nla_australia_id"])
(fact claim "Royal Society" "nla-australia-id" "36101708")

(refer-to ["properties.inception"])
(fact claim "Royal Society" "inception" "+1660-11-01T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Royal Society" "isni" "0000 0001 2248 8383")
(fact claim "Royal Society" "isni" "0000 0001 2248 733X")

(refer-to ["properties.official_website"])
(fact claim "Royal Society" "official-website" "http://royalsociety.org/")

(refer-to ["properties.gnd_id"])
(fact claim "Royal Society" "gnd-id" "39272-8")

(refer-to ["properties.logo_image"])
(fact claim "Royal Society" "logo-image" "Arms of the Royal Society.svg")

(refer-to ["properties.open_library_id"])
(fact claim "Royal Society" "open-library-id" "OL1290127A")
(fact claim "Royal Society" "open-library-id" "OL2760312A")
(fact claim "Royal Society" "open-library-id" "OL4490896A")

(refer-to ["properties.archon_code"])
(fact claim "Royal Society" "archon-code" "117")

(refer-to ["properties.instance_of"])
(fact claim "Royal Society" "instance-of" "Q162633")

(refer-to ["properties.bne_id"])
(fact claim "Royal Society" "bne-id" "XX102063")

(refer-to ["properties.selibr"])
(fact claim "Royal Society" "selibr" "251043")

(refer-to ["properties.ne_se_id"])
(fact claim "Royal Society" "ne_se-id" "royal-society")

(refer-to ["properties.image"])
(fact claim "Royal Society" "image" "Royal Society 20040420.jpg")

(refer-to ["properties.ptbnp_id"])
(fact claim "Royal Society" "ptbnp-id" "366290")

(refer-to ["properties.ra_collections_id"])
(fact claim "Royal Society" "ra-collections-id" "13848")

(refer-to ["properties.grid_id"])
(fact claim "Royal Society" "grid-id" "grid.421649.c")

(refer-to ["properties.ulan_id"])
(fact claim "Royal Society" "ulan-id" "500301966")

(refer-to ["properties.national_library_of_greece_id"])
(fact claim "Royal Society" "national-library-of-greece-id" "91394")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Royal Society" "library-of-congress-authority-id" "n79127772")

(refer-to ["properties.quora_topic_id"])
(fact claim "Royal Society" "quora-topic-id" "The-Royal-Society")

(refer-to ["properties.eu_transparency_register_id"])
(fact claim "Royal Society" "eu-transparency-register-id" "041898210470-66")
