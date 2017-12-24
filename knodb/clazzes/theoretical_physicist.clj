(ns clazzes.theoretical_physicist
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "theoretical physicist")

(name-as-in "theoretical physicist" "" "zh-hk")
(name-as-in "theoretical physicist" "físico teórico" "pt")
(name-as-in "theoretical physicist" "theoretical physicist" "en")
(name-as-in "theoretical physicist" "physicien théoricien" "fr")
(name-as-in "theoretical physicist" "" "zh-tw")
(name-as-in "theoretical physicist" "theoretischer Physiker" "de")
(name-as-in "theoretical physicist" "физик-теоретик" "ru")
(name-as-in "theoretical physicist" "físico teórico" "es")
(name-as-in "theoretical physicist" "理論物理学者" "ja")
(name-as-in "theoretical physicist" "" "zh-cn")
(name-as-in "theoretical physicist" "" "zh-sg")

(descr-as-in "theoretical physicist" "" "zh-hk")
(descr-as-in "theoretical physicist" "" "pt")
(descr-as-in "theoretical physicist" "occupation" "en")
(descr-as-in "theoretical physicist" "" "fr")
(descr-as-in "theoretical physicist" "" "zh-tw")
(descr-as-in "theoretical physicist" "" "de")
(descr-as-in "theoretical physicist" "" "ru")
(descr-as-in "theoretical physicist" "persona que se especializa en la física teórica" "es")
(descr-as-in "theoretical physicist" "" "ja")
(descr-as-in "theoretical physicist" "" "zh-cn")
(descr-as-in "theoretical physicist" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "theoretical physicist" "instance-of" "Q28640")

(refer-to ["properties.subclass_of"])
(fact claim "theoretical physicist" "subclass-of" "Q169470")
(fact claim "theoretical physicist" "subclass-of" "Q18931911")

(refer-to ["properties.field_of_this_occupation"])
(refer-to ["clazzes.theoretical_physics"])
(fact claim "theoretical physicist" "field-of-this-occupation" "theoretical physics")

(refer-to ["properties.topics_main_category"])
(fact claim "theoretical physicist" "topic's-main-category" "Q7085753")

(refer-to ["properties.female_form_of_label"])
(fact claim "theoretical physicist" "female-form-of-label" "monolingualtext")
(fact claim "theoretical physicist" "female-form-of-label" "monolingualtext")
(fact claim "theoretical physicist" "female-form-of-label" "monolingualtext")
(fact claim "theoretical physicist" "female-form-of-label" "monolingualtext")
(fact claim "theoretical physicist" "female-form-of-label" "monolingualtext")
(fact claim "theoretical physicist" "female-form-of-label" "monolingualtext")

(refer-to ["properties.quora_topic_id"])
(fact claim "theoretical physicist" "quora-topic-id" "Theoretical-Physicist-4")

(refer-to ["properties.has_list"])
(fact claim "theoretical physicist" "has-list" "Q6643258")
