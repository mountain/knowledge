(ns properties.shares_border_with
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "shares-border-with")

(name-as-in "shares-border-with" "接壤" "zh-hant")
(name-as-in "shares-border-with" "接壤" "zh-hans")
(name-as-in "shares-border-with" "имеет границы с" "ru")
(name-as-in "shares-border-with" "faz fronteira com" "pt")
(name-as-in "shares-border-with" "limitrophe de" "fr")
(name-as-in "shares-border-with" "comparte fronteras con" "es")
(name-as-in "shares-border-with" "隣の国または行政区画" "ja")
(name-as-in "shares-border-with" "gemeinsame Grenze mit" "de")
(name-as-in "shares-border-with" "shares border with" "en")

(descr-as-in "shares-border-with" "屬同一等級的行政區劃與項目的邊界接壤" "zh-hant")
(descr-as-in "shares-border-with" "属同一等级的行政区划与项目的边界接壤" "zh-hans")
(descr-as-in "shares-border-with" "страны или административные единицы одинакового уровня, с которыми этот элемент граничит по суше или воде" "ru")
(descr-as-in "shares-border-with" "países ou subdivisões administrativas de mesmo nível que este item faz fronteira" "pt")
(descr-as-in "shares-border-with" "pays ou division administrative de même niveau partageant une frontière commune" "fr")
(descr-as-in "shares-border-with" "países o subdivisiones administrativas del mismo nivel que el elemento con las que este comparte fronteras" "es")
(descr-as-in "shares-border-with" "この項目が陸上で対等に境界を接する国々または行政区画" "ja")
(descr-as-in "shares-border-with" "Länder oder administrative  Einheit derselben Ebene, die an das Objekt grenzen (Staat an Staat, Provinz an Provinz)" "de")
(descr-as-in "shares-border-with" "countries or administrative subdivisions, of equal level, that this item borders, either by land or water" "en")

