(ns properties.on_astronomical_body
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "on-astronomical-body")

(name-as-in "on-astronomical-body" "所在天體" "zh-hant")
(name-as-in "on-astronomical-body" "所在天体" "zh-hans")
(name-as-in "on-astronomical-body" "на астрономическом теле" "ru")
(name-as-in "on-astronomical-body" "no objeto astronómico" "pt")
(name-as-in "on-astronomical-body" "sur le corps astronomique" "fr")
(name-as-in "on-astronomical-body" "en el cuerpo astronómico" "es")
(name-as-in "on-astronomical-body" "位置する天体" "ja")
(name-as-in "on-astronomical-body" "auf astronomischem Körper" "de")
(name-as-in "on-astronomical-body" "on astronomical body" "en")

(descr-as-in "on-astronomical-body" "" "zh-hant")
(descr-as-in "on-astronomical-body" "" "zh-hans")
(descr-as-in "on-astronomical-body" "" "ru")
(descr-as-in "on-astronomical-body" "objeto astronómico no qual o objeto geográfico está localizado" "pt")
(descr-as-in "on-astronomical-body" "lieux ou caractéristiques du corps astronomique" "fr")
(descr-as-in "on-astronomical-body" "cuerpo astronómico en el cual está situado" "es")
(descr-as-in "on-astronomical-body" "事象や場所が位置している天体" "ja")
(descr-as-in "on-astronomical-body" "astronomischer Körper, auf dem sich ein Datenobjekt befindet" "de")
(descr-as-in "on-astronomical-body" "astronomical body on which features or places are situated" "en")

