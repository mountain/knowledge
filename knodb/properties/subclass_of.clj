(ns properties.subclass_of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "subclass-of")

(name-as-in "subclass-of" "上級分類" "zh-hk")
(name-as-in "subclass-of" "subclasse de" "pt")
(name-as-in "subclass-of" "subclass of" "en")
(name-as-in "subclass-of" "sous-classe de" "fr")
(name-as-in "subclass-of" "上級分類" "zh-tw")
(name-as-in "subclass-of" "Unterklasse von" "de")
(name-as-in "subclass-of" "подкласс от" "ru")
(name-as-in "subclass-of" "subclase de" "es")
(name-as-in "subclass-of" "上位クラス" "ja")
(name-as-in "subclass-of" "上级分类" "zh-cn")
(name-as-in "subclass-of" "上级分类" "zh-sg")

(descr-as-in "subclass-of" "此項的上級分類" "zh-hk")
(descr-as-in "subclass-of" "todas as instâncias destes itens são instâncias daqueles itens; este item é uma classe daquele item. Não confundir com Property:P31 (instância de)" "pt")
(descr-as-in "subclass-of" "all instances of these items are instances of those items; this item is a class (subset) of that item. Not to be confused with P31 (instance of)" "en")
(descr-as-in "subclass-of" "X sous-classe de Y : tous les éléments qui sont des instances (exemples) de X sont aussi des éléments instances de Y. Ne pas confondre avec la propriété P31 (instance de)" "fr")
(descr-as-in "subclass-of" "此項的上級分類" "zh-tw")
(descr-as-in "subclass-of" "Dieses Element ist eine Klasse/Gruppe jenes Elements (Beispiel: Auto ist eine Unterklasse von Fahrzeug)" "de")
(descr-as-in "subclass-of" "каждый частный случай данного элемента также частный случай следующего(-их) элемента(-ов)" "ru")
(descr-as-in "subclass-of" "este elemento es una clase del otro" "es")
(descr-as-in "subclass-of" "この項目を下位とする上位のクラス（分類・概念）" "ja")
(descr-as-in "subclass-of" "此项的上级分类" "zh-cn")
(descr-as-in "subclass-of" "此项的上级分类" "zh-sg")

