(ns clazzes.weimar_republic
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Weimar Republic")

(name-as-in "Weimar Republic" "" "zh-hk")
(name-as-in "Weimar Republic" "República de Weimar" "pt")
(name-as-in "Weimar Republic" "Weimar Republic" "en")
(name-as-in "Weimar Republic" "République de Weimar" "fr")
(name-as-in "Weimar Republic" "" "zh-tw")
(name-as-in "Weimar Republic" "Weimarer Republik" "de")
(name-as-in "Weimar Republic" "Веймарская республика" "ru")
(name-as-in "Weimar Republic" "República de Weimar" "es")
(name-as-in "Weimar Republic" "ヴァイマル共和政" "ja")
(name-as-in "Weimar Republic" "" "zh-cn")
(name-as-in "Weimar Republic" "" "zh-sg")

(descr-as-in "Weimar Republic" "" "zh-hk")
(descr-as-in "Weimar Republic" "" "pt")
(descr-as-in "Weimar Republic" "Germany in the years 1918/1919-1933" "en")
(descr-as-in "Weimar Republic" "Allemagne de 1918/1919-1933" "fr")
(descr-as-in "Weimar Republic" "" "zh-tw")
(descr-as-in "Weimar Republic" "Deutschland in den Jahren 1918/1919 bis 1933" "de")
(descr-as-in "Weimar Republic" "Германское государство в 1918/1919–1933 годах" "ru")
(descr-as-in "Weimar Republic" "régimen Alemán entre 1918  y 1933" "es")
(descr-as-in "Weimar Republic" "" "ja")
(descr-as-in "Weimar Republic" "" "zh-cn")
(descr-as-in "Weimar Republic" "" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.weimar_republic"])
(fact claim "Weimar Republic" "country" "Weimar Republic")

(refer-to ["properties.head_of_government"])
(fact claim "Weimar Republic" "head-of-government" "Q70581")
(fact claim "Weimar Republic" "head-of-government" "Q57159")
(fact claim "Weimar Republic" "head-of-government" "Q77156")
(fact claim "Weimar Republic" "head-of-government" "Q60150")
(fact claim "Weimar Republic" "head-of-government" "Q77179")
(fact claim "Weimar Republic" "head-of-government" "Q103955")
(fact claim "Weimar Republic" "head-of-government" "Q77183")
(fact claim "Weimar Republic" "head-of-government" "Q155419")
(fact claim "Weimar Republic" "head-of-government" "Q155398")
(fact claim "Weimar Republic" "head-of-government" "Q150552")
(fact claim "Weimar Republic" "head-of-government" "Q57133")
(fact claim "Weimar Republic" "head-of-government" "Q77183")
(fact claim "Weimar Republic" "head-of-government" "Q57158")
(fact claim "Weimar Republic" "head-of-government" "Q57158")

(refer-to ["properties.locator_map_image"])
(fact claim "Weimar Republic" "locator-map-image" "Weimar Republic 1930.svg")

(refer-to ["properties.commons_gallery"])
(fact claim "Weimar Republic" "commons-gallery" "Weimarer Republik")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.weimar_republic"])
(fact claim "Weimar Republic" "commons-category" "Weimar Republic")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Weimar Republic" "encyclopædia-britannica-online-id" "topic/Weimar-Republic")

(refer-to ["properties.currency"])
(fact claim "Weimar Republic" "currency" "Q705983")
(fact claim "Weimar Republic" "currency" "Q260447")
(fact claim "Weimar Republic" "currency" "Q155009")

(refer-to ["properties.coat_of_arms"])
(fact claim "Weimar Republic" "coat-of-arms" "Q25401250")

(refer-to ["properties.topics_main_category"])
(fact claim "Weimar Republic" "topic's-main-category" "Q8147215")

(refer-to ["properties.yso_id"])
(fact claim "Weimar Republic" "yso-id" "159117")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Weimar Republic" "official-language" "German")

(refer-to ["properties.commons_maps_category"])
(fact claim "Weimar Republic" "commons-maps-category" "Maps of the Weimar Republic")

(refer-to ["properties.capital"])
(fact claim "Weimar Republic" "capital" "Q64")

(refer-to ["properties.cultureel_woordenboek_identifier"])
(fact claim "Weimar Republic" "cultureel-woordenboek-identifier" "geschiedenis-1900-2000/weimarrepubliek")

(refer-to ["properties.freebase_id"])
(fact claim "Weimar Republic" "freebase-id" "/m/084n_")

(refer-to ["properties.contains_administrative_territorial_entity"])
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q1055")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q980")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q694231")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q2372248")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q569871")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q1998459")
(refer-to ["clazzes.free_state_of_prussia"])
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Free State of Prussia")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q705438")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q690821")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q648297")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q1209")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q835382")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q2843")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q161215")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q1202")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q427703")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q873634")
(fact claim "Weimar Republic" "contains-administrative-territorial-entity" "Q165763")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Weimar Republic" "coat-of-arms-image" "Wappen Deutsches Reich (Weimarer Republik).svg")

(refer-to ["properties.coordinate_location"])
(fact claim "Weimar Republic" "coordinate-location" "lng 13.4 lat 52.516666666667 alt ")

(refer-to ["properties.inception"])
(fact claim "Weimar Republic" "inception" "+1919-01-01T00:00:00Z")

(refer-to ["properties.flag"])
(fact claim "Weimar Republic" "flag" "Q4485721")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Weimar Republic" "dissolved-abolished-or-demolished" "+1933-01-01T00:00:00Z")

(refer-to ["properties.gnd_id"])
(fact claim "Weimar Republic" "gnd-id" "4065109-5")

(refer-to ["properties.described_by_source"])
(fact claim "Weimar Republic" "described-by-source" "Q2657718")

(refer-to ["properties.instance_of"])
(fact claim "Weimar Republic" "instance-of" "Q3624078")
(fact claim "Weimar Republic" "instance-of" "Q11514315")
(fact claim "Weimar Republic" "instance-of" "Q3024240")

(refer-to ["properties.legislative_body"])
(fact claim "Weimar Republic" "legislative-body" "Q637829")
(fact claim "Weimar Republic" "legislative-body" "Q565039")

(refer-to ["properties.office_held_by_head_of_state"])
(fact claim "Weimar Republic" "office-held-by-head-of-state" "Q157740")

(refer-to ["properties.office_held_by_head_of_government"])
(fact claim "Weimar Republic" "office-held-by-head-of-government" "Q29034484")

(refer-to ["properties.replaces"])
(fact claim "Weimar Republic" "replaces" "Q43287")

(refer-to ["properties.head_of_state"])
(fact claim "Weimar Republic" "head-of-state" "Q2667")
(fact claim "Weimar Republic" "head-of-state" "Q2646")

(refer-to ["properties.replaced_by"])
(fact claim "Weimar Republic" "replaced-by" "Q7318")

(refer-to ["properties.topics_main_wikimedia_portal"])
(fact claim "Weimar Republic" "topic's-main-wikimedia-portal" "Q17311931")

(refer-to ["properties.anthem"])
(fact claim "Weimar Republic" "anthem" "Q44042")

(refer-to ["properties.category_for_people_born_here"])
(fact claim "Weimar Republic" "category-for-people-born-here" "Q7463306")

(refer-to ["properties.basic_form_of_government"])
(fact claim "Weimar Republic" "basic-form-of-government" "Q49890")

(refer-to ["properties.flag_image"])
(fact claim "Weimar Republic" "flag-image" "Flag of Germany (3-2 aspect ratio).svg")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Weimar Republic" "library-of-congress-authority-id" "sh85054639")

(refer-to ["properties.quora_topic_id"])
(fact claim "Weimar Republic" "quora-topic-id" "Weimar-Republic")

(refer-to ["properties.british_museum_person_institution"])
(fact claim "Weimar Republic" "british-museum-person-institution" "167743")
