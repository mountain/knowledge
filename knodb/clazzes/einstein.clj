(ns clazzes.einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Einstein")

(name-as-in "Einstein" "" "zh-hk")
(name-as-in "Einstein" "Einstein" "pt")
(name-as-in "Einstein" "Einstein" "en")
(name-as-in "Einstein" "Einstein" "fr")
(name-as-in "Einstein" "" "zh-tw")
(name-as-in "Einstein" "Einstein" "de")
(name-as-in "Einstein" "Эйнштейн" "ru")
(name-as-in "Einstein" "Einstein" "es")
(name-as-in "Einstein" "" "ja")
(name-as-in "Einstein" "" "zh-cn")
(name-as-in "Einstein" "" "zh-sg")

(descr-as-in "Einstein" "姓氏" "zh-hk")
(descr-as-in "Einstein" "sobrenome" "pt")
(descr-as-in "Einstein" "family name" "en")
(descr-as-in "Einstein" "nom de famille" "fr")
(descr-as-in "Einstein" "姓氏" "zh-tw")
(descr-as-in "Einstein" "Familienname" "de")
(descr-as-in "Einstein" "фамилия" "ru")
(descr-as-in "Einstein" "apellido" "es")
(descr-as-in "Einstein" "姓" "ja")
(descr-as-in "Einstein" "姓氏" "zh-cn")
(descr-as-in "Einstein" "姓氏" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Einstein" "instance-of" "Q101352")

(refer-to ["properties.different_from"])
(fact claim "Einstein" "different-from" "Q214395")

(refer-to ["properties.native_label"])
(fact claim "Einstein" "native-label" "monolingualtext")

(refer-to ["properties.language_of_work_or_name"])
(refer-to ["clazzes.german"])
(fact claim "Einstein" "language-of-work-or-name" "German")

(refer-to ["properties.writing_system"])
(fact claim "Einstein" "writing-system" "Q8229")

(refer-to ["properties.soundex"])
(fact claim "Einstein" "soundex" "E523")

(refer-to ["properties.cologne_phonetics"])
(fact claim "Einstein" "cologne-phonetics" "06826")

(refer-to ["properties.caverphone"])
(fact claim "Einstein" "caverphone" "ANSTN1")
