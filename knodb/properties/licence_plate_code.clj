(ns properties.licence_plate_code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "licence-plate-code")

(name-as-in "licence-plate-code" "牌照代碼" "zh-hant")
(name-as-in "licence-plate-code" "牌照代码" "zh-hans")
(name-as-in "licence-plate-code" "код номерного знака" "ru")
(name-as-in "licence-plate-code" "código de matrícula" "pt")
(name-as-in "licence-plate-code" "plaque d'immatriculation" "fr")
(name-as-in "licence-plate-code" "código de matrícula" "es")
(name-as-in "licence-plate-code" "ナンバープレート・コード" "ja")
(name-as-in "licence-plate-code" "Kfz-Kennzeichen" "de")
(name-as-in "licence-plate-code" "licence plate code" "en")

(descr-as-in "licence-plate-code" "" "zh-hant")
(descr-as-in "licence-plate-code" "" "zh-hans")
(descr-as-in "licence-plate-code" "" "ru")
(descr-as-in "licence-plate-code" "" "pt")
(descr-as-in "licence-plate-code" "Pour les pays : code d'immatriculation du pays ou marquage du véhicule dans le trafic international. Pour les autres entités : signes distinctif ou partie de la plaque d'immatriculation associée à l'entité." "fr")
(descr-as-in "licence-plate-code" "" "es")
(descr-as-in "licence-plate-code" "" "ja")
(descr-as-in "licence-plate-code" "international: Kfz-Nationalitätszeichen oder Kennzeichnung für Fahrzeuge in internationalem Verkehr. Innerstaatlich: Unterscheidungszeichen für den Verwaltungsbezirk" "de")
(descr-as-in "licence-plate-code" "distinguishing signs or parts of license plate associated with the subject. For countries: international licence plate country code or distinguishing sign of vehicles" "en")

