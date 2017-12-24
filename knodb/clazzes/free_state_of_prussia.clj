(ns clazzes.free_state_of_prussia
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Free State of Prussia")

(name-as-in "Free State of Prussia" "普魯士邦" "zh-hk")
(name-as-in "Free State of Prussia" "Estado Livre da Prússia" "pt")
(name-as-in "Free State of Prussia" "Free State of Prussia" "en")
(name-as-in "Free State of Prussia" "État libre de Prusse" "fr")
(name-as-in "Free State of Prussia" "普魯士邦" "zh-tw")
(name-as-in "Free State of Prussia" "Freistaat Preußen" "de")
(name-as-in "Free State of Prussia" "Свободное государство Пруссия" "ru")
(name-as-in "Free State of Prussia" "Estado Libre de Prusia" "es")
(name-as-in "Free State of Prussia" "プロイセン州" "ja")
(name-as-in "Free State of Prussia" "普鲁士邦" "zh-cn")
(name-as-in "Free State of Prussia" "普鲁士邦" "zh-sg")

(descr-as-in "Free State of Prussia" "" "zh-hk")
(descr-as-in "Free State of Prussia" "" "pt")
(descr-as-in "Free State of Prussia" "former federated state of Germany between 1918 and 1947" "en")
(descr-as-in "Free State of Prussia" "" "fr")
(descr-as-in "Free State of Prussia" "" "zh-tw")
(descr-as-in "Free State of Prussia" "Gliedstaat des Deutschen Reichs zur Zeit der Weimarer Republik, de facto 1933, formell 1947 aufgelöst" "de")
(descr-as-in "Free State of Prussia" "государство в составе Веймарской республики" "ru")
(descr-as-in "Free State of Prussia" "" "es")
(descr-as-in "Free State of Prussia" "" "ja")
(descr-as-in "Free State of Prussia" "" "zh-cn")
(descr-as-in "Free State of Prussia" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Free State of Prussia" "country" "Q38872")

(refer-to ["properties.locator_map_image"])
(fact claim "Free State of Prussia" "locator-map-image" "Map-WR-Prussia.svg")

(refer-to ["properties.commons_category"])
(fact claim "Free State of Prussia" "commons-category" "Freistaat Preußen")

(refer-to ["properties.viaf_id"])
(fact claim "Free State of Prussia" "viaf-id" "129960353")

(refer-to ["properties.currency"])
(fact claim "Free State of Prussia" "currency" "Q705983")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Free State of Prussia" "located-in-the-administrative-territorial-entity" "Q41304")
(fact claim "Free State of Prussia" "located-in-the-administrative-territorial-entity" "Q7318")

(refer-to ["properties.capital"])
(fact claim "Free State of Prussia" "capital" "Q64")

(refer-to ["properties.follows"])
(fact claim "Free State of Prussia" "follows" "Q27306")

(refer-to ["properties.freebase_id"])
(fact claim "Free State of Prussia" "freebase-id" "/m/025t9d5")

(refer-to ["properties.contains_administrative_territorial_entity"])
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q819125")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q103801")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q700264")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q836689")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q700812")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q704495")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q340210")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q286977")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q829718")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q698162")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q693356")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q819762")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q693438")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q64")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q27069601")
(fact claim "Free State of Prussia" "contains-administrative-territorial-entity" "Q161947")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Free State of Prussia" "coat-of-arms-image" "Coat of arms of Prussia (1918–1933).svg")

(refer-to ["properties.coordinate_location"])
(fact claim "Free State of Prussia" "coordinate-location" "lng 13.4 lat 52.516666666667 alt ")

(refer-to ["properties.inception"])
(fact claim "Free State of Prussia" "inception" "+1918-01-01T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Free State of Prussia" "dissolved-abolished-or-demolished" "+1947-02-25T00:00:00Z")

(refer-to ["properties.gnd_id"])
(fact claim "Free State of Prussia" "gnd-id" "10036835-9")

(refer-to ["properties.continent"])
(fact claim "Free State of Prussia" "continent" "Q46")

(refer-to ["properties.instance_of"])
(fact claim "Free State of Prussia" "instance-of" "Q107390")

(refer-to ["properties.legislative_body"])
(fact claim "Free State of Prussia" "legislative-body" "Q650248")

(refer-to ["properties.basic_form_of_government"])
(fact claim "Free State of Prussia" "basic-form-of-government" "Q836915")

(refer-to ["properties.area"])
(fact claim "Free State of Prussia" "area" "quantity")

(refer-to ["properties.flag_image"])
(fact claim "Free State of Prussia" "flag-image" "Flag of Prussia (1918–1933).svg")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Free State of Prussia" "library-of-congress-authority-id" "sh85108094")
