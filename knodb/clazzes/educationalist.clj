(ns clazzes.educationalist
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "educationalist")

(name-as-in "educationalist" "教育學家" "zh-hk")
(name-as-in "educationalist" "pedagogo" "pt")
(name-as-in "educationalist" "educationalist" "en")
(name-as-in "educationalist" "pédagogue" "fr")
(name-as-in "educationalist" "教育學家" "zh-tw")
(name-as-in "educationalist" "Pädagoge" "de")
(name-as-in "educationalist" "педагог" "ru")
(name-as-in "educationalist" "pedagogo" "es")
(name-as-in "educationalist" "教育学者" "ja")
(name-as-in "educationalist" "教育学家" "zh-cn")
(name-as-in "educationalist" "教育学家" "zh-sg")

(descr-as-in "educationalist" "" "zh-hk")
(descr-as-in "educationalist" "" "pt")
(descr-as-in "educationalist" "person working in the academic field of pedagogy" "en")
(descr-as-in "educationalist" "personne travaillant dans le domaine de la pédagogie" "fr")
(descr-as-in "educationalist" "" "zh-tw")
(descr-as-in "educationalist" "Person, die sich mit erzieherischen Handeln professionell auseinandersetzt" "de")
(descr-as-in "educationalist" "" "ru")
(descr-as-in "educationalist" "persona que se especializa en la pedagogía" "es")
(descr-as-in "educationalist" "教育学の学術分野で働く者" "ja")
(descr-as-in "educationalist" "" "zh-cn")
(descr-as-in "educationalist" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "educationalist" "subclass-of" "Q901")

(refer-to ["properties.commons_category"])
(fact claim "educationalist" "commons-category" "Educationists")

(refer-to ["properties.topics_main_category"])
(fact claim "educationalist" "topic's-main-category" "Q10257749")

(refer-to ["properties.field_of_this_occupation"])
(fact claim "educationalist" "field-of-this-occupation" "Q7922")

(refer-to ["properties.gnd_id"])
(fact claim "educationalist" "gnd-id" "4044300-0")

(refer-to ["properties.instance_of"])
(fact claim "educationalist" "instance-of" "Q28640")

(refer-to ["properties.different_from"])
(fact claim "educationalist" "different-from" "Q37226")
(fact claim "educationalist" "different-from" "Q974144")

(refer-to ["properties.female_form_of_label"])
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")
(fact claim "educationalist" "female-form-of-label" "monolingualtext")

(refer-to ["properties.quora_topic_id"])
(fact claim "educationalist" "quora-topic-id" "Educationist")
