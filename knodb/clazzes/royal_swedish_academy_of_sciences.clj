(ns clazzes.royal_swedish_academy_of_sciences
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Royal Swedish Academy of Sciences")

(name-as-in "Royal Swedish Academy of Sciences" "瑞典皇家科學院" "zh-hk")
(name-as-in "Royal Swedish Academy of Sciences" "Academia Real das Ciências da Suécia" "pt")
(name-as-in "Royal Swedish Academy of Sciences" "Royal Swedish Academy of Sciences" "en")
(name-as-in "Royal Swedish Academy of Sciences" "Académie royale des sciences de Suède" "fr")
(name-as-in "Royal Swedish Academy of Sciences" "瑞典皇家科學院" "zh-tw")
(name-as-in "Royal Swedish Academy of Sciences" "Königlich Schwedische Akademie der Wissenschaften" "de")
(name-as-in "Royal Swedish Academy of Sciences" "Шведская королевская академия наук" "ru")
(name-as-in "Royal Swedish Academy of Sciences" "Real Academia de las Ciencias de Suecia" "es")
(name-as-in "Royal Swedish Academy of Sciences" "スウェーデン王立科学アカデミー" "ja")
(name-as-in "Royal Swedish Academy of Sciences" "瑞典皇家科学院" "zh-cn")
(name-as-in "Royal Swedish Academy of Sciences" "瑞典皇家科学院" "zh-sg")

(descr-as-in "Royal Swedish Academy of Sciences" "" "zh-hk")
(descr-as-in "Royal Swedish Academy of Sciences" "" "pt")
(descr-as-in "Royal Swedish Academy of Sciences" "" "en")
(descr-as-in "Royal Swedish Academy of Sciences" "" "fr")
(descr-as-in "Royal Swedish Academy of Sciences" "" "zh-tw")
(descr-as-in "Royal Swedish Academy of Sciences" "" "de")
(descr-as-in "Royal Swedish Academy of Sciences" "" "ru")
(descr-as-in "Royal Swedish Academy of Sciences" "" "es")
(descr-as-in "Royal Swedish Academy of Sciences" "" "ja")
(descr-as-in "Royal Swedish Academy of Sciences" "" "zh-cn")
(descr-as-in "Royal Swedish Academy of Sciences" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Royal Swedish Academy of Sciences" "country" "Q34")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.royal_swedish_academy_of_sciences"])
(fact claim "Royal Swedish Academy of Sciences" "commons-category" "Royal Swedish Academy of Sciences")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Royal Swedish Academy of Sciences" "encyclopædia-britannica-online-id" "topic/Royal-Swedish-Academy-of-Sciences")

(refer-to ["properties.viaf_id"])
(fact claim "Royal Swedish Academy of Sciences" "viaf-id" "150591344")

(refer-to ["properties.headquarters_location"])
(fact claim "Royal Swedish Academy of Sciences" "headquarters-location" "Q1455650")

(refer-to ["properties.short_name"])
(fact claim "Royal Swedish Academy of Sciences" "short-name" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "Royal Swedish Academy of Sciences" "topic's-main-category" "Q7047305")

(refer-to ["properties.founded_by"])
(fact claim "Royal Swedish Academy of Sciences" "founded-by" "Q632219")
(fact claim "Royal Swedish Academy of Sciences" "founded-by" "Q491083")
(fact claim "Royal Swedish Academy of Sciences" "founded-by" "Q362485")
(fact claim "Royal Swedish Academy of Sciences" "founded-by" "Q1043")
(fact claim "Royal Swedish Academy of Sciences" "founded-by" "Q363197")
(fact claim "Royal Swedish Academy of Sciences" "founded-by" "Q363545")

(refer-to ["properties.doi"])
(fact claim "Royal Swedish Academy of Sciences" "doi" "10.13039/501100001725")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Royal Swedish Academy of Sciences" "sudoc-authorities" "029950112")

(refer-to ["properties.bnf_id"])
(fact claim "Royal Swedish Academy of Sciences" "bnf-id" "121466863")

(refer-to ["properties.freebase_id"])
(fact claim "Royal Swedish Academy of Sciences" "freebase-id" "/m/01dy4v")

(refer-to ["properties.inception"])
(fact claim "Royal Swedish Academy of Sciences" "inception" "+1739-06-02T00:00:00Z")

(refer-to ["properties.isni"])
(fact claim "Royal Swedish Academy of Sciences" "isni" "0000 0001 0945 0671")

(refer-to ["properties.official_website"])
(fact claim "Royal Swedish Academy of Sciences" "official-website" "http://www.kva.se/")

(refer-to ["properties.gnd_id"])
(fact claim "Royal Swedish Academy of Sciences" "gnd-id" "1013793-2")

(refer-to ["properties.described_by_source"])
(fact claim "Royal Swedish Academy of Sciences" "described-by-source" "Q2041543")

(refer-to ["properties.archon_code"])
(fact claim "Royal Swedish Academy of Sciences" "archon-code" "1611")

(refer-to ["properties.instance_of"])
(fact claim "Royal Swedish Academy of Sciences" "instance-of" "Q414147")
(fact claim "Royal Swedish Academy of Sciences" "instance-of" "Q1310653")

(refer-to ["properties.nationalmuseum_sweden_artist_id"])
(fact claim "Royal Swedish Academy of Sciences" "nationalmuseum-sweden-artist-id" "1188")

(refer-to ["properties.selibr"])
(fact claim "Royal Swedish Academy of Sciences" "selibr" "121938")

(refer-to ["properties.image"])
(fact claim "Royal Swedish Academy of Sciences" "image" "Main building of the Royal Swedish Academy of Sciences (Kungliga Vetenskapsakademien), Frescati, Norra Djurgården, Stockholm.jpg")

(refer-to ["properties.grid_id"])
(fact claim "Royal Swedish Academy of Sciences" "grid-id" "grid.419331.d")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Royal Swedish Academy of Sciences" "library-of-congress-authority-id" "n80044879")

(refer-to ["properties.eu_transparency_register_id"])
(fact claim "Royal Swedish Academy of Sciences" "eu-transparency-register-id" "744827611137-47")
