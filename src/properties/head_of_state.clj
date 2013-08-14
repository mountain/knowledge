(ns properties.head-of-state
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "head-of-state")

(name-as-in "head-of-state" "國家元首" "zh-hant")
(name-as-in "head-of-state" "国家元首" "zh-hans")
(name-as-in "head-of-state" "глава государства" "ru")
(name-as-in "head-of-state" "chefe de Estado" "pt")
(name-as-in "head-of-state" "chef d'État" "fr")
(name-as-in "head-of-state" "jefe de Estado" "es")
(name-as-in "head-of-state" "元首" "ja")
(name-as-in "head-of-state" "Staatsoberhaupt" "de")
(name-as-in "head-of-state" "head of state" "en")

(descr-as-in "head-of-state" "" "zh-hant")
(descr-as-in "head-of-state" "" "zh-hans")
(descr-as-in "head-of-state" "" "ru")
(descr-as-in "head-of-state" "autoridade máxima de um Estado" "pt")
(descr-as-in "head-of-state" "plus haute autorité d'un pays" "fr")
(descr-as-in "head-of-state" "persona que ostenta la máxima autoridad de un Estado" "es")
(descr-as-in "head-of-state" "その国歌における公的な最高権威の人物" "ja")
(descr-as-in "head-of-state" "höchste formale Autorität in einem Staat oder Land" "de")
(descr-as-in "head-of-state" "official with the highest formal authority in a country" "en")

