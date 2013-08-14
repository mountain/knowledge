(ns properties.award-received
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "award-received")

(name-as-in "award-received" "獎項" "zh-hant")
(name-as-in "award-received" "奖项" "zh-hans")
(name-as-in "award-received" "полученные награды" "ru")
(name-as-in "award-received" "prémios" "pt")
(name-as-in "award-received" "distinction" "fr")
(name-as-in "award-received" "premio recibido" "es")
(name-as-in "award-received" "受賞" "ja")
(name-as-in "award-received" "Auszeichnung" "de")
(name-as-in "award-received" "award received" "en")

(descr-as-in "award-received" "人物、機構或作品所獲的獎項" "zh-hant")
(descr-as-in "award-received" "人物、机构或作品所获的奖项" "zh-hans")
(descr-as-in "award-received" "награды, полученные персоной, организацией или произведением" "ru")
(descr-as-in "award-received" "prémios com que a pessoa, organização ou obra foi agraciada" "pt")
(descr-as-in "award-received" "récompenses reçues par une personne, une organisation ou une œuvre" "fr")
(descr-as-in "award-received" "premio o reconocimiento recibido por una persona, organización u obra creativa" "es")
(descr-as-in "award-received" "" "ja")
(descr-as-in "award-received" "Auszeichnung einer Person, Organisation oder eines schöpferichen Werks" "de")
(descr-as-in "award-received" "award or recognition received by a person, organisation or creative work" "en")

