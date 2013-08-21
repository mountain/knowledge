(ns entities.hans_albert_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Hans Albert Einstein")

(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "de")
(name-as-in "Hans Albert Einstein" "漢斯·阿爾伯特·愛因斯坦" "zh-hk")
(name-as-in "Hans Albert Einstein" "漢斯·阿爾伯特·愛因斯坦" "zh-tw")
(name-as-in "Hans Albert Einstein" "" "ru")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "pt")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "en")
(name-as-in "Hans Albert Einstein" "汉斯·阿尔伯特·爱因斯坦" "zh-cn")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "fr")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "es")
(name-as-in "Hans Albert Einstein" "汉斯·阿尔伯特·爱因斯坦" "zh-sg")
(name-as-in "Hans Albert Einstein" "ハンス・アルベルト・アインシュタイン" "ja")
(name-as-in "Hans Albert Einstein" "汉斯·阿尔伯特·爱因斯坦" "zh-hans")
(name-as-in "Hans Albert Einstein" "漢斯·阿爾伯特·愛因斯坦" "zh-hant")

(descr-as-in "Hans Albert Einstein" "Professor für Hydraulik und Sohn Albert Einsteins" "de")
(descr-as-in "Hans Albert Einstein" "" "zh-hk")
(descr-as-in "Hans Albert Einstein" "" "zh-tw")
(descr-as-in "Hans Albert Einstein" "" "ru")
(descr-as-in "Hans Albert Einstein" "" "pt")
(descr-as-in "Hans Albert Einstein" "" "en")
(descr-as-in "Hans Albert Einstein" "" "zh-cn")
(descr-as-in "Hans Albert Einstein" "" "fr")
(descr-as-in "Hans Albert Einstein" "" "es")
(descr-as-in "Hans Albert Einstein" "" "zh-sg")
(descr-as-in "Hans Albert Einstein" "" "ja")
(descr-as-in "Hans Albert Einstein" "" "zh-hans")
(descr-as-in "Hans Albert Einstein" "" "zh-hant")


(refer-to ["properties.lccn_identifier"])
(fact claim "Hans Albert Einstein" "lccn-identifier" "n85802437")

(refer-to ["properties.isni_iso_27729"])
(fact claim "Hans Albert Einstein" "isni-iso-27729" "0000 0001 0982 7635")

(refer-to ["properties.native_language"])
(refer-to ["clazzes.german"])
(fact claim "Hans Albert Einstein" "native-language" "German")

(refer-to ["properties.viaf_identifier"])
(fact claim "Hans Albert Einstein" "viaf-identifier" "67420636")

(refer-to ["properties.brother"])
(refer-to ["entities.eduard_einstein"])
(fact claim "Hans Albert Einstein" "brother" "Eduard Einstein")

(refer-to ["properties.gnd_identifier"])
(fact claim "Hans Albert Einstein" "gnd-identifier" "143075845")

(refer-to ["properties.date_of_birth"])
(fact claim "Hans Albert Einstein" "date-of-birth" "+00000001904-05-14T00:00:00Z")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Hans Albert Einstein" "main-type-gnd" "person")

(refer-to ["properties.sister"])
(refer-to ["entities.lieserl_einstein"])
(fact claim "Hans Albert Einstein" "sister" "Lieserl Einstein")

(refer-to ["properties.mathematics_genealogy_project_identifier"])
(fact claim "Hans Albert Einstein" "mathematics-genealogy-project-identifier" "30930")

(refer-to ["properties.child"])
(refer-to ["entities.bernhard_caesar_einstein"])
(fact claim "Hans Albert Einstein" "child" "Bernhard Caesar Einstein")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.woods_hole_massachusetts"])
(fact claim "Hans Albert Einstein" "place-of-death" "Woods Hole, Massachusetts")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Hans Albert Einstein" "sex" "male")

(refer-to ["properties.father"])
(refer-to ["entities.albert_einstein"])
(fact claim "Hans Albert Einstein" "father" "Albert Einstein")

(refer-to ["properties.mother"])
(refer-to ["entities.mileva_marić"])
(fact claim "Hans Albert Einstein" "mother" "Mileva Marić")

(refer-to ["properties.alma_mater"])
(refer-to ["entities.eth_zurich"])
(fact claim "Hans Albert Einstein" "alma-mater" "ETH Zurich")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.switzerland"])
(fact claim "Hans Albert Einstein" "country-of-citizenship" "Switzerland")
(refer-to ["entities.united_states_of_america"])
(fact claim "Hans Albert Einstein" "country-of-citizenship" "United States of America")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.zurich"])
(fact claim "Hans Albert Einstein" "place-of-birth" "Zurich")
(refer-to ["entities.bern"])
(fact claim "Hans Albert Einstein" "place-of-birth" "Bern")

(refer-to ["properties.date_of_death"])
(fact claim "Hans Albert Einstein" "date-of-death" "+00000001973-07-26T00:00:00Z")
