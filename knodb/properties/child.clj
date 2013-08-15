(ns properties.child
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "child")

(name-as-in "child" "子女" "zh-hant")
(name-as-in "child" "子女" "zh-hans")
(name-as-in "child" "ребёнок" "ru")
(name-as-in "child" "filhos(as)" "pt")
(name-as-in "child" "enfant" "fr")
(name-as-in "child" "hijo" "es")
(name-as-in "child" "子" "ja")
(name-as-in "child" "Kinder" "de")
(name-as-in "child" "child" "en")

(descr-as-in "child" "" "zh-hant")
(descr-as-in "child" "" "zh-hans")
(descr-as-in "child" "" "ru")
(descr-as-in "child" "os filhos(as) do sujeito" "pt")
(descr-as-in "child" "lien familial" "fr")
(descr-as-in "child" "el sujeto tuvo de hijo al objeto" "es")
(descr-as-in "child" "その項目は主題に対し子" "ja")
(descr-as-in "child" "Kinder der Person" "de")
(descr-as-in "child" "the subject has the object as their child" "en")

