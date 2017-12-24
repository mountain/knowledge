(ns clazzes.benjamin_franklin_medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Benjamin Franklin Medal")

(name-as-in "Benjamin Franklin Medal" "" "zh-hk")
(name-as-in "Benjamin Franklin Medal" "Medalha Benjamin Franklin" "pt")
(name-as-in "Benjamin Franklin Medal" "Benjamin Franklin Medal" "en")
(name-as-in "Benjamin Franklin Medal" "médaille Benjamin Franklin" "fr")
(name-as-in "Benjamin Franklin Medal" "" "zh-tw")
(name-as-in "Benjamin Franklin Medal" "Benjamin Franklin Medal" "de")
(name-as-in "Benjamin Franklin Medal" "медаль Бенджамина Франклина" "ru")
(name-as-in "Benjamin Franklin Medal" "Medalla Benjamin Franklin" "es")
(name-as-in "Benjamin Franklin Medal" "ベンジャミン・フランクリン・メダル (フランクリン協会)" "ja")
(name-as-in "Benjamin Franklin Medal" "" "zh-cn")
(name-as-in "Benjamin Franklin Medal" "" "zh-sg")

(descr-as-in "Benjamin Franklin Medal" "" "zh-hk")
(descr-as-in "Benjamin Franklin Medal" "" "pt")
(descr-as-in "Benjamin Franklin Medal" "science and engineering award presented by the Franklin Institute" "en")
(descr-as-in "Benjamin Franklin Medal" "" "fr")
(descr-as-in "Benjamin Franklin Medal" "" "zh-tw")
(descr-as-in "Benjamin Franklin Medal" "Auszeichnung in den Bereichen Wissenschaft und Technologie des Franklin Institute" "de")
(descr-as-in "Benjamin Franklin Medal" "медаль за научные и технические достижения, вручаемая с 1998 года американским Институтом Франклина" "ru")
(descr-as-in "Benjamin Franklin Medal" "premio" "es")
(descr-as-in "Benjamin Franklin Medal" "" "ja")
(descr-as-in "Benjamin Franklin Medal" "" "zh-cn")
(descr-as-in "Benjamin Franklin Medal" "" "zh-sg")


(refer-to ["properties.freebase_id"])
(fact claim "Benjamin Franklin Medal" "freebase-id" "/m/06_y0kx")

(refer-to ["properties.instance_of"])
(fact claim "Benjamin Franklin Medal" "instance-of" "Q11448906")
(fact claim "Benjamin Franklin Medal" "instance-of" "Q131647")

(refer-to ["properties.winner"])
(fact claim "Benjamin Franklin Medal" "winner" "Q189997")
(fact claim "Benjamin Franklin Medal" "winner" "Q104651")
(fact claim "Benjamin Franklin Medal" "winner" "Q202136")
(fact claim "Benjamin Franklin Medal" "winner" "Q418983")

(refer-to ["properties.named_after"])
(fact claim "Benjamin Franklin Medal" "named-after" "Q34969")

(refer-to ["properties.image"])
(fact claim "Benjamin Franklin Medal" "image" "Logo awards.jpg")

(refer-to ["properties.category_for_recipients_of_this_award"])
(fact claim "Benjamin Franklin Medal" "category-for-recipients-of-this-award" "Q9644769")

(refer-to ["properties.country"])
(fact claim "Benjamin Franklin Medal" "country" "Q30")

(refer-to ["properties.native_label"])
(fact claim "Benjamin Franklin Medal" "native-label" "monolingualtext")
