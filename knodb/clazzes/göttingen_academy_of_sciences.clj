(ns clazzes.göttingen_academy_of_sciences
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Göttingen Academy of Sciences")

(name-as-in "Göttingen Academy of Sciences" "" "zh-hk")
(name-as-in "Göttingen Academy of Sciences" "Academia de Ciências de Göttingen" "pt")
(name-as-in "Göttingen Academy of Sciences" "Göttingen Academy of Sciences" "en")
(name-as-in "Göttingen Academy of Sciences" "Académie des sciences de Göttingen" "fr")
(name-as-in "Göttingen Academy of Sciences" "" "zh-tw")
(name-as-in "Göttingen Academy of Sciences" "Akademie der Wissenschaften zu Göttingen" "de")
(name-as-in "Göttingen Academy of Sciences" "Академия наук в Гёттингене" "ru")
(name-as-in "Göttingen Academy of Sciences" "Academia de Ciencias de Gotinga" "es")
(name-as-in "Göttingen Academy of Sciences" "ゲッチンゲン科学アカデミー" "ja")
(name-as-in "Göttingen Academy of Sciences" "" "zh-cn")
(name-as-in "Göttingen Academy of Sciences" "" "zh-sg")

(descr-as-in "Göttingen Academy of Sciences" "" "zh-hk")
(descr-as-in "Göttingen Academy of Sciences" "" "pt")
(descr-as-in "Göttingen Academy of Sciences" "" "en")
(descr-as-in "Göttingen Academy of Sciences" "" "fr")
(descr-as-in "Göttingen Academy of Sciences" "" "zh-tw")
(descr-as-in "Göttingen Academy of Sciences" "wissenschaftliche Akademie in Deutschland" "de")
(descr-as-in "Göttingen Academy of Sciences" "" "ru")
(descr-as-in "Göttingen Academy of Sciences" "" "es")
(descr-as-in "Göttingen Academy of Sciences" "" "ja")
(descr-as-in "Göttingen Academy of Sciences" "" "zh-cn")
(descr-as-in "Göttingen Academy of Sciences" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Göttingen Academy of Sciences" "country" "Q183")

(refer-to ["properties.commons_category"])
(fact claim "Göttingen Academy of Sciences" "commons-category" "Akademie der Wissenschaften zu Göttingen")

(refer-to ["properties.viaf_id"])
(fact claim "Göttingen Academy of Sciences" "viaf-id" "134191279")

(refer-to ["properties.headquarters_location"])
(fact claim "Göttingen Academy of Sciences" "headquarters-location" "Q3033")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Göttingen Academy of Sciences" "located-in-the-administrative-territorial-entity" "Q3033")

(refer-to ["properties.heritage_designation"])
(fact claim "Göttingen Academy of Sciences" "heritage-designation" "Q811165")

(refer-to ["properties.topics_main_category"])
(fact claim "Göttingen Academy of Sciences" "topic's-main-category" "Q19319690")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Göttingen Academy of Sciences" "nkcr-aut-id" "olak2002113239")

(refer-to ["properties.doi"])
(fact claim "Göttingen Academy of Sciences" "doi" "10.13039/501100007410")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Göttingen Academy of Sciences" "official-language" "German")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Göttingen Academy of Sciences" "sudoc-authorities" "026462362")

(refer-to ["properties.bnf_id"])
(fact claim "Göttingen Academy of Sciences" "bnf-id" "118706401")

(refer-to ["properties.member_of"])
(fact claim "Göttingen Academy of Sciences" "member-of" "Q1662834")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Göttingen Academy of Sciences" "national-library-of-israel-id" "000007932")

(refer-to ["properties.freebase_id"])
(fact claim "Göttingen Academy of Sciences" "freebase-id" "/m/02ptcc4")

(refer-to ["properties.coordinate_location"])
(fact claim "Göttingen Academy of Sciences" "coordinate-location" "lng 9.93733056 lat 51.53468889 alt ")

(refer-to ["properties.nla_australia_id"])
(fact claim "Göttingen Academy of Sciences" "nla-australia-id" "35002157")

(refer-to ["properties.inception"])
(fact claim "Göttingen Academy of Sciences" "inception" "+1751-00-00T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Göttingen Academy of Sciences" "isni" "0000 0001 2162 0936")

(refer-to ["properties.official_website"])
(fact claim "Göttingen Academy of Sciences" "official-website" "https://adw-goe.de/")

(refer-to ["properties.gnd_id"])
(fact claim "Göttingen Academy of Sciences" "gnd-id" "2003658-9")

(refer-to ["properties.instance_of"])
(fact claim "Göttingen Academy of Sciences" "instance-of" "Q414147")
(fact claim "Göttingen Academy of Sciences" "instance-of" "Q12020836")

(refer-to ["properties.located_at_street_address"])
(fact claim "Göttingen Academy of Sciences" "located-at-street-address" "Theaterstraße 7")

(refer-to ["properties.bne_id"])
(fact claim "Göttingen Academy of Sciences" "bne-id" "XX117340")

(refer-to ["properties.image"])
(fact claim "Göttingen Academy of Sciences" "image" "Akademie Eingang.jpg")
(fact claim "Göttingen Academy of Sciences" "image" "Göttingen-Akademie.der.Wissenschaften.01.jpg")

(refer-to ["properties.grid_id"])
(fact claim "Göttingen Academy of Sciences" "grid-id" "grid.461599.6")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Göttingen Academy of Sciences" "library-of-congress-authority-id" "n80066174")
