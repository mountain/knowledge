(ns clazzes.bavarian_academy_of_sciences_and_humanities
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Bavarian Academy of Sciences and Humanities")

(name-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-hk")
(name-as-in "Bavarian Academy of Sciences and Humanities" "" "pt")
(name-as-in "Bavarian Academy of Sciences and Humanities" "Bavarian Academy of Sciences and Humanities" "en")
(name-as-in "Bavarian Academy of Sciences and Humanities" "Académie bavaroise des sciences" "fr")
(name-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-tw")
(name-as-in "Bavarian Academy of Sciences and Humanities" "Bayerische Akademie der Wissenschaften" "de")
(name-as-in "Bavarian Academy of Sciences and Humanities" "Баварская академия наук" "ru")
(name-as-in "Bavarian Academy of Sciences and Humanities" "Academia de Ciencias de Baviera" "es")
(name-as-in "Bavarian Academy of Sciences and Humanities" "バイエルン学士院" "ja")
(name-as-in "Bavarian Academy of Sciences and Humanities" "巴伐利亚科学人文学院" "zh-cn")
(name-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-sg")

(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-hk")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "pt")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "academy of sciences" "en")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "fr")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-tw")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "Akademie der Wissenschaften in Deutschland" "de")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "ru")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "es")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "ja")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-cn")
(descr-as-in "Bavarian Academy of Sciences and Humanities" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Bavarian Academy of Sciences and Humanities" "country" "Q183")

(refer-to ["properties.commons_category"])
(fact claim "Bavarian Academy of Sciences and Humanities" "commons-category" "Bayerische Akademie der Wissenschaften")

(refer-to ["properties.bav_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "bav-id" "ADV10006921")

(refer-to ["properties.cantic_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "cantic-id" "a10239765")

(refer-to ["properties.viaf_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "viaf-id" "123154646")
(fact claim "Bavarian Academy of Sciences and Humanities" "viaf-id" "195094305")

(refer-to ["properties.headquarters_location"])
(fact claim "Bavarian Academy of Sciences and Humanities" "headquarters-location" "Q1726")

(refer-to ["properties.heritage_designation"])
(fact claim "Bavarian Academy of Sciences and Humanities" "heritage-designation" "Q17297633")

(refer-to ["properties.topics_main_category"])
(fact claim "Bavarian Academy of Sciences and Humanities" "topic's-main-category" "Q8898015")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "nkcr-aut-id" "ko2002147953")

(refer-to ["properties.doi"])
(fact claim "Bavarian Academy of Sciences and Humanities" "doi" "10.13039/501100007306")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Bavarian Academy of Sciences and Humanities" "sudoc-authorities" "026471493")

(refer-to ["properties.bnf_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "bnf-id" "11871386r")

(refer-to ["properties.member_of"])
(fact claim "Bavarian Academy of Sciences and Humanities" "member-of" "Q1662834")

(refer-to ["properties.freebase_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "freebase-id" "/m/06pg8v")

(refer-to ["properties.coordinate_location"])
(fact claim "Bavarian Academy of Sciences and Humanities" "coordinate-location" "lng 11.5806 lat 48.1415 alt ")

(refer-to ["properties.nla_australia_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "nla-australia-id" "35002161")

(refer-to ["properties.inception"])
(fact claim "Bavarian Academy of Sciences and Humanities" "inception" "+1759-00-00T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Bavarian Academy of Sciences and Humanities" "isni" "0000 0001 0940 3517")

(refer-to ["properties.official_website"])
(fact claim "Bavarian Academy of Sciences and Humanities" "official-website" "http://badw.de")

(refer-to ["properties.gnd_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "gnd-id" "2005521-3")

(refer-to ["properties.has_part"])
(fact claim "Bavarian Academy of Sciences and Humanities" "has-part" "Q28738695")

(refer-to ["properties.instance_of"])
(fact claim "Bavarian Academy of Sciences and Humanities" "instance-of" "Q414147")
(fact claim "Bavarian Academy of Sciences and Humanities" "instance-of" "Q1320047")

(refer-to ["properties.nukat_warsawu_authorities"])
(fact claim "Bavarian Academy of Sciences and Humanities" "nukat-warsawu-authorities" "n97047505")

(refer-to ["properties.bne_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "bne-id" "XX92258")

(refer-to ["properties.selibr"])
(fact claim "Bavarian Academy of Sciences and Humanities" "selibr" "108101")

(refer-to ["properties.image"])
(fact claim "Bavarian Academy of Sciences and Humanities" "image" "Bayerische Akademie der Wissenschaften.jpg")

(refer-to ["properties.ptbnp_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "ptbnp-id" "468021")

(refer-to ["properties.grid_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "grid-id" "grid.423977.c")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Bavarian Academy of Sciences and Humanities" "library-of-congress-authority-id" "n80089974")
