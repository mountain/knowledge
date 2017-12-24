(ns clazzes.lincean_academy
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Lincean Academy")

(name-as-in "Lincean Academy" "" "zh-hk")
(name-as-in "Lincean Academy" "Accademia Nazionale dei Lincei" "pt")
(name-as-in "Lincean Academy" "Lincean Academy" "en")
(name-as-in "Lincean Academy" "Académie des Lyncéens" "fr")
(name-as-in "Lincean Academy" "" "zh-tw")
(name-as-in "Lincean Academy" "Accademia Nazionale dei Lincei" "de")
(name-as-in "Lincean Academy" "Национальная академия деи Линчеи" "ru")
(name-as-in "Lincean Academy" "Academia Nacional de los Linces" "es")
(name-as-in "Lincean Academy" "アッカデーミア・デイ・リンチェイ" "ja")
(name-as-in "Lincean Academy" "" "zh-cn")
(name-as-in "Lincean Academy" "" "zh-sg")

(descr-as-in "Lincean Academy" "" "zh-hk")
(descr-as-in "Lincean Academy" "" "pt")
(descr-as-in "Lincean Academy" "academy of sciences" "en")
(descr-as-in "Lincean Academy" "" "fr")
(descr-as-in "Lincean Academy" "" "zh-tw")
(descr-as-in "Lincean Academy" "" "de")
(descr-as-in "Lincean Academy" "старейшая академия наук Италии" "ru")
(descr-as-in "Lincean Academy" "academia de ciencias italiana" "es")
(descr-as-in "Lincean Academy" "" "ja")
(descr-as-in "Lincean Academy" "" "zh-cn")
(descr-as-in "Lincean Academy" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Lincean Academy" "country" "Q38")

(refer-to ["properties.commons_category"])
(fact claim "Lincean Academy" "commons-category" "Accademia dei Lincei")

(refer-to ["properties.viaf_id"])
(fact claim "Lincean Academy" "viaf-id" "126646324")

(refer-to ["properties.headquarters_location"])
(fact claim "Lincean Academy" "headquarters-location" "Q220")

(refer-to ["properties.share_catalogue_author_id"])
(fact claim "Lincean Academy" "share-catalogue-author-id" "4172")

(refer-to ["properties.topics_main_category"])
(fact claim "Lincean Academy" "topic's-main-category" "Q8984537")

(refer-to ["properties.founded_by"])
(fact claim "Lincean Academy" "founded-by" "Q322023")

(refer-to ["properties.doi"])
(fact claim "Lincean Academy" "doi" "10.13039/501100008027")

(refer-to ["properties.bnf_id"])
(fact claim "Lincean Academy" "bnf-id" "15373443x")

(refer-to ["properties.freebase_id"])
(fact claim "Lincean Academy" "freebase-id" "/m/01vhkb")

(refer-to ["properties.coordinate_location"])
(fact claim "Lincean Academy" "coordinate-location" "lng 12.466666666667 lat 41.893333333333 alt ")

(refer-to ["properties.inception"])
(fact claim "Lincean Academy" "inception" "+1603-00-00T00:00:00Z")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "Lincean Academy" "gran-enciclopèdia-catalana-id" "0000525")

(refer-to ["properties.isni"])
(fact claim "Lincean Academy" "isni" "0000 0001 2195 4282")

(refer-to ["properties.official_website"])
(fact claim "Lincean Academy" "official-website" "http://www.lincei.it/")

(refer-to ["properties.gnd_id"])
(fact claim "Lincean Academy" "gnd-id" "35038-2")

(refer-to ["properties.described_by_source"])
(fact claim "Lincean Academy" "described-by-source" "Q2041543")

(refer-to ["properties.instance_of"])
(fact claim "Lincean Academy" "instance-of" "Q414147")

(refer-to ["properties.ne_se_id"])
(fact claim "Lincean Academy" "ne_se-id" "accademia-dei-lincei")

(refer-to ["properties.image"])
(fact claim "Lincean Academy" "image" "Trastevere - Accademia dei Lincei alla Lungara 01593.JPG")

(refer-to ["properties.grid_id"])
(fact claim "Lincean Academy" "grid-id" "grid.466495.c")

(refer-to ["properties.national_library_of_greece_id"])
(fact claim "Lincean Academy" "national-library-of-greece-id" "273290")

(refer-to ["properties.named_after"])
(fact claim "Lincean Academy" "named-after" "Q677014")
