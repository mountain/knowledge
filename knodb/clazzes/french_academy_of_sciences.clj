(ns clazzes.french_academy_of_sciences
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "French Academy of Sciences")

(name-as-in "French Academy of Sciences" "法國科學院" "zh-hk")
(name-as-in "French Academy of Sciences" "Académie des Sciences" "pt")
(name-as-in "French Academy of Sciences" "French Academy of Sciences" "en")
(name-as-in "French Academy of Sciences" "Académie des sciences" "fr")
(name-as-in "French Academy of Sciences" "法蘭西科學院" "zh-tw")
(name-as-in "French Academy of Sciences" "Académie des sciences" "de")
(name-as-in "French Academy of Sciences" "Французская академия наук" "ru")
(name-as-in "French Academy of Sciences" "Academia de Ciencias de Francia" "es")
(name-as-in "French Academy of Sciences" "科学アカデミー" "ja")
(name-as-in "French Academy of Sciences" "法国科学院" "zh-cn")
(name-as-in "French Academy of Sciences" "法国科学院" "zh-sg")

(descr-as-in "French Academy of Sciences" "" "zh-hk")
(descr-as-in "French Academy of Sciences" "" "pt")
(descr-as-in "French Academy of Sciences" "learned society, founded in 1666 by Louis XIV at the suggestion of Jean-Baptiste Colbert, to encourage and protect the spirit of French scientific research" "en")
(descr-as-in "French Academy of Sciences" "l’une des cinq académies regroupées au sein de l’Institut de France qui encourage et protège l’esprit de recherche, et contribue aux progrès des sciences et de leurs applications" "fr")
(descr-as-in "French Academy of Sciences" "是法蘭西學會下屬的五個學院之一" "zh-tw")
(descr-as-in "French Academy of Sciences" "" "de")
(descr-as-in "French Academy of Sciences" "" "ru")
(descr-as-in "French Academy of Sciences" "institución científica francesa" "es")
(descr-as-in "French Academy of Sciences" "" "ja")
(descr-as-in "French Academy of Sciences" "" "zh-cn")
(descr-as-in "French Academy of Sciences" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "French Academy of Sciences" "country" "Q142")

(refer-to ["properties.commons_category"])
(fact claim "French Academy of Sciences" "commons-category" "Académie des sciences (France)")

(refer-to ["properties.viaf_id"])
(fact claim "French Academy of Sciences" "viaf-id" "123268181")

(refer-to ["properties.headquarters_location"])
(fact claim "French Academy of Sciences" "headquarters-location" "Q90")

(refer-to ["properties.share_catalogue_author_id"])
(fact claim "French Academy of Sciences" "share-catalogue-author-id" "4161")

(refer-to ["properties.topics_main_category"])
(fact claim "French Academy of Sciences" "topic's-main-category" "Q6177001")

(refer-to ["properties.founded_by"])
(fact claim "French Academy of Sciences" "founded-by" "Q188971")

(refer-to ["properties.sudoc_authorities"])
(fact claim "French Academy of Sciences" "sudoc-authorities" "026357852")

(refer-to ["properties.bnf_id"])
(fact claim "French Academy of Sciences" "bnf-id" "11862135b")

(refer-to ["properties.freebase_id"])
(fact claim "French Academy of Sciences" "freebase-id" "/m/02395w")

(refer-to ["properties.coordinate_location"])
(fact claim "French Academy of Sciences" "coordinate-location" "lng 2.337 lat 48.8574 alt ")

(refer-to ["properties.inception"])
(fact claim "French Academy of Sciences" "inception" "+1666-12-22T00:00:00Z")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "French Academy of Sciences" "gran-enciclopèdia-catalana-id" "0000496")

(refer-to ["properties.isni"])
(fact claim "French Academy of Sciences" "isni" "0000 0001 2290 4869")

(refer-to ["properties.official_website"])
(fact claim "French Academy of Sciences" "official-website" "http://www.academie-sciences.fr/")

(refer-to ["properties.gnd_id"])
(fact claim "French Academy of Sciences" "gnd-id" "1085261573")

(refer-to ["properties.described_by_source"])
(fact claim "French Academy of Sciences" "described-by-source" "Q2041543")

(refer-to ["properties.archon_code"])
(fact claim "French Academy of Sciences" "archon-code" "1065")

(refer-to ["properties.instance_of"])
(fact claim "French Academy of Sciences" "instance-of" "Q414147")

(refer-to ["properties.part_of"])
(fact claim "French Academy of Sciences" "part-of" "Q377066")
(fact claim "French Academy of Sciences" "part-of" "Q377066")

(refer-to ["properties.image"])
(fact claim "French Academy of Sciences" "image" "Institut France.jpg")

(refer-to ["properties.cths_society_id"])
(fact claim "French Academy of Sciences" "cths-society-id" "100679")

(refer-to ["properties.twitter_username"])
(fact claim "French Academy of Sciences" "twitter-username" "AcadSciences")

(refer-to ["properties.national_library_of_greece_id"])
(fact claim "French Academy of Sciences" "national-library-of-greece-id" "112484")

(refer-to ["properties.openmlol_author_id"])
(fact claim "French Academy of Sciences" "openmlol-author-id" "93064")
