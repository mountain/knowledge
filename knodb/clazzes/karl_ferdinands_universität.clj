(ns clazzes.karl_ferdinands_universität
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Karl-Ferdinands-Universität")

(name-as-in "Karl-Ferdinands-Universität" "" "zh-hk")
(name-as-in "Karl-Ferdinands-Universität" "" "pt")
(name-as-in "Karl-Ferdinands-Universität" "Karl-Ferdinands-Universität" "en")
(name-as-in "Karl-Ferdinands-Universität" "Karl-Ferdinands-Universität" "fr")
(name-as-in "Karl-Ferdinands-Universität" "" "zh-tw")
(name-as-in "Karl-Ferdinands-Universität" "Karl-Ferdinands-Universität" "de")
(name-as-in "Karl-Ferdinands-Universität" "университет Карла Фердинанда" "ru")
(name-as-in "Karl-Ferdinands-Universität" "" "es")
(name-as-in "Karl-Ferdinands-Universität" "カール＝フェルディナント大学" "ja")
(name-as-in "Karl-Ferdinands-Universität" "" "zh-cn")
(name-as-in "Karl-Ferdinands-Universität" "" "zh-sg")

(descr-as-in "Karl-Ferdinands-Universität" "" "zh-hk")
(descr-as-in "Karl-Ferdinands-Universität" "" "pt")
(descr-as-in "Karl-Ferdinands-Universität" "" "en")
(descr-as-in "Karl-Ferdinands-Universität" "" "fr")
(descr-as-in "Karl-Ferdinands-Universität" "" "zh-tw")
(descr-as-in "Karl-Ferdinands-Universität" "Universität in Tschechien" "de")
(descr-as-in "Karl-Ferdinands-Universität" "" "ru")
(descr-as-in "Karl-Ferdinands-Universität" "" "es")
(descr-as-in "Karl-Ferdinands-Universität" "" "ja")
(descr-as-in "Karl-Ferdinands-Universität" "" "zh-cn")
(descr-as-in "Karl-Ferdinands-Universität" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Karl-Ferdinands-Universität" "country" "Q213")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.charles_university_in_prague"])
(fact claim "Karl-Ferdinands-Universität" "commons-category" "Charles University in Prague")

(refer-to ["properties.viaf_id"])
(fact claim "Karl-Ferdinands-Universität" "viaf-id" "167393152")

(refer-to ["properties.headquarters_location"])
(fact claim "Karl-Ferdinands-Universität" "headquarters-location" "Q1085")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Karl-Ferdinands-Universität" "sudoc-authorities" "122134117")

(refer-to ["properties.bnf_id"])
(fact claim "Karl-Ferdinands-Universität" "bnf-id" "14650498f")

(refer-to ["properties.inception"])
(fact claim "Karl-Ferdinands-Universität" "inception" "+1882-00-00T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Karl-Ferdinands-Universität" "dissolved-abolished-or-demolished" "+1945-00-00T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Karl-Ferdinands-Universität" "isni" "0000 0001 1500 618X")

(refer-to ["properties.gnd_id"])
(fact claim "Karl-Ferdinands-Universität" "gnd-id" "2047130-0")

(refer-to ["properties.instance_of"])
(fact claim "Karl-Ferdinands-Universität" "instance-of" "Q3918")

(refer-to ["properties.image"])
(fact claim "Karl-Ferdinands-Universität" "image" "Praha, Staré Město, Univerzita Karlova II EX.JPG")
