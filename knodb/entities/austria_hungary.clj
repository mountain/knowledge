(ns entities.austria_hungary
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Austria-Hungary")

(name-as-in "Austria-Hungary" "奧匈帝國" "zh-hant")
(name-as-in "Austria-Hungary" "奥匈帝国" "zh-hans")
(name-as-in "Austria-Hungary" "Австро-Венгрия" "ru")
(name-as-in "Austria-Hungary" "Áustria-Hungria" "pt")
(name-as-in "Austria-Hungary" "Autriche-Hongrie" "fr")
(name-as-in "Austria-Hungary" "Imperio austrohúngaro" "es")
(name-as-in "Austria-Hungary" "オーストリア＝ハンガリー帝国" "ja")
(name-as-in "Austria-Hungary" "Österreich-Ungarn" "de")
(name-as-in "Austria-Hungary" "Austria-Hungary" "en")

(descr-as-in "Austria-Hungary" "" "zh-hant")
(descr-as-in "Austria-Hungary" "" "zh-hans")
(descr-as-in "Austria-Hungary" "историческое государство" "ru")
(descr-as-in "Austria-Hungary" "" "pt")
(descr-as-in "Austria-Hungary" "" "fr")
(descr-as-in "Austria-Hungary" "antiguo estado europeo" "es")
(descr-as-in "Austria-Hungary" "" "ja")
(descr-as-in "Austria-Hungary" "Gesamtstaat des Habsburgerreiches zwischen 1867 und 1918" "de")
(descr-as-in "Austria-Hungary" "constitutional monarchic union  from 1867 to October 1918" "en")


(refer-to ["properties.lccn_identifier"])
(fact claim "Austria-Hungary" "lccn-identifier" "n50057161")

(refer-to ["properties.bnf_identifier"])
(fact claim "Austria-Hungary" "bnf-identifier" "153768385")

(refer-to ["properties.sudoc_identifier"])
(fact claim "Austria-Hungary" "sudoc-identifier" "02635991X")

(refer-to ["properties.viaf_identifier"])
(fact claim "Austria-Hungary" "viaf-identifier" "248356621")

(refer-to ["properties.gnd_identifier"])
(fact claim "Austria-Hungary" "gnd-identifier" "2021001-2")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Austria-Hungary" "main-type-gnd" "geographical feature")

(refer-to ["properties.coordinate_location"])
(fact claim "Austria-Hungary" "coordinate-location" "lng 16.35 lat 48.2 alt ")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.state"])
(fact claim "Austria-Hungary" "instance-of" "state")

(refer-to ["properties.commons_category"])
(refer-to ["entities.austria_hungary"])
(fact claim "Austria-Hungary" "commons-category" "Austria-Hungary")
