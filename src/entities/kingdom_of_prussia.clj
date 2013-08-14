(ns entities.kingdom-of-prussia
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Kingdom of Prussia")

(name-as-in "Kingdom of Prussia" "普魯士王國" "zh-hant")
(name-as-in "Kingdom of Prussia" "普鲁士王国" "zh-hans")
(name-as-in "Kingdom of Prussia" "Пруссия" "ru")
(name-as-in "Kingdom of Prussia" "Reino da Prússia" "pt")
(name-as-in "Kingdom of Prussia" "Royaume de Prusse" "fr")
(name-as-in "Kingdom of Prussia" "Reino de Prusia" "es")
(name-as-in "Kingdom of Prussia" "プロイセン王国" "ja")
(name-as-in "Kingdom of Prussia" "Königreich Preußen" "de")
(name-as-in "Kingdom of Prussia" "Kingdom of Prussia" "en")

(descr-as-in "Kingdom of Prussia" "" "zh-hant")
(descr-as-in "Kingdom of Prussia" "" "zh-hans")
(descr-as-in "Kingdom of Prussia" "" "ru")
(descr-as-in "Kingdom of Prussia" "" "pt")
(descr-as-in "Kingdom of Prussia" "ancien état européen (1701 - 1918)" "fr")
(descr-as-in "Kingdom of Prussia" "reino que existió desde 1701 hasta 1918" "es")
(descr-as-in "Kingdom of Prussia" "" "ja")
(descr-as-in "Kingdom of Prussia" "" "de")
(descr-as-in "Kingdom of Prussia" "German kingdom from 1701 to 1918" "en")

(fact claim "Kingdom of Prussia" "commons-category" "Prussia")

(fact claim "Kingdom of Prussia" "main-type-gnd" "geographical feature")

