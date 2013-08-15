(ns entities.woods_hole_massachusetts
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Woods Hole, Massachusetts")

(name-as-in "Woods Hole, Massachusetts" "" "zh-hant")
(name-as-in "Woods Hole, Massachusetts" "" "zh-hans")
(name-as-in "Woods Hole, Massachusetts" "" "ru")
(name-as-in "Woods Hole, Massachusetts" "Woods Hole" "pt")
(name-as-in "Woods Hole, Massachusetts" "Woods Hole" "fr")
(name-as-in "Woods Hole, Massachusetts" "Woods Hole" "es")
(name-as-in "Woods Hole, Massachusetts" "" "ja")
(name-as-in "Woods Hole, Massachusetts" "" "de")
(name-as-in "Woods Hole, Massachusetts" "Woods Hole, Massachusetts" "en")

(descr-as-in "Woods Hole, Massachusetts" "" "zh-hant")
(descr-as-in "Woods Hole, Massachusetts" "" "zh-hans")
(descr-as-in "Woods Hole, Massachusetts" "" "ru")
(descr-as-in "Woods Hole, Massachusetts" "" "pt")
(descr-as-in "Woods Hole, Massachusetts" "comté américain" "fr")
(descr-as-in "Woods Hole, Massachusetts" "" "es")
(descr-as-in "Woods Hole, Massachusetts" "" "ja")
(descr-as-in "Woods Hole, Massachusetts" "" "de")
(descr-as-in "Woods Hole, Massachusetts" "" "en")


(refer-to ["properties.commons_category"])
(refer-to ["entities.woods_hole_massachusetts"])
(fact claim "Woods Hole, Massachusetts" "commons-category" "Woods Hole, Massachusetts")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Woods Hole, Massachusetts" "main-type-gnd" "geographical feature")

(refer-to ["properties.country"])
(refer-to ["entities.united_states_of_america"])
(fact claim "Woods Hole, Massachusetts" "country" "United States of America")
