(ns clazzes.larousse_encyclopedia_online
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Larousse Encyclopedia online")

(name-as-in "Larousse Encyclopedia online" "" "zh-hk")
(name-as-in "Larousse Encyclopedia online" "Larousse Encyclopedia online" "pt")
(name-as-in "Larousse Encyclopedia online" "Larousse Encyclopedia online" "en")
(name-as-in "Larousse Encyclopedia online" "Encyclopédie Larousse en ligne" "fr")
(name-as-in "Larousse Encyclopedia online" "" "zh-tw")
(name-as-in "Larousse Encyclopedia online" "Larousse Encyclopedia online" "de")
(name-as-in "Larousse Encyclopedia online" "Энциклопедия Ларусса онлайн" "ru")
(name-as-in "Larousse Encyclopedia online" "Larousse Encyclopedia online" "es")
(name-as-in "Larousse Encyclopedia online" "" "ja")
(name-as-in "Larousse Encyclopedia online" "" "zh-cn")
(name-as-in "Larousse Encyclopedia online" "" "zh-sg")

(descr-as-in "Larousse Encyclopedia online" "" "zh-hk")
(descr-as-in "Larousse Encyclopedia online" "" "pt")
(descr-as-in "Larousse Encyclopedia online" "online-version of Grand Larousse encyclopédique" "en")
(descr-as-in "Larousse Encyclopedia online" "édition en ligne du Grand Larousse encyclopédique" "fr")
(descr-as-in "Larousse Encyclopedia online" "" "zh-tw")
(descr-as-in "Larousse Encyclopedia online" "online-version der Großen Larousse Enzyklopädie" "de")
(descr-as-in "Larousse Encyclopedia online" "онлайн-версия энциклопедии Ларусса" "ru")
(descr-as-in "Larousse Encyclopedia online" "" "es")
(descr-as-in "Larousse Encyclopedia online" "" "ja")
(descr-as-in "Larousse Encyclopedia online" "" "zh-cn")
(descr-as-in "Larousse Encyclopedia online" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Larousse Encyclopedia online" "instance-of" "Q3331189")

(refer-to ["properties.edition_or_translation_of"])
(fact claim "Larousse Encyclopedia online" "edition-or-translation-of" "Q2568738")

(refer-to ["properties.official_website"])
(fact claim "Larousse Encyclopedia online" "official-website" "http://www.larousse.fr/encyclopedie")

(refer-to ["properties.language_of_work_or_name"])
(fact claim "Larousse Encyclopedia online" "language-of-work-or-name" "Q150")

(refer-to ["properties.full_work_available_at"])
(fact claim "Larousse Encyclopedia online" "full-work-available-at" "http://www.larousse.fr/encyclopedie/")

(refer-to ["properties.title"])
(fact claim "Larousse Encyclopedia online" "title" "monolingualtext")
