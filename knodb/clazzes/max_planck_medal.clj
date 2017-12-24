(ns clazzes.max_planck_medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Max Planck Medal")

(name-as-in "Max Planck Medal" "馬克斯·普朗克獎章" "zh-hk")
(name-as-in "Max Planck Medal" "Medalha Max Planck" "pt")
(name-as-in "Max Planck Medal" "Max Planck Medal" "en")
(name-as-in "Max Planck Medal" "médaille Max-Planck" "fr")
(name-as-in "Max Planck Medal" "馬克斯·普朗克獎章" "zh-tw")
(name-as-in "Max Planck Medal" "Max-Planck-Medaille" "de")
(name-as-in "Max Planck Medal" "медаль имени Макса Планка" "ru")
(name-as-in "Max Planck Medal" "Medalla Max Planck" "es")
(name-as-in "Max Planck Medal" "マックス・プランク・メダル" "ja")
(name-as-in "Max Planck Medal" "马克斯·普朗克奖章" "zh-cn")
(name-as-in "Max Planck Medal" "马克斯·普朗克奖章" "zh-sg")

(descr-as-in "Max Planck Medal" "" "zh-hk")
(descr-as-in "Max Planck Medal" "" "pt")
(descr-as-in "Max Planck Medal" "science award" "en")
(descr-as-in "Max Planck Medal" "" "fr")
(descr-as-in "Max Planck Medal" "" "zh-tw")
(descr-as-in "Max Planck Medal" "Wissenschaftspreis" "de")
(descr-as-in "Max Planck Medal" "медаль Немецкого физического общества" "ru")
(descr-as-in "Max Planck Medal" "" "es")
(descr-as-in "Max Planck Medal" "" "ja")
(descr-as-in "Max Planck Medal" "" "zh-cn")
(descr-as-in "Max Planck Medal" "" "zh-sg")


(refer-to ["properties.named_after"])
(fact claim "Max Planck Medal" "named-after" "Q9021")

(refer-to ["properties.freebase_id"])
(fact claim "Max Planck Medal" "freebase-id" "/m/03w1cz")

(refer-to ["properties.instance_of"])
(fact claim "Max Planck Medal" "instance-of" "Q11448906")
(fact claim "Max Planck Medal" "instance-of" "Q131647")

(refer-to ["properties.inception"])
(fact claim "Max Planck Medal" "inception" "+1929-00-00T00:00:00Z")

(refer-to ["properties.conferred_by"])
(fact claim "Max Planck Medal" "conferred-by" "Q819187")

(refer-to ["properties.topics_main_category"])
(fact claim "Max Planck Medal" "topic's-main-category" "Q9645029")

(refer-to ["properties.category_for_recipients_of_this_award"])
(fact claim "Max Planck Medal" "category-for-recipients-of-this-award" "Q9645029")
