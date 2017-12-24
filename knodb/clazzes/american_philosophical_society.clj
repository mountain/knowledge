(ns clazzes.american_philosophical_society
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "American Philosophical Society")

(name-as-in "American Philosophical Society" "" "zh-hk")
(name-as-in "American Philosophical Society" "American Philosophical Society" "pt")
(name-as-in "American Philosophical Society" "American Philosophical Society" "en")
(name-as-in "American Philosophical Society" "Société américaine de philosophie" "fr")
(name-as-in "American Philosophical Society" "" "zh-tw")
(name-as-in "American Philosophical Society" "American Philosophical Society" "de")
(name-as-in "American Philosophical Society" "Американское философское общество" "ru")
(name-as-in "American Philosophical Society" "Sociedad Filosófica Estadounidense" "es")
(name-as-in "American Philosophical Society" "アメリカ哲学協会" "ja")
(name-as-in "American Philosophical Society" "" "zh-cn")
(name-as-in "American Philosophical Society" "" "zh-sg")

(descr-as-in "American Philosophical Society" "" "zh-hk")
(descr-as-in "American Philosophical Society" "" "pt")
(descr-as-in "American Philosophical Society" "United States scholarly organization  that promotes knowledge in the sciences and humanities" "en")
(descr-as-in "American Philosophical Society" "" "fr")
(descr-as-in "American Philosophical Society" "" "zh-tw")
(descr-as-in "American Philosophical Society" "" "de")
(descr-as-in "American Philosophical Society" "" "ru")
(descr-as-in "American Philosophical Society" "" "es")
(descr-as-in "American Philosophical Society" "" "ja")
(descr-as-in "American Philosophical Society" "" "zh-cn")
(descr-as-in "American Philosophical Society" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "American Philosophical Society" "country" "Q30")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.american_philosophical_society"])
(fact claim "American Philosophical Society" "commons-category" "American Philosophical Society")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "American Philosophical Society" "encyclopædia-britannica-online-id" "topic/American-Philosophical-Society")

(refer-to ["properties.viaf_id"])
(fact claim "American Philosophical Society" "viaf-id" "143732195")

(refer-to ["properties.headquarters_location"])
(fact claim "American Philosophical Society" "headquarters-location" "Q1345")

(refer-to ["properties.topics_main_category"])
(fact claim "American Philosophical Society" "topic's-main-category" "Q10172061")

(refer-to ["properties.founded_by"])
(fact claim "American Philosophical Society" "founded-by" "Q34969")

(refer-to ["properties.doi"])
(fact claim "American Philosophical Society" "doi" "10.13039/100001461")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.english"])
(fact claim "American Philosophical Society" "official-language" "English")

(refer-to ["properties.sudoc_authorities"])
(fact claim "American Philosophical Society" "sudoc-authorities" "029970008")

(refer-to ["properties.bnf_id"])
(fact claim "American Philosophical Society" "bnf-id" "12148286g")

(refer-to ["properties.freebase_id"])
(fact claim "American Philosophical Society" "freebase-id" "/m/01prf3")

(refer-to ["properties.te_papa_person_id"])
(fact claim "American Philosophical Society" "te-papa-person-id" "40980")

(refer-to ["properties.ringgold_id"])
(fact claim "American Philosophical Society" "ringgold-id" "6550")

(refer-to ["properties.inception"])
(fact claim "American Philosophical Society" "inception" "+1743-00-00T00:00:00Z")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "American Philosophical Society" "gran-enciclopèdia-catalana-id" "0003511")

(refer-to ["properties.location"])
(fact claim "American Philosophical Society" "location" "Q20643652")

(refer-to ["properties.isni"])
(fact claim "American Philosophical Society" "isni" "0000 0004 0453 8561")

(refer-to ["properties.official_website"])
(fact claim "American Philosophical Society" "official-website" "https://amphilsoc.org/")

(refer-to ["properties.open_library_id"])
(fact claim "American Philosophical Society" "open-library-id" "OL121500A")

(refer-to ["properties.instance_of"])
(fact claim "American Philosophical Society" "instance-of" "Q43229")

(refer-to ["properties.ne_se_id"])
(fact claim "American Philosophical Society" "ne_se-id" "american-philosophical-society")

(refer-to ["properties.image"])
(fact claim "American Philosophical Society" "image" "American Philosophical Society Library.jpg")

(refer-to ["properties.grid_id"])
(fact claim "American Philosophical Society" "grid-id" "grid.428194.2")
