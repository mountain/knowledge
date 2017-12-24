(ns properties.medical_specialty
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "medical-specialty")

(name-as-in "medical-specialty" "" "zh-hk")
(name-as-in "medical-specialty" "especialidade médica" "pt")
(name-as-in "medical-specialty" "medical specialty" "en")
(name-as-in "medical-specialty" "spécialité médicale" "fr")
(name-as-in "medical-specialty" "" "zh-tw")
(name-as-in "medical-specialty" "medizinisches Fachgebiet" "de")
(name-as-in "medical-specialty" "медицинская специальность" "ru")
(name-as-in "medical-specialty" "especialidad médica" "es")
(name-as-in "medical-specialty" "診療科" "ja")
(name-as-in "medical-specialty" "" "zh-cn")
(name-as-in "medical-specialty" "" "zh-sg")

(descr-as-in "medical-specialty" "" "zh-hk")
(descr-as-in "medical-specialty" "especialidade médica em relação a uma certa doença" "pt")
(descr-as-in "medical-specialty" "main medical specialty concerned with a specific condition" "en")
(descr-as-in "medical-specialty" "spécialité médicale la plus concernée par une condition médicale particulière" "fr")
(descr-as-in "medical-specialty" "" "zh-tw")
(descr-as-in "medical-specialty" "medizinisches Fachgebiet, das hauptsächlich zur Behandlung dieser Krankheit herangezogen wird" "de")
(descr-as-in "medical-specialty" "" "ru")
(descr-as-in "medical-specialty" "especialidad médica en relación a cierta dolencia" "es")
(descr-as-in "medical-specialty" "" "ja")
(descr-as-in "medical-specialty" "" "zh-cn")
(descr-as-in "medical-specialty" "" "zh-sg")

