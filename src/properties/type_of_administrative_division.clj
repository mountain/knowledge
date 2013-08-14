(ns properties.type-of-administrative-division
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "type-of-administrative-division")

(name-as-in "type-of-administrative-division" "行政區劃類型" "zh-hant")
(name-as-in "type-of-administrative-division" "行政区划类型" "zh-hans")
(name-as-in "type-of-administrative-division" "тип административной единицы" "ru")
(name-as-in "type-of-administrative-division" "tipo de divisão administrativa" "pt")
(name-as-in "type-of-administrative-division" "type de division administrative" "fr")
(name-as-in "type-of-administrative-division" "tipo de división administrativa" "es")
(name-as-in "type-of-administrative-division" "行政区画の種類" "ja")
(name-as-in "type-of-administrative-division" "Typ der administrativen Einheit" "de")
(name-as-in "type-of-administrative-division" "type of administrative division" "en")

(descr-as-in "type-of-administrative-division" "行政區劃的類型，如美國州份、意大利市鎮" "zh-hant")
(descr-as-in "type-of-administrative-division" "行政区划的类型，如美国州份、意大利市镇" "zh-hans")
(descr-as-in "type-of-administrative-division" "" "ru")
(descr-as-in "type-of-administrative-division" "" "pt")
(descr-as-in "type-of-administrative-division" "statut administratif de l'élément (par exemple commune française ou État des États-Unis)" "fr")
(descr-as-in "type-of-administrative-division" "división administrativa como estado estadounidense, comuna francesa..." "es")
(descr-as-in "type-of-administrative-division" "" "ja")
(descr-as-in "type-of-administrative-division" "Status innerhalb der Verwaltungsgliederung, z.B. Gemeinde in Deutschland, Landkreis, US-Bundesstaat" "de")
(descr-as-in "type-of-administrative-division" "is an administrative division such as a U.S. state, Italian commune" "en")

