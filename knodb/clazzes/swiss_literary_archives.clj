(ns clazzes.swiss_literary_archives
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Swiss Literary Archives")

(name-as-in "Swiss Literary Archives" "" "zh-hk")
(name-as-in "Swiss Literary Archives" "" "pt")
(name-as-in "Swiss Literary Archives" "Swiss Literary Archives" "en")
(name-as-in "Swiss Literary Archives" "Archives littéraires suisses" "fr")
(name-as-in "Swiss Literary Archives" "" "zh-tw")
(name-as-in "Swiss Literary Archives" "Schweizerisches Literaturarchiv" "de")
(name-as-in "Swiss Literary Archives" "Швейцарский литературный архив" "ru")
(name-as-in "Swiss Literary Archives" "" "es")
(name-as-in "Swiss Literary Archives" "" "ja")
(name-as-in "Swiss Literary Archives" "" "zh-cn")
(name-as-in "Swiss Literary Archives" "" "zh-sg")

(descr-as-in "Swiss Literary Archives" "" "zh-hk")
(descr-as-in "Swiss Literary Archives" "" "pt")
(descr-as-in "Swiss Literary Archives" "" "en")
(descr-as-in "Swiss Literary Archives" "" "fr")
(descr-as-in "Swiss Literary Archives" "" "zh-tw")
(descr-as-in "Swiss Literary Archives" "" "de")
(descr-as-in "Swiss Literary Archives" "" "ru")
(descr-as-in "Swiss Literary Archives" "" "es")
(descr-as-in "Swiss Literary Archives" "" "ja")
(descr-as-in "Swiss Literary Archives" "" "zh-cn")
(descr-as-in "Swiss Literary Archives" "" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.switzerland"])
(fact claim "Swiss Literary Archives" "country" "Switzerland")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.swiss_literary_archives"])
(fact claim "Swiss Literary Archives" "commons-category" "Swiss Literary Archives")

(refer-to ["properties.viaf_id"])
(fact claim "Swiss Literary Archives" "viaf-id" "151983833")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(refer-to ["clazzes.bern"])
(fact claim "Swiss Literary Archives" "located-in-the-administrative-territorial-entity" "Bern")
(fact claim "Swiss Literary Archives" "located-in-the-administrative-territorial-entity" "Q11911")

(refer-to ["properties.heritage_designation"])
(fact claim "Swiss Literary Archives" "heritage-designation" "Q8274529")

(refer-to ["properties.babelnet_id"])
(fact claim "Swiss Literary Archives" "babelnet-id" "03622939n")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Swiss Literary Archives" "nkcr-aut-id" "kn20050330001")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Swiss Literary Archives" "sudoc-authorities" "069393311")

(refer-to ["properties.bnf_id"])
(fact claim "Swiss Literary Archives" "bnf-id" "12482938f")

(refer-to ["properties.freebase_id"])
(fact claim "Swiss Literary Archives" "freebase-id" "/m/0263zfw")

(refer-to ["properties.coordinate_location"])
(fact claim "Swiss Literary Archives" "coordinate-location" "lng 7.44955 lat 46.94134 alt ")

(refer-to ["properties.isni"])
(fact claim "Swiss Literary Archives" "isni" "0000 0001 0945 4293")

(refer-to ["properties.official_website"])
(fact claim "Swiss Literary Archives" "official-website" "http://www.nb.admin.ch/sla/index.html?lang=fr")

(refer-to ["properties.gnd_id"])
(fact claim "Swiss Literary Archives" "gnd-id" "5034750-0")

(refer-to ["properties.instance_of"])
(fact claim "Swiss Literary Archives" "instance-of" "Q166118")
(fact claim "Swiss Literary Archives" "instance-of" "Q2122214")

(refer-to ["properties.international_standard_identifier_for_libraries"])
(fact claim "Swiss Literary Archives" "international-standard-identifier-for-libraries" "CH-000015-0")

(refer-to ["properties.nukat_warsawu_authorities"])
(fact claim "Swiss Literary Archives" "nukat-warsawu-authorities" "n2003010837")

(refer-to ["properties.part_of"])
(fact claim "Swiss Literary Archives" "part-of" "Q201787")

(refer-to ["properties.located_at_street_address"])
(fact claim "Swiss Literary Archives" "located-at-street-address" "Hallwylstrasse 15")

(refer-to ["properties.image"])
(fact claim "Swiss Literary Archives" "image" "Bern Nationalbibliothek Sammlung-9.jpg")

(refer-to ["properties.bibsys_id"])
(fact claim "Swiss Literary Archives" "bibsys-id" "90767602")

(refer-to ["properties.pcp_reference_number"])
(fact claim "Swiss Literary Archives" "pcp-reference-number" "8835")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Swiss Literary Archives" "library-of-congress-authority-id" "nr94022019")
