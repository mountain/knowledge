(ns clazzes.state
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "state")

(name-as-in "state" "國" "zh-hant")
(name-as-in "state" "国" "zh-hans")
(name-as-in "state" "государство" "ru")
(name-as-in "state" "Estado" "pt")
(name-as-in "state" "État" "fr")
(name-as-in "state" "Estado" "es")
(name-as-in "state" "国家" "ja")
(name-as-in "state" "Staat" "de")
(name-as-in "state" "state" "en")

(descr-as-in "state" "" "zh-hant")
(descr-as-in "state" "" "zh-hans")
(descr-as-in "state" "организованное сообщество с правительством" "ru")
(descr-as-in "state" "comunidade organizada vivendo sobre um sistema de governo" "pt")
(descr-as-in "state" "organisation politique et juridique d'un territoire délimité" "fr")
(descr-as-in "state" "forma de organización social, económica, política soberana y coercitiva" "es")
(descr-as-in "state" "" "ja")
(descr-as-in "state" "mehrdeutiger Begriff verschiedener Sozial- und Staatswissenschaften" "de")
(descr-as-in "state" "organised community living under one system of government" "en")


(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.community"])
(fact claim "state" "subclass-of" "community")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "state" "main-type-gnd" "term")

(refer-to ["properties.commons_category"])
(fact claim "state" "commons-category" "Countries")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "state" "bncf-thesaurus" "5267")

(refer-to ["properties.gnd_identifier"])
(fact claim "state" "gnd-identifier" "4056618-3")
