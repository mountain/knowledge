(ns clazzes.theoretical_physics
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "theoretical physics")

(name-as-in "theoretical physics" "" "zh-hk")
(name-as-in "theoretical physics" "física teórica" "pt")
(name-as-in "theoretical physics" "theoretical physics" "en")
(name-as-in "theoretical physics" "physique théorique" "fr")
(name-as-in "theoretical physics" "" "zh-tw")
(name-as-in "theoretical physics" "theoretische Physik" "de")
(name-as-in "theoretical physics" "теоретическая физика" "ru")
(name-as-in "theoretical physics" "física teórica" "es")
(name-as-in "theoretical physics" "理論物理学" "ja")
(name-as-in "theoretical physics" "" "zh-cn")
(name-as-in "theoretical physics" "" "zh-sg")

(descr-as-in "theoretical physics" "" "zh-hk")
(descr-as-in "theoretical physics" "" "pt")
(descr-as-in "theoretical physics" "branch of physics" "en")
(descr-as-in "theoretical physics" "branche de la physique" "fr")
(descr-as-in "theoretical physics" "" "zh-tw")
(descr-as-in "theoretical physics" "Teilgebiet der Physik" "de")
(descr-as-in "theoretical physics" "область физики, изучающая фундаментальные свойства материи" "ru")
(descr-as-in "theoretical physics" "rama de la física" "es")
(descr-as-in "theoretical physics" "" "ja")
(descr-as-in "theoretical physics" "" "zh-cn")
(descr-as-in "theoretical physics" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "theoretical physics" "subclass-of" "Q413")

(refer-to ["properties.commons_category"])
(fact claim "theoretical physics" "commons-category" "Theoretical physics")

(refer-to ["properties.topics_main_category"])
(fact claim "theoretical physics" "topic's-main-category" "Q6584877")

(refer-to ["properties.opposite_of"])
(fact claim "theoretical physics" "opposite-of" "Q373065")

(refer-to ["properties.freebase_id"])
(fact claim "theoretical physics" "freebase-id" "/m/01vx9r")

(refer-to ["properties.ndl_auth_id"])
(fact claim "theoretical physics" "ndl-auth-id" "00569547")

(refer-to ["properties.gnd_id"])
(fact claim "theoretical physics" "gnd-id" "4117202-4")

(refer-to ["properties.part_of"])
(fact claim "theoretical physics" "part-of" "Q413")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "theoretical physics" "bncf-thesaurus" "20394")

(refer-to ["properties.jstor_topic_id"])
(fact claim "theoretical physics" "jstor-topic-id" "theoretical-physics")

(refer-to ["properties.quora_topic_id"])
(fact claim "theoretical physics" "quora-topic-id" "Theoretical-Physics")
