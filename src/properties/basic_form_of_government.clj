(ns properties.basic-form-of-government
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "basic-form-of-government")

(name-as-in "basic-form-of-government" "政體" "zh-hant")
(name-as-in "basic-form-of-government" "政体" "zh-hans")
(name-as-in "basic-form-of-government" "форма правления" "ru")
(name-as-in "basic-form-of-government" "forma de governo" "pt")
(name-as-in "basic-form-of-government" "régime politique" "fr")
(name-as-in "basic-form-of-government" "forma de gobierno" "es")
(name-as-in "basic-form-of-government" "政治体制" "ja")
(name-as-in "basic-form-of-government" "Regierungsform" "de")
(name-as-in "basic-form-of-government" "basic form of government" "en")

(descr-as-in "basic-form-of-government" "" "zh-hant")
(descr-as-in "basic-form-of-government" "" "zh-hans")
(descr-as-in "basic-form-of-government" "" "ru")
(descr-as-in "basic-form-of-government" "" "pt")
(descr-as-in "basic-form-of-government" "régime politique du sujet" "fr")
(descr-as-in "basic-form-of-government" "por ejemplo: monarquía, república, etc." "es")
(descr-as-in "basic-form-of-government" "" "ja")
(descr-as-in "basic-form-of-government" "Art und Weise der Herrschaftsausübung" "de")
(descr-as-in "basic-form-of-government" "the subject's government" "en")

