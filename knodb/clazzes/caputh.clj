(ns clazzes.caputh
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Caputh")

(name-as-in "Caputh" "" "zh-hk")
(name-as-in "Caputh" "" "pt")
(name-as-in "Caputh" "Caputh" "en")
(name-as-in "Caputh" "Caputh" "fr")
(name-as-in "Caputh" "" "zh-tw")
(name-as-in "Caputh" "Caputh" "de")
(name-as-in "Caputh" "" "ru")
(name-as-in "Caputh" "" "es")
(name-as-in "Caputh" "カプート" "ja")
(name-as-in "Caputh" "" "zh-cn")
(name-as-in "Caputh" "" "zh-sg")

(descr-as-in "Caputh" "" "zh-hk")
(descr-as-in "Caputh" "" "pt")
(descr-as-in "Caputh" "Town" "en")
(descr-as-in "Caputh" "" "fr")
(descr-as-in "Caputh" "" "zh-tw")
(descr-as-in "Caputh" "Ortsteil der Gemeinde Schwielowsee" "de")
(descr-as-in "Caputh" "" "ru")
(descr-as-in "Caputh" "" "es")
(descr-as-in "Caputh" "" "ja")
(descr-as-in "Caputh" "" "zh-cn")
(descr-as-in "Caputh" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Caputh" "country" "Q183")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.caputh"])
(fact claim "Caputh" "commons-category" "Caputh")

(refer-to ["properties.viaf_id"])
(fact claim "Caputh" "viaf-id" "129688165")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Caputh" "located-in-the-administrative-territorial-entity" "Q625403")

(refer-to ["properties.topics_main_category"])
(fact claim "Caputh" "topic's-main-category" "Q21014995")

(refer-to ["properties.postal_code"])
(fact claim "Caputh" "postal-code" "14548")

(refer-to ["properties.geonames_id"])
(fact claim "Caputh" "geonames-id" "2940315")

(refer-to ["properties.woeid"])
(fact claim "Caputh" "woeid" "643038")

(refer-to ["properties.elevation_above_sea_level"])
(fact claim "Caputh" "elevation-above-sea-level" "quantity")

(refer-to ["properties.population"])
(fact claim "Caputh" "population" "quantity")

(refer-to ["properties.freebase_id"])
(fact claim "Caputh" "freebase-id" "/m/0405p2p")

(refer-to ["properties.coordinate_location"])
(fact claim "Caputh" "coordinate-location" "lng 12.9953 lat 52.3472 alt ")

(refer-to ["properties.gnd_id"])
(fact claim "Caputh" "gnd-id" "4259445-5")

(refer-to ["properties.instance_of"])
(fact claim "Caputh" "instance-of" "Q253019")

(refer-to ["properties.image"])
(fact claim "Caputh" "image" "Caputh-02.jpg")

(refer-to ["properties.located_in_or_next_to_body_of_water"])
(fact claim "Caputh" "located-in-or-next-to-body-of-water" "Q318313")

(refer-to ["properties.located_in_time_zone"])
(fact claim "Caputh" "located-in-time-zone" "Q6655")
(fact claim "Caputh" "located-in-time-zone" "Q6723")
