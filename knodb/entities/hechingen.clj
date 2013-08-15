(ns entities.hechingen
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Hechingen")

(name-as-in "Hechingen" "黑欣根" "zh-hant")
(name-as-in "Hechingen" "黑欣根" "zh-hans")
(name-as-in "Hechingen" "Хехинген" "ru")
(name-as-in "Hechingen" "Hechingen" "pt")
(name-as-in "Hechingen" "Hechingen" "fr")
(name-as-in "Hechingen" "Hechingen" "es")
(name-as-in "Hechingen" "" "ja")
(name-as-in "Hechingen" "Hechingen" "de")
(name-as-in "Hechingen" "Hechingen" "en")

(descr-as-in "Hechingen" "" "zh-hant")
(descr-as-in "Hechingen" "" "zh-hans")
(descr-as-in "Hechingen" "" "ru")
(descr-as-in "Hechingen" "" "pt")
(descr-as-in "Hechingen" "commune allemande" "fr")
(descr-as-in "Hechingen" "localidad de Baden-Wurtemberg, Alemania" "es")
(descr-as-in "Hechingen" "" "ja")
(descr-as-in "Hechingen" "Stadt in Deutschland" "de")
(descr-as-in "Hechingen" "" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Hechingen" "main-type-gnd" "geographical feature")

(refer-to ["properties.country"])
(refer-to ["entities.germany"])
(fact claim "Hechingen" "country" "Germany")

(refer-to ["properties.commons_category"])
(refer-to ["entities.hechingen"])
(fact claim "Hechingen" "commons-category" "Hechingen")

(refer-to ["properties.german_municipality_key"])
(fact claim "Hechingen" "german-municipality-key" "08417031")

(refer-to ["properties.coordinate_location"])
(fact claim "Hechingen" "coordinate-location" "lng 8.9633333333333 lat 48.351666666667 alt ")
