(ns clazzes.physicist
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "physicist")

(name-as-in "physicist" "物理學家" "zh-hant")
(name-as-in "physicist" "物理学家" "zh-hans")
(name-as-in "physicist" "физик" "ru")
(name-as-in "physicist" "físico" "pt")
(name-as-in "physicist" "physicien" "fr")
(name-as-in "physicist" "físico" "es")
(name-as-in "physicist" "物理学者" "ja")
(name-as-in "physicist" "Physiker" "de")
(name-as-in "physicist" "physicist" "en")

(descr-as-in "physicist" "" "zh-hant")
(descr-as-in "physicist" "" "zh-hans")
(descr-as-in "physicist" "" "ru")
(descr-as-in "physicist" "" "pt")
(descr-as-in "physicist" "scientifique étudiant la physique" "fr")
(descr-as-in "physicist" "científico que se dedica al estudio de las ciencias físicas" "es")
(descr-as-in "physicist" "" "ja")
(descr-as-in "physicist" "Naturwissenschaftler der Physik" "de")
(descr-as-in "physicist" "scientist who does research in physics" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "physicist" "main-type-gnd" "term")

(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.scientist"])
(fact claim "physicist" "subclass-of" "scientist")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.profession"])
(fact claim "physicist" "instance-of" "profession")

(refer-to ["properties.field_of_this_profession"])
(refer-to ["clazzes.physics"])
(fact claim "physicist" "field-of-this-profession" "physics")

(refer-to ["properties.commons_category"])
(fact claim "physicist" "commons-category" "Physicists")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "physicist" "bncf-thesaurus" "28902")
