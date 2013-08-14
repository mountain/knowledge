(ns properties.postal_code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "postal-code")

(name-as-in "postal-code" "郵政編碼" "zh-hant")
(name-as-in "postal-code" "邮政编码" "zh-hans")
(name-as-in "postal-code" "почтовый индекс" "ru")
(name-as-in "postal-code" "código postal" "pt")
(name-as-in "postal-code" "code postal" "fr")
(name-as-in "postal-code" "código postal" "es")
(name-as-in "postal-code" "郵便番号" "ja")
(name-as-in "postal-code" "Postleitzahl" "de")
(name-as-in "postal-code" "postal code" "en")

(descr-as-in "postal-code" "" "zh-hant")
(descr-as-in "postal-code" "" "zh-hans")
(descr-as-in "postal-code" "" "ru")
(descr-as-in "postal-code" "" "pt")
(descr-as-in "postal-code" "code postal/ZIP d'une entité dans le format spécifique d'un pays" "fr")
(descr-as-in "postal-code" "" "es")
(descr-as-in "postal-code" "この項目の郵便番号（地域毎に形式が異なる）" "ja")
(descr-as-in "postal-code" "Postleitzahl einer Adresse in jeweils landesspezifischem Format" "de")
(descr-as-in "postal-code" "local code assigned by postal authorities for the subject area" "en")

