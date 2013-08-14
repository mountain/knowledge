(ns properties.capital
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "capital")

(name-as-in "capital" "行政中心" "zh-hant")
(name-as-in "capital" "行政中心" "zh-hans")
(name-as-in "capital" "столица" "ru")
(name-as-in "capital" "capital" "pt")
(name-as-in "capital" "capitale" "fr")
(name-as-in "capital" "capital" "es")
(name-as-in "capital" "行政中心地" "ja")
(name-as-in "capital" "Hauptstadt" "de")
(name-as-in "capital" "capital" "en")

(descr-as-in "capital" "" "zh-hant")
(descr-as-in "capital" "" "zh-hans")
(descr-as-in "capital" "центральный населённый пункт в административной единице" "ru")
(descr-as-in "capital" "" "pt")
(descr-as-in "capital" "siège du pouvoir politique" "fr")
(descr-as-in "capital" "Ciudad donde se ubica el gobierno del país, región o subdivisión." "es")
(descr-as-in "capital" "国、州、または行政区画の行政中枢である自治体" "ja")
(descr-as-in "capital" "Regierungs- oder Verwaltungssitz eines Staates, Landes oder administrativen Untereinheit" "de")
(descr-as-in "capital" "location (city, municipality) of governmental seat of the country, state or administrative subdivision" "en")

