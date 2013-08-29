(ns entities.new_jersey
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "New Jersey")

(name-as-in "New Jersey" "新澤西州" "zh-hant")
(name-as-in "New Jersey" "新泽西州" "zh-hans")
(name-as-in "New Jersey" "Нью-Джерси" "ru")
(name-as-in "New Jersey" "Nova Jérsei" "pt")
(name-as-in "New Jersey" "New Jersey" "fr")
(name-as-in "New Jersey" "Nueva Jersey" "es")
(name-as-in "New Jersey" "ニュージャージー州" "ja")
(name-as-in "New Jersey" "New Jersey" "de")
(name-as-in "New Jersey" "New Jersey" "en")

(descr-as-in "New Jersey" "" "zh-hant")
(descr-as-in "New Jersey" "" "zh-hans")
(descr-as-in "New Jersey" "штат в США" "ru")
(descr-as-in "New Jersey" "" "pt")
(descr-as-in "New Jersey" "État des États-Unis" "fr")
(descr-as-in "New Jersey" "estado de los Estados Unidos de América" "es")
(descr-as-in "New Jersey" "" "ja")
(descr-as-in "New Jersey" "Bundesstaat der USA" "de")
(descr-as-in "New Jersey" "state of the United States of America" "en")


(refer-to ["properties.locator_map_image"])
(fact claim "New Jersey" "locator-map-image" "Map of New Jersey NA.png")

(refer-to ["properties.type_of_administrative_division"])
(refer-to ["clazzes.u_s__state"])
(fact claim "New Jersey" "type-of-administrative-division" "U.S. state")

(refer-to ["properties.iso_3166_2"])
(fact claim "New Jersey" "iso-3166-2" "US-NJ")

(refer-to ["properties.time_zone"])
(refer-to ["clazzes.utc−05_00"])
(fact claim "New Jersey" "time-zone" "UTC−05:00")

(refer-to ["properties.named_after"])
(refer-to ["entities.jersey"])
(fact claim "New Jersey" "named-after" "Jersey")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "New Jersey" "main-type-gnd" "geographical feature")

(refer-to ["properties.coordinate_location"])
(fact claim "New Jersey" "coordinate-location" "lng -74.5 lat 40 alt ")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "New Jersey" "coat-of-arms-image" "Seal of New Jersey.svg")

(refer-to ["properties.flag_image"])
(fact claim "New Jersey" "flag-image" "Flag of New Jersey.svg")

(refer-to ["properties.capital"])
(refer-to ["entities.trenton"])
(fact claim "New Jersey" "capital" "Trenton")

(refer-to ["properties.shares_border_with"])
(refer-to ["entities.new_york"])
(fact claim "New Jersey" "shares-border-with" "New York")
(refer-to ["entities.pennsylvania"])
(fact claim "New Jersey" "shares-border-with" "Pennsylvania")
(refer-to ["entities.delaware"])
(fact claim "New Jersey" "shares-border-with" "Delaware")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.english"])
(fact claim "New Jersey" "official-language" "English")

(refer-to ["properties.country"])
(refer-to ["entities.united_states_of_america"])
(fact claim "New Jersey" "country" "United States of America")

(refer-to ["properties.legislative_body"])
(refer-to ["clazzes.new_jersey_legislature"])
(fact claim "New Jersey" "legislative-body" "New Jersey Legislature")
(refer-to ["clazzes.new_jersey_senate"])
(fact claim "New Jersey" "legislative-body" "New Jersey Senate")
(refer-to ["clazzes.new_jersey_general_assembly"])
(fact claim "New Jersey" "legislative-body" "New Jersey General Assembly")

(refer-to ["properties.flag"])
(refer-to ["clazzes.flag_of_new_jersey"])
(fact claim "New Jersey" "flag" "Flag of New Jersey")

(refer-to ["properties.commons_category"])
(refer-to ["entities.new_jersey"])
(fact claim "New Jersey" "commons-category" "New Jersey")
