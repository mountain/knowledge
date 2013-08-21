(ns entities.eduard_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Eduard Einstein")

(name-as-in "Eduard Einstein" "Eduard Einstein" "de")
(name-as-in "Eduard Einstein" "" "zh-hk")
(name-as-in "Eduard Einstein" "" "zh-tw")
(name-as-in "Eduard Einstein" "" "ru")
(name-as-in "Eduard Einstein" "Eduard Einstein" "pt")
(name-as-in "Eduard Einstein" "Eduard Einstein" "en")
(name-as-in "Eduard Einstein" "" "zh-cn")
(name-as-in "Eduard Einstein" "Eduard Einstein" "fr")
(name-as-in "Eduard Einstein" "Eduard Einstein" "es")
(name-as-in "Eduard Einstein" "" "zh-sg")
(name-as-in "Eduard Einstein" "エドゥアルト・アインシュタイン" "ja")
(name-as-in "Eduard Einstein" "" "zh-hans")
(name-as-in "Eduard Einstein" "" "zh-hant")

(descr-as-in "Eduard Einstein" "Sohn Albert Einsteins" "de")
(descr-as-in "Eduard Einstein" "" "zh-hk")
(descr-as-in "Eduard Einstein" "" "zh-tw")
(descr-as-in "Eduard Einstein" "" "ru")
(descr-as-in "Eduard Einstein" "" "pt")
(descr-as-in "Eduard Einstein" "" "en")
(descr-as-in "Eduard Einstein" "" "zh-cn")
(descr-as-in "Eduard Einstein" "fils du physicien allemand Albert Einstein" "fr")
(descr-as-in "Eduard Einstein" "" "es")
(descr-as-in "Eduard Einstein" "" "zh-sg")
(descr-as-in "Eduard Einstein" "" "ja")
(descr-as-in "Eduard Einstein" "" "zh-hans")
(descr-as-in "Eduard Einstein" "" "zh-hant")


(refer-to ["properties.lccn_identifier"])
(fact claim "Eduard Einstein" "lccn-identifier" "n85254722")

(refer-to ["properties.isni_iso_27729"])
(fact claim "Eduard Einstein" "isni-iso-27729" "0000 0000 2893 5490")

(refer-to ["properties.native_language"])
(refer-to ["clazzes.german"])
(fact claim "Eduard Einstein" "native-language" "German")

(refer-to ["properties.viaf_identifier"])
(fact claim "Eduard Einstein" "viaf-identifier" "42634344")

(refer-to ["properties.brother"])
(refer-to ["entities.hans_albert_einstein"])
(fact claim "Eduard Einstein" "brother" "Hans Albert Einstein")

(refer-to ["properties.gnd_identifier"])
(fact claim "Eduard Einstein" "gnd-identifier" "118810928")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Eduard Einstein" "main-type-gnd" "person")

(refer-to ["properties.sister"])
(refer-to ["entities.lieserl_einstein"])
(fact claim "Eduard Einstein" "sister" "Lieserl Einstein")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.zurich"])
(fact claim "Eduard Einstein" "place-of-death" "Zurich")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Eduard Einstein" "sex" "male")

(refer-to ["properties.father"])
(refer-to ["entities.albert_einstein"])
(fact claim "Eduard Einstein" "father" "Albert Einstein")

(refer-to ["properties.mother"])
(refer-to ["entities.mileva_marić"])
(fact claim "Eduard Einstein" "mother" "Mileva Marić")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.switzerland"])
(fact claim "Eduard Einstein" "country-of-citizenship" "Switzerland")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.zurich"])
(fact claim "Eduard Einstein" "place-of-birth" "Zurich")
