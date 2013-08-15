(ns properties.anthem
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "anthem")

(name-as-in "anthem" "頌歌" "zh-hant")
(name-as-in "anthem" "国歌" "zh-hans")
(name-as-in "anthem" "гимн" "ru")
(name-as-in "anthem" "hino" "pt")
(name-as-in "anthem" "hymne" "fr")
(name-as-in "anthem" "himno" "es")
(name-as-in "anthem" "国歌" "ja")
(name-as-in "anthem" "Hymne" "de")
(name-as-in "anthem" "anthem" "en")

(descr-as-in "anthem" "" "zh-hant")
(descr-as-in "anthem" "" "zh-hans")
(descr-as-in "anthem" "название гимна предмета" "ru")
(descr-as-in "anthem" "" "pt")
(descr-as-in "anthem" "nom de l'hymne de l'entité" "fr")
(descr-as-in "anthem" "himno oficial del elemento" "es")
(descr-as-in "anthem" "" "ja")
(descr-as-in "anthem" "Name der Hymne" "de")
(descr-as-in "anthem" "name of the subject's anthem" "en")

