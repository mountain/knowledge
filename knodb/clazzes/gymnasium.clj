(ns clazzes.gymnasium
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "gymnasium")

(name-as-in "gymnasium" "" "zh-hant")
(name-as-in "gymnasium" "" "zh-hans")
(name-as-in "gymnasium" "Гимназия" "ru")
(name-as-in "gymnasium" "Ginásio" "pt")
(name-as-in "gymnasium" "Gymnasium" "fr")
(name-as-in "gymnasium" "gymnasium" "es")
(name-as-in "gymnasium" "ギムナジウム" "ja")
(name-as-in "gymnasium" "Gymnasium" "de")
(name-as-in "gymnasium" "gymnasium" "en")

(descr-as-in "gymnasium" "" "zh-hant")
(descr-as-in "gymnasium" "" "zh-hans")
(descr-as-in "gymnasium" "" "ru")
(descr-as-in "gymnasium" "" "pt")
(descr-as-in "gymnasium" "" "fr")
(descr-as-in "gymnasium" "escuela de educación secundaria en algunos países europeos" "es")
(descr-as-in "gymnasium" "" "ja")
(descr-as-in "gymnasium" "weiterführende Schule des sekundären Bildungsbereichs" "de")
(descr-as-in "gymnasium" "type of school providing advanced secondary education in Europe" "en")


(refer-to ["properties.commons_category"])
(fact claim "gymnasium" "commons-category" "Gymnasiums (schools)")

(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.school"])
(fact claim "gymnasium" "subclass-of" "school")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "gymnasium" "main-type-gnd" "term")
