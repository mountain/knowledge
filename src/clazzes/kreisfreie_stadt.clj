(ns clazzes.kreisfreie_stadt
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Kreisfreie stadt")

(name-as-in "Kreisfreie stadt" "獨立市" "zh-hant")
(name-as-in "Kreisfreie stadt" "独立市" "zh-hans")
(name-as-in "Kreisfreie stadt" "городской округ в Германии" "ru")
(name-as-in "Kreisfreie stadt" "cidade independente" "pt")
(name-as-in "Kreisfreie stadt" "ville indépendante" "fr")
(name-as-in "Kreisfreie stadt" "ciudad independiente" "es")
(name-as-in "Kreisfreie stadt" "独立市" "ja")
(name-as-in "Kreisfreie stadt" "Kreisfreie Stadt" "de")
(name-as-in "Kreisfreie stadt" "Kreisfreie stadt" "en")

(descr-as-in "Kreisfreie stadt" "" "zh-hant")
(descr-as-in "Kreisfreie stadt" "" "zh-hans")
(descr-as-in "Kreisfreie stadt" "" "ru")
(descr-as-in "Kreisfreie stadt" "" "pt")
(descr-as-in "Kreisfreie stadt" "" "fr")
(descr-as-in "Kreisfreie stadt" "ciudad que no forma parte de otra entidad gubernamental local" "es")
(descr-as-in "Kreisfreie stadt" "" "ja")
(descr-as-in "Kreisfreie stadt" "Stadt, die keinem Landkreis zugehörig ist" "de")
(descr-as-in "Kreisfreie stadt" "city or town that does not form part of another general-purpose local government entity" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "Kreisfreie stadt" "main-type-gnd" "term")

(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.administrative_division_of_germany"])
(fact claim "Kreisfreie stadt" "subclass-of" "administrative division of Germany")
(refer-to ["clazzes.city"])
(fact claim "Kreisfreie stadt" "subclass-of" "city")
