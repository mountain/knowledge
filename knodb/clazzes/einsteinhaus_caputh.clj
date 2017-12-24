(ns clazzes.einsteinhaus_caputh
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Einsteinhaus Caputh")

(name-as-in "Einsteinhaus Caputh" "" "zh-hk")
(name-as-in "Einsteinhaus Caputh" "" "pt")
(name-as-in "Einsteinhaus Caputh" "Einsteinhaus Caputh" "en")
(name-as-in "Einsteinhaus Caputh" "" "fr")
(name-as-in "Einsteinhaus Caputh" "" "zh-tw")
(name-as-in "Einsteinhaus Caputh" "Einsteinhaus Caputh" "de")
(name-as-in "Einsteinhaus Caputh" "" "ru")
(name-as-in "Einsteinhaus Caputh" "" "es")
(name-as-in "Einsteinhaus Caputh" "" "ja")
(name-as-in "Einsteinhaus Caputh" "" "zh-cn")
(name-as-in "Einsteinhaus Caputh" "" "zh-sg")

(descr-as-in "Einsteinhaus Caputh" "" "zh-hk")
(descr-as-in "Einsteinhaus Caputh" "" "pt")
(descr-as-in "Einsteinhaus Caputh" "from 1929 to 1932 house of Albert Einstein" "en")
(descr-as-in "Einsteinhaus Caputh" "" "fr")
(descr-as-in "Einsteinhaus Caputh" "" "zh-tw")
(descr-as-in "Einsteinhaus Caputh" "von 1929 bis 1932 Wohnhaus Albert Einsteins" "de")
(descr-as-in "Einsteinhaus Caputh" "" "ru")
(descr-as-in "Einsteinhaus Caputh" "" "es")
(descr-as-in "Einsteinhaus Caputh" "" "ja")
(descr-as-in "Einsteinhaus Caputh" "" "zh-cn")
(descr-as-in "Einsteinhaus Caputh" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Einsteinhaus Caputh" "country" "Q183")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.einsteinhaus_caputh"])
(fact claim "Einsteinhaus Caputh" "commons-category" "Einsteinhaus Caputh")

(refer-to ["properties.occupant"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Einsteinhaus Caputh" "occupant" "Albert Einstein")
(fact claim "Einsteinhaus Caputh" "occupant" "Q30185")
(fact claim "Einsteinhaus Caputh" "occupant" "Q49738")
(fact claim "Einsteinhaus Caputh" "occupant" "Q998964")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Einsteinhaus Caputh" "located-in-the-administrative-territorial-entity" "Q625403")

(refer-to ["properties.commissioned_by"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Einsteinhaus Caputh" "commissioned-by" "Albert Einstein")

(refer-to ["properties.heritage_designation"])
(fact claim "Einsteinhaus Caputh" "heritage-designation" "Q811165")

(refer-to ["properties.described_at_url"])
(fact claim "Einsteinhaus Caputh" "described-at-url" "http://ns.gis-bldam-brandenburg.de/hida4web/view?docId=obj09190125,t.xml;query=;brand=default;doc.style=standardview;blockId=d86995e48;startDoc=1")
(fact claim "Einsteinhaus Caputh" "described-at-url" "http://ns.gis-bldam-brandenburg.de/hida4web/view?docId=obj09190125,t.xml;query=;brand=default;doc.style=gridview;blockId=d86995e2;startDoc=1")
(fact claim "Einsteinhaus Caputh" "described-at-url" "http://ns.gis-bldam-brandenburg.de./HTML-8336/09190125.html")

(refer-to ["properties.manufacturer"])
(fact claim "Einsteinhaus Caputh" "manufacturer" "Q1084446")

(refer-to ["properties.coordinate_location"])
(fact claim "Einsteinhaus Caputh" "coordinate-location" "lng 13.0141 lat 52.35 alt ")

(refer-to ["properties.inception"])
(fact claim "Einsteinhaus Caputh" "inception" "+1929-00-00T00:00:00Z")

(refer-to ["properties.significant_event"])
(fact claim "Einsteinhaus Caputh" "significant-event" "Q217102")

(refer-to ["properties.location"])
(fact claim "Einsteinhaus Caputh" "location" "Q464344")

(refer-to ["properties.instance_of"])
(fact claim "Einsteinhaus Caputh" "instance-of" "Q5003624")
(fact claim "Einsteinhaus Caputh" "instance-of" "Q358")

(refer-to ["properties.image"])
(fact claim "Einsteinhaus Caputh" "image" "Albert Einstein home Berlin 100.JPG")

(refer-to ["properties.architect"])
(fact claim "Einsteinhaus Caputh" "architect" "Q95246")

(refer-to ["properties.bldam_object_id"])
(fact claim "Einsteinhaus Caputh" "bldam-object-id" "09190125,t")

(refer-to ["properties.owned_by"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Einsteinhaus Caputh" "owned-by" "Albert Einstein")
(fact claim "Einsteinhaus Caputh" "owned-by" "Q464344")
(fact claim "Einsteinhaus Caputh" "owned-by" "Q174158")

(refer-to ["properties.named_after"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Einsteinhaus Caputh" "named-after" "Albert Einstein")
