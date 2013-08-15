(ns properties.grandparent
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "grandparent")

(name-as-in "grandparent" "祖父母" "zh-hant")
(name-as-in "grandparent" "祖父母" "zh-hans")
(name-as-in "grandparent" "дедушка/бабушка" "ru")
(name-as-in "grandparent" "avô/avó" "pt")
(name-as-in "grandparent" "grand-parent" "fr")
(name-as-in "grandparent" "abuelo/a" "es")
(name-as-in "grandparent" "祖父母" "ja")
(name-as-in "grandparent" "Großeltern" "de")
(name-as-in "grandparent" "grandparent" "en")

(descr-as-in "grandparent" "" "zh-hant")
(descr-as-in "grandparent" "" "zh-hans")
(descr-as-in "grandparent" "" "ru")
(descr-as-in "grandparent" "os avós do sujeito (não importa o sexo)" "pt")
(descr-as-in "grandparent" "relation familiale" "fr")
(descr-as-in "grandparent" "el sujeto tuvo como abuelo al objeto (sin importar el sexo)" "es")
(descr-as-in "grandparent" "その項目は主題に対し祖父母（父方または母方、男性または女性）" "ja")
(descr-as-in "grandparent" "Großeltern der Person" "de")
(descr-as-in "grandparent" "the subject has the object as their grand-parent (male or female, paternal or maternal)" "en")

