(ns entities.luitpold_gymnasium
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Organization "Luitpold Gymnasium")

(name-as-in "Luitpold Gymnasium" "" "zh-hant")
(name-as-in "Luitpold Gymnasium" "" "zh-hans")
(name-as-in "Luitpold Gymnasium" "Luitpold Gymnasium" "ru")
(name-as-in "Luitpold Gymnasium" "" "pt")
(name-as-in "Luitpold Gymnasium" "Luitpold Gymnasium" "fr")
(name-as-in "Luitpold Gymnasium" "" "es")
(name-as-in "Luitpold Gymnasium" "" "ja")
(name-as-in "Luitpold Gymnasium" "Staatliches Luitpold-Gymnasium München" "de")
(name-as-in "Luitpold Gymnasium" "Luitpold Gymnasium" "en")

(descr-as-in "Luitpold Gymnasium" "" "zh-hant")
(descr-as-in "Luitpold Gymnasium" "" "zh-hans")
(descr-as-in "Luitpold Gymnasium" "гимназия в Мюнхене" "ru")
(descr-as-in "Luitpold Gymnasium" "" "pt")
(descr-as-in "Luitpold Gymnasium" "" "fr")
(descr-as-in "Luitpold Gymnasium" "" "es")
(descr-as-in "Luitpold Gymnasium" "" "ja")
(descr-as-in "Luitpold Gymnasium" "" "de")
(descr-as-in "Luitpold Gymnasium" "" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.organization"])
(fact claim "Luitpold Gymnasium" "main-type-gnd" "organization")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.gymnasium"])
(fact claim "Luitpold Gymnasium" "instance-of" "gymnasium")
