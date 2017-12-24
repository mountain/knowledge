(ns clazzes.princeton
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Princeton")

(name-as-in "Princeton" "普林斯頓" "zh-hk")
(name-as-in "Princeton" "Princeton" "pt")
(name-as-in "Princeton" "Princeton" "en")
(name-as-in "Princeton" "Princeton" "fr")
(name-as-in "Princeton" "普林斯頓" "zh-tw")
(name-as-in "Princeton" "Princeton" "de")
(name-as-in "Princeton" "Принстон" "ru")
(name-as-in "Princeton" "Princeton borough" "es")
(name-as-in "Princeton" "プリンストン" "ja")
(name-as-in "Princeton" "普林斯顿" "zh-cn")
(name-as-in "Princeton" "普林斯顿" "zh-sg")

(descr-as-in "Princeton" "" "zh-hk")
(descr-as-in "Princeton" "" "pt")
(descr-as-in "Princeton" "borough in New Jersey" "en")
(descr-as-in "Princeton" "ville du New Jersey, aux États-Unis" "fr")
(descr-as-in "Princeton" "" "zh-tw")
(descr-as-in "Princeton" "Universitätsstadt in Mercer County (New Jersey)" "de")
(descr-as-in "Princeton" "город в США, Нью-Джерси, Мёрсер" "ru")
(descr-as-in "Princeton" "borough de Nueva Jersey, Estados Unidos" "es")
(descr-as-in "Princeton" "" "ja")
(descr-as-in "Princeton" "" "zh-cn")
(descr-as-in "Princeton" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Princeton" "country" "Q30")

(refer-to ["properties.locator_map_image"])
(fact claim "Princeton" "locator-map-image" "Mercer County New Jersey incorporated and unincorporated areas Princeton highlighted.svg")

(refer-to ["properties.commons_category"])
(fact claim "Princeton" "commons-category" "Princeton, New Jersey")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Princeton" "encyclopædia-britannica-online-id" "place/Princeton-New-Jersey")

(refer-to ["properties.shares_border_with"])
(fact claim "Princeton" "shares-border-with" "Q1086191")
(fact claim "Princeton" "shares-border-with" "Q16460211")
(fact claim "Princeton" "shares-border-with" "Q367289")
(fact claim "Princeton" "shares-border-with" "Q6923279")
(fact claim "Princeton" "shares-border-with" "Q1073777")

(refer-to ["properties.dewey_decimal_classification"])
(fact claim "Princeton" "dewey-decimal-classification" "2--74965")

(refer-to ["properties.viaf_id"])
(fact claim "Princeton" "viaf-id" "146878659")

(refer-to ["properties.musicbrainz_area_id"])
(fact claim "Princeton" "musicbrainz-area-id" "61a9459b-05ee-483d-a364-785dfb6232e9")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Princeton" "located-in-the-administrative-territorial-entity" "Q496886")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "Princeton" "us-national-archives-identifier" "10046496")

(refer-to ["properties.topics_main_category"])
(fact claim "Princeton" "topic's-main-category" "Q9241681")

(refer-to ["properties.postal_code"])
(fact claim "Princeton" "postal-code" "08540")
(fact claim "Princeton" "postal-code" "08542")

(refer-to ["properties.geonames_id"])
(fact claim "Princeton" "geonames-id" "5102922")

(refer-to ["properties.category_of_associated_people"])
(fact claim "Princeton" "category-of-associated-people" "Q8746408")

(refer-to ["properties.sister_city"])
(fact claim "Princeton" "sister-city" "Q130994")
(fact claim "Princeton" "sister-city" "Q279352")
(fact claim "Princeton" "sister-city" "Q6352498")

(refer-to ["properties.elevation_above_sea_level"])
(fact claim "Princeton" "elevation-above-sea-level" "quantity")

(refer-to ["properties.population"])
(fact claim "Princeton" "population" "quantity")

(refer-to ["properties.bnf_id"])
(fact claim "Princeton" "bnf-id" "119515893")

(refer-to ["properties.freebase_id"])
(fact claim "Princeton" "freebase-id" "/m/0ljsz")

(refer-to ["properties.coordinate_location"])
(fact claim "Princeton" "coordinate-location" "lng -74.656944444444 lat 40.352222222222 alt ")

(refer-to ["properties.fips_55_3_locations_in_the_us"])
(fact claim "Princeton" "fips-55-3-locations-in-the-us" "34-60900")

(refer-to ["properties.inception"])
(fact claim "Princeton" "inception" "+1894-00-00T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Princeton" "dissolved-abolished-or-demolished" "+2013-01-01T00:00:00Z")

(refer-to ["properties.official_website"])
(fact claim "Princeton" "official-website" "http://www.princetonnj.gov/")

(refer-to ["properties.gnd_id"])
(fact claim "Princeton" "gnd-id" "4103300-0")

(refer-to ["properties.instance_of"])
(fact claim "Princeton" "instance-of" "Q2911266")

(refer-to ["properties.dmoz_id"])
(fact claim "Princeton" "dmoz-id" "Regional/North_America/United_States/New_Jersey/Localities/P/Princeton/")

(refer-to ["properties.local_dialing_code"])
(fact claim "Princeton" "local-dialing-code" "600")

(refer-to ["properties.image"])
(fact claim "Princeton" "image" "Lower Pyne (Princeton).jpg")

(refer-to ["properties.different_from"])
(fact claim "Princeton" "different-from" "Q2396806")

(refer-to ["properties.category_for_people_who_died_here"])
(fact claim "Princeton" "category-for-people-who-died-here" "Q9913676")

(refer-to ["properties.located_in_time_zone"])
(fact claim "Princeton" "located-in-time-zone" "Q941023")

(refer-to ["properties.native_label"])
(fact claim "Princeton" "native-label" "monolingualtext")

(refer-to ["properties.category_for_people_born_here"])
(fact claim "Princeton" "category-for-people-born-here" "Q9226596")

(refer-to ["properties.area"])
(fact claim "Princeton" "area" "quantity")

(refer-to ["properties.quora_topic_id"])
(fact claim "Princeton" "quora-topic-id" "Princeton-NJ")
