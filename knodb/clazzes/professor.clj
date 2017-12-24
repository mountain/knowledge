(ns clazzes.professor
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "professor")

(name-as-in "professor" "教授" "zh-hk")
(name-as-in "professor" "professor" "pt")
(name-as-in "professor" "professor" "en")
(name-as-in "professor" "professeur" "fr")
(name-as-in "professor" "教授" "zh-tw")
(name-as-in "professor" "Professor" "de")
(name-as-in "professor" "профессор" "ru")
(name-as-in "professor" "profesor" "es")
(name-as-in "professor" "教授" "ja")
(name-as-in "professor" "教授" "zh-cn")
(name-as-in "professor" "教授" "zh-sg")

(descr-as-in "professor" "" "zh-hk")
(descr-as-in "professor" "" "pt")
(descr-as-in "professor" "academic rank at universities and other post-secondary education and research institutions in most countries" "en")
(descr-as-in "professor" "titre académique qualifiant un expert dans un art ou une science" "fr")
(descr-as-in "professor" "" "zh-tw")
(descr-as-in "professor" "akademischer Titel oder Teil der Amtsbezeichnung eines Hochschullehrers" "de")
(descr-as-in "professor" "учёное звание в высшей школе" "ru")
(descr-as-in "professor" "rango académico" "es")
(descr-as-in "professor" "" "ja")
(descr-as-in "professor" "" "zh-cn")
(descr-as-in "professor" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.university_teacher"])
(fact claim "professor" "subclass-of" "university teacher")

(refer-to ["properties.commons_category"])
(fact claim "professor" "commons-category" "Professors")

(refer-to ["properties.applies_to_jurisdiction"])
(fact claim "professor" "applies-to-jurisdiction" "")

(refer-to ["properties.male_form_of_label"])
(fact claim "professor" "male-form-of-label" "monolingualtext")
(fact claim "professor" "male-form-of-label" "monolingualtext")

(refer-to ["properties.aat_id"])
(fact claim "professor" "aat-id" "300025533")

(refer-to ["properties.babelnet_id"])
(fact claim "professor" "babelnet-id" "00064601n")

(refer-to ["properties.short_name"])
(fact claim "professor" "short-name" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "professor" "topic's-main-category" "Q8795241")

(refer-to ["properties.rome_occupation_code_v3"])
(fact claim "professor" "rome-occupation-code-v3" "K2108")

(refer-to ["properties.freebase_id"])
(fact claim "professor" "freebase-id" "/m/016fly")

(refer-to ["properties.field_of_this_occupation"])
(fact claim "professor" "field-of-this-occupation" "Q8434")

(refer-to ["properties.gnd_id"])
(fact claim "professor" "gnd-id" "4025243-7")

(refer-to ["properties.said_to_be_the_same_as"])
(fact claim "professor" "said-to-be-the-same-as" "Q16481664")
(fact claim "professor" "said-to-be-the-same-as" "Q10639464")

(refer-to ["properties.instance_of"])
(fact claim "professor" "instance-of" "Q216353")
(fact claim "professor" "instance-of" "Q28640")

(refer-to ["properties.different_from"])
(fact claim "professor" "different-from" "Q495871")

(refer-to ["properties.female_form_of_label"])
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
(fact claim "professor" "female-form-of-label" "monolingualtext")
