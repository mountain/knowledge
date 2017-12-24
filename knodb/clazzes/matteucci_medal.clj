(ns clazzes.matteucci_medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Matteucci Medal")

(name-as-in "Matteucci Medal" "" "zh-hk")
(name-as-in "Matteucci Medal" "Medalha Matteucci" "pt")
(name-as-in "Matteucci Medal" "Matteucci Medal" "en")
(name-as-in "Matteucci Medal" "médaille Matteucci" "fr")
(name-as-in "Matteucci Medal" "" "zh-tw")
(name-as-in "Matteucci Medal" "Matteucci-Medaille" "de")
(name-as-in "Matteucci Medal" "Медаль Маттеуччи" "ru")
(name-as-in "Matteucci Medal" "Medalla Matteucci" "es")
(name-as-in "Matteucci Medal" "マテウチ・メダル" "ja")
(name-as-in "Matteucci Medal" "" "zh-cn")
(name-as-in "Matteucci Medal" "" "zh-sg")

(descr-as-in "Matteucci Medal" "" "zh-hk")
(descr-as-in "Matteucci Medal" "" "pt")
(descr-as-in "Matteucci Medal" "award" "en")
(descr-as-in "Matteucci Medal" "" "fr")
(descr-as-in "Matteucci Medal" "" "zh-tw")
(descr-as-in "Matteucci Medal" "" "de")
(descr-as-in "Matteucci Medal" "" "ru")
(descr-as-in "Matteucci Medal" "" "es")
(descr-as-in "Matteucci Medal" "" "ja")
(descr-as-in "Matteucci Medal" "" "zh-cn")
(descr-as-in "Matteucci Medal" "" "zh-sg")


(refer-to ["properties.freebase_id"])
(fact claim "Matteucci Medal" "freebase-id" "/m/0h5vy3")

(refer-to ["properties.instance_of"])
(fact claim "Matteucci Medal" "instance-of" "Q618779")

(refer-to ["properties.topics_main_category"])
(fact claim "Matteucci Medal" "topic's-main-category" "Q22338841")

(refer-to ["properties.named_after"])
(fact claim "Matteucci Medal" "named-after" "Q280250")
