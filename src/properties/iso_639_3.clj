(ns properties.iso_639_3
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-639-3")

(name-as-in "iso-639-3" "" "zh-hant")
(name-as-in "iso-639-3" "" "zh-hans")
(name-as-in "iso-639-3" "код ISO 639-3" "ru")
(name-as-in "iso-639-3" "ISO 639-3" "pt")
(name-as-in "iso-639-3" "ISO 639-3" "fr")
(name-as-in "iso-639-3" "ISO 639-3" "es")
(name-as-in "iso-639-3" "ISO 639-3" "ja")
(name-as-in "iso-639-3" "ISO 639-3" "de")
(name-as-in "iso-639-3" "ISO 639-3" "en")

(descr-as-in "iso-639-3" "" "zh-hant")
(descr-as-in "iso-639-3" "" "zh-hans")
(descr-as-in "iso-639-3" "трехбуквенный код языка" "ru")
(descr-as-in "iso-639-3" "código ISO 639-3 para linguagens" "pt")
(descr-as-in "iso-639-3" "code ISO 639-3 d'une langue" "fr")
(descr-as-in "iso-639-3" "" "es")
(descr-as-in "iso-639-3" "その言語のISO 639-3 コード" "ja")
(descr-as-in "iso-639-3" "Kennung für Namen von Sprachen von der Internationalen Organisation für Normung" "de")
(descr-as-in "iso-639-3" "ISO 639-3 code for a language" "en")

