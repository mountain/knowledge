(ns entities.princeton
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Princeton")

(name-as-in "Princeton" "普林斯頓" "zh-hant")
(name-as-in "Princeton" "普林斯顿" "zh-hans")
(name-as-in "Princeton" "Принстон" "ru")
(name-as-in "Princeton" "Princeton" "pt")
(name-as-in "Princeton" "Princeton" "fr")
(name-as-in "Princeton" "Princeton" "es")
(name-as-in "Princeton" "プリンストン" "ja")
(name-as-in "Princeton" "Princeton" "de")
(name-as-in "Princeton" "Princeton" "en")

(descr-as-in "Princeton" "" "zh-hant")
(descr-as-in "Princeton" "" "zh-hans")
(descr-as-in "Princeton" "" "ru")
(descr-as-in "Princeton" "" "pt")
(descr-as-in "Princeton" "" "fr")
(descr-as-in "Princeton" "" "es")
(descr-as-in "Princeton" "" "ja")
(descr-as-in "Princeton" "Universitätsstadt in Mercer County (New Jersey)" "de")
(descr-as-in "Princeton" "" "en")

(fact claim "Princeton" "commons-category" "Princeton, New Jersey")

(fact claim "Princeton" "main-type-gnd" "geographical feature")

(fact claim "Princeton" "country" "United States of America")

(fact claim "Princeton" "coordinate-location" "lng -74.656944444444 lat 40.352222222222 alt ")

(fact claim "Princeton" "is-in-the-administrative-unit" "New Jersey")

