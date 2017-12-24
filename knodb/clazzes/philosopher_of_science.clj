(ns clazzes.philosopher_of_science
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "philosopher of science")

(name-as-in "philosopher of science" "" "zh-hk")
(name-as-in "philosopher of science" "filósofo da ciência" "pt")
(name-as-in "philosopher of science" "philosopher of science" "en")
(name-as-in "philosopher of science" "philosophe des sciences" "fr")
(name-as-in "philosopher of science" "" "zh-tw")
(name-as-in "philosopher of science" "Wissenschaftstheoretiker" "de")
(name-as-in "philosopher of science" "философ науки" "ru")
(name-as-in "philosopher of science" "filósofo de la ciencia" "es")
(name-as-in "philosopher of science" "" "ja")
(name-as-in "philosopher of science" "" "zh-cn")
(name-as-in "philosopher of science" "" "zh-sg")

(descr-as-in "philosopher of science" "" "zh-hk")
(descr-as-in "philosopher of science" "" "pt")
(descr-as-in "philosopher of science" "" "en")
(descr-as-in "philosopher of science" "" "fr")
(descr-as-in "philosopher of science" "" "zh-tw")
(descr-as-in "philosopher of science" "" "de")
(descr-as-in "philosopher of science" "" "ru")
(descr-as-in "philosopher of science" "persona que se especializa en la filosofía de la ciencia" "es")
(descr-as-in "philosopher of science" "" "ja")
(descr-as-in "philosopher of science" "" "zh-cn")
(descr-as-in "philosopher of science" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "philosopher of science" "instance-of" "Q28640")

(refer-to ["properties.subclass_of"])
(fact claim "philosopher of science" "subclass-of" "Q4964182")

(refer-to ["properties.commons_category"])
(fact claim "philosopher of science" "commons-category" "Philosophers of science")

(refer-to ["properties.field_of_this_occupation"])
(fact claim "philosopher of science" "field-of-this-occupation" "Q59115")

(refer-to ["properties.topics_main_category"])
(fact claim "philosopher of science" "topic's-main-category" "Q7877764")

(refer-to ["properties.female_form_of_label"])
(fact claim "philosopher of science" "female-form-of-label" "monolingualtext")
(fact claim "philosopher of science" "female-form-of-label" "monolingualtext")
(fact claim "philosopher of science" "female-form-of-label" "monolingualtext")
(fact claim "philosopher of science" "female-form-of-label" "monolingualtext")
(fact claim "philosopher of science" "female-form-of-label" "monolingualtext")
