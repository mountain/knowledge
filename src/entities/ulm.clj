(ns entities.ulm
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Ulm")

(name-as-in "Ulm" "烏爾姆" "zh-hant")
(name-as-in "Ulm" "乌尔姆" "zh-hans")
(name-as-in "Ulm" "Ульм" "ru")
(name-as-in "Ulm" "Ulm" "pt")
(name-as-in "Ulm" "Ulm" "fr")
(name-as-in "Ulm" "Ulm" "es")
(name-as-in "Ulm" "ウルム" "ja")
(name-as-in "Ulm" "Ulm" "de")
(name-as-in "Ulm" "Ulm" "en")

(descr-as-in "Ulm" "德國城市" "zh-hant")
(descr-as-in "Ulm" "德国城市" "zh-hans")
(descr-as-in "Ulm" "город в земле Баден-Вюртемберг, Германия" "ru")
(descr-as-in "Ulm" "" "pt")
(descr-as-in "Ulm" "Ville d'Allemagne" "fr")
(descr-as-in "Ulm" "ciudad alemana" "es")
(descr-as-in "Ulm" "" "ja")
(descr-as-in "Ulm" "Großstadt an der Donau in Baden-Württemberg" "de")
(descr-as-in "Ulm" "German city" "en")

(fact claim "Ulm" "local-dialing-code" "0731")

(fact claim "Ulm" "local-dialing-code" "07346")

(fact claim "Ulm" "local-dialing-code" "07304")

(fact claim "Ulm" "local-dialing-code" "07305")

(fact claim "Ulm" "locator-map-image" "Baden-Württemberg UL (town).svg")

(fact claim "Ulm" "type-of-administrative-division" "Kreisfreie stadt")

(fact claim "Ulm" "type-of-administrative-division" "Q2327515")

(fact claim "Ulm" "time-zone" "UTC+01:00")

(fact claim "Ulm" "main-type-gnd" "geographical feature")

(fact claim "Ulm" "coordinate-location" "lng 9.9833333333333 lat 48.4 alt ")

(fact claim "Ulm" "german-municipality-key" "08421000")

(fact claim "Ulm" "coat-of-arms-image" "Coat of arms of Ulm.svg")

(fact claim "Ulm" "continent" "Eurasia")

(fact claim "Ulm" "instance-of" "Großstadt")

(fact claim "Ulm" "instance-of" "college town")

(fact claim "Ulm" "country" "Germany")

(fact claim "Ulm" "image" "Ulm vom sprollheim aus.jpg")

(fact claim "Ulm" "postal-code" "89081")

(fact claim "Ulm" "postal-code" "89073")

(fact claim "Ulm" "is-in-the-administrative-unit" "Baden-Württemberg")

(fact claim "Ulm" "is-in-the-administrative-unit" "Regierungsbezirk Tübingen")

(fact claim "Ulm" "commons-category" "Ulm")

