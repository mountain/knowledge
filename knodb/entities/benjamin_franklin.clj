(ns entities.benjamin_franklin
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Benjamin Franklin")

(name-as-in "Benjamin Franklin" "Benjamin Franklin" "de")
(name-as-in "Benjamin Franklin" "" "zh-hk")
(name-as-in "Benjamin Franklin" "" "zh-tw")
(name-as-in "Benjamin Franklin" "Франклин, Бенджамин" "ru")
(name-as-in "Benjamin Franklin" "Benjamin Franklin" "pt")
(name-as-in "Benjamin Franklin" "Benjamin Franklin" "en")
(name-as-in "Benjamin Franklin" "" "zh-cn")
(name-as-in "Benjamin Franklin" "Benjamin Franklin" "fr")
(name-as-in "Benjamin Franklin" "Benjamin Franklin" "es")
(name-as-in "Benjamin Franklin" "" "zh-sg")
(name-as-in "Benjamin Franklin" "ベンジャミン・フランクリン" "ja")
(name-as-in "Benjamin Franklin" "" "zh-hans")
(name-as-in "Benjamin Franklin" "" "zh-hant")

(descr-as-in "Benjamin Franklin" "amerikanischer Drucker, Verleger, Schriftsteller, Naturwissenschaftler, Erfinder und Staatsmann" "de")
(descr-as-in "Benjamin Franklin" "" "zh-hk")
(descr-as-in "Benjamin Franklin" "" "zh-tw")
(descr-as-in "Benjamin Franklin" "" "ru")
(descr-as-in "Benjamin Franklin" "" "pt")
(descr-as-in "Benjamin Franklin" "American printer, writer, politician" "en")
(descr-as-in "Benjamin Franklin" "" "zh-cn")
(descr-as-in "Benjamin Franklin" "" "fr")
(descr-as-in "Benjamin Franklin" "político, científico e inventor estadounidense" "es")
(descr-as-in "Benjamin Franklin" "" "zh-sg")
(descr-as-in "Benjamin Franklin" "" "ja")
(descr-as-in "Benjamin Franklin" "" "zh-hans")
(descr-as-in "Benjamin Franklin" "" "zh-hant")


(refer-to ["properties.member_of"])
(refer-to ["entities.royal_society"])
(fact claim "Benjamin Franklin" "member-of" "Royal Society")

(refer-to ["properties.lccn_identifier"])
(fact claim "Benjamin Franklin" "lccn-identifier" "n79043402")

(refer-to ["properties.bnf_identifier"])
(fact claim "Benjamin Franklin" "bnf-identifier" "119034658")

(refer-to ["properties.isni_iso_27729"])
(fact claim "Benjamin Franklin" "isni-iso-27729" "0000 0001 2133 9941")

(refer-to ["properties.imdb_identifier"])
(fact claim "Benjamin Franklin" "imdb-identifier" "tt0956098")

(refer-to ["properties.sudoc_identifier"])
(fact claim "Benjamin Franklin" "sudoc-identifier" "026873478")

(refer-to ["properties.viaf_identifier"])
(fact claim "Benjamin Franklin" "viaf-identifier" "56609913")

(refer-to ["properties.find_a_grave_id"])
(fact claim "Benjamin Franklin" "find-a-grave-id" "364")

(refer-to ["properties.gnd_identifier"])
(fact claim "Benjamin Franklin" "gnd-identifier" "118534912")

(refer-to ["properties.date_of_birth"])
(fact claim "Benjamin Franklin" "date-of-birth" "+00000001706-01-17T00:00:00Z")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Benjamin Franklin" "main-type-gnd" "person")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.philadelphia"])
(fact claim "Benjamin Franklin" "place-of-death" "Philadelphia")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Benjamin Franklin" "sex" "male")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.united_states_of_america"])
(fact claim "Benjamin Franklin" "country-of-citizenship" "United States of America")

(refer-to ["properties.image"])
(fact claim "Benjamin Franklin" "image" "BenFranklinDuplessis.jpg")
(fact claim "Benjamin Franklin" "image" "Franklin's Leyden jar experiment.png")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.boston"])
(fact claim "Benjamin Franklin" "place-of-birth" "Boston")

(refer-to ["properties.date_of_death"])
(fact claim "Benjamin Franklin" "date-of-death" "+00000001790-04-17T00:00:00Z")

(refer-to ["properties.aut_nkc"])
(fact claim "Benjamin Franklin" "aut-nkc" "jn20000720076")

(refer-to ["properties.commons_category"])
(refer-to ["entities.benjamin_franklin"])
(fact claim "Benjamin Franklin" "commons-category" "Benjamin Franklin")
