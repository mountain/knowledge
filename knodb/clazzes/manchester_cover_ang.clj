(ns clazzes.manchester_cover_ang
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Manchester cover ang")

(name-as-in "Manchester cover ang" "" "zh-hk")
(name-as-in "Manchester cover ang" "Sociedade Kaiser Wilhelm" "pt")
(name-as-in "Manchester cover ang" "Manchester cover ang" "en")
(name-as-in "Manchester cover ang" "Société Kaiser-Wilhelm" "fr")
(name-as-in "Manchester cover ang" "" "zh-tw")
(name-as-in "Manchester cover ang" "Kaiser-Wilhelm-Gesellschaft zur Förderung der Wissenschaften" "de")
(name-as-in "Manchester cover ang" "Общество кайзера Вильгельма" "ru")
(name-as-in "Manchester cover ang" "Sociedad Kaiser Wilhelm" "es")
(name-as-in "Manchester cover ang" "カイザー・ヴィルヘルム協会" "ja")
(name-as-in "Manchester cover ang" "威廉皇帝学会" "zh-cn")
(name-as-in "Manchester cover ang" "" "zh-sg")

(descr-as-in "Manchester cover ang" "" "zh-hk")
(descr-as-in "Manchester cover ang" "" "pt")
(descr-as-in "Manchester cover ang" "" "en")
(descr-as-in "Manchester cover ang" "" "fr")
(descr-as-in "Manchester cover ang" "" "zh-tw")
(descr-as-in "Manchester cover ang" "" "de")
(descr-as-in "Manchester cover ang" "" "ru")
(descr-as-in "Manchester cover ang" "" "es")
(descr-as-in "Manchester cover ang" "" "ja")
(descr-as-in "Manchester cover ang" "" "zh-cn")
(descr-as-in "Manchester cover ang" "" "zh-sg")


(refer-to ["properties.commons_category"])
(fact claim "Manchester cover ang" "commons-category" "Kaiser Wilhelm Society")

(refer-to ["properties.bav_id"])
(fact claim "Manchester cover ang" "bav-id" "ADV11223248")

(refer-to ["properties.viaf_id"])
(fact claim "Manchester cover ang" "viaf-id" "133170089")

(refer-to ["properties.topics_main_category"])
(fact claim "Manchester cover ang" "topic's-main-category" "Q8979514")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Manchester cover ang" "nkcr-aut-id" "ko2007402495")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Manchester cover ang" "sudoc-authorities" "02811678X")

(refer-to ["properties.bnf_id"])
(fact claim "Manchester cover ang" "bnf-id" "12001549d")

(refer-to ["properties.freebase_id"])
(fact claim "Manchester cover ang" "freebase-id" "/m/039_nh")

(refer-to ["properties.leader"])
(fact claim "Manchester cover ang" "leader" "Q164699")
(fact claim "Manchester cover ang" "leader" "Q9021")
(fact claim "Manchester cover ang" "leader" "Q76606")
(fact claim "Manchester cover ang" "leader" "Q91173")

(refer-to ["properties.inception"])
(fact claim "Manchester cover ang" "inception" "+1911-00-00T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Manchester cover ang" "dissolved-abolished-or-demolished" "+1960-06-21T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Manchester cover ang" "isni" "0000 0001 2161 6283")

(refer-to ["properties.followed_by"])
(fact claim "Manchester cover ang" "followed-by" "Q158085")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Manchester cover ang" "ndl-auth-id" "00323335")

(refer-to ["properties.gnd_id"])
(fact claim "Manchester cover ang" "gnd-id" "2015138-X")

(refer-to ["properties.instance_of"])
(fact claim "Manchester cover ang" "instance-of" "Q9299236")
(fact claim "Manchester cover ang" "instance-of" "Q748019")

(refer-to ["properties.nukat_warsawu_authorities"])
(fact claim "Manchester cover ang" "nukat-warsawu-authorities" "n00070421")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Manchester cover ang" "library-of-congress-authority-id" "n81141877")
