(ns clazzes.prix-jules-janssen
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Prix Jules Janssen")

(name-as-in "Prix Jules Janssen" "" "zh-hant")
(name-as-in "Prix Jules Janssen" "" "zh-hans")
(name-as-in "Prix Jules Janssen" "" "ru")
(name-as-in "Prix Jules Janssen" "Prémio Jules Janssen" "pt")
(name-as-in "Prix Jules Janssen" "Prix Jules-Janssen" "fr")
(name-as-in "Prix Jules Janssen" "" "es")
(name-as-in "Prix Jules Janssen" "" "ja")
(name-as-in "Prix Jules Janssen" "Jules-Janssen-Preis" "de")
(name-as-in "Prix Jules Janssen" "Prix Jules Janssen" "en")

(descr-as-in "Prix Jules Janssen" "" "zh-hant")
(descr-as-in "Prix Jules Janssen" "" "zh-hans")
(descr-as-in "Prix Jules Janssen" "" "ru")
(descr-as-in "Prix Jules Janssen" "" "pt")
(descr-as-in "Prix Jules Janssen" "" "fr")
(descr-as-in "Prix Jules Janssen" "" "es")
(descr-as-in "Prix Jules Janssen" "" "ja")
(descr-as-in "Prix Jules Janssen" "" "de")
(descr-as-in "Prix Jules Janssen" "" "en")

(fact claim "Prix Jules Janssen" "named-after" "Pierre Janssen")

