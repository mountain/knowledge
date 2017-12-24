(ns clazzes.university_of_zurich
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "University of Zurich")

(name-as-in "University of Zurich" "蘇黎世大學" "zh-hk")
(name-as-in "University of Zurich" "Universidade de Zurique" "pt")
(name-as-in "University of Zurich" "University of Zurich" "en")
(name-as-in "University of Zurich" "université de Zurich" "fr")
(name-as-in "University of Zurich" "蘇黎世大學" "zh-tw")
(name-as-in "University of Zurich" "Universität Zürich" "de")
(name-as-in "University of Zurich" "Цюрихский университет" "ru")
(name-as-in "University of Zurich" "Universidad de Zúrich" "es")
(name-as-in "University of Zurich" "チューリッヒ大学" "ja")
(name-as-in "University of Zurich" "苏黎世大学" "zh-cn")
(name-as-in "University of Zurich" "苏黎世大学" "zh-sg")

(descr-as-in "University of Zurich" "" "zh-hk")
(descr-as-in "University of Zurich" "" "pt")
(descr-as-in "University of Zurich" "university in Switzerland" "en")
(descr-as-in "University of Zurich" "" "fr")
(descr-as-in "University of Zurich" "" "zh-tw")
(descr-as-in "University of Zurich" "Universität in der Schweiz" "de")
(descr-as-in "University of Zurich" "" "ru")
(descr-as-in "University of Zurich" "" "es")
(descr-as-in "University of Zurich" "" "ja")
(descr-as-in "University of Zurich" "" "zh-cn")
(descr-as-in "University of Zurich" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "University of Zurich" "country" "Q39")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.university_of_zurich"])
(fact claim "University of Zurich" "commons-category" "University of Zurich")

(refer-to ["properties.viaf_id"])
(fact claim "University of Zurich" "viaf-id" "122255956")

(refer-to ["properties.headquarters_location"])
(fact claim "University of Zurich" "headquarters-location" "Q72")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "University of Zurich" "located-in-the-administrative-territorial-entity" "Q11943")

(refer-to ["properties.heritage_designation"])
(fact claim "University of Zurich" "heritage-designation" "Q8274529")

(refer-to ["properties.topics_main_category"])
(fact claim "University of Zurich" "topic's-main-category" "Q8946129")

(refer-to ["properties.doi"])
(fact claim "University of Zurich" "doi" "10.13039/501100006447")

(refer-to ["properties.category_for_alumni_of_educational_institution"])
(fact claim "University of Zurich" "category-for-alumni-of-educational-institution" "Q7694444")

(refer-to ["properties.sudoc_authorities"])
(fact claim "University of Zurich" "sudoc-authorities" "026431092")

(refer-to ["properties.hds_id"])
(fact claim "University of Zurich" "hds-id" "10977")

(refer-to ["properties.bnf_id"])
(fact claim "University of Zurich" "bnf-id" "118679870")

(refer-to ["properties.freebase_id"])
(fact claim "University of Zurich" "freebase-id" "/m/01tpvt")

(refer-to ["properties.coordinate_location"])
(fact claim "University of Zurich" "coordinate-location" "lng 8.5483333333333 lat 47.374722222222 alt ")

(refer-to ["properties.inception"])
(fact claim "University of Zurich" "inception" "+1833-00-00T00:00:00Z")

(refer-to ["properties.students_count"])
(fact claim "University of Zurich" "students-count" "quantity")

(refer-to ["properties.isni"])
(fact claim "University of Zurich" "isni" "0000 0004 1937 0650")

(refer-to ["properties.official_website"])
(fact claim "University of Zurich" "official-website" "http://www.uzh.ch/index.html")

(refer-to ["properties.gnd_id"])
(fact claim "University of Zurich" "gnd-id" "36190-2")

(refer-to ["properties.has_part"])
(fact claim "University of Zurich" "has-part" "Q856547")
(fact claim "University of Zurich" "has-part" "Q27490237")

(refer-to ["properties.instance_of"])
(fact claim "University of Zurich" "instance-of" "Q3918")

(refer-to ["properties.image"])
(fact claim "University of Zurich" "image" "Zürich - Universität Zürich IMG 1204.JPG")

(refer-to ["properties.official_name"])
(fact claim "University of Zurich" "official-name" "monolingualtext")

(refer-to ["properties.grid_id"])
(fact claim "University of Zurich" "grid-id" "grid.7400.3")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "University of Zurich" "library-of-congress-authority-id" "n80001441")
