(ns properties.iso_3166_1_alpha_3
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-3166-1-alpha-3")

(name-as-in "iso-3166-1-alpha-3" "國家代碼 (ISO 3166-1 alpha-3)" "zh-hant")
(name-as-in "iso-3166-1-alpha-3" "国家代码 (ISO 3166-1 alpha-3)" "zh-hans")
(name-as-in "iso-3166-1-alpha-3" "ISO 3166-1 alpha-3" "ru")
(name-as-in "iso-3166-1-alpha-3" "ISO 3166-1 alfa-3" "pt")
(name-as-in "iso-3166-1-alpha-3" "code ISO 3166-1 alpha-3" "fr")
(name-as-in "iso-3166-1-alpha-3" "código ISO 3166-1 de tres letras" "es")
(name-as-in "iso-3166-1-alpha-3" "国名コード (ISO 3166-1 alpha-3)" "ja")
(name-as-in "iso-3166-1-alpha-3" "Ländercode (ISO 3166-1 alpha-3)" "de")
(name-as-in "iso-3166-1-alpha-3" "ISO 3166-1 alpha-3" "en")

(descr-as-in "iso-3166-1-alpha-3" "含三位字母的 ISO 3166-1 國家代碼" "zh-hant")
(descr-as-in "iso-3166-1-alpha-3" "含三位字母的 ISO 3166-1 国家代码" "zh-hans")
(descr-as-in "iso-3166-1-alpha-3" "" "ru")
(descr-as-in "iso-3166-1-alpha-3" "código do país (ISO 3166-1 de três letras)" "pt")
(descr-as-in "iso-3166-1-alpha-3" "code à 3 lettres du pays" "fr")
(descr-as-in "iso-3166-1-alpha-3" "" "es")
(descr-as-in "iso-3166-1-alpha-3" "ISO 3166-1 3文字コード" "ja")
(descr-as-in "iso-3166-1-alpha-3" "dreibuchstabiger ISO-3166-1-Ländercode" "de")
(descr-as-in "iso-3166-1-alpha-3" "country code in three-letter format per ISO 3166-1" "en")

