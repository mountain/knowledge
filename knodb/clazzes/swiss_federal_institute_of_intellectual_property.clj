(ns clazzes.swiss_federal_institute_of_intellectual_property
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Swiss Federal Institute of Intellectual Property")

(name-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-hk")
(name-as-in "Swiss Federal Institute of Intellectual Property" "Instituto Federal Suíço de Propriedade Intelectual" "pt")
(name-as-in "Swiss Federal Institute of Intellectual Property" "Swiss Federal Institute of Intellectual Property" "en")
(name-as-in "Swiss Federal Institute of Intellectual Property" "Institut fédéral de la propriété intellectuelle" "fr")
(name-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-tw")
(name-as-in "Swiss Federal Institute of Intellectual Property" "Eidgenössisches Institut für Geistiges Eigentum" "de")
(name-as-in "Swiss Federal Institute of Intellectual Property" "" "ru")
(name-as-in "Swiss Federal Institute of Intellectual Property" "" "es")
(name-as-in "Swiss Federal Institute of Intellectual Property" "" "ja")
(name-as-in "Swiss Federal Institute of Intellectual Property" "瑞士伯爾尼专利局" "zh-cn")
(name-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-sg")

(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-hk")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "pt")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "facility in Bern, Switzerland" "en")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "fr")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-tw")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "de")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "ru")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "es")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "ja")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-cn")
(descr-as-in "Swiss Federal Institute of Intellectual Property" "" "zh-sg")


(refer-to ["properties.freebase_id"])
(fact claim "Swiss Federal Institute of Intellectual Property" "freebase-id" "/m/043n5nn")

(refer-to ["properties.official_website"])
(fact claim "Swiss Federal Institute of Intellectual Property" "official-website" "https://www.ige.ch/en.html")

(refer-to ["properties.logo_image"])
(fact claim "Swiss Federal Institute of Intellectual Property" "logo-image" "Swiss Federal Institute of Intellectual Property.png")

(refer-to ["properties.grid_id"])
(fact claim "Swiss Federal Institute of Intellectual Property" "grid-id" "grid.483041.a")

(refer-to ["properties.country"])
(fact claim "Swiss Federal Institute of Intellectual Property" "country" "Q39")

(refer-to ["properties.coordinate_location"])
(fact claim "Swiss Federal Institute of Intellectual Property" "coordinate-location" "lng 7.455484 lat 46.968757 alt ")

(refer-to ["properties.instance_of"])
(fact claim "Swiss Federal Institute of Intellectual Property" "instance-of" "Q13226383")

(refer-to ["properties.inception"])
(fact claim "Swiss Federal Institute of Intellectual Property" "inception" "+1888-01-01T00:00:00Z")
