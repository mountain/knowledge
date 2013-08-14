(ns properties.iso-639-2
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-639-2")

(name-as-in "iso-639-2" "ISO 639-2" "zh-hant")
(name-as-in "iso-639-2" "ISO 639-2" "zh-hans")
(name-as-in "iso-639-2" "код ISO 639-2" "ru")
(name-as-in "iso-639-2" "ISO 639-2" "pt")
(name-as-in "iso-639-2" "ISO 639-2" "fr")
(name-as-in "iso-639-2" "ISO 639-2" "es")
(name-as-in "iso-639-2" "ISO 639-2" "ja")
(name-as-in "iso-639-2" "ISO 639-2" "de")
(name-as-in "iso-639-2" "ISO 639-2" "en")

(descr-as-in "iso-639-2" "" "zh-hant")
(descr-as-in "iso-639-2" "一个语言的ISO 639-2码" "zh-hans")
(descr-as-in "iso-639-2" "трёхбуквенный код языка" "ru")
(descr-as-in "iso-639-2" "" "pt")
(descr-as-in "iso-639-2" "code ISO 639-2 d'une langue" "fr")
(descr-as-in "iso-639-2" "" "es")
(descr-as-in "iso-639-2" "その言語のISO 639-2 コード" "ja")
(descr-as-in "iso-639-2" "Kennung für Namen von Sprachen von der Internationalen Organisation für Normung" "de")
(descr-as-in "iso-639-2" "ISO 639-2 code for a language" "en")

