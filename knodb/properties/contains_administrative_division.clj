(ns properties.contains_administrative_division
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "contains-administrative-division")

(name-as-in "contains-administrative-division" "下轄" "zh-hant")
(name-as-in "contains-administrative-division" "下辖" "zh-hans")
(name-as-in "contains-administrative-division" "административно делится на" "ru")
(name-as-in "contains-administrative-division" "subdivide-se em" "pt")
(name-as-in "contains-administrative-division" "subdivisions (division administrative)" "fr")
(name-as-in "contains-administrative-division" "subdividido en (división administrativa)" "es")
(name-as-in "contains-administrative-division" "直下の行政区画" "ja")
(name-as-in "contains-administrative-division" "Untereinheit (administrative Einheit)" "de")
(name-as-in "contains-administrative-division" "contains administrative division" "en")

(descr-as-in "contains-administrative-division" "" "zh-hant")
(descr-as-in "contains-administrative-division" "" "zh-hans")
(descr-as-in "contains-administrative-division" "единицы, на которые непосредственно подразделяется данная административная единица" "ru")
(descr-as-in "contains-administrative-division" "subdivisão direta de um divisão administrativa" "pt")
(descr-as-in "contains-administrative-division" "(liste des) subdivisions qui composent une division administrative" "fr")
(descr-as-in "contains-administrative-division" "subdivisiones que componen una división administrativa" "es")
(descr-as-in "contains-administrative-division" "この項目の直下に位置付けられる行政区画" "ja")
(descr-as-in "contains-administrative-division" "(Liste von) direkten Untereinheiten einer administrativen Einheit" "de")
(descr-as-in "contains-administrative-division" "(list of) direct subdivisions of an administrative division" "en")

