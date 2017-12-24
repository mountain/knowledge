(ns clazzes.pauline_koch
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Pauline Koch")

(name-as-in "Pauline Koch" "" "zh-hk")
(name-as-in "Pauline Koch" "Pauline Koch" "pt")
(name-as-in "Pauline Koch" "Pauline Koch" "en")
(name-as-in "Pauline Koch" "Pauline Einstein" "fr")
(name-as-in "Pauline Koch" "" "zh-tw")
(name-as-in "Pauline Koch" "Pauline Koch" "de")
(name-as-in "Pauline Koch" "Паулина Эйнштейн" "ru")
(name-as-in "Pauline Koch" "Pauline Koch" "es")
(name-as-in "Pauline Koch" "" "ja")
(name-as-in "Pauline Koch" "" "zh-cn")
(name-as-in "Pauline Koch" "" "zh-sg")

(descr-as-in "Pauline Koch" "" "zh-hk")
(descr-as-in "Pauline Koch" "" "pt")
(descr-as-in "Pauline Koch" "" "en")
(descr-as-in "Pauline Koch" "" "fr")
(descr-as-in "Pauline Koch" "" "zh-tw")
(descr-as-in "Pauline Koch" "" "de")
(descr-as-in "Pauline Koch" "" "ru")
(descr-as-in "Pauline Koch" "" "es")
(descr-as-in "Pauline Koch" "" "ja")
(descr-as-in "Pauline Koch" "" "zh-cn")
(descr-as-in "Pauline Koch" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Pauline Koch" "place-of-birth" "Q656982")

(refer-to ["properties.date_of_death"])
(fact claim "Pauline Koch" "date-of-death" "+1920-02-20T00:00:00Z")

(refer-to ["properties.ethnic_group"])
(refer-to ["clazzes.jewish_people"])
(fact claim "Pauline Koch" "ethnic-group" "Jewish people")

(refer-to ["properties.place_of_death"])
(refer-to ["clazzes.berlin"])
(fact claim "Pauline Koch" "place-of-death" "Berlin")

(refer-to ["properties.sex_or_gender"])
(fact claim "Pauline Koch" "sex-or-gender" "Q6581072")

(refer-to ["properties.father"])
(fact claim "Pauline Koch" "father" "Q1712755")

(refer-to ["properties.child"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Pauline Koch" "child" "Albert Einstein")
(refer-to ["clazzes.maja_einstein"])
(fact claim "Pauline Koch" "child" "Maja Einstein")

(refer-to ["properties.spouse"])
(refer-to ["clazzes.hermann_einstein"])
(fact claim "Pauline Koch" "spouse" "Hermann Einstein")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Pauline Koch" "wikitree-person-id" "Koch-845")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Pauline Koch" "country-of-citizenship" "Q183")

(refer-to ["properties.sibling"])
(fact claim "Pauline Koch" "sibling" "Q30302248")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.human"])
(fact claim "Pauline Koch" "instance-of" "human")

(refer-to ["properties.given_name"])
(fact claim "Pauline Koch" "given-name" "Q18009833")

(refer-to ["properties.mother"])
(fact claim "Pauline Koch" "mother" "Q30283429")

(refer-to ["properties.image"])
(fact claim "Pauline Koch" "image" "Pauline Koch.jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Pauline Koch" "date-of-birth" "+1858-02-08T00:00:00Z")
