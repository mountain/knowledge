(ns entities.ulm
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Ulm")

(name-as-in "Ulm" "Ulm" "de")
(name-as-in "Ulm" "" "zh-hk")
(name-as-in "Ulm" "" "zh-tw")
(name-as-in "Ulm" "Ульм" "ru")
(name-as-in "Ulm" "Ulm" "pt")
(name-as-in "Ulm" "Ulm" "en")
(name-as-in "Ulm" "乌尔姆" "zh-cn")
(name-as-in "Ulm" "Ulm" "fr")
(name-as-in "Ulm" "Ulm" "es")
(name-as-in "Ulm" "" "zh-sg")
(name-as-in "Ulm" "ウルム" "ja")
(name-as-in "Ulm" "乌尔姆" "zh-hans")
(name-as-in "Ulm" "烏爾姆" "zh-hant")

(descr-as-in "Ulm" "Großstadt an der Donau in Baden-Württemberg" "de")
(descr-as-in "Ulm" "" "zh-hk")
(descr-as-in "Ulm" "" "zh-tw")
(descr-as-in "Ulm" "город в земле Баден-Вюртемберг, Германия" "ru")
(descr-as-in "Ulm" "" "pt")
(descr-as-in "Ulm" "German city" "en")
(descr-as-in "Ulm" "" "zh-cn")
(descr-as-in "Ulm" "Ville d'Allemagne" "fr")
(descr-as-in "Ulm" "ciudad alemana" "es")
(descr-as-in "Ulm" "" "zh-sg")
(descr-as-in "Ulm" "" "ja")
(descr-as-in "Ulm" "德国城市" "zh-hans")
(descr-as-in "Ulm" "德國城市" "zh-hant")


(refer-to ["properties.local_dialing_code"])
(fact claim "Ulm" "local-dialing-code" "0731")
(fact claim "Ulm" "local-dialing-code" "07346")
(fact claim "Ulm" "local-dialing-code" "07304")
(fact claim "Ulm" "local-dialing-code" "07305")

(refer-to ["properties.locator_map_image"])
(fact claim "Ulm" "locator-map-image" "Baden-Württemberg UL (town).svg")

(refer-to ["properties.type_of_administrative_division"])
(refer-to ["clazzes.kreisfreie_stadt"])
(fact claim "Ulm" "type-of-administrative-division" "Kreisfreie stadt")
(fact claim "Ulm" "type-of-administrative-division" "Q2327515")

(refer-to ["properties.time_zone"])
(refer-to ["clazzes.utc_01_00"])
(fact claim "Ulm" "time-zone" "UTC+01:00")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Ulm" "main-type-gnd" "geographical feature")

(refer-to ["properties.coordinate_location"])
(fact claim "Ulm" "coordinate-location" "lng 9.9833333333333 lat 48.4 alt ")

(refer-to ["properties.german_municipality_key"])
(fact claim "Ulm" "german-municipality-key" "08421000")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Ulm" "coat-of-arms-image" "Coat of arms of Ulm.svg")

(refer-to ["properties.continent"])
(refer-to ["entities.eurasia"])
(fact claim "Ulm" "continent" "Eurasia")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.großstadt"])
(fact claim "Ulm" "instance-of" "Großstadt")
(refer-to ["clazzes.college_town"])
(fact claim "Ulm" "instance-of" "college town")

(refer-to ["properties.country"])
(refer-to ["entities.germany"])
(fact claim "Ulm" "country" "Germany")

(refer-to ["properties.image"])
(fact claim "Ulm" "image" "Ulm vom sprollheim aus.jpg")

(refer-to ["properties.postal_code"])
(fact claim "Ulm" "postal-code" "89081")
(fact claim "Ulm" "postal-code" "89073")

(refer-to ["properties.is_in_the_administrative_unit"])
(refer-to ["entities.baden_württemberg"])
(fact claim "Ulm" "is-in-the-administrative-unit" "Baden-Württemberg")
(refer-to ["entities.regierungsbezirk_tübingen"])
(fact claim "Ulm" "is-in-the-administrative-unit" "Regierungsbezirk Tübingen")

(refer-to ["properties.commons_category"])
(refer-to ["entities.ulm"])
(fact claim "Ulm" "commons-category" "Ulm")
