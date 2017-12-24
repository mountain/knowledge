(ns clazzes.science_writer
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "science writer")

(name-as-in "science writer" "" "zh-hk")
(name-as-in "science writer" "" "pt")
(name-as-in "science writer" "science writer" "en")
(name-as-in "science writer" "écrivain scientifique" "fr")
(name-as-in "science writer" "" "zh-tw")
(name-as-in "science writer" "" "de")
(name-as-in "science writer" "научный писатель" "ru")
(name-as-in "science writer" "escritor de ciencia" "es")
(name-as-in "science writer" "サイエンスライター" "ja")
(name-as-in "science writer" "" "zh-cn")
(name-as-in "science writer" "" "zh-sg")

(descr-as-in "science writer" "" "zh-hk")
(descr-as-in "science writer" "" "pt")
(descr-as-in "science writer" "profession in writing" "en")
(descr-as-in "science writer" "écrivain qui rédige des ouvrages scientifiques" "fr")
(descr-as-in "science writer" "" "zh-tw")
(descr-as-in "science writer" "" "de")
(descr-as-in "science writer" "" "ru")
(descr-as-in "science writer" "" "es")
(descr-as-in "science writer" "" "ja")
(descr-as-in "science writer" "" "zh-cn")
(descr-as-in "science writer" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "science writer" "subclass-of" "Q15980158")
(fact claim "science writer" "subclass-of" "Q15143191")

(refer-to ["properties.instance_of"])
(fact claim "science writer" "instance-of" "Q28640")

(refer-to ["properties.topics_main_category"])
(fact claim "science writer" "topic's-main-category" "Q8717866")

(refer-to ["properties.commons_category"])
(fact claim "science writer" "commons-category" "Science writers")

(refer-to ["properties.female_form_of_label"])
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")
(fact claim "science writer" "female-form-of-label" "monolingualtext")

(refer-to ["properties.quora_topic_id"])
(fact claim "science writer" "quora-topic-id" "Science-Writer")
