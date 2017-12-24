(ns clazzes.kingdom_of_prussia
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Kingdom of Prussia")

(name-as-in "Kingdom of Prussia" "" "zh-hk")
(name-as-in "Kingdom of Prussia" "Reino da Prússia" "pt")
(name-as-in "Kingdom of Prussia" "Kingdom of Prussia" "en")
(name-as-in "Kingdom of Prussia" "royaume de Prusse" "fr")
(name-as-in "Kingdom of Prussia" "普魯士王國" "zh-tw")
(name-as-in "Kingdom of Prussia" "Königreich Preußen" "de")
(name-as-in "Kingdom of Prussia" "королевство Пруссия" "ru")
(name-as-in "Kingdom of Prussia" "Reino de Prusia" "es")
(name-as-in "Kingdom of Prussia" "プロイセン王国" "ja")
(name-as-in "Kingdom of Prussia" "" "zh-cn")
(name-as-in "Kingdom of Prussia" "" "zh-sg")

(descr-as-in "Kingdom of Prussia" "" "zh-hk")
(descr-as-in "Kingdom of Prussia" "" "pt")
(descr-as-in "Kingdom of Prussia" "former German state (1701–1918)" "en")
(descr-as-in "Kingdom of Prussia" "ancien État européen (1701 - 1918)" "fr")
(descr-as-in "Kingdom of Prussia" "位於現今德國和波蘭境內的王國，存在於1701年至1918年" "zh-tw")
(descr-as-in "Kingdom of Prussia" "europäisches Königreich von 1701 bis 1918" "de")
(descr-as-in "Kingdom of Prussia" "королевство в Европе в 1701-1918 годах" "ru")
(descr-as-in "Kingdom of Prussia" "reino que existió desde 1701 hasta 1918" "es")
(descr-as-in "Kingdom of Prussia" "" "ja")
(descr-as-in "Kingdom of Prussia" "" "zh-cn")
(descr-as-in "Kingdom of Prussia" "" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.kingdom_of_prussia"])
(fact claim "Kingdom of Prussia" "country" "Kingdom of Prussia")

(refer-to ["properties.locator_map_image"])
(fact claim "Kingdom of Prussia" "locator-map-image" "Map-DR-Prussia.svg")

(refer-to ["properties.great_russian_encyclopedia_online_id"])
(fact claim "Kingdom of Prussia" "great-russian-encyclopedia-online-id" "3170291")

(refer-to ["properties.commons_category"])
(fact claim "Kingdom of Prussia" "commons-category" "Prussia")

(refer-to ["properties.viaf_id"])
(fact claim "Kingdom of Prussia" "viaf-id" "137143200")

(refer-to ["properties.currency"])
(fact claim "Kingdom of Prussia" "currency" "Q15944605")

(refer-to ["properties.coat_of_arms"])
(fact claim "Kingdom of Prussia" "coat-of-arms" "Q573426")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Kingdom of Prussia" "located-in-the-administrative-territorial-entity" "Q43287")
(fact claim "Kingdom of Prussia" "located-in-the-administrative-territorial-entity" "Q150981")
(fact claim "Kingdom of Prussia" "located-in-the-administrative-territorial-entity" "Q151624")

(refer-to ["properties.topics_main_category"])
(fact claim "Kingdom of Prussia" "topic's-main-category" "Q6333604")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Kingdom of Prussia" "official-language" "German")

(refer-to ["properties.capital"])
(fact claim "Kingdom of Prussia" "capital" "Q64")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Kingdom of Prussia" "sudoc-authorities" "125686862")

(refer-to ["properties.bnf_id"])
(fact claim "Kingdom of Prussia" "bnf-id" "113529929")

(refer-to ["properties.follows"])
(fact claim "Kingdom of Prussia" "follows" "Q12548")
(fact claim "Kingdom of Prussia" "follows" "Q153091")
(fact claim "Kingdom of Prussia" "follows" "Q589662")
(fact claim "Kingdom of Prussia" "follows" "Q901974")
(fact claim "Kingdom of Prussia" "follows" "Q682318")
(fact claim "Kingdom of Prussia" "follows" "Q529605")
(fact claim "Kingdom of Prussia" "follows" "Q704300")
(fact claim "Kingdom of Prussia" "follows" "Q836680")
(fact claim "Kingdom of Prussia" "follows" "Q164079")
(fact claim "Kingdom of Prussia" "follows" "Q704288")
(fact claim "Kingdom of Prussia" "follows" "Q26167")
(fact claim "Kingdom of Prussia" "follows" "Q313175")

(refer-to ["properties.freebase_id"])
(fact claim "Kingdom of Prussia" "freebase-id" "/m/01k6y1")

(refer-to ["properties.contains_administrative_territorial_entity"])
(fact claim "Kingdom of Prussia" "contains-administrative-territorial-entity" "Q819125")
(fact claim "Kingdom of Prussia" "contains-administrative-territorial-entity" "Q340210")
(fact claim "Kingdom of Prussia" "contains-administrative-territorial-entity" "Q675032")
(fact claim "Kingdom of Prussia" "contains-administrative-territorial-entity" "Q700264")
(fact claim "Kingdom of Prussia" "contains-administrative-territorial-entity" "Q64")
(fact claim "Kingdom of Prussia" "contains-administrative-territorial-entity" "Q675291")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Kingdom of Prussia" "coat-of-arms-image" "Coat of Arms of the Kingdom of Prussia 1873-1918.svg")

(refer-to ["properties.coordinate_location"])
(fact claim "Kingdom of Prussia" "coordinate-location" "lng 14 lat 53 alt ")

(refer-to ["properties.inception"])
(fact claim "Kingdom of Prussia" "inception" "+1701-01-18T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Kingdom of Prussia" "dissolved-abolished-or-demolished" "+1918-01-01T00:00:00Z")

(refer-to ["properties.followed_by"])
(refer-to ["clazzes.free_state_of_prussia"])
(fact claim "Kingdom of Prussia" "followed-by" "Free State of Prussia")
(fact claim "Kingdom of Prussia" "followed-by" "Q151624")

(refer-to ["properties.gnd_id"])
(fact claim "Kingdom of Prussia" "gnd-id" "4047194-9")

(refer-to ["properties.described_by_source"])
(fact claim "Kingdom of Prussia" "described-by-source" "Q602358")
(fact claim "Kingdom of Prussia" "described-by-source" "Q19180675")
(fact claim "Kingdom of Prussia" "described-by-source" "Q4173137")

(refer-to ["properties.continent"])
(fact claim "Kingdom of Prussia" "continent" "Q46")

(refer-to ["properties.instance_of"])
(fact claim "Kingdom of Prussia" "instance-of" "Q3024240")
(fact claim "Kingdom of Prussia" "instance-of" "Q3624078")
(fact claim "Kingdom of Prussia" "instance-of" "Q107390")

(refer-to ["properties.legislative_body"])
(fact claim "Kingdom of Prussia" "legislative-body" "Q650248")

(refer-to ["properties.anthem"])
(fact claim "Kingdom of Prussia" "anthem" "Q1928655")

(refer-to ["properties.basic_form_of_government"])
(fact claim "Kingdom of Prussia" "basic-form-of-government" "Q184558")
(fact claim "Kingdom of Prussia" "basic-form-of-government" "Q41614")

(refer-to ["properties.flag_image"])
(fact claim "Kingdom of Prussia" "flag-image" "Flag of the Kingdom of Prussia (1701-1750).svg")
(fact claim "Kingdom of Prussia" "flag-image" "Flag of the Kingdom of Prussia (1750-1801).svg")
(fact claim "Kingdom of Prussia" "flag-image" "Flag of the Kingdom of Prussia (1803-1892).svg")
(fact claim "Kingdom of Prussia" "flag-image" "Freestate of prussia flag 1920–1947.png")
(fact claim "Kingdom of Prussia" "flag-image" "Flag of Prussia 1933.svg")
(fact claim "Kingdom of Prussia" "flag-image" "Flag of Prussia (1892-1918).svg")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Kingdom of Prussia" "library-of-congress-authority-id" "n79104278")

(refer-to ["properties.religion"])
(fact claim "Kingdom of Prussia" "religion" "Q170111")
