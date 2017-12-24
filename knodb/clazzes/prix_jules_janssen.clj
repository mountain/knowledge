(ns clazzes.prix_jules_janssen
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Prix Jules Janssen")

(name-as-in "Prix Jules Janssen" "" "zh-hk")
(name-as-in "Prix Jules Janssen" "Prémio Jules Janssen" "pt")
(name-as-in "Prix Jules Janssen" "Prix Jules Janssen" "en")
(name-as-in "Prix Jules Janssen" "prix Jules-Janssen" "fr")
(name-as-in "Prix Jules Janssen" "" "zh-tw")
(name-as-in "Prix Jules Janssen" "Jules-Janssen-Preis" "de")
(name-as-in "Prix Jules Janssen" "премия Жюля Жансена" "ru")
(name-as-in "Prix Jules Janssen" "Premio Jules Janssen" "es")
(name-as-in "Prix Jules Janssen" "" "ja")
(name-as-in "Prix Jules Janssen" "" "zh-cn")
(name-as-in "Prix Jules Janssen" "" "zh-sg")

(descr-as-in "Prix Jules Janssen" "" "zh-hk")
(descr-as-in "Prix Jules Janssen" "" "pt")
(descr-as-in "Prix Jules Janssen" "" "en")
(descr-as-in "Prix Jules Janssen" "" "fr")
(descr-as-in "Prix Jules Janssen" "" "zh-tw")
(descr-as-in "Prix Jules Janssen" "" "de")
(descr-as-in "Prix Jules Janssen" "высшая награда, присуждаемая ежегодно Французским астрономическим обществом в области астрономии" "ru")
(descr-as-in "Prix Jules Janssen" "" "es")
(descr-as-in "Prix Jules Janssen" "" "ja")
(descr-as-in "Prix Jules Janssen" "" "zh-cn")
(descr-as-in "Prix Jules Janssen" "" "zh-sg")


(refer-to ["properties.named_after"])
(fact claim "Prix Jules Janssen" "named-after" "Q298581")

(refer-to ["properties.freebase_id"])
(fact claim "Prix Jules Janssen" "freebase-id" "/m/0g9z7x1")

(refer-to ["properties.instance_of"])
(fact claim "Prix Jules Janssen" "instance-of" "Q11448906")

(refer-to ["properties.country"])
(fact claim "Prix Jules Janssen" "country" "Q142")

(refer-to ["properties.conferred_by"])
(fact claim "Prix Jules Janssen" "conferred-by" "Q2919053")
