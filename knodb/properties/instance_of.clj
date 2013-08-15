(ns properties.instance_of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "instance-of")

(name-as-in "instance-of" "性質" "zh-hant")
(name-as-in "instance-of" "性质" "zh-hans")
(name-as-in "instance-of" "это частный случай понятия" "ru")
(name-as-in "instance-of" "é um/uma" "pt")
(name-as-in "instance-of" "nature de l'élément" "fr")
(name-as-in "instance-of" "instancia de" "es")
(name-as-in "instance-of" "種類" "ja")
(name-as-in "instance-of" "ist eine Instanz von" "de")
(name-as-in "instance-of" "instance of" "en")

(descr-as-in "instance-of" "" "zh-hant")
(descr-as-in "instance-of" "" "zh-hans")
(descr-as-in "instance-of" "данный элемент представляет собой конкретный объект (экземпляр / частный случай) класса, категории или группы объектов" "ru")
(descr-as-in "instance-of" "" "pt")
(descr-as-in "instance-of" "nature de, expression de ou exemplaire de" "fr")
(descr-as-in "instance-of" "este elemento es un ejemplar de otro elemento" "es")
(descr-as-in "instance-of" "この項目をインスタンス（実体）とする種類・概念" "ja")
(descr-as-in "instance-of" "Ausprägung oder Exemplar einer Sache" "de")
(descr-as-in "instance-of" "this item is a concrete object (instance) of this class, category or object group" "en")

