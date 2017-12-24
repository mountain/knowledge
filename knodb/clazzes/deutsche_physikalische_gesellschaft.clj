(ns clazzes.deutsche_physikalische_gesellschaft
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Deutsche Physikalische Gesellschaft")

(name-as-in "Deutsche Physikalische Gesellschaft" "德國物理學會" "zh-hk")
(name-as-in "Deutsche Physikalische Gesellschaft" "Deutsche Physikalische Gesellschaft" "pt")
(name-as-in "Deutsche Physikalische Gesellschaft" "Deutsche Physikalische Gesellschaft" "en")
(name-as-in "Deutsche Physikalische Gesellschaft" "Deutsche Physikalische Gesellschaft" "fr")
(name-as-in "Deutsche Physikalische Gesellschaft" "" "zh-tw")
(name-as-in "Deutsche Physikalische Gesellschaft" "Deutsche Physikalische Gesellschaft" "de")
(name-as-in "Deutsche Physikalische Gesellschaft" "Немецкое физическое общество" "ru")
(name-as-in "Deutsche Physikalische Gesellschaft" "Deutsche Physikalische Gesellschaft" "es")
(name-as-in "Deutsche Physikalische Gesellschaft" "ドイツ物理学会" "ja")
(name-as-in "Deutsche Physikalische Gesellschaft" "" "zh-cn")
(name-as-in "Deutsche Physikalische Gesellschaft" "" "zh-sg")

(descr-as-in "Deutsche Physikalische Gesellschaft" "" "zh-hk")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "pt")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "en")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "fr")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "zh-tw")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "de")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "ru")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "es")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "ja")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "zh-cn")
(descr-as-in "Deutsche Physikalische Gesellschaft" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Deutsche Physikalische Gesellschaft" "country" "Q1206012")
(fact claim "Deutsche Physikalische Gesellschaft" "country" "Q183")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.deutsche_physikalische_gesellschaft"])
(fact claim "Deutsche Physikalische Gesellschaft" "commons-category" "Deutsche Physikalische Gesellschaft")

(refer-to ["properties.viaf_id"])
(fact claim "Deutsche Physikalische Gesellschaft" "viaf-id" "145522824")

(refer-to ["properties.headquarters_location"])
(fact claim "Deutsche Physikalische Gesellschaft" "headquarters-location" "Q12434")

(refer-to ["properties.member_count"])
(fact claim "Deutsche Physikalische Gesellschaft" "member-count" "quantity")

(refer-to ["properties.topics_main_category"])
(fact claim "Deutsche Physikalische Gesellschaft" "topic's-main-category" "Q9669095")

(refer-to ["properties.founded_by"])
(fact claim "Deutsche Physikalische Gesellschaft" "founded-by" "Q76571")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Deutsche Physikalische Gesellschaft" "sudoc-authorities" "03165777X")

(refer-to ["properties.bnf_id"])
(fact claim "Deutsche Physikalische Gesellschaft" "bnf-id" "122831384")

(refer-to ["properties.member_of"])
(fact claim "Deutsche Physikalische Gesellschaft" "member-of" "Q891109")
(fact claim "Deutsche Physikalische Gesellschaft" "member-of" "Q28346")

(refer-to ["properties.freebase_id"])
(fact claim "Deutsche Physikalische Gesellschaft" "freebase-id" "/m/08g8vz")

(refer-to ["properties.leader"])
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q213779")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q76571")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q60024")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q67850")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q65466")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q65466")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q9021")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q61755")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q9021")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q61810")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q9021")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q61810")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q67801")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q61810")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q57075")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q9021")
(refer-to ["clazzes.albert_einstein"])
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Albert Einstein")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q77078")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q57068")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q126384")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q64839")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q57805")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q98058")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q84955")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q57067")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q90603")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q71722")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q103835")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q71722")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q78096")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q71722")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q13383927")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q85556")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q13383927")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q61745")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q126314")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q91387")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q13384180")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q91356")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q91645")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1670745")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1321110")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1277957")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q100678")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q89057")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q78097")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q121141")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q15449167")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1690521")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1690524")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q2038900")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q2416958")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q71220")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1579645")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1901796")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1465671")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1227762")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1109312")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q110765")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q77995")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q1510655")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q2591113")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q100459")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q16888015")
(fact claim "Deutsche Physikalische Gesellschaft" "leader" "Q65092")

(refer-to ["properties.inception"])
(fact claim "Deutsche Physikalische Gesellschaft" "inception" "+1845-01-14T00:00:00Z")

(refer-to ["properties.official_website"])
(fact claim "Deutsche Physikalische Gesellschaft" "official-website" "http://www.dpg-physik.de")

(refer-to ["properties.gnd_id"])
(fact claim "Deutsche Physikalische Gesellschaft" "gnd-id" "309-8")

(refer-to ["properties.logo_image"])
(fact claim "Deutsche Physikalische Gesellschaft" "logo-image" "Deutsche Physikalische Gesellschaft Logo.svg")

(refer-to ["properties.instance_of"])
(fact claim "Deutsche Physikalische Gesellschaft" "instance-of" "Q1391145")

(refer-to ["properties.legal_form"])
(fact claim "Deutsche Physikalische Gesellschaft" "legal-form" "Q9299236")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Deutsche Physikalische Gesellschaft" "library-of-congress-authority-id" "n50005003")
