(ns clazzes.american_academy_of_arts_and_sciences
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "American Academy of Arts and Sciences")

(name-as-in "American Academy of Arts and Sciences" "" "zh-hk")
(name-as-in "American Academy of Arts and Sciences" "Academia de Artes e Ciências dos Estados Unidos" "pt")
(name-as-in "American Academy of Arts and Sciences" "American Academy of Arts and Sciences" "en")
(name-as-in "American Academy of Arts and Sciences" "Académie américaine des arts et des sciences" "fr")
(name-as-in "American Academy of Arts and Sciences" "美國文理科學院" "zh-tw")
(name-as-in "American Academy of Arts and Sciences" "American Academy of Arts and Sciences" "de")
(name-as-in "American Academy of Arts and Sciences" "Американская академия искусств и наук" "ru")
(name-as-in "American Academy of Arts and Sciences" "Academia Estadounidense de las Artes y las Ciencias" "es")
(name-as-in "American Academy of Arts and Sciences" "アメリカ芸術科学アカデミー" "ja")
(name-as-in "American Academy of Arts and Sciences" "" "zh-cn")
(name-as-in "American Academy of Arts and Sciences" "" "zh-sg")

(descr-as-in "American Academy of Arts and Sciences" "" "zh-hk")
(descr-as-in "American Academy of Arts and Sciences" "" "pt")
(descr-as-in "American Academy of Arts and Sciences" "United States honorary society and center for independent policy research" "en")
(descr-as-in "American Academy of Arts and Sciences" "" "fr")
(descr-as-in "American Academy of Arts and Sciences" "" "zh-tw")
(descr-as-in "American Academy of Arts and Sciences" "US-Akademie für Kunst und Wissenschaften" "de")
(descr-as-in "American Academy of Arts and Sciences" "" "ru")
(descr-as-in "American Academy of Arts and Sciences" "" "es")
(descr-as-in "American Academy of Arts and Sciences" "" "ja")
(descr-as-in "American Academy of Arts and Sciences" "" "zh-cn")
(descr-as-in "American Academy of Arts and Sciences" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "American Academy of Arts and Sciences" "country" "Q30")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.american_academy_of_arts_and_sciences"])
(fact claim "American Academy of Arts and Sciences" "commons-category" "American Academy of Arts and Sciences")

(refer-to ["properties.viaf_id"])
(fact claim "American Academy of Arts and Sciences" "viaf-id" "142551606")

(refer-to ["properties.headquarters_location"])
(fact claim "American Academy of Arts and Sciences" "headquarters-location" "Q49111")

(refer-to ["properties.topics_main_category"])
(fact claim "American Academy of Arts and Sciences" "topic's-main-category" "Q19319799")

(refer-to ["properties.geonames_id"])
(fact claim "American Academy of Arts and Sciences" "geonames-id" "4928968")

(refer-to ["properties.doi"])
(fact claim "American Academy of Arts and Sciences" "doi" "10.13039/100005276")

(refer-to ["properties.sudoc_authorities"])
(fact claim "American Academy of Arts and Sciences" "sudoc-authorities" "030378826")

(refer-to ["properties.bnf_id"])
(fact claim "American Academy of Arts and Sciences" "bnf-id" "12180527p")

(refer-to ["properties.freebase_id"])
(fact claim "American Academy of Arts and Sciences" "freebase-id" "/m/022st_")

(refer-to ["properties.ringgold_id"])
(fact claim "American Academy of Arts and Sciences" "ringgold-id" "67173")

(refer-to ["properties.coordinate_location"])
(fact claim "American Academy of Arts and Sciences" "coordinate-location" "lng -71.1103 lat 42.3808 alt ")

(refer-to ["properties.inception"])
(fact claim "American Academy of Arts and Sciences" "inception" "+1780-05-04T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "American Academy of Arts and Sciences" "isni" "0000 0000 9248 7629")

(refer-to ["properties.official_website"])
(fact claim "American Academy of Arts and Sciences" "official-website" "http://www.amacad.org")

(refer-to ["properties.gnd_id"])
(fact claim "American Academy of Arts and Sciences" "gnd-id" "2003822-7")

(refer-to ["properties.logo_image"])
(fact claim "American Academy of Arts and Sciences" "logo-image" "American Academy of Arts and Sciences.png")

(refer-to ["properties.archon_code"])
(fact claim "American Academy of Arts and Sciences" "archon-code" "993")

(refer-to ["properties.instance_of"])
(fact claim "American Academy of Arts and Sciences" "instance-of" "Q811979")
(fact claim "American Academy of Arts and Sciences" "instance-of" "Q955824")

(refer-to ["properties.image"])
(fact claim "American Academy of Arts and Sciences" "image" "AAAS exterior 1 - Cambridge, MA.JPG")

(refer-to ["properties.twitter_username"])
(fact claim "American Academy of Arts and Sciences" "twitter-username" "americanacad")

(refer-to ["properties.grid_id"])
(fact claim "American Academy of Arts and Sciences" "grid-id" "grid.299848.6")
