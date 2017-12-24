(ns clazzes.honorary_doctor_of_the_princeton_university
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Honorary doctor of the Princeton University")

(name-as-in "Honorary doctor of the Princeton University" "" "zh-hk")
(name-as-in "Honorary doctor of the Princeton University" "" "pt")
(name-as-in "Honorary doctor of the Princeton University" "Honorary doctor of the Princeton University" "en")
(name-as-in "Honorary doctor of the Princeton University" "docteur honoris causa de l'université de Princeton" "fr")
(name-as-in "Honorary doctor of the Princeton University" "" "zh-tw")
(name-as-in "Honorary doctor of the Princeton University" "Ehrendoktor der Princeton University" "de")
(name-as-in "Honorary doctor of the Princeton University" "" "ru")
(name-as-in "Honorary doctor of the Princeton University" "" "es")
(name-as-in "Honorary doctor of the Princeton University" "" "ja")
(name-as-in "Honorary doctor of the Princeton University" "" "zh-cn")
(name-as-in "Honorary doctor of the Princeton University" "" "zh-sg")

(descr-as-in "Honorary doctor of the Princeton University" "" "zh-hk")
(descr-as-in "Honorary doctor of the Princeton University" "" "pt")
(descr-as-in "Honorary doctor of the Princeton University" "" "en")
(descr-as-in "Honorary doctor of the Princeton University" "" "fr")
(descr-as-in "Honorary doctor of the Princeton University" "" "zh-tw")
(descr-as-in "Honorary doctor of the Princeton University" "" "de")
(descr-as-in "Honorary doctor of the Princeton University" "" "ru")
(descr-as-in "Honorary doctor of the Princeton University" "" "es")
(descr-as-in "Honorary doctor of the Princeton University" "" "ja")
(descr-as-in "Honorary doctor of the Princeton University" "" "zh-cn")
(descr-as-in "Honorary doctor of the Princeton University" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Honorary doctor of the Princeton University" "instance-of" "Q618779")

(refer-to ["properties.subclass_of"])
(fact claim "Honorary doctor of the Princeton University" "subclass-of" "Q11415564")

(refer-to ["properties.country"])
(fact claim "Honorary doctor of the Princeton University" "country" "Q30")

(refer-to ["properties.conferred_by"])
(fact claim "Honorary doctor of the Princeton University" "conferred-by" "Q21578")

(refer-to ["properties.topics_main_category"])
(fact claim "Honorary doctor of the Princeton University" "topic's-main-category" "Q8943514")
