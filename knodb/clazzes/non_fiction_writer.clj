(ns clazzes.non_fiction_writer
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "non-fiction writer")

(name-as-in "non-fiction writer" "非虛構文學作家" "zh-hk")
(name-as-in "non-fiction writer" "" "pt")
(name-as-in "non-fiction writer" "non-fiction writer" "en")
(name-as-in "non-fiction writer" "essayiste" "fr")
(name-as-in "non-fiction writer" "非虛構文學作家" "zh-tw")
(name-as-in "non-fiction writer" "Sachbuchautor" "de")
(name-as-in "non-fiction writer" "писатель-документалист" "ru")
(name-as-in "non-fiction writer" "escritor de no ficción" "es")
(name-as-in "non-fiction writer" "ノンフィクション作家" "ja")
(name-as-in "non-fiction writer" "非虚构文学作家" "zh-cn")
(name-as-in "non-fiction writer" "非虚构文学作家" "zh-sg")

(descr-as-in "non-fiction writer" "" "zh-hk")
(descr-as-in "non-fiction writer" "" "pt")
(descr-as-in "non-fiction writer" "author who writes non-fiction texts" "en")
(descr-as-in "non-fiction writer" "auteur de textes ne relevant pas de la fiction" "fr")
(descr-as-in "non-fiction writer" "" "zh-tw")
(descr-as-in "non-fiction writer" "AutorIn, die/der Sachbücher verfasst" "de")
(descr-as-in "non-fiction writer" "человек, пишущий научную, публицистическую или другую литературу, не построенную на художественном вымысле" "ru")
(descr-as-in "non-fiction writer" "profesión" "es")
(descr-as-in "non-fiction writer" "ノンフィクションを活動分野とする作家" "ja")
(descr-as-in "non-fiction writer" "" "zh-cn")
(descr-as-in "non-fiction writer" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "non-fiction writer" "instance-of" "Q28640")

(refer-to ["properties.subclass_of"])
(fact claim "non-fiction writer" "subclass-of" "Q36180")

(refer-to ["properties.field_of_this_occupation"])
(fact claim "non-fiction writer" "field-of-this-occupation" "Q213051")

(refer-to ["properties.topics_main_category"])
(fact claim "non-fiction writer" "topic's-main-category" "Q6997687")

(refer-to ["properties.female_form_of_label"])
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")
(fact claim "non-fiction writer" "female-form-of-label" "monolingualtext")

(refer-to ["properties.has_list"])
(fact claim "non-fiction writer" "has-list" "Q6630726")
