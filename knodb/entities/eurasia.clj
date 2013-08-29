(ns entities.eurasia
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Eurasia")

(name-as-in "Eurasia" "" "zh-hant")
(name-as-in "Eurasia" "" "zh-hans")
(name-as-in "Eurasia" "Евразия" "ru")
(name-as-in "Eurasia" "Eurásia" "pt")
(name-as-in "Eurasia" "Eurasie" "fr")
(name-as-in "Eurasia" "Eurasia" "es")
(name-as-in "Eurasia" "ユーラシア大陸" "ja")
(name-as-in "Eurasia" "Eurasien" "de")
(name-as-in "Eurasia" "Eurasia" "en")

(descr-as-in "Eurasia" "" "zh-hant")
(descr-as-in "Eurasia" "" "zh-hans")
(descr-as-in "Eurasia" "континент" "ru")
(descr-as-in "Eurasia" "" "pt")
(descr-as-in "Eurasia" "continent formé par l'Europe et l'Asie" "fr")
(descr-as-in "Eurasia" "término que define una zona geográfica que comprende Europa y Asia unidas" "es")
(descr-as-in "Eurasia" "" "ja")
(descr-as-in "Eurasia" "Kontinentale Landmasse von Europa und Asien" "de")
(descr-as-in "Eurasia" "continental landmass comprising Europe and Asia" "en")


(refer-to ["properties.instance_of"])
(refer-to ["clazzes.continent"])
(fact claim "Eurasia" "instance-of" "continent")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Eurasia" "main-type-gnd" "geographical feature")

(refer-to ["properties.commons_category"])
(refer-to ["entities.eurasia"])
(fact claim "Eurasia" "commons-category" "Eurasia")

(refer-to ["properties.locator_map_image"])
(fact claim "Eurasia" "locator-map-image" "Eurasia (orthographic projection).svg")

(refer-to ["properties.on_astronomical_body"])
(refer-to ["clazzes.earth"])
(fact claim "Eurasia" "on-astronomical-body" "Earth")
