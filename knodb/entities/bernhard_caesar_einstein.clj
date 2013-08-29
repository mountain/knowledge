(ns entities.bernhard_caesar_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Bernhard Caesar Einstein")

(name-as-in "Bernhard Caesar Einstein" "Bernhard Caesar Einstein" "de")
(name-as-in "Bernhard Caesar Einstein" "" "zh-hk")
(name-as-in "Bernhard Caesar Einstein" "" "zh-tw")
(name-as-in "Bernhard Caesar Einstein" "" "ru")
(name-as-in "Bernhard Caesar Einstein" "Bernhard Caesar Einstein" "pt")
(name-as-in "Bernhard Caesar Einstein" "Bernhard Caesar Einstein" "en")
(name-as-in "Bernhard Caesar Einstein" "" "zh-cn")
(name-as-in "Bernhard Caesar Einstein" "Bernhard Caesar Einstein" "fr")
(name-as-in "Bernhard Caesar Einstein" "Bernhard Caesar Einstein" "es")
(name-as-in "Bernhard Caesar Einstein" "" "zh-sg")
(name-as-in "Bernhard Caesar Einstein" "" "ja")
(name-as-in "Bernhard Caesar Einstein" "" "zh-hans")
(name-as-in "Bernhard Caesar Einstein" "" "zh-hant")

(descr-as-in "Bernhard Caesar Einstein" "Ingenieur für Opto-Elektronik" "de")
(descr-as-in "Bernhard Caesar Einstein" "" "zh-hk")
(descr-as-in "Bernhard Caesar Einstein" "" "zh-tw")
(descr-as-in "Bernhard Caesar Einstein" "" "ru")
(descr-as-in "Bernhard Caesar Einstein" "" "pt")
(descr-as-in "Bernhard Caesar Einstein" "" "en")
(descr-as-in "Bernhard Caesar Einstein" "" "zh-cn")
(descr-as-in "Bernhard Caesar Einstein" "physicien américain" "fr")
(descr-as-in "Bernhard Caesar Einstein" "" "es")
(descr-as-in "Bernhard Caesar Einstein" "" "zh-sg")
(descr-as-in "Bernhard Caesar Einstein" "" "ja")
(descr-as-in "Bernhard Caesar Einstein" "" "zh-hans")
(descr-as-in "Bernhard Caesar Einstein" "" "zh-hant")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Bernhard Caesar Einstein" "main-type-gnd" "person")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Bernhard Caesar Einstein" "sex" "male")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.dortmund"])
(fact claim "Bernhard Caesar Einstein" "place-of-birth" "Dortmund")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.bern"])
(fact claim "Bernhard Caesar Einstein" "place-of-death" "Bern")

(refer-to ["properties.father"])
(refer-to ["entities.hans_albert_einstein"])
(fact claim "Bernhard Caesar Einstein" "father" "Hans Albert Einstein")

(refer-to ["properties.grandparent"])
(refer-to ["entities.albert_einstein"])
(fact claim "Bernhard Caesar Einstein" "grandparent" "Albert Einstein")
(refer-to ["entities.mileva_marić"])
(fact claim "Bernhard Caesar Einstein" "grandparent" "Mileva Marić")

(refer-to ["properties.image"])
(fact claim "Bernhard Caesar Einstein" "image" "Bernard Einstein .jpg")

(refer-to ["properties.signature"])
(fact claim "Bernhard Caesar Einstein" "signature" "BernardEinstein.png")
