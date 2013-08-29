(ns properties.iso_3166_2
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-3166-2")

(name-as-in "iso-3166-2" "ISO 3166-2" "zh-hant")
(name-as-in "iso-3166-2" "ISO 3166-2" "zh-hans")
(name-as-in "iso-3166-2" "ISO 3166-2" "ru")
(name-as-in "iso-3166-2" "ISO 3166-2" "pt")
(name-as-in "iso-3166-2" "ISO 3166-2" "fr")
(name-as-in "iso-3166-2" "ISO 3166-2" "es")
(name-as-in "iso-3166-2" "ISO 3166-2" "ja")
(name-as-in "iso-3166-2" "ISO 3166-2 Code" "de")
(name-as-in "iso-3166-2" "ISO 3166-2" "en")

(descr-as-in "iso-3166-2" "" "zh-hant")
(descr-as-in "iso-3166-2" "" "zh-hans")
(descr-as-in "iso-3166-2" "" "ru")
(descr-as-in "iso-3166-2" "" "pt")
(descr-as-in "iso-3166-2" "norme édictée par l'Organisation internationale de normalisation permettant de désigner les principales subdivisions administratives d'un pays par un code en quelques chiffres et/ou lettres complétant le code ISO 3166-1 du pays." "fr")
(descr-as-in "iso-3166-2" "código para este elemento en ISO 3166-2" "es")
(descr-as-in "iso-3166-2" "ISO 3166-2 におけるこの実体の一意なコード（国名コードを含む）" "ja")
(descr-as-in "iso-3166-2" "aus Ländercode und zwei bis dreistelligem alphanummerischem Code für subnationale Einheiten" "de")
(descr-as-in "iso-3166-2" "subdivision identification code per ISO 3166-2 (include country code)" "en")

