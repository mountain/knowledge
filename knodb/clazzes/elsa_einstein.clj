(ns clazzes.elsa_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Elsa Einstein")

(name-as-in "Elsa Einstein" "" "zh-hk")
(name-as-in "Elsa Einstein" "Elsa Einstein" "pt")
(name-as-in "Elsa Einstein" "Elsa Einstein" "en")
(name-as-in "Elsa Einstein" "Elsa Einstein" "fr")
(name-as-in "Elsa Einstein" "" "zh-tw")
(name-as-in "Elsa Einstein" "Elsa Einstein" "de")
(name-as-in "Elsa Einstein" "Эльза Эйнштейн" "ru")
(name-as-in "Elsa Einstein" "Elsa Einstein" "es")
(name-as-in "Elsa Einstein" "エルザ・アインシュタイン" "ja")
(name-as-in "Elsa Einstein" "爱尔莎·爱因斯坦" "zh-cn")
(name-as-in "Elsa Einstein" "" "zh-sg")

(descr-as-in "Elsa Einstein" "" "zh-hk")
(descr-as-in "Elsa Einstein" "" "pt")
(descr-as-in "Elsa Einstein" "second wife of Albert Einstein" "en")
(descr-as-in "Elsa Einstein" "" "fr")
(descr-as-in "Elsa Einstein" "" "zh-tw")
(descr-as-in "Elsa Einstein" "zweite Frau von Albert Einstein" "de")
(descr-as-in "Elsa Einstein" "" "ru")
(descr-as-in "Elsa Einstein" "" "es")
(descr-as-in "Elsa Einstein" "" "ja")
(descr-as-in "Elsa Einstein" "" "zh-cn")
(descr-as-in "Elsa Einstein" "" "zh-sg")


(refer-to ["properties.commons_category"])
(refer-to ["clazzes.elsa_einstein"])
(fact claim "Elsa Einstein" "commons-category" "Elsa Einstein")

(refer-to ["properties.place_of_birth"])
(fact claim "Elsa Einstein" "place-of-birth" "Q494529")

(refer-to ["properties.date_of_death"])
(fact claim "Elsa Einstein" "date-of-death" "+1936-12-20T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Elsa Einstein" "viaf-id" "31600989")

(refer-to ["properties.ethnic_group"])
(refer-to ["clazzes.jewish_people"])
(fact claim "Elsa Einstein" "ethnic-group" "Jewish people")

(refer-to ["properties.place_of_death"])
(refer-to ["clazzes.princeton"])
(fact claim "Elsa Einstein" "place-of-death" "Princeton")

(refer-to ["properties.sex_or_gender"])
(fact claim "Elsa Einstein" "sex-or-gender" "Q6581072")

(refer-to ["properties.father"])
(fact claim "Elsa Einstein" "father" "Q29788388")

(refer-to ["properties.bnf_id"])
(fact claim "Elsa Einstein" "bnf-id" "166903163")

(refer-to ["properties.freebase_id"])
(fact claim "Elsa Einstein" "freebase-id" "/m/027gd2x")

(refer-to ["properties.snac_ark_id"])
(fact claim "Elsa Einstein" "snac-ark-id" "w6hh7c53")

(refer-to ["properties.fast_id"])
(fact claim "Elsa Einstein" "fast-id" "393128")

(refer-to ["properties.spouse"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Elsa Einstein" "spouse" "Albert Einstein")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Elsa Einstein" "wikitree-person-id" "Einstein-25")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Elsa Einstein" "country-of-citizenship" "Q183")

(refer-to ["properties.isni"])
(fact claim "Elsa Einstein" "isni" "0000 0000 4611 1321")

(refer-to ["properties.gnd_id"])
(fact claim "Elsa Einstein" "gnd-id" "116425741")

(refer-to ["properties.genealogics_org_person_id"])
(fact claim "Elsa Einstein" "genealogics_org-person-id" "I00545774")

(refer-to ["properties.instance_of"])
(fact claim "Elsa Einstein" "instance-of" "Q5")

(refer-to ["properties.given_name"])
(fact claim "Elsa Einstein" "given-name" "Q1077181")

(refer-to ["properties.mother"])
(fact claim "Elsa Einstein" "mother" "Q30302248")

(refer-to ["properties.image"])
(fact claim "Elsa Einstein" "image" "Bundesarchiv Bild 102-00486A, Elsa Einstein.jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Elsa Einstein" "date-of-birth" "+1876-01-18T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Elsa Einstein" "library-of-congress-authority-id" "no97035877")

(refer-to ["properties.religion"])
(fact claim "Elsa Einstein" "religion" "Q9268")
