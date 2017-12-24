(ns clazzes.franklin_medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Franklin Medal")

(name-as-in "Franklin Medal" "" "zh-hk")
(name-as-in "Franklin Medal" "Medalha Franklin" "pt")
(name-as-in "Franklin Medal" "Franklin Medal" "en")
(name-as-in "Franklin Medal" "médaille Franklin" "fr")
(name-as-in "Franklin Medal" "" "zh-tw")
(name-as-in "Franklin Medal" "Franklin-Medaille" "de")
(name-as-in "Franklin Medal" "медаль Франклина" "ru")
(name-as-in "Franklin Medal" "Medalla Franklin" "es")
(name-as-in "Franklin Medal" "フランクリン・メダル" "ja")
(name-as-in "Franklin Medal" "富兰克林奖" "zh-cn")
(name-as-in "Franklin Medal" "" "zh-sg")

(descr-as-in "Franklin Medal" "" "zh-hk")
(descr-as-in "Franklin Medal" "" "pt")
(descr-as-in "Franklin Medal" "science award by the Franklin Institute, Philadelphia" "en")
(descr-as-in "Franklin Medal" "" "fr")
(descr-as-in "Franklin Medal" "" "zh-tw")
(descr-as-in "Franklin Medal" "Wissenschaftspreis des Franklin Instituts in Philadelphia, USA" "de")
(descr-as-in "Franklin Medal" "медаль, вручавшаяся с 1915 по 1997 годы Институтом Франклина в Филадельфии" "ru")
(descr-as-in "Franklin Medal" "" "es")
(descr-as-in "Franklin Medal" "" "ja")
(descr-as-in "Franklin Medal" "" "zh-cn")
(descr-as-in "Franklin Medal" "" "zh-sg")


(refer-to ["properties.named_after"])
(fact claim "Franklin Medal" "named-after" "Q34969")

(refer-to ["properties.freebase_id"])
(fact claim "Franklin Medal" "freebase-id" "/m/06zrp44")

(refer-to ["properties.instance_of"])
(fact claim "Franklin Medal" "instance-of" "Q11448906")
(fact claim "Franklin Medal" "instance-of" "Q131647")

(refer-to ["properties.topics_main_category"])
(fact claim "Franklin Medal" "topic's-main-category" "Q8846609")

(refer-to ["properties.image"])
(fact claim "Franklin Medal" "image" "PSM V85 D622 The franklin medal.png")

(refer-to ["properties.native_label"])
(fact claim "Franklin Medal" "native-label" "monolingualtext")

(refer-to ["properties.country"])
(fact claim "Franklin Medal" "country" "Q30")

(refer-to ["properties.conferred_by"])
(fact claim "Franklin Medal" "conferred-by" "Q339484")
