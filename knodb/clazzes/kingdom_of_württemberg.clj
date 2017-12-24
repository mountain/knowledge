(ns clazzes.kingdom_of_württemberg
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Kingdom of Württemberg")

(name-as-in "Kingdom of Württemberg" "" "zh-hk")
(name-as-in "Kingdom of Württemberg" "Reino de Württemberg" "pt")
(name-as-in "Kingdom of Württemberg" "Kingdom of Württemberg" "en")
(name-as-in "Kingdom of Württemberg" "Royaume de Wurtemberg" "fr")
(name-as-in "Kingdom of Württemberg" "" "zh-tw")
(name-as-in "Kingdom of Württemberg" "Königreich Württemberg" "de")
(name-as-in "Kingdom of Württemberg" "Королевство Вюртемберг" "ru")
(name-as-in "Kingdom of Württemberg" "Reino de Wurtemberg" "es")
(name-as-in "Kingdom of Württemberg" "ヴュルテンベルク王国" "ja")
(name-as-in "Kingdom of Württemberg" "" "zh-cn")
(name-as-in "Kingdom of Württemberg" "" "zh-sg")

(descr-as-in "Kingdom of Württemberg" "" "zh-hk")
(descr-as-in "Kingdom of Württemberg" "" "pt")
(descr-as-in "Kingdom of Württemberg" "kingdom in Central Europe between 1806–1918, from January 1871 part of the German Empire" "en")
(descr-as-in "Kingdom of Württemberg" "" "fr")
(descr-as-in "Kingdom of Württemberg" "" "zh-tw")
(descr-as-in "Kingdom of Württemberg" "ehemaliger Staat im Südwesten des heutigen Deutschlands" "de")
(descr-as-in "Kingdom of Württemberg" "" "ru")
(descr-as-in "Kingdom of Württemberg" "" "es")
(descr-as-in "Kingdom of Württemberg" "" "ja")
(descr-as-in "Kingdom of Württemberg" "" "zh-cn")
(descr-as-in "Kingdom of Württemberg" "" "zh-sg")


(refer-to ["properties.locator_map_image"])
(fact claim "Kingdom of Württemberg" "locator-map-image" "German Empire - Wurttemberg (1871).svg")

(refer-to ["properties.commons_category"])
(fact claim "Kingdom of Württemberg" "commons-category" "Württemberg")

(refer-to ["properties.viaf_id"])
(fact claim "Kingdom of Württemberg" "viaf-id" "306257951")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Kingdom of Württemberg" "located-in-the-administrative-territorial-entity" "Q43287")
(fact claim "Kingdom of Württemberg" "located-in-the-administrative-territorial-entity" "Q151624")

(refer-to ["properties.topics_main_category"])
(fact claim "Kingdom of Württemberg" "topic's-main-category" "Q9042692")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Kingdom of Württemberg" "official-language" "German")

(refer-to ["properties.capital"])
(fact claim "Kingdom of Württemberg" "capital" "Q1022")

(refer-to ["properties.population"])
(fact claim "Kingdom of Württemberg" "population" "quantity")

(refer-to ["properties.follows"])
(fact claim "Kingdom of Württemberg" "follows" "Q151624")

(refer-to ["properties.freebase_id"])
(fact claim "Kingdom of Württemberg" "freebase-id" "/m/03m3qw2")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Kingdom of Württemberg" "coat-of-arms-image" "Coat of Arms of the Kingdom of Württemberg, 1817.svg")

(refer-to ["properties.inception"])
(fact claim "Kingdom of Württemberg" "inception" "+1806-01-01T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Kingdom of Württemberg" "dissolved-abolished-or-demolished" "+1918-01-01T00:00:00Z")

(refer-to ["properties.described_by_source"])
(fact claim "Kingdom of Württemberg" "described-by-source" "Q678259")

(refer-to ["properties.instance_of"])
(fact claim "Kingdom of Württemberg" "instance-of" "Q3024240")
(fact claim "Kingdom of Württemberg" "instance-of" "Q3624078")
(fact claim "Kingdom of Württemberg" "instance-of" "Q26879769")
(fact claim "Kingdom of Württemberg" "instance-of" "Q4057683")

(refer-to ["properties.replaces"])
(fact claim "Kingdom of Württemberg" "replaces" "Q159626")

(refer-to ["properties.replaced_by"])
(fact claim "Kingdom of Württemberg" "replaced-by" "Q569871")

(refer-to ["properties.basic_form_of_government"])
(fact claim "Kingdom of Württemberg" "basic-form-of-government" "Q41614")

(refer-to ["properties.area"])
(fact claim "Kingdom of Württemberg" "area" "quantity")

(refer-to ["properties.flag_image"])
(fact claim "Kingdom of Württemberg" "flag-image" "Flagge Königreich Württemberg.svg")
