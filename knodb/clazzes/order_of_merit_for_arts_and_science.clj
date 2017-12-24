(ns clazzes.order_of_merit_for_arts_and_science
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Order of Merit for Arts and Science")

(name-as-in "Order of Merit for Arts and Science" "" "zh-hk")
(name-as-in "Order of Merit for Arts and Science" "" "pt")
(name-as-in "Order of Merit for Arts and Science" "Order of Merit for Arts and Science" "en")
(name-as-in "Order of Merit for Arts and Science" "ordre du Mérite pour les sciences et arts" "fr")
(name-as-in "Order of Merit for Arts and Science" "" "zh-tw")
(name-as-in "Order of Merit for Arts and Science" "Pour le Mérite für Wissenschaften und Künste" "de")
(name-as-in "Order of Merit for Arts and Science" "орден Pour le Mérite в области искусств и науки" "ru")
(name-as-in "Order of Merit for Arts and Science" "Orden del Mérito de las Ciencias y las Artes" "es")
(name-as-in "Order of Merit for Arts and Science" "" "ja")
(name-as-in "Order of Merit for Arts and Science" "" "zh-cn")
(name-as-in "Order of Merit for Arts and Science" "" "zh-sg")

(descr-as-in "Order of Merit for Arts and Science" "" "zh-hk")
(descr-as-in "Order of Merit for Arts and Science" "" "pt")
(descr-as-in "Order of Merit for Arts and Science" "" "en")
(descr-as-in "Order of Merit for Arts and Science" "version civile de l'ordre Pour le Mérite" "fr")
(descr-as-in "Order of Merit for Arts and Science" "" "zh-tw")
(descr-as-in "Order of Merit for Arts and Science" "" "de")
(descr-as-in "Order of Merit for Arts and Science" "награда Пруссии" "ru")
(descr-as-in "Order of Merit for Arts and Science" "versión civil de la Orden del Mérito" "es")
(descr-as-in "Order of Merit for Arts and Science" "" "ja")
(descr-as-in "Order of Merit for Arts and Science" "" "zh-cn")
(descr-as-in "Order of Merit for Arts and Science" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "Order of Merit for Arts and Science" "subclass-of" "Q156478")

(refer-to ["properties.instance_of"])
(fact claim "Order of Merit for Arts and Science" "instance-of" "Q5124642")
(fact claim "Order of Merit for Arts and Science" "instance-of" "Q193622")

(refer-to ["properties.country"])
(fact claim "Order of Merit for Arts and Science" "country" "Q38872")

(refer-to ["properties.service_ribbon_image"])
(fact claim "Order of Merit for Arts and Science" "service-ribbon-image" "D-PRU Pour le Merite 1 BAR.svg")

(refer-to ["properties.category_for_recipients_of_this_award"])
(fact claim "Order of Merit for Arts and Science" "category-for-recipients-of-this-award" "Q6254305")
