(ns clazzes.maja_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Maja Einstein")

(name-as-in "Maja Einstein" "" "zh-hk")
(name-as-in "Maja Einstein" "Maja Einstein" "pt")
(name-as-in "Maja Einstein" "Maja Einstein" "en")
(name-as-in "Maja Einstein" "Maja Einstein" "fr")
(name-as-in "Maja Einstein" "" "zh-tw")
(name-as-in "Maja Einstein" "Maja Einstein" "de")
(name-as-in "Maja Einstein" "Майя Эйнштейн" "ru")
(name-as-in "Maja Einstein" "Maja Einstein" "es")
(name-as-in "Maja Einstein" "" "ja")
(name-as-in "Maja Einstein" "" "zh-cn")
(name-as-in "Maja Einstein" "" "zh-sg")

(descr-as-in "Maja Einstein" "" "zh-hk")
(descr-as-in "Maja Einstein" "" "pt")
(descr-as-in "Maja Einstein" "" "en")
(descr-as-in "Maja Einstein" "soeur d'Albert Einstein" "fr")
(descr-as-in "Maja Einstein" "" "zh-tw")
(descr-as-in "Maja Einstein" "deutsche Romanistin, Schwester von Albert Einstein" "de")
(descr-as-in "Maja Einstein" "" "ru")
(descr-as-in "Maja Einstein" "" "es")
(descr-as-in "Maja Einstein" "" "ja")
(descr-as-in "Maja Einstein" "" "zh-cn")
(descr-as-in "Maja Einstein" "" "zh-sg")


(refer-to ["properties.commons_category"])
(refer-to ["clazzes.maja_einstein"])
(fact claim "Maja Einstein" "commons-category" "Maja Einstein")

(refer-to ["properties.place_of_birth"])
(fact claim "Maja Einstein" "place-of-birth" "Q1726")

(refer-to ["properties.date_of_death"])
(fact claim "Maja Einstein" "date-of-death" "+1951-06-25T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Maja Einstein" "viaf-id" "27847852")

(refer-to ["properties.place_of_death"])
(refer-to ["clazzes.princeton"])
(fact claim "Maja Einstein" "place-of-death" "Princeton")

(refer-to ["properties.sex_or_gender"])
(fact claim "Maja Einstein" "sex-or-gender" "Q6581072")

(refer-to ["properties.father"])
(refer-to ["clazzes.hermann_einstein"])
(fact claim "Maja Einstein" "father" "Hermann Einstein")

(refer-to ["properties.bnf_id"])
(fact claim "Maja Einstein" "bnf-id" "15114268c")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Maja Einstein" "national-library-of-israel-id" "000210181")

(refer-to ["properties.fast_id"])
(fact claim "Maja Einstein" "fast-id" "1630179")

(refer-to ["properties.occupation"])
(fact claim "Maja Einstein" "occupation" "Q2504617")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Maja Einstein" "wikitree-person-id" "Einstein-38")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Maja Einstein" "country-of-citizenship" "Q183")

(refer-to ["properties.isni"])
(fact claim "Maja Einstein" "isni" "0000 0000 6676 0150")

(refer-to ["properties.sibling"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Maja Einstein" "sibling" "Albert Einstein")

(refer-to ["properties.gnd_id"])
(fact claim "Maja Einstein" "gnd-id" "117408522")

(refer-to ["properties.instance_of"])
(fact claim "Maja Einstein" "instance-of" "Q5")

(refer-to ["properties.given_name"])
(fact claim "Maja Einstein" "given-name" "Q18184581")

(refer-to ["properties.mother"])
(fact claim "Maja Einstein" "mother" "Q4357787")

(refer-to ["properties.image"])
(fact claim "Maja Einstein" "image" "Maja Einstein.jpg")
(fact claim "Maja Einstein" "image" "Maja Einstein 1900s.jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Maja Einstein" "date-of-birth" "+1881-11-18T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Maja Einstein" "library-of-congress-authority-id" "n2005090981")
