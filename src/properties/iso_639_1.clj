(ns properties.iso_639_1
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-639-1")

(name-as-in "iso-639-1" "" "zh-hant")
(name-as-in "iso-639-1" "ISO 639-1" "zh-hans")
(name-as-in "iso-639-1" "код ISO 639-1" "ru")
(name-as-in "iso-639-1" "ISO 639-1" "pt")
(name-as-in "iso-639-1" "ISO 639-1" "fr")
(name-as-in "iso-639-1" "ISO 639-1" "es")
(name-as-in "iso-639-1" "ISO 639-1" "ja")
(name-as-in "iso-639-1" "ISO 639-1" "de")
(name-as-in "iso-639-1" "ISO 639-1" "en")

(descr-as-in "iso-639-1" "" "zh-hant")
(descr-as-in "iso-639-1" "一个语言的ISO 639-1码" "zh-hans")
(descr-as-in "iso-639-1" "двухбуквенный код языка" "ru")
(descr-as-in "iso-639-1" "" "pt")
(descr-as-in "iso-639-1" "code ISO 639-1 d'une langue" "fr")
(descr-as-in "iso-639-1" "" "es")
(descr-as-in "iso-639-1" "その言語のISO 639-1 コード" "ja")
(descr-as-in "iso-639-1" "Kennung für Namen von Sprachen von der Internationalen Organisation für Normung" "de")
(descr-as-in "iso-639-1" "language code per ISO 639-1" "en")

