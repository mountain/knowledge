(ns clazzes.honorary_doctor_of_the_university_of_geneva
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Honorary doctor of the University of Geneva")

(name-as-in "Honorary doctor of the University of Geneva" "" "zh-hk")
(name-as-in "Honorary doctor of the University of Geneva" "" "pt")
(name-as-in "Honorary doctor of the University of Geneva" "Honorary doctor of the University of Geneva" "en")
(name-as-in "Honorary doctor of the University of Geneva" "docteur honoris causa de l'université de Genève" "fr")
(name-as-in "Honorary doctor of the University of Geneva" "" "zh-tw")
(name-as-in "Honorary doctor of the University of Geneva" "Ehrendoktor der Universität Genf" "de")
(name-as-in "Honorary doctor of the University of Geneva" "почётный доктор Женевского университета" "ru")
(name-as-in "Honorary doctor of the University of Geneva" "" "es")
(name-as-in "Honorary doctor of the University of Geneva" "" "ja")
(name-as-in "Honorary doctor of the University of Geneva" "" "zh-cn")
(name-as-in "Honorary doctor of the University of Geneva" "" "zh-sg")

(descr-as-in "Honorary doctor of the University of Geneva" "" "zh-hk")
(descr-as-in "Honorary doctor of the University of Geneva" "" "pt")
(descr-as-in "Honorary doctor of the University of Geneva" "" "en")
(descr-as-in "Honorary doctor of the University of Geneva" "titre honorifique décerné par l'université de Genève" "fr")
(descr-as-in "Honorary doctor of the University of Geneva" "" "zh-tw")
(descr-as-in "Honorary doctor of the University of Geneva" "" "de")
(descr-as-in "Honorary doctor of the University of Geneva" "" "ru")
(descr-as-in "Honorary doctor of the University of Geneva" "" "es")
(descr-as-in "Honorary doctor of the University of Geneva" "" "ja")
(descr-as-in "Honorary doctor of the University of Geneva" "" "zh-cn")
(descr-as-in "Honorary doctor of the University of Geneva" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Honorary doctor of the University of Geneva" "instance-of" "Q618779")

(refer-to ["properties.country"])
(fact claim "Honorary doctor of the University of Geneva" "country" "Q39")

(refer-to ["properties.topics_main_category"])
(fact claim "Honorary doctor of the University of Geneva" "topic's-main-category" "Q8943929")

(refer-to ["properties.subclass_of"])
(fact claim "Honorary doctor of the University of Geneva" "subclass-of" "Q11415564")

(refer-to ["properties.conferred_by"])
(fact claim "Honorary doctor of the University of Geneva" "conferred-by" "Q503473")
