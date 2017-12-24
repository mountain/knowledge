(ns clazzes.honorary_doctor_of_the_hebrew_university_of_jerusalem
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Honorary doctor of the Hebrew University of Jerusalem")

(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-hk")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "pt")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "Honorary doctor of the Hebrew University of Jerusalem" "en")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "docteur honoris causa de l'université hébraïque de Jérusalem" "fr")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-tw")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "Ehrendoktor der Hebräische Universität Jerusalem" "de")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "почётный доктор Еврейского университета в Иерусалиме" "ru")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "es")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "ja")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-cn")
(name-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-sg")

(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-hk")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "pt")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "en")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "titre honorifique décerné par l'université hébraïque de Jérusalem" "fr")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-tw")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "de")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "ru")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "es")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "ja")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-cn")
(descr-as-in "Honorary doctor of the Hebrew University of Jerusalem" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Honorary doctor of the Hebrew University of Jerusalem" "instance-of" "Q618779")

(refer-to ["properties.country"])
(fact claim "Honorary doctor of the Hebrew University of Jerusalem" "country" "Q801")

(refer-to ["properties.subclass_of"])
(fact claim "Honorary doctor of the Hebrew University of Jerusalem" "subclass-of" "Q11415564")

(refer-to ["properties.conferred_by"])
(fact claim "Honorary doctor of the Hebrew University of Jerusalem" "conferred-by" "Q174158")

(refer-to ["properties.topics_main_category"])
(fact claim "Honorary doctor of the Hebrew University of Jerusalem" "topic's-main-category" "Q6911111")
