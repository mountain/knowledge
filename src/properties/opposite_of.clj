(ns properties.opposite_of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "opposite-of")

(name-as-in "opposite-of" "相對概念" "zh-hant")
(name-as-in "opposite-of" "相对概念" "zh-hans")
(name-as-in "opposite-of" "противоположно" "ru")
(name-as-in "opposite-of" "oposto de" "pt")
(name-as-in "opposite-of" "contraire" "fr")
(name-as-in "opposite-of" "opuesto a" "es")
(name-as-in "opposite-of" "反対の概念" "ja")
(name-as-in "opposite-of" "Gegenteil von" "de")
(name-as-in "opposite-of" "opposite of" "en")

(descr-as-in "opposite-of" "與資料相反或不同的概念" "zh-hant")
(descr-as-in "opposite-of" "" "zh-hans")
(descr-as-in "opposite-of" "" "ru")
(descr-as-in "opposite-of" "" "pt")
(descr-as-in "opposite-of" "objet contraire à l'objet" "fr")
(descr-as-in "opposite-of" "elemento que es el opuesto de este elemento" "es")
(descr-as-in "opposite-of" "この項目の反対の関係にある概念の項目" "ja")
(descr-as-in "opposite-of" "Objekt, das das Gegenteil dieses Objekts ist" "de")
(descr-as-in "opposite-of" "item that is the opposite of this item" "en")

