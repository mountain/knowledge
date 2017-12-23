(ns db.test-db
  (:use knodb.db))

(fact Geographical-feature "Princeton")

(Individual "Princeton"
            [["Princeton" "de"]
             ["Принстон" "ru"]
             ["Princeton" "pt"]
             ["Princeton" "en"]
             ["普林斯頓" "zh-tw"]
             ["普林斯顿" "zh-cn"]
             ["Princeton" "fr"]
             ["Princeton" "es"]
             ["プリンストン" "ja"]]
            []
            [])

(refer-to ["properties.country"])
(refer-to ["entities.united_states_of_america"])
(fact claim "Princeton" "country" "United States of America")

(refer-to ["properties.coordinate_location"])
(fact claim "Princeton" "coordinate-location" "lng -74.656944444444 lat 40.352222222222 alt ")

(refer-to ["properties.is_in_the_administrative_unit"])
(refer-to ["entities.new_jersey"])
(fact claim "Princeton" "is-in-the-administrative-unit" "New Jersey")


