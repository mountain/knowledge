(ns entities.bad_buchau
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Bad Buchau")

(name-as-in "Bad Buchau" "巴德布豪" "zh-hant")
(name-as-in "Bad Buchau" "巴德布豪" "zh-hans")
(name-as-in "Bad Buchau" "Бад-Бухау" "ru")
(name-as-in "Bad Buchau" "Bad Buchau" "pt")
(name-as-in "Bad Buchau" "Bad Buchau" "fr")
(name-as-in "Bad Buchau" "Bad Buchau" "es")
(name-as-in "Bad Buchau" "" "ja")
(name-as-in "Bad Buchau" "Bad Buchau" "de")
(name-as-in "Bad Buchau" "Bad Buchau" "en")

(descr-as-in "Bad Buchau" "" "zh-hant")
(descr-as-in "Bad Buchau" "" "zh-hans")
(descr-as-in "Bad Buchau" "город в земле Баден-Вюртемберг, Германия" "ru")
(descr-as-in "Bad Buchau" "" "pt")
(descr-as-in "Bad Buchau" "commune allemande" "fr")
(descr-as-in "Bad Buchau" "localidad de Baden-Wurtemberg, Alemania" "es")
(descr-as-in "Bad Buchau" "" "ja")
(descr-as-in "Bad Buchau" "Stadt in Deutschland" "de")
(descr-as-in "Bad Buchau" "town in Baden-Württemberg, Germany" "en")


(refer-to ["properties.type_of_administrative_division"])
(refer-to ["clazzes.city"])
(fact claim "Bad Buchau" "type-of-administrative-division" "city")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Bad Buchau" "main-type-gnd" "geographical feature")

(refer-to ["properties.coordinate_location"])
(fact claim "Bad Buchau" "coordinate-location" "lng 9.61 lat 48.066111111111 alt ")

(refer-to ["properties.german_municipality_key"])
(fact claim "Bad Buchau" "german-municipality-key" "08426013")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Bad Buchau" "coat-of-arms-image" "Wappen Bad Buchau.svg")

(refer-to ["properties.continent"])
(refer-to ["entities.europe"])
(fact claim "Bad Buchau" "continent" "Europe")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.spa_town"])
(fact claim "Bad Buchau" "instance-of" "spa town")
(refer-to ["clazzes.balneario"])
(fact claim "Bad Buchau" "instance-of" "balneario")

(refer-to ["properties.country"])
(refer-to ["entities.germany"])
(fact claim "Bad Buchau" "country" "Germany")

(refer-to ["properties.postal_code"])
(fact claim "Bad Buchau" "postal-code" "88422")

(refer-to ["properties.is_in_the_administrative_unit"])
(refer-to ["entities.biberach"])
(fact claim "Bad Buchau" "is-in-the-administrative-unit" "Biberach")
(refer-to ["entities.baden_württemberg"])
(fact claim "Bad Buchau" "is-in-the-administrative-unit" "Baden-Württemberg")
(refer-to ["entities.regierungsbezirk_tübingen"])
(fact claim "Bad Buchau" "is-in-the-administrative-unit" "Regierungsbezirk Tübingen")

(refer-to ["properties.commons_category"])
(refer-to ["entities.bad_buchau"])
(fact claim "Bad Buchau" "commons-category" "Bad Buchau")
