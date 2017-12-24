(ns properties.geonames_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "geonames-id")

(name-as-in "geonames-id" "GeoNames編號" "zh-hk")
(name-as-in "geonames-id" "identificador em GeoNames" "pt")
(name-as-in "geonames-id" "GeoNames ID" "en")
(name-as-in "geonames-id" "identifiant GeoNames" "fr")
(name-as-in "geonames-id" "GeoNames編號" "zh-tw")
(name-as-in "geonames-id" "GeoNames-ID" "de")
(name-as-in "geonames-id" "код GeoNames" "ru")
(name-as-in "geonames-id" "identificador GeoNames" "es")
(name-as-in "geonames-id" "GeoNames ID" "ja")
(name-as-in "geonames-id" "GeoNames编号" "zh-cn")
(name-as-in "geonames-id" "GeoNames编号" "zh-sg")

(descr-as-in "geonames-id" "" "zh-hk")
(descr-as-in "geonames-id" "código identificador na base de dados geográfica GeoNames" "pt")
(descr-as-in "geonames-id" "identifier in the GeoNames geographical database" "en")
(descr-as-in "geonames-id" "identifiant dans la base de données géographique GeoNames" "fr")
(descr-as-in "geonames-id" "" "zh-tw")
(descr-as-in "geonames-id" "in der GeoNames-Datenbank benutzte Kennung für geografische Objekte" "de")
(descr-as-in "geonames-id" "код с сайта http://www.geonames.org/" "ru")
(descr-as-in "geonames-id" "número de identificación en la base de datos GeoNames" "es")
(descr-as-in "geonames-id" "GeoNames 地理データベースにおける識別子" "ja")
(descr-as-in "geonames-id" "" "zh-cn")
(descr-as-in "geonames-id" "" "zh-sg")

