(ns properties.patron_saint
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "patron-saint")

(name-as-in "patron-saint" "主保聖人" "zh-hant")
(name-as-in "patron-saint" "主保圣人" "zh-hans")
(name-as-in "patron-saint" "святой покровитель" "ru")
(name-as-in "patron-saint" "santo padroeiro" "pt")
(name-as-in "patron-saint" "saint patron" "fr")
(name-as-in "patron-saint" "patrón" "es")
(name-as-in "patron-saint" "守護聖人" "ja")
(name-as-in "patron-saint" "Schutzpatron" "de")
(name-as-in "patron-saint" "patron saint" "en")

(descr-as-in "patron-saint" "" "zh-hant")
(descr-as-in "patron-saint" "" "zh-hans")
(descr-as-in "patron-saint" "" "ru")
(descr-as-in "patron-saint" "santo padroeiro de uma localidade" "pt")
(descr-as-in "patron-saint" "saint patron d'une ville ou d'un village" "fr")
(descr-as-in "patron-saint" "santo patrón de una ciudad o pueblo" "es")
(descr-as-in "patron-saint" "この都市または町の守護聖人" "ja")
(descr-as-in "patron-saint" "Schutzpatron einer Stadt, eines Ortes, einer Berufsgruppe" "de")
(descr-as-in "patron-saint" "patron saint adopted by the subject" "en")

