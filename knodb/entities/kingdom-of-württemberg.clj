(ns entities.kingdom_of_württemberg
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Kingdom of Württemberg")

(name-as-in "Kingdom of Württemberg" "符騰堡王國" "zh-hant")
(name-as-in "Kingdom of Württemberg" "符腾堡王国" "zh-hans")
(name-as-in "Kingdom of Württemberg" "Королевство Вюртемберг" "ru")
(name-as-in "Kingdom of Württemberg" "Reino de Württemberg" "pt")
(name-as-in "Kingdom of Württemberg" "Royaume de Wurtemberg" "fr")
(name-as-in "Kingdom of Württemberg" "Reino de Wurtemberg" "es")
(name-as-in "Kingdom of Württemberg" "ヴュルテンベルク王国" "ja")
(name-as-in "Kingdom of Württemberg" "Königreich Württemberg" "de")
(name-as-in "Kingdom of Württemberg" "Kingdom of Württemberg" "en")

(descr-as-in "Kingdom of Württemberg" "" "zh-hant")
(descr-as-in "Kingdom of Württemberg" "" "zh-hans")
(descr-as-in "Kingdom of Württemberg" "" "ru")
(descr-as-in "Kingdom of Württemberg" "" "pt")
(descr-as-in "Kingdom of Württemberg" "" "fr")
(descr-as-in "Kingdom of Württemberg" "" "es")
(descr-as-in "Kingdom of Württemberg" "" "ja")
(descr-as-in "Kingdom of Württemberg" "ehemaliger Staat im Südwesten des heutigen Deutschlands" "de")
(descr-as-in "Kingdom of Württemberg" "" "en")


(refer-to ["properties.commons_category"])
(fact claim "Kingdom of Württemberg" "commons-category" "Württemberg")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical-feature"])
(fact claim "Kingdom of Württemberg" "main-type-gnd" "geographical feature")
