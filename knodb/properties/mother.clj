(ns properties.mother
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "mother")

(name-as-in "mother" "母親" "zh-hant")
(name-as-in "mother" "母亲" "zh-hans")
(name-as-in "mother" "мать" "ru")
(name-as-in "mother" "mãe" "pt")
(name-as-in "mother" "mère" "fr")
(name-as-in "mother" "madre" "es")
(name-as-in "mother" "母親" "ja")
(name-as-in "mother" "Mutter" "de")
(name-as-in "mother" "mother" "en")

(descr-as-in "mother" "" "zh-hant")
(descr-as-in "mother" "" "zh-hans")
(descr-as-in "mother" "мать персоны" "ru")
(descr-as-in "mother" "" "pt")
(descr-as-in "mother" "lien familial" "fr")
(descr-as-in "mother" "el sujeto tuvo como madre al objeto" "es")
(descr-as-in "mother" "その項目は主題に対し女性の親" "ja")
(descr-as-in "mother" "weiblicher Elternteil" "de")
(descr-as-in "mother" "female parent" "en")

