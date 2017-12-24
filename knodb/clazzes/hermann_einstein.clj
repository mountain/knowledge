(ns clazzes.hermann_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Hermann Einstein")

(name-as-in "Hermann Einstein" "" "zh-hk")
(name-as-in "Hermann Einstein" "Hermann Einstein" "pt")
(name-as-in "Hermann Einstein" "Hermann Einstein" "en")
(name-as-in "Hermann Einstein" "Hermann Einstein" "fr")
(name-as-in "Hermann Einstein" "" "zh-tw")
(name-as-in "Hermann Einstein" "Hermann Einstein" "de")
(name-as-in "Hermann Einstein" "Герман Эйнштейн" "ru")
(name-as-in "Hermann Einstein" "Hermann Einstein" "es")
(name-as-in "Hermann Einstein" "ヘルマン・アインシュタイン" "ja")
(name-as-in "Hermann Einstein" "" "zh-cn")
(name-as-in "Hermann Einstein" "" "zh-sg")

(descr-as-in "Hermann Einstein" "" "zh-hk")
(descr-as-in "Hermann Einstein" "" "pt")
(descr-as-in "Hermann Einstein" "German electrical engineer and businessman, father of Albert Einstein" "en")
(descr-as-in "Hermann Einstein" "homme d'affaires allemand et père d'Albert Einstein" "fr")
(descr-as-in "Hermann Einstein" "" "zh-tw")
(descr-as-in "Hermann Einstein" "deutscher Elektrotechniker und Unternehmer, Vater Albert Einsteins" "de")
(descr-as-in "Hermann Einstein" "немецкий электротехник и предприниматель, отец Альберта Эйнштейна" "ru")
(descr-as-in "Hermann Einstein" "" "es")
(descr-as-in "Hermann Einstein" "" "ja")
(descr-as-in "Hermann Einstein" "" "zh-cn")
(descr-as-in "Hermann Einstein" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Hermann Einstein" "place-of-birth" "Q496489")

(refer-to ["properties.date_of_death"])
(fact claim "Hermann Einstein" "date-of-death" "+1902-10-10T00:00:00Z")

(refer-to ["properties.ethnic_group"])
(refer-to ["clazzes.jewish_people"])
(fact claim "Hermann Einstein" "ethnic-group" "Jewish people")

(refer-to ["properties.place_of_death"])
(fact claim "Hermann Einstein" "place-of-death" "Q490")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Hermann Einstein" "sex-or-gender" "male")

(refer-to ["properties.father"])
(fact claim "Hermann Einstein" "father" "Q30277523")

(refer-to ["properties.family"])
(fact claim "Hermann Einstein" "family" "Q3292175")

(refer-to ["properties.freebase_id"])
(fact claim "Hermann Einstein" "freebase-id" "/m/03gq3xh")

(refer-to ["properties.child"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Hermann Einstein" "child" "Albert Einstein")
(fact claim "Hermann Einstein" "child" "Q216738")

(refer-to ["properties.occupation"])
(fact claim "Hermann Einstein" "occupation" "Q131524")
(fact claim "Hermann Einstein" "occupation" "Q81096")

(refer-to ["properties.spouse"])
(fact claim "Hermann Einstein" "spouse" "Q4357787")

(refer-to ["properties.residence"])
(fact claim "Hermann Einstein" "residence" "Q490")
(fact claim "Hermann Einstein" "residence" "Q6259")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Hermann Einstein" "wikitree-person-id" "Einstein-7")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Hermann Einstein" "country-of-citizenship" "Q183")

(refer-to ["properties.genealogics_org_person_id"])
(fact claim "Hermann Einstein" "genealogics_org-person-id" "I00545768")

(refer-to ["properties.instance_of"])
(fact claim "Hermann Einstein" "instance-of" "Q5")

(refer-to ["properties.cause_of_death"])
(fact claim "Hermann Einstein" "cause-of-death" "Q181754")

(refer-to ["properties.given_name"])
(fact claim "Hermann Einstein" "given-name" "Q1158570")

(refer-to ["properties.mother"])
(fact claim "Hermann Einstein" "mother" "Q30278245")

(refer-to ["properties.image"])
(fact claim "Hermann Einstein" "image" "Hermann einstein.jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Hermann Einstein" "date-of-birth" "+1847-08-30T00:00:00Z")

(refer-to ["properties.religion"])
(fact claim "Hermann Einstein" "religion" "Q9268")
