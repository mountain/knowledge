(ns clazzes.nobel_prize
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Nobel prize")

(name-as-in "Nobel prize" "Nobelpreis" "de")
(name-as-in "Nobel prize" "" "zh-hk")
(name-as-in "Nobel prize" "" "zh-tw")
(name-as-in "Nobel prize" "Нобелевская премия" "ru")
(name-as-in "Nobel prize" "prémio Nobel" "pt")
(name-as-in "Nobel prize" "Nobel prize" "en")
(name-as-in "Nobel prize" "" "zh-cn")
(name-as-in "Nobel prize" "Prix Nobel" "fr")
(name-as-in "Nobel prize" "Premio Nobel" "es")
(name-as-in "Nobel prize" "" "zh-sg")
(name-as-in "Nobel prize" "ノーベル賞" "ja")
(name-as-in "Nobel prize" "" "zh-hans")
(name-as-in "Nobel prize" "" "zh-hant")

(descr-as-in "Nobel prize" "jährlich vergebene Auszeichung in verschiedene Bereichen" "de")
(descr-as-in "Nobel prize" "" "zh-hk")
(descr-as-in "Nobel prize" "" "zh-tw")
(descr-as-in "Nobel prize" "" "ru")
(descr-as-in "Nobel prize" "" "pt")
(descr-as-in "Nobel prize" "set of annual international awards" "en")
(descr-as-in "Nobel prize" "" "zh-cn")
(descr-as-in "Nobel prize" "ensemble de récompenses décernées annuellement" "fr")
(descr-as-in "Nobel prize" "conjunto de premios internacionales anuales" "es")
(descr-as-in "Nobel prize" "" "zh-sg")
(descr-as-in "Nobel prize" "" "ja")
(descr-as-in "Nobel prize" "" "zh-hans")
(descr-as-in "Nobel prize" "" "zh-hant")


(refer-to ["properties.named_after"])
(refer-to ["entities.alfred_nobel"])
(fact claim "Nobel prize" "named-after" "Alfred Nobel")

(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.award"])
(fact claim "Nobel prize" "subclass-of" "award")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "Nobel prize" "bncf-thesaurus" "41608")

(refer-to ["properties.commons_category"])
(fact claim "Nobel prize" "commons-category" "Nobel Prize")

(refer-to ["properties.image"])
(fact claim "Nobel prize" "image" "AlfredNobel adjusted.jpg")
(fact claim "Nobel prize" "image" "Nobel Prize Diploma Fritz Haber 1918.JPG")
(fact claim "Nobel prize" "image" "President Barack Obama with the Nobel Prize medal and diploma.jpg")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "Nobel prize" "main-type-gnd" "term")
