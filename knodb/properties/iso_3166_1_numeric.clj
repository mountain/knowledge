(ns properties.iso_3166_1_numeric
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "iso-3166-1-numeric")

(name-as-in "iso-3166-1-numeric" "國家代碼 (ISO 3166-1 numeric)" "zh-hant")
(name-as-in "iso-3166-1-numeric" "国家代码 (ISO 3166-1 numeric)" "zh-hans")
(name-as-in "iso-3166-1-numeric" "ISO 3166-1 цифровой" "ru")
(name-as-in "iso-3166-1-numeric" "ISO 3166-1 numérico" "pt")
(name-as-in "iso-3166-1-numeric" "ISO 3166-1 numérique" "fr")
(name-as-in "iso-3166-1-numeric" "código ISO 3166-1 numérico" "es")
(name-as-in "iso-3166-1-numeric" "ISO 3166-1 numeric" "ja")
(name-as-in "iso-3166-1-numeric" "Ländercode (ISO 3166-1 numerisch)" "de")
(name-as-in "iso-3166-1-numeric" "ISO 3166-1 numeric" "en")

(descr-as-in "iso-3166-1-numeric" "含三位數字的 ISO 3166-1 國家代碼" "zh-hant")
(descr-as-in "iso-3166-1-numeric" "含三位数字的 ISO 3166-1 国家代码" "zh-hans")
(descr-as-in "iso-3166-1-numeric" "" "ru")
(descr-as-in "iso-3166-1-numeric" "código do país (ISO 3166-1 numérico)" "pt")
(descr-as-in "iso-3166-1-numeric" "code numérique ISO du pays" "fr")
(descr-as-in "iso-3166-1-numeric" "" "es")
(descr-as-in "iso-3166-1-numeric" "ISO 3166-1 3桁コード" "ja")
(descr-as-in "iso-3166-1-numeric" "dreistelliger numerischer ISO-3166-1-Ländercode" "de")
(descr-as-in "iso-3166-1-numeric" "country code in numeric format per ISO 3166-1" "en")

