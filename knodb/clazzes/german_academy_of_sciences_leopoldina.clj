(ns clazzes.german_academy_of_sciences_leopoldina
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "German Academy of Sciences Leopoldina")

(name-as-in "German Academy of Sciences Leopoldina" "" "zh-hk")
(name-as-in "German Academy of Sciences Leopoldina" "Academia Leopoldina" "pt")
(name-as-in "German Academy of Sciences Leopoldina" "German Academy of Sciences Leopoldina" "en")
(name-as-in "German Academy of Sciences Leopoldina" "Leopoldina" "fr")
(name-as-in "German Academy of Sciences Leopoldina" "" "zh-tw")
(name-as-in "German Academy of Sciences Leopoldina" "Deutsche Akademie der Naturforscher Leopoldina" "de")
(name-as-in "German Academy of Sciences Leopoldina" "Леопольдина" "ru")
(name-as-in "German Academy of Sciences Leopoldina" "Academia Alemana de las Ciencias Naturales Leopoldina" "es")
(name-as-in "German Academy of Sciences Leopoldina" "国立科学アカデミー・レオポルディーナ" "ja")
(name-as-in "German Academy of Sciences Leopoldina" "" "zh-cn")
(name-as-in "German Academy of Sciences Leopoldina" "" "zh-sg")

(descr-as-in "German Academy of Sciences Leopoldina" "" "zh-hk")
(descr-as-in "German Academy of Sciences Leopoldina" "" "pt")
(descr-as-in "German Academy of Sciences Leopoldina" "national academy of Germany" "en")
(descr-as-in "German Academy of Sciences Leopoldina" "société savante" "fr")
(descr-as-in "German Academy of Sciences Leopoldina" "" "zh-tw")
(descr-as-in "German Academy of Sciences Leopoldina" "naturwissenschaftlich-medizinische Gelehrtengesellschaft" "de")
(descr-as-in "German Academy of Sciences Leopoldina" "научное общество в Германии" "ru")
(descr-as-in "German Academy of Sciences Leopoldina" "academia nacional alemana" "es")
(descr-as-in "German Academy of Sciences Leopoldina" "" "ja")
(descr-as-in "German Academy of Sciences Leopoldina" "" "zh-cn")
(descr-as-in "German Academy of Sciences Leopoldina" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "German Academy of Sciences Leopoldina" "country" "Q183")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.german_academy_of_sciences_leopoldina"])
(fact claim "German Academy of Sciences Leopoldina" "commons-category" "German Academy of Sciences Leopoldina")

(refer-to ["properties.viaf_id"])
(fact claim "German Academy of Sciences Leopoldina" "viaf-id" "130151569")

(refer-to ["properties.headquarters_location"])
(fact claim "German Academy of Sciences Leopoldina" "headquarters-location" "Q2814")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "German Academy of Sciences Leopoldina" "located-in-the-administrative-territorial-entity" "Q183")

(refer-to ["properties.topics_main_category"])
(fact claim "German Academy of Sciences Leopoldina" "topic's-main-category" "Q7034114")

(refer-to ["properties.wikidata_property"])
(fact claim "German Academy of Sciences Leopoldina" "wikidata-property" "Q3413")

(refer-to ["properties.founded_by"])
(fact claim "German Academy of Sciences Leopoldina" "founded-by" "Q98496")
(fact claim "German Academy of Sciences Leopoldina" "founded-by" "Q1575280")
(fact claim "German Academy of Sciences Leopoldina" "founded-by" "Q104854")

(refer-to ["properties.sudoc_authorities"])
(fact claim "German Academy of Sciences Leopoldina" "sudoc-authorities" "02644402X")

(refer-to ["properties.bnf_id"])
(fact claim "German Academy of Sciences Leopoldina" "bnf-id" "11869058d")

(refer-to ["properties.member_of"])
(fact claim "German Academy of Sciences Leopoldina" "member-of" "Q1783362")

(refer-to ["properties.freebase_id"])
(fact claim "German Academy of Sciences Leopoldina" "freebase-id" "/m/03mnv5")

(refer-to ["properties.location_of_formation"])
(fact claim "German Academy of Sciences Leopoldina" "location-of-formation" "Q4126")

(refer-to ["properties.inception"])
(fact claim "German Academy of Sciences Leopoldina" "inception" "+1652-01-01T00:00:00Z")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "German Academy of Sciences Leopoldina" "gran-enciclopèdia-catalana-id" "0000481")

(refer-to ["properties.isni"])
(fact claim "German Academy of Sciences Leopoldina" "isni" "0000 0001 2157 0182")

(refer-to ["properties.official_website"])
(fact claim "German Academy of Sciences Leopoldina" "official-website" "http://www.leopoldina.org/")

(refer-to ["properties.gnd_id"])
(fact claim "German Academy of Sciences Leopoldina" "gnd-id" "35672-4")

(refer-to ["properties.has_part"])
(fact claim "German Academy of Sciences Leopoldina" "has-part" "Q28737991")

(refer-to ["properties.described_by_source"])
(fact claim "German Academy of Sciences Leopoldina" "described-by-source" "Q2041543")

(refer-to ["properties.instance_of"])
(fact claim "German Academy of Sciences Leopoldina" "instance-of" "Q414147")
(fact claim "German Academy of Sciences Leopoldina" "instance-of" "Q9299236")
(fact claim "German Academy of Sciences Leopoldina" "instance-of" "Q955824")

(refer-to ["properties.image"])
(fact claim "German Academy of Sciences Leopoldina" "image" "Leopoldina Halle Jaegerberg1.JPG")

(refer-to ["properties.grid_id"])
(fact claim "German Academy of Sciences Leopoldina" "grid-id" "grid.461637.1")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "German Academy of Sciences Leopoldina" "library-of-congress-authority-id" "n50005104")

(refer-to ["properties.named_after"])
(fact claim "German Academy of Sciences Leopoldina" "named-after" "Q150494")
