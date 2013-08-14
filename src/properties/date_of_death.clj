(ns properties.date-of-death
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "date-of-death")

(name-as-in "date-of-death" "死亡日期" "zh-hant")
(name-as-in "date-of-death" "死亡日期" "zh-hans")
(name-as-in "date-of-death" "дата смерти" "ru")
(name-as-in "date-of-death" "data de falecimento" "pt")
(name-as-in "date-of-death" "date de décès" "fr")
(name-as-in "date-of-death" "fecha de fallecimiento" "es")
(name-as-in "date-of-death" "没年月日" "ja")
(name-as-in "date-of-death" "Sterbedatum" "de")
(name-as-in "date-of-death" "date of death" "en")

(descr-as-in "date-of-death" "" "zh-hant")
(descr-as-in "date-of-death" "" "zh-hans")
(descr-as-in "date-of-death" "" "ru")
(descr-as-in "date-of-death" "" "pt")
(descr-as-in "date-of-death" "date à laquelle la personne est décédée" "fr")
(descr-as-in "date-of-death" "fecha en la cual falleció el sujeto" "es")
(descr-as-in "date-of-death" "その人物が死亡した日付" "ja")
(descr-as-in "date-of-death" "Datum, an dem eine Person verstarb" "de")
(descr-as-in "date-of-death" "date on which the subject died or death" "en")

