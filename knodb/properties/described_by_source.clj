(ns properties.described_by_source
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "described-by-source")

(name-as-in "described-by-source" "記載於" "zh-hk")
(name-as-in "described-by-source" "descrito pela fonte" "pt")
(name-as-in "described-by-source" "described by source" "en")
(name-as-in "described-by-source" "décrit par" "fr")
(name-as-in "described-by-source" "記載於" "zh-tw")
(name-as-in "described-by-source" "beschrieben in" "de")
(name-as-in "described-by-source" "описывается в источниках" "ru")
(name-as-in "described-by-source" "descrito en" "es")
(name-as-in "described-by-source" "掲載している事典" "ja")
(name-as-in "described-by-source" "记载于" "zh-cn")
(name-as-in "described-by-source" "记载于" "zh-sg")

(descr-as-in "described-by-source" "有記載此項的文獻" "zh-hk")
(descr-as-in "described-by-source" "" "pt")
(descr-as-in "described-by-source" "dictionary, encyclopaedia, etc. where this item is described" "en")
(descr-as-in "described-by-source" "dictionnaire ou encyclopédie qui décrit l'entité" "fr")
(descr-as-in "described-by-source" "有記載此項的文獻" "zh-tw")
(descr-as-in "described-by-source" "Wörterbuch, Enzyklopädie etc., in der das Objekt beschrieben wird" "de")
(descr-as-in "described-by-source" "авторитетные источники (словари и энциклопедии), описывающие элемент целиком" "ru")
(descr-as-in "described-by-source" "diccionario o enciclopedia donde este concepto está descrito" "es")
(descr-as-in "described-by-source" "この項目を掲載している辞書や事典など" "ja")
(descr-as-in "described-by-source" "有记载此项的文献" "zh-cn")
(descr-as-in "described-by-source" "有记载此项的文献" "zh-sg")

