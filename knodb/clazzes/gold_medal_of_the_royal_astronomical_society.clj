(ns clazzes.gold_medal_of_the_royal_astronomical_society
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Gold Medal of the Royal Astronomical Society")

(name-as-in "Gold Medal of the Royal Astronomical Society" "英國皇家天文學會金質獎章" "zh-hk")
(name-as-in "Gold Medal of the Royal Astronomical Society" "Medalha de Ouro da Royal Astronomical Society" "pt")
(name-as-in "Gold Medal of the Royal Astronomical Society" "Gold Medal of the Royal Astronomical Society" "en")
(name-as-in "Gold Medal of the Royal Astronomical Society" "médaille d'or de la Royal Astronomical Society" "fr")
(name-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-tw")
(name-as-in "Gold Medal of the Royal Astronomical Society" "Goldmedaille der Royal Astronomical Society" "de")
(name-as-in "Gold Medal of the Royal Astronomical Society" "золотая медаль Королевского астрономического общества" "ru")
(name-as-in "Gold Medal of the Royal Astronomical Society" "Medalla de oro de la Real Sociedad Astronómica" "es")
(name-as-in "Gold Medal of the Royal Astronomical Society" "王立天文学会ゴールドメダル" "ja")
(name-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-cn")
(name-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-sg")

(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-hk")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "pt")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "award" "en")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "fr")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-tw")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "de")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "ru")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "es")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "ja")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-cn")
(descr-as-in "Gold Medal of the Royal Astronomical Society" "" "zh-sg")


(refer-to ["properties.freebase_id"])
(fact claim "Gold Medal of the Royal Astronomical Society" "freebase-id" "/m/03j2ts")

(refer-to ["properties.conferred_by"])
(fact claim "Gold Medal of the Royal Astronomical Society" "conferred-by" "Q753299")

(refer-to ["properties.official_website"])
(fact claim "Gold Medal of the Royal Astronomical Society" "official-website" "http://www.ras.org.uk/awards-and-grants/awards")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.gold_medal_of_the_royal_astronomical_society"])
(fact claim "Gold Medal of the Royal Astronomical Society" "commons-category" "Gold Medal of the Royal Astronomical Society")

(refer-to ["properties.instance_of"])
(fact claim "Gold Medal of the Royal Astronomical Society" "instance-of" "Q11448906")
(fact claim "Gold Medal of the Royal Astronomical Society" "instance-of" "Q131647")

(refer-to ["properties.image"])
(fact claim "Gold Medal of the Royal Astronomical Society" "image" "Asaph Hall Gold Medal.jpg")

(refer-to ["properties.inception"])
(fact claim "Gold Medal of the Royal Astronomical Society" "inception" "+1824-00-00T00:00:00Z")

(refer-to ["properties.country"])
(fact claim "Gold Medal of the Royal Astronomical Society" "country" "Q145")
