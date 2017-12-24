(ns properties.viaf_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "viaf-id")

(name-as-in "viaf-id" "VIAF編號" "zh-hk")
(name-as-in "viaf-id" "identificador VIAF" "pt")
(name-as-in "viaf-id" "VIAF ID" "en")
(name-as-in "viaf-id" "identifiant Fichier d'autorité international virtuel" "fr")
(name-as-in "viaf-id" "VIAF編號" "zh-tw")
(name-as-in "viaf-id" "VIAF" "de")
(name-as-in "viaf-id" "код VIAF" "ru")
(name-as-in "viaf-id" "identificador VIAF" "es")
(name-as-in "viaf-id" "VIAF識別子" "ja")
(name-as-in "viaf-id" "VIAF标识符" "zh-cn")
(name-as-in "viaf-id" "VIAF标识符" "zh-sg")

(descr-as-in "viaf-id" "虛擬國際規範文檔編號" "zh-hk")
(descr-as-in "viaf-id" "Base Virtual Internacional de Autoridade" "pt")
(descr-as-in "viaf-id" "identifier in the Virtual International Authority File. Format: up to 22 digits" "en")
(descr-as-in "viaf-id" "Identifiant du Fichier d'autorité international virtuel" "fr")
(descr-as-in "viaf-id" "虛擬國際規範文檔" "zh-tw")
(descr-as-in "viaf-id" "virtuelle internationale Normdatei (bitte nur individualisierte VIAFs eintragen, das heißt Nummern ohne den Vermerk undifferentiated)" "de")
(descr-as-in "viaf-id" "идентификатор в международной базе данных нормативного контроля" "ru")
(descr-as-in "viaf-id" "Virtual International Authority File identifier" "es")
(descr-as-in "viaf-id" "バーチャル国際典拠ファイル識別子" "ja")
(descr-as-in "viaf-id" "虚拟国际规范文档中的标识符。格式：最多22个数字" "zh-cn")
(descr-as-in "viaf-id" "虚拟国际规范文档中的标识符。格式：最多22个数字" "zh-sg")

