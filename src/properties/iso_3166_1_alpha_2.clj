(ns properties.iso_3166_1_alpha_2
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-3166-1-alpha-2")

(name-as-in "iso-3166-1-alpha-2" "國家代碼 (ISO 3166-1 alpha-2)" "zh-hant")
(name-as-in "iso-3166-1-alpha-2" "国家代码 (ISO 3166-1 alpha-2)" "zh-hans")
(name-as-in "iso-3166-1-alpha-2" "ISO 3166-1 alpha-2" "ru")
(name-as-in "iso-3166-1-alpha-2" "ISO 3166-1 alfa-2" "pt")
(name-as-in "iso-3166-1-alpha-2" "code ISO 3166-1 alpha-2 du pays" "fr")
(name-as-in "iso-3166-1-alpha-2" "código ISO 3166-1 de dos letras" "es")
(name-as-in "iso-3166-1-alpha-2" "国名コード (ISO 3166-1 alpha-2)" "ja")
(name-as-in "iso-3166-1-alpha-2" "Ländercode (ISO 3166-1 alpha-2)" "de")
(name-as-in "iso-3166-1-alpha-2" "ISO 3166-1 alpha-2" "en")

(descr-as-in "iso-3166-1-alpha-2" "含二位字母的 ISO 3166-1 國家代碼" "zh-hant")
(descr-as-in "iso-3166-1-alpha-2" "含二位字母的 ISO 3166-1 国家代码" "zh-hans")
(descr-as-in "iso-3166-1-alpha-2" "" "ru")
(descr-as-in "iso-3166-1-alpha-2" "código do país (ISO 3166-1 de duas letras)" "pt")
(descr-as-in "iso-3166-1-alpha-2" "code ISO à 2 lettres du pays" "fr")
(descr-as-in "iso-3166-1-alpha-2" "" "es")
(descr-as-in "iso-3166-1-alpha-2" "項目におけるISO 3166-1 alpha-2コード" "ja")
(descr-as-in "iso-3166-1-alpha-2" "zweibuchstabiger ISO-3166-1 alpha-2 -Ländercode" "de")
(descr-as-in "iso-3166-1-alpha-2" "country code in two-letter format per ISO 3166-1" "en")

