(ns clazzes.copley_medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Copley Medal")

(name-as-in "Copley Medal" "科普利獎章" "zh-hant")
(name-as-in "Copley Medal" "科普利奖章" "zh-hans")
(name-as-in "Copley Medal" "Медаль Копли" "ru")
(name-as-in "Copley Medal" "Medalha Copley" "pt")
(name-as-in "Copley Medal" "Médaille Copley" "fr")
(name-as-in "Copley Medal" "Medalla Copley" "es")
(name-as-in "Copley Medal" "コプリ・メダル" "ja")
(name-as-in "Copley Medal" "Copley Medal" "de")
(name-as-in "Copley Medal" "Copley Medal" "en")

(descr-as-in "Copley Medal" "" "zh-hant")
(descr-as-in "Copley Medal" "" "zh-hans")
(descr-as-in "Copley Medal" "" "ru")
(descr-as-in "Copley Medal" "" "pt")
(descr-as-in "Copley Medal" "" "fr")
(descr-as-in "Copley Medal" "premio que otorga la Real Sociedad de Londres a una persona física como el mayor reconocimiento al trabajo científico por sus logros sobresalientes en cualquiera de las ciencias físicas o biológicas" "es")
(descr-as-in "Copley Medal" "" "ja")
(descr-as-in "Copley Medal" "" "de")
(descr-as-in "Copley Medal" "award given by the Royal Society of London" "en")


(refer-to ["properties.named_after"])
(refer-to ["entities.sir_godfrey_copley_2nd_baronet"])
(fact claim "Copley Medal" "named-after" "Sir Godfrey Copley, 2nd Baronet")
