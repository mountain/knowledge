(ns clazzes.hans_albert_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Hans Albert Einstein")

(name-as-in "Hans Albert Einstein" "漢斯·阿爾伯特·愛因斯坦" "zh-hk")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "pt")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "en")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "fr")
(name-as-in "Hans Albert Einstein" "漢斯·阿爾伯特·愛因斯坦" "zh-tw")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "de")
(name-as-in "Hans Albert Einstein" "Ганс Альберт Эйнштейн" "ru")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "es")
(name-as-in "Hans Albert Einstein" "ハンス・アルベルト・アインシュタイン" "ja")
(name-as-in "Hans Albert Einstein" "汉斯·阿尔伯特·爱因斯坦" "zh-cn")
(name-as-in "Hans Albert Einstein" "汉斯·阿尔伯特·爱因斯坦" "zh-sg")

(descr-as-in "Hans Albert Einstein" "" "zh-hk")
(descr-as-in "Hans Albert Einstein" "" "pt")
(descr-as-in "Hans Albert Einstein" "Swiss-American engineer and educator" "en")
(descr-as-in "Hans Albert Einstein" "ingénieur américain, fils d'Albert Einstein" "fr")
(descr-as-in "Hans Albert Einstein" "" "zh-tw")
(descr-as-in "Hans Albert Einstein" "Professor für Hydraulik und Sohn Albert Einsteins" "de")
(descr-as-in "Hans Albert Einstein" "первый сын Альберта Эйнштейна и Милевы Марич" "ru")
(descr-as-in "Hans Albert Einstein" "" "es")
(descr-as-in "Hans Albert Einstein" "" "ja")
(descr-as-in "Hans Albert Einstein" "" "zh-cn")
(descr-as-in "Hans Albert Einstein" "" "zh-sg")


(refer-to ["properties.award_received"])
(fact claim "Hans Albert Einstein" "award-received" "Q1316544")

(refer-to ["properties.place_of_birth"])
(fact claim "Hans Albert Einstein" "place-of-birth" "Q70")

(refer-to ["properties.mathematics_genealogy_project_id"])
(fact claim "Hans Albert Einstein" "mathematics-genealogy-project-id" "30930")

(refer-to ["properties.date_of_death"])
(fact claim "Hans Albert Einstein" "date-of-death" "+1973-07-26T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Hans Albert Einstein" "viaf-id" "67420636")

(refer-to ["properties.place_of_death"])
(fact claim "Hans Albert Einstein" "place-of-death" "Q747172")

(refer-to ["properties.employer"])
(fact claim "Hans Albert Einstein" "employer" "Q168756")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Hans Albert Einstein" "sex-or-gender" "male")

(refer-to ["properties.father"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Hans Albert Einstein" "father" "Albert Einstein")

(refer-to ["properties.family"])
(fact claim "Hans Albert Einstein" "family" "Q3292175")

(refer-to ["properties.native_language"])
(refer-to ["clazzes.german"])
(fact claim "Hans Albert Einstein" "native-language" "German")

(refer-to ["properties.languages_spoken_written_or_signed"])
(refer-to ["clazzes.german"])
(fact claim "Hans Albert Einstein" "languages-spoken-written-or-signed" "German")
(refer-to ["clazzes.english"])
(fact claim "Hans Albert Einstein" "languages-spoken-written-or-signed" "English")

(refer-to ["properties.hds_id"])
(fact claim "Hans Albert Einstein" "hds-id" "31334")

(refer-to ["properties.freebase_id"])
(fact claim "Hans Albert Einstein" "freebase-id" "/m/04xmkm")

(refer-to ["properties.child"])
(fact claim "Hans Albert Einstein" "child" "Q824855")
(fact claim "Hans Albert Einstein" "child" "Q432375")

(refer-to ["properties.snac_ark_id"])
(fact claim "Hans Albert Einstein" "snac-ark-id" "w60k304m")

(refer-to ["properties.fast_id"])
(fact claim "Hans Albert Einstein" "fast-id" "145163")

(refer-to ["properties.manner_of_death"])
(fact claim "Hans Albert Einstein" "manner-of-death" "Q3739104")

(refer-to ["properties.occupation"])
(fact claim "Hans Albert Einstein" "occupation" "Q81096")
(fact claim "Hans Albert Einstein" "occupation" "Q37226")

(refer-to ["properties.spouse"])
(fact claim "Hans Albert Einstein" "spouse" "Q15449907")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Hans Albert Einstein" "wikitree-person-id" "Einstein-39")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Hans Albert Einstein" "country-of-citizenship" "Q30")

(refer-to ["properties.isni"])
(fact claim "Hans Albert Einstein" "isni" "0000 0001 0982 7635")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Hans Albert Einstein" "ndl-auth-id" "001210122")

(refer-to ["properties.sibling"])
(fact claim "Hans Albert Einstein" "sibling" "Q118253")
(fact claim "Hans Albert Einstein" "sibling" "Q468357")

(refer-to ["properties.gnd_id"])
(fact claim "Hans Albert Einstein" "gnd-id" "143075845")

(refer-to ["properties.educated_at"])
(refer-to ["clazzes.eth_zurich"])
(fact claim "Hans Albert Einstein" "educated-at" "ETH Zurich")

(refer-to ["properties.instance_of"])
(fact claim "Hans Albert Einstein" "instance-of" "Q5")

(refer-to ["properties.nukat_warsawu_authorities"])
(fact claim "Hans Albert Einstein" "nukat-warsawu-authorities" "n2008122449")

(refer-to ["properties.cause_of_death"])
(fact claim "Hans Albert Einstein" "cause-of-death" "Q181754")

(refer-to ["properties.family_name"])
(fact claim "Hans Albert Einstein" "family-name" "Q16834800")

(refer-to ["properties.given_name"])
(fact claim "Hans Albert Einstein" "given-name" "Q632842")

(refer-to ["properties.mother"])
(fact claim "Hans Albert Einstein" "mother" "Q76346")

(refer-to ["properties.date_of_birth"])
(fact claim "Hans Albert Einstein" "date-of-birth" "+1904-05-14T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Hans Albert Einstein" "library-of-congress-authority-id" "n85802437")
