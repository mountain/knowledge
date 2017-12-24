(ns clazzes.bern
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Bern")

(name-as-in "Bern" "伯恩" "zh-hk")
(name-as-in "Bern" "Berna" "pt")
(name-as-in "Bern" "Bern" "en")
(name-as-in "Bern" "Berne" "fr")
(name-as-in "Bern" "伯恩" "zh-tw")
(name-as-in "Bern" "Bern" "de")
(name-as-in "Bern" "Берн" "ru")
(name-as-in "Bern" "Berna" "es")
(name-as-in "Bern" "ベルン" "ja")
(name-as-in "Bern" "伯尔尼" "zh-cn")
(name-as-in "Bern" "伯尔尼" "zh-sg")

(descr-as-in "Bern" "瑞士首都" "zh-hk")
(descr-as-in "Bern" "capital da Suíça" "pt")
(descr-as-in "Bern" "capital of Switzerland and municipality in the canton of Bern" "en")
(descr-as-in "Bern" "capitale de la Suisse et chef-lieu du canton de Berne" "fr")
(descr-as-in "Bern" "瑞士首都" "zh-tw")
(descr-as-in "Bern" "Hauptstadt der Schweiz und Hauptort des Kantons Bern" "de")
(descr-as-in "Bern" "столица Швейцарии" "ru")
(descr-as-in "Bern" "capital de Suiza" "es")
(descr-as-in "Bern" "スイスの首都" "ja")
(descr-as-in "Bern" "瑞士首都" "zh-cn")
(descr-as-in "Bern" "瑞士首都" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.switzerland"])
(fact claim "Bern" "country" "Switzerland")

(refer-to ["properties.head_of_government"])
(fact claim "Bern" "head-of-government" "Q121896")
(fact claim "Bern" "head-of-government" "Q74144")
(fact claim "Bern" "head-of-government" "Q125289")
(fact claim "Bern" "head-of-government" "Q120844")
(fact claim "Bern" "head-of-government" "Q120748")

(refer-to ["properties.locator_map_image"])
(fact claim "Bern" "locator-map-image" "Karte Gemeinde Bern 2012.png")

(refer-to ["properties.commons_gallery"])
(refer-to ["clazzes.bern"])
(fact claim "Bern" "commons-gallery" "Bern")

(refer-to ["properties.catholic_encyclopedia_id"])
(fact claim "Bern" "catholic-encyclopedia-id" "02507b")

(refer-to ["properties.history_of_topic"])
(fact claim "Bern" "history-of-topic" "Q693116")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.bern"])
(fact claim "Bern" "commons-category" "Bern")

(refer-to ["properties.page_banner"])
(fact claim "Bern" "page-banner" "Bern Wikivoyage banner.png")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Bern" "encyclopædia-britannica-online-id" "place/Bern")
(fact claim "Bern" "encyclopædia-britannica-online-id" "place/Bern-canton-Switzerland")

(refer-to ["properties.shares_border_with"])
(fact claim "Bern" "shares-border-with" "Q68185")
(fact claim "Bern" "shares-border-with" "Q69690")
(fact claim "Bern" "shares-border-with" "Q69688")
(fact claim "Bern" "shares-border-with" "Q64058")
(fact claim "Bern" "shares-border-with" "Q67278")
(fact claim "Bern" "shares-border-with" "Q69765")
(fact claim "Bern" "shares-border-with" "Q66125")
(fact claim "Bern" "shares-border-with" "Q69682")
(fact claim "Bern" "shares-border-with" "Q67613")
(fact claim "Bern" "shares-border-with" "Q69680")
(fact claim "Bern" "shares-border-with" "Q69675")

(refer-to ["properties.dewey_decimal_classification"])
(fact claim "Bern" "dewey-decimal-classification" "2--4945424")

(refer-to ["properties.subreddit"])
(fact claim "Bern" "subreddit" "bern")

(refer-to ["properties.viaf_id"])
(fact claim "Bern" "viaf-id" "237298336")

(refer-to ["properties.emlo_location_id"])
(fact claim "Bern" "emlo-location-id" "f135e0c6-bdbe-4c12-ba59-b98b135b5e46")

(refer-to ["properties.list_of_monuments"])
(fact claim "Bern" "list-of-monuments" "Q1845551")

(refer-to ["properties.musicbrainz_area_id"])
(fact claim "Bern" "musicbrainz-area-id" "e03bf3ef-3e0b-4f51-9600-a161cbd5fb75")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Bern" "located-in-the-administrative-territorial-entity" "Q666217")
(fact claim "Bern" "located-in-the-administrative-territorial-entity" "Q11911")
(fact claim "Bern" "located-in-the-administrative-territorial-entity" "Q263941")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "Bern" "us-national-archives-identifier" "10045254")

(refer-to ["properties.swiss_municipality_code"])
(fact claim "Bern" "swiss-municipality-code" "0351")

(refer-to ["properties.babelnet_id"])
(fact claim "Bern" "babelnet-id" "00010046n")

(refer-to ["properties.topics_main_category"])
(fact claim "Bern" "topic's-main-category" "Q8298245")

(refer-to ["properties.encyclopædia_universalis_online_id"])
(fact claim "Bern" "encyclopædia-universalis-online-id" "berne")

(refer-to ["properties.postal_code"])
(fact claim "Bern" "postal-code" "3000")

(refer-to ["properties.geonames_id"])
(fact claim "Bern" "geonames-id" "2661552")

(refer-to ["properties.openstreetmap_relation_identifier"])
(fact claim "Bern" "openstreetmap-relation-identifier" "1682378")

(refer-to ["properties.category_of_associated_people"])
(fact claim "Bern" "category-of-associated-people" "Q6467777")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Bern" "official-language" "German")

(refer-to ["properties.sister_city"])
(fact claim "Bern" "sister-city" "Q1741")
(fact claim "Bern" "sister-city" "Q34713")
(fact claim "Bern" "sister-city" "Q1844")
(fact claim "Bern" "sister-city" "Q13437")
(fact claim "Bern" "sister-city" "Q34820")
(fact claim "Bern" "sister-city" "Q1002490")
(fact claim "Bern" "sister-city" "Q1131258")

(refer-to ["properties.facebook_places_id"])
(fact claim "Bern" "facebook-places-id" "106534979381554")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Bern" "sudoc-authorities" "027369714")

(refer-to ["properties.elevation_above_sea_level"])
(fact claim "Bern" "elevation-above-sea-level" "quantity")

(refer-to ["properties.hds_id"])
(fact claim "Bern" "hds-id" "209")

(refer-to ["properties.population"])
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")
(fact claim "Bern" "population" "quantity")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Bern" "national-library-of-israel-id" "001032536")

(refer-to ["properties.freebase_id"])
(fact claim "Bern" "freebase-id" "/m/0d6nx")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Bern" "coat-of-arms-image" "Berne-coat of arms.svg")

(refer-to ["properties.ringgold_id"])
(fact claim "Bern" "ringgold-id" "128901")

(refer-to ["properties.coordinate_location"])
(fact claim "Bern" "coordinate-location" "lng 7.4386111111111 lat 46.950833333333 alt ")

(refer-to ["properties.capital_of"])
(refer-to ["clazzes.switzerland"])
(fact claim "Bern" "capital-of" "Switzerland")
(fact claim "Bern" "capital-of" "Q11911")

(refer-to ["properties.inception"])
(fact claim "Bern" "inception" "+1191-00-00T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Bern" "isni" "0000 0001 0941 5921")

(refer-to ["properties.official_website"])
(fact claim "Bern" "official-website" "http://www.bern.ch/")

(refer-to ["properties.gnd_id"])
(fact claim "Bern" "gnd-id" "4005762-8")

(refer-to ["properties.described_by_source"])
(fact claim "Bern" "described-by-source" "Q302556")
(fact claim "Bern" "described-by-source" "Q20078554")

(refer-to ["properties.continent"])
(fact claim "Bern" "continent" "Q46")

(refer-to ["properties.instance_of"])
(fact claim "Bern" "instance-of" "Q70208")
(fact claim "Bern" "instance-of" "Q14770218")
(fact claim "Bern" "instance-of" "Q537250")
(fact claim "Bern" "instance-of" "Q1187811")
(fact claim "Bern" "instance-of" "Q1549591")
(fact claim "Bern" "instance-of" "Q515")
(fact claim "Bern" "instance-of" "Q5119")

(refer-to ["properties.dmoz_id"])
(fact claim "Bern" "dmoz-id" "Regional/Europe/Switzerland/Cantons/Berne/Localities/Bern/")

(refer-to ["properties.office_held_by_head_of_government"])
(fact claim "Bern" "office-held-by-head-of-government" "Q29631244")

(refer-to ["properties.ne_se_id"])
(fact claim "Bern" "ne_se-id" "bern")

(refer-to ["properties.local_dialing_code"])
(fact claim "Bern" "local-dialing-code" "031")

(refer-to ["properties.ipv4_routing_prefix"])
(fact claim "Bern" "ipv4-routing-prefix" "138.190.0.0/16")

(refer-to ["properties.image"])
(fact claim "Bern" "image" "Bern luftaufnahme.png")

(refer-to ["properties.category_of_people_buried_here"])
(fact claim "Bern" "category-of-people-buried-here" "Q7975025")

(refer-to ["properties.located_in_or_next_to_body_of_water"])
(fact claim "Bern" "located-in-or-next-to-body-of-water" "Q1675")

(refer-to ["properties.category_for_people_who_died_here"])
(fact claim "Bern" "category-for-people-who-died-here" "Q9217676")

(refer-to ["properties.located_in_time_zone"])
(fact claim "Bern" "located-in-time-zone" "Q6655")
(fact claim "Bern" "located-in-time-zone" "Q6723")

(refer-to ["properties.topics_main_wikimedia_portal"])
(fact claim "Bern" "topic's-main-wikimedia-portal" "Q15630620")

(refer-to ["properties.official_name"])
(fact claim "Bern" "official-name" "monolingualtext")

(refer-to ["properties.external_data_available_at"])
(fact claim "Bern" "external-data-available-at" "https://ld.geo.admin.ch/boundaries/municipality/351")

(refer-to ["properties.category_for_people_born_here"])
(fact claim "Bern" "category-for-people-born-here" "Q15080501")

(refer-to ["properties.area"])
(fact claim "Bern" "area" "quantity")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Bern" "library-of-congress-authority-id" "n79065374")

(refer-to ["properties.quora_topic_id"])
(refer-to ["clazzes.bern"])
(fact claim "Bern" "quora-topic-id" "Bern")
