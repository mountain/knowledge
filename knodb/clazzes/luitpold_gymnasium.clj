(ns clazzes.luitpold_gymnasium
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Luitpold-Gymnasium")

(name-as-in "Luitpold-Gymnasium" "" "zh-hk")
(name-as-in "Luitpold-Gymnasium" "" "pt")
(name-as-in "Luitpold-Gymnasium" "Luitpold-Gymnasium" "en")
(name-as-in "Luitpold-Gymnasium" "" "fr")
(name-as-in "Luitpold-Gymnasium" "" "zh-tw")
(name-as-in "Luitpold-Gymnasium" "Luitpold-Gymnasium" "de")
(name-as-in "Luitpold-Gymnasium" "" "ru")
(name-as-in "Luitpold-Gymnasium" "" "es")
(name-as-in "Luitpold-Gymnasium" "" "ja")
(name-as-in "Luitpold-Gymnasium" "" "zh-cn")
(name-as-in "Luitpold-Gymnasium" "" "zh-sg")

(descr-as-in "Luitpold-Gymnasium" "" "zh-hk")
(descr-as-in "Luitpold-Gymnasium" "" "pt")
(descr-as-in "Luitpold-Gymnasium" "former high school in Munich, today Albert-Einstein-Gymnasium" "en")
(descr-as-in "Luitpold-Gymnasium" "" "fr")
(descr-as-in "Luitpold-Gymnasium" "" "zh-tw")
(descr-as-in "Luitpold-Gymnasium" "ehemaliges Gymnasium in München, heute Albert-Einstein-Gymnasium" "de")
(descr-as-in "Luitpold-Gymnasium" "" "ru")
(descr-as-in "Luitpold-Gymnasium" "" "es")
(descr-as-in "Luitpold-Gymnasium" "" "ja")
(descr-as-in "Luitpold-Gymnasium" "" "zh-cn")
(descr-as-in "Luitpold-Gymnasium" "" "zh-sg")


(refer-to ["properties.coordinate_location"])
(fact claim "Luitpold-Gymnasium" "coordinate-location" "lng 11.5733 lat 48.132 alt ")

(refer-to ["properties.country"])
(fact claim "Luitpold-Gymnasium" "country" "Q183")

(refer-to ["properties.instance_of"])
(fact claim "Luitpold-Gymnasium" "instance-of" "Q3914")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Luitpold-Gymnasium" "located-in-the-administrative-territorial-entity" "Q1726")

(refer-to ["properties.inception"])
(fact claim "Luitpold-Gymnasium" "inception" "+1887-00-00T00:00:00Z")

(refer-to ["properties.student"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Luitpold-Gymnasium" "student" "Albert Einstein")
(fact claim "Luitpold-Gymnasium" "student" "Q44054")
(fact claim "Luitpold-Gymnasium" "student" "Q2061116")
(fact claim "Luitpold-Gymnasium" "student" "Q1127846")

(refer-to ["properties.gnd_id"])
(fact claim "Luitpold-Gymnasium" "gnd-id" "4503718-8")

(refer-to ["properties.viaf_id"])
(fact claim "Luitpold-Gymnasium" "viaf-id" "1532145424733386830185")
