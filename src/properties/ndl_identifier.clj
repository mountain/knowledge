(ns properties.ndl-identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "ndl-identifier")

(name-as-in "ndl-identifier" "NDL" "zh-hant")
(name-as-in "ndl-identifier" "NDL" "zh-hans")
(name-as-in "ndl-identifier" "идентификатор NDL" "ru")
(name-as-in "ndl-identifier" "ID da NDL" "pt")
(name-as-in "ndl-identifier" "identifiant bibliothèque nationale de la Diète" "fr")
(name-as-in "ndl-identifier" "NDL" "es")
(name-as-in "ndl-identifier" "国立国会図書館典拠ID" "ja")
(name-as-in "ndl-identifier" "Web NDL Authorities" "de")
(name-as-in "ndl-identifier" "NDL identifier" "en")

(descr-as-in "ndl-identifier" "日本國立國會圖書館權威控制編號" "zh-hant")
(descr-as-in "ndl-identifier" "日本国立国会图书馆权威控制编号" "zh-hans")
(descr-as-in "ndl-identifier" "" "ru")
(descr-as-in "ndl-identifier" "" "pt")
(descr-as-in "ndl-identifier" "" "fr")
(descr-as-in "ndl-identifier" "número de control de autoridad en la Biblioteca de la Dieta Nacional de Japón" "es")
(descr-as-in "ndl-identifier" "日本の国立国会図書館の典拠 ID" "ja")
(descr-as-in "ndl-identifier" "Normdatei der Nationalen Parlamentsbibliothek (NDL) in Japan" "de")
(descr-as-in "ndl-identifier" "authority control number per the National Diet Library of Japan" "en")

