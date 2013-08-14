(ns properties.field-of-this-profession
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "field-of-this-profession")

(name-as-in "field-of-this-profession" "專業領域" "zh-hant")
(name-as-in "field-of-this-profession" "职业领域" "zh-hans")
(name-as-in "field-of-this-profession" "соответствует деятельности" "ru")
(name-as-in "field-of-this-profession" "campo desta profissão" "pt")
(name-as-in "field-of-this-profession" "domaine de ce métier" "fr")
(name-as-in "field-of-this-profession" "campo de la profesión" "es")
(name-as-in "field-of-this-profession" "専門的職業の分野" "ja")
(name-as-in "field-of-this-profession" "Betätigungsfeld des Berufes" "de")
(name-as-in "field-of-this-profession" "field of this profession" "en")

(descr-as-in "field-of-this-profession" "" "zh-hant")
(descr-as-in "field-of-this-profession" "" "zh-hans")
(descr-as-in "field-of-this-profession" "сфера деятельности работника данной профессии" "ru")
(descr-as-in "field-of-this-profession" "" "pt")
(descr-as-in "field-of-this-profession" "domaine correspondant au métier" "fr")
(descr-as-in "field-of-this-profession" "campo correspondiente a esta profesión" "es")
(descr-as-in "field-of-this-profession" "この専門的職業に対応する分野" "ja")
(descr-as-in "field-of-this-profession" "Feld korrespondiert mit Beruf" "de")
(descr-as-in "field-of-this-profession" "field corresponding to profession" "en")

