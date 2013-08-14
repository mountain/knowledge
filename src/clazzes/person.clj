(ns clazzes.person
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "person")

(name-as-in "person" "個人" "zh-hant")
(name-as-in "person" "个人" "zh-hans")
(name-as-in "person" "личность" "ru")
(name-as-in "person" "pessoa" "pt")
(name-as-in "person" "personne" "fr")
(name-as-in "person" "persona" "es")
(name-as-in "person" "人" "ja")
(name-as-in "person" "Person" "de")
(name-as-in "person" "person" "en")

(descr-as-in "person" "具有人格的存在，比如一個人（用於屬性P107 主類別）" "zh-hant")
(descr-as-in "person" "具有人格的存在，比如一个人（用于属性P107 主类别）" "zh-hans")
(descr-as-in "person" "реальная или вымышленная персона" "ru")
(descr-as-in "person" "indivíduo" "pt")
(descr-as-in "person" "individu" "fr")
(descr-as-in "person" "individuo (se usa con Propiedad:P107 "tipo principal (GND)")" "es")
(descr-as-in "person" "個人" "ja")
(descr-as-in "person" "Individuum (fiktional oder nicht-fiktional)" "de")
(descr-as-in "person" "being, e.g. a human, that has certain capacities or attributes constituting personhood (use with Property:P107 "main type (GND)")" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "person" "main-type-gnd" "term")

(refer-to ["properties.mesh_code"])
(fact claim "person" "mesh-code" "M")
