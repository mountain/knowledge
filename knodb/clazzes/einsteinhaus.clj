(ns clazzes.einsteinhaus
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Einsteinhaus")

(name-as-in "Einsteinhaus" "" "zh-hk")
(name-as-in "Einsteinhaus" "" "pt")
(name-as-in "Einsteinhaus" "Einsteinhaus" "en")
(name-as-in "Einsteinhaus" "maison d'Einstein" "fr")
(name-as-in "Einsteinhaus" "" "zh-tw")
(name-as-in "Einsteinhaus" "Einsteinhaus Bern" "de")
(name-as-in "Einsteinhaus" "Дом-музей Альберта Эйнштейна" "ru")
(name-as-in "Einsteinhaus" "Einsteinhaus" "es")
(name-as-in "Einsteinhaus" "アインシュタイン・ハウス" "ja")
(name-as-in "Einsteinhaus" "" "zh-cn")
(name-as-in "Einsteinhaus" "" "zh-sg")

(descr-as-in "Einsteinhaus" "" "zh-hk")
(descr-as-in "Einsteinhaus" "" "pt")
(descr-as-in "Einsteinhaus" "museum and a former residence of Albert Einstein" "en")
(descr-as-in "Einsteinhaus" "musée suisse" "fr")
(descr-as-in "Einsteinhaus" "" "zh-tw")
(descr-as-in "Einsteinhaus" "beherbergt ein Museum zum Leben und Werk Albert Einsteins" "de")
(descr-as-in "Einsteinhaus" "" "ru")
(descr-as-in "Einsteinhaus" "" "es")
(descr-as-in "Einsteinhaus" "" "ja")
(descr-as-in "Einsteinhaus" "" "zh-cn")
(descr-as-in "Einsteinhaus" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Einsteinhaus" "country" "Q39")

(refer-to ["properties.located_on_street"])
(fact claim "Einsteinhaus" "located-on-street" "Q680298")

(refer-to ["properties.commons_category"])
(fact claim "Einsteinhaus" "commons-category" "Einsteinhaus Bern")

(refer-to ["properties.occupant"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Einsteinhaus" "occupant" "Albert Einstein")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Einsteinhaus" "located-in-the-administrative-territorial-entity" "Q11911")
(fact claim "Einsteinhaus" "located-in-the-administrative-territorial-entity" "Q70")

(refer-to ["properties.freebase_id"])
(fact claim "Einsteinhaus" "freebase-id" "/m/06zqw5w")

(refer-to ["properties.coordinate_location"])
(fact claim "Einsteinhaus" "coordinate-location" "lng 7.4499 lat 46.9479 alt ")

(refer-to ["properties.official_website"])
(fact claim "Einsteinhaus" "official-website" "http://www.einstein-bern.ch")

(refer-to ["properties.instance_of"])
(fact claim "Einsteinhaus" "instance-of" "Q33506")
(fact claim "Einsteinhaus" "instance-of" "Q699405")

(refer-to ["properties.image"])
(fact claim "Einsteinhaus" "image" "Albert einstein house bern.JPG")

(refer-to ["properties.date_of_official_opening"])
(fact claim "Einsteinhaus" "date-of-official-opening" "+1977-00-00T00:00:00Z")

(refer-to ["properties.named_after"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Einsteinhaus" "named-after" "Albert Einstein")
