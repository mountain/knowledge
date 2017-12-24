(ns clazzes.lieserl_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Lieserl Einstein")

(name-as-in "Lieserl Einstein" "" "zh-hk")
(name-as-in "Lieserl Einstein" "Lieserl Einstein" "pt")
(name-as-in "Lieserl Einstein" "Lieserl Einstein" "en")
(name-as-in "Lieserl Einstein" "Lieserl Einstein" "fr")
(name-as-in "Lieserl Einstein" "" "zh-tw")
(name-as-in "Lieserl Einstein" "Lieserl Marić" "de")
(name-as-in "Lieserl Einstein" "Лизерл Эйнштейн" "ru")
(name-as-in "Lieserl Einstein" "Lieserl Einstein" "es")
(name-as-in "Lieserl Einstein" "" "ja")
(name-as-in "Lieserl Einstein" "" "zh-cn")
(name-as-in "Lieserl Einstein" "" "zh-sg")

(descr-as-in "Lieserl Einstein" "" "zh-hk")
(descr-as-in "Lieserl Einstein" "" "pt")
(descr-as-in "Lieserl Einstein" "daughter of Albert Einstein" "en")
(descr-as-in "Lieserl Einstein" "fille d'Albert Einstein" "fr")
(descr-as-in "Lieserl Einstein" "" "zh-tw")
(descr-as-in "Lieserl Einstein" "uneheliches Kind von Albert Einstein" "de")
(descr-as-in "Lieserl Einstein" "дочь Альберта Эйнштейна" "ru")
(descr-as-in "Lieserl Einstein" "" "es")
(descr-as-in "Lieserl Einstein" "" "ja")
(descr-as-in "Lieserl Einstein" "" "zh-cn")
(descr-as-in "Lieserl Einstein" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Lieserl Einstein" "place-of-birth" "Q55630")

(refer-to ["properties.date_of_death"])
(fact claim "Lieserl Einstein" "date-of-death" "+1903-09-00T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Lieserl Einstein" "viaf-id" "63318102")

(refer-to ["properties.place_of_death"])
(fact claim "Lieserl Einstein" "place-of-death" "")

(refer-to ["properties.sex_or_gender"])
(fact claim "Lieserl Einstein" "sex-or-gender" "Q6581072")

(refer-to ["properties.father"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Lieserl Einstein" "father" "Albert Einstein")

(refer-to ["properties.family"])
(fact claim "Lieserl Einstein" "family" "Q3292175")

(refer-to ["properties.freebase_id"])
(fact claim "Lieserl Einstein" "freebase-id" "/m/07npgc")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Lieserl Einstein" "wikitree-person-id" "Einstein-41")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Lieserl Einstein" "country-of-citizenship" "Q403")
(fact claim "Lieserl Einstein" "country-of-citizenship" "Q28513")

(refer-to ["properties.isni"])
(fact claim "Lieserl Einstein" "isni" "0000 0000 7865 8612")

(refer-to ["properties.sibling"])
(refer-to ["clazzes.eduard_einstein"])
(fact claim "Lieserl Einstein" "sibling" "Eduard Einstein")
(refer-to ["clazzes.hans_albert_einstein"])
(fact claim "Lieserl Einstein" "sibling" "Hans Albert Einstein")

(refer-to ["properties.gnd_id"])
(fact claim "Lieserl Einstein" "gnd-id" "12174406X")

(refer-to ["properties.genealogics_org_person_id"])
(fact claim "Lieserl Einstein" "genealogics_org-person-id" "I00545771")

(refer-to ["properties.instance_of"])
(fact claim "Lieserl Einstein" "instance-of" "Q5")

(refer-to ["properties.family_name"])
(fact claim "Lieserl Einstein" "family-name" "Q21449580")

(refer-to ["properties.mother"])
(fact claim "Lieserl Einstein" "mother" "Q76346")

(refer-to ["properties.date_of_birth"])
(fact claim "Lieserl Einstein" "date-of-birth" "+1902-01-01T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Lieserl Einstein" "library-of-congress-authority-id" "n98016491")
