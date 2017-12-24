(ns clazzes.national_museum_of_health_and_medicine
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "National Museum of Health and Medicine")

(name-as-in "National Museum of Health and Medicine" "" "zh-hk")
(name-as-in "National Museum of Health and Medicine" "" "pt")
(name-as-in "National Museum of Health and Medicine" "National Museum of Health and Medicine" "en")
(name-as-in "National Museum of Health and Medicine" "National Museum of Health and Medicine" "fr")
(name-as-in "National Museum of Health and Medicine" "" "zh-tw")
(name-as-in "National Museum of Health and Medicine" "" "de")
(name-as-in "National Museum of Health and Medicine" "" "ru")
(name-as-in "National Museum of Health and Medicine" "" "es")
(name-as-in "National Museum of Health and Medicine" "" "ja")
(name-as-in "National Museum of Health and Medicine" "美国国家卫生与医学博物馆" "zh-cn")
(name-as-in "National Museum of Health and Medicine" "" "zh-sg")

(descr-as-in "National Museum of Health and Medicine" "" "zh-hk")
(descr-as-in "National Museum of Health and Medicine" "" "pt")
(descr-as-in "National Museum of Health and Medicine" "" "en")
(descr-as-in "National Museum of Health and Medicine" "musée  américain" "fr")
(descr-as-in "National Museum of Health and Medicine" "" "zh-tw")
(descr-as-in "National Museum of Health and Medicine" "" "de")
(descr-as-in "National Museum of Health and Medicine" "" "ru")
(descr-as-in "National Museum of Health and Medicine" "" "es")
(descr-as-in "National Museum of Health and Medicine" "" "ja")
(descr-as-in "National Museum of Health and Medicine" "" "zh-cn")
(descr-as-in "National Museum of Health and Medicine" "" "zh-sg")


(refer-to ["properties.visitors_per_year"])
(fact claim "National Museum of Health and Medicine" "visitors-per-year" "quantity")

(refer-to ["properties.country"])
(refer-to ["clazzes.united_states_of_america"])
(fact claim "National Museum of Health and Medicine" "country" "United States of America")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.national_museum_of_health_and_medicine"])
(fact claim "National Museum of Health and Medicine" "commons-category" "National Museum of Health and Medicine")

(refer-to ["properties.viaf_id"])
(fact claim "National Museum of Health and Medicine" "viaf-id" "128836992")

(refer-to ["properties.atheneum_museum_id"])
(fact claim "National Museum of Health and Medicine" "atheneum-museum-id" "480")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "National Museum of Health and Medicine" "located-in-the-administrative-territorial-entity" "Q1391")

(refer-to ["properties.geonames_id"])
(fact claim "National Museum of Health and Medicine" "geonames-id" "4139751")

(refer-to ["properties.sudoc_authorities"])
(fact claim "National Museum of Health and Medicine" "sudoc-authorities" "177973633")

(refer-to ["properties.freebase_id"])
(fact claim "National Museum of Health and Medicine" "freebase-id" "/m/09mm7v")

(refer-to ["properties.coordinate_location"])
(fact claim "National Museum of Health and Medicine" "coordinate-location" "lng -77.0539 lat 39.0089 alt ")

(refer-to ["properties.inception"])
(fact claim "National Museum of Health and Medicine" "inception" "+1862-01-01T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "National Museum of Health and Medicine" "isni" "0000 0001 2323 1846")

(refer-to ["properties.official_website"])
(fact claim "National Museum of Health and Medicine" "official-website" "http://www.medicalmuseum.mil/")

(refer-to ["properties.instance_of"])
(fact claim "National Museum of Health and Medicine" "instance-of" "Q2772772")

(refer-to ["properties.image"])
(fact claim "National Museum of Health and Medicine" "image" "NationalMuseumOfHealthAndMedicine.jpg")
