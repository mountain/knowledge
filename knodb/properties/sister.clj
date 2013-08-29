(ns properties.sister
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "sister")

(name-as-in "sister" "姐妹" "zh-hant")
(name-as-in "sister" "姐妹" "zh-hans")
(name-as-in "sister" "сестра" "ru")
(name-as-in "sister" "irmã" "pt")
(name-as-in "sister" "sœur" "fr")
(name-as-in "sister" "hermana" "es")
(name-as-in "sister" "姉妹" "ja")
(name-as-in "sister" "Schwester" "de")
(name-as-in "sister" "sister" "en")

(descr-as-in "sister" "" "zh-hant")
(descr-as-in "sister" "" "zh-hans")
(descr-as-in "sister" "сестра персоны" "ru")
(descr-as-in "sister" "" "pt")
(descr-as-in "sister" "le sujet a pour sœur l'objet" "fr")
(descr-as-in "sister" "el sujeto tuvo como hermana al objeto" "es")
(descr-as-in "sister" "その項目は主題に対し姉または妹" "ja")
(descr-as-in "sister" "Verwandte weiblichen Geschlechts, die dieselben Eltern hat" "de")
(descr-as-in "sister" "subject has the object as their sister (female sibling)" "en")

