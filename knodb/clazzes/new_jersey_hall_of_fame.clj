(ns clazzes.new_jersey_hall_of_fame
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "New Jersey Hall of Fame")

(name-as-in "New Jersey Hall of Fame" "" "zh-hk")
(name-as-in "New Jersey Hall of Fame" "" "pt")
(name-as-in "New Jersey Hall of Fame" "New Jersey Hall of Fame" "en")
(name-as-in "New Jersey Hall of Fame" "" "fr")
(name-as-in "New Jersey Hall of Fame" "" "zh-tw")
(name-as-in "New Jersey Hall of Fame" "" "de")
(name-as-in "New Jersey Hall of Fame" "Зал славы Нью-Джерси" "ru")
(name-as-in "New Jersey Hall of Fame" "" "es")
(name-as-in "New Jersey Hall of Fame" "ニュージャージー州の殿堂" "ja")
(name-as-in "New Jersey Hall of Fame" "新泽西州名人堂" "zh-cn")
(name-as-in "New Jersey Hall of Fame" "" "zh-sg")

(descr-as-in "New Jersey Hall of Fame" "" "zh-hk")
(descr-as-in "New Jersey Hall of Fame" "" "pt")
(descr-as-in "New Jersey Hall of Fame" "" "en")
(descr-as-in "New Jersey Hall of Fame" "" "fr")
(descr-as-in "New Jersey Hall of Fame" "" "zh-tw")
(descr-as-in "New Jersey Hall of Fame" "" "de")
(descr-as-in "New Jersey Hall of Fame" "" "ru")
(descr-as-in "New Jersey Hall of Fame" "" "es")
(descr-as-in "New Jersey Hall of Fame" "" "ja")
(descr-as-in "New Jersey Hall of Fame" "" "zh-cn")
(descr-as-in "New Jersey Hall of Fame" "" "zh-sg")


(refer-to ["properties.coordinate_location"])
(fact claim "New Jersey Hall of Fame" "coordinate-location" "lng -74.078 lat 40.814 alt ")

(refer-to ["properties.country"])
(fact claim "New Jersey Hall of Fame" "country" "Q30")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "New Jersey Hall of Fame" "located-in-the-administrative-territorial-entity" "Q1408")

(refer-to ["properties.instance_of"])
(fact claim "New Jersey Hall of Fame" "instance-of" "Q618779")

(refer-to ["properties.inception"])
(fact claim "New Jersey Hall of Fame" "inception" "+2008-00-00T00:00:00Z")

(refer-to ["properties.official_website"])
(fact claim "New Jersey Hall of Fame" "official-website" "https://njhalloffame.org/")
