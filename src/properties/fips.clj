(ns properties.fips
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "fips")

(name-as-in "fips" "" "zh-hant")
(name-as-in "fips" "" "zh-hans")
(name-as-in "fips" "" "ru")
(name-as-in "fips" "" "pt")
(name-as-in "fips" "" "fr")
(name-as-in "fips" "FIPS" "es")
(name-as-in "fips" "" "ja")
(name-as-in "fips" "" "de")
(name-as-in "fips" "FIPS" "en")

(descr-as-in "fips" "" "zh-hant")
(descr-as-in "fips" "" "zh-hans")
(descr-as-in "fips" "" "ru")
(descr-as-in "fips" "" "pt")
(descr-as-in "fips" "" "fr")
(descr-as-in "fips" "código de identificación para objetos geográficos en los EUA" "es")
(descr-as-in "fips" "" "ja")
(descr-as-in "fips" "" "de")
(descr-as-in "fips" "former US identification codes for geographic objects" "en")

