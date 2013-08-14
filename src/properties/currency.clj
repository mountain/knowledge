(ns properties.currency
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "currency")

(name-as-in "currency" "貨幣" "zh-hant")
(name-as-in "currency" "货币" "zh-hans")
(name-as-in "currency" "валюта" "ru")
(name-as-in "currency" "moeda" "pt")
(name-as-in "currency" "monnaie" "fr")
(name-as-in "currency" "moneda" "es")
(name-as-in "currency" "通貨" "ja")
(name-as-in "currency" "Währung" "de")
(name-as-in "currency" "currency" "en")

(descr-as-in "currency" "項目使用的貨幣" "zh-hant")
(descr-as-in "currency" "项目使用的货币" "zh-hans")
(descr-as-in "currency" "" "ru")
(descr-as-in "currency" "moeda oficial do elemento" "pt")
(descr-as-in "currency" "moyen d'échange commercial" "fr")
(descr-as-in "currency" "moneda oficial del elemento" "es")
(descr-as-in "currency" "その項目において使われている通貨" "ja")
(descr-as-in "currency" "offizielles Zahlungsmittel" "de")
(descr-as-in "currency" "currency used by item" "en")

