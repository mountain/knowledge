(ns properties.father
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "father")

(name-as-in "father" "父親" "zh-hant")
(name-as-in "father" "父亲" "zh-hans")
(name-as-in "father" "отец" "ru")
(name-as-in "father" "pai" "pt")
(name-as-in "father" "père" "fr")
(name-as-in "father" "padre" "es")
(name-as-in "father" "父親" "ja")
(name-as-in "father" "Vater" "de")
(name-as-in "father" "father" "en")

(descr-as-in "father" "" "zh-hant")
(descr-as-in "father" "" "zh-hans")
(descr-as-in "father" "отец персоны" "ru")
(descr-as-in "father" "" "pt")
(descr-as-in "father" "lien familial" "fr")
(descr-as-in "father" "el sujeto tuvo como padre al objeto" "es")
(descr-as-in "father" "その項目は主題に対し男性の親" "ja")
(descr-as-in "father" "männlicher Erzeuger der Person" "de")
(descr-as-in "father" "male parent" "en")

