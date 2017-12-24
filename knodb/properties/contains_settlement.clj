(ns properties.contains_settlement
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "contains-settlement")

(name-as-in "contains-settlement" "" "zh-hk")
(name-as-in "contains-settlement" "contém o povoamento" "pt")
(name-as-in "contains-settlement" "contains settlement" "en")
(name-as-in "contains-settlement" "contient la localité" "fr")
(name-as-in "contains-settlement" "" "zh-tw")
(name-as-in "contains-settlement" "enthält Siedlung" "de")
(name-as-in "contains-settlement" "включает населённый пункт" "ru")
(name-as-in "contains-settlement" "núcleos de población" "es")
(name-as-in "contains-settlement" "包含する集落" "ja")
(name-as-in "contains-settlement" "" "zh-cn")
(name-as-in "contains-settlement" "" "zh-sg")

(descr-as-in "contains-settlement" "" "zh-hk")
(descr-as-in "contains-settlement" "" "pt")
(descr-as-in "contains-settlement" "settlement which an administrative division contains" "en")
(descr-as-in "contains-settlement" "lieu habité contenu par une division administrative" "fr")
(descr-as-in "contains-settlement" "" "zh-tw")
(descr-as-in "contains-settlement" "Siedlung, die zu einer Gemeinde gehört" "de")
(descr-as-in "contains-settlement" "поселения, входящие в данную административно-территориальную единицу" "ru")
(descr-as-in "contains-settlement" "núcleos de población o asentamientos que contiene una división administrativa" "es")
(descr-as-in "contains-settlement" "主題の行政区画の中にある集落。包含する行政区画はP150を使用。" "ja")
(descr-as-in "contains-settlement" "" "zh-cn")
(descr-as-in "contains-settlement" "" "zh-sg")

