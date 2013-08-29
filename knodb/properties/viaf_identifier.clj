(ns properties.viaf_identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "viaf-identifier")

(name-as-in "viaf-identifier" "VIAF" "zh-hant")
(name-as-in "viaf-identifier" "VIAF" "zh-hans")
(name-as-in "viaf-identifier" "идентификатор VIAF" "ru")
(name-as-in "viaf-identifier" "identificador VIAF" "pt")
(name-as-in "viaf-identifier" "identifiant VIAF" "fr")
(name-as-in "viaf-identifier" "identificador FAVI" "es")
(name-as-in "viaf-identifier" "VIAF識別子" "ja")
(name-as-in "viaf-identifier" "VIAF" "de")
(name-as-in "viaf-identifier" "VIAF identifier" "en")

(descr-as-in "viaf-identifier" "虛擬國際規範文檔" "zh-hant")
(descr-as-in "viaf-identifier" "虚拟国际规范文档" "zh-hans")
(descr-as-in "viaf-identifier" "" "ru")
(descr-as-in "viaf-identifier" "Base Virtual Internacional de Autoridade" "pt")
(descr-as-in "viaf-identifier" "Identifiant VIAF" "fr")
(descr-as-in "viaf-identifier" "Virtual International Authority File identifier" "es")
(descr-as-in "viaf-identifier" "バーチャル国際典拠ファイル識別子" "ja")
(descr-as-in "viaf-identifier" "virtuelle internationale Normdatei für Personendaten (Bitte nur individualisierte VIAFs eintragen, d.h. Nummern ohne den Vermerk undifferentiated)" "de")
(descr-as-in "viaf-identifier" "Virtual International Authority File identifier" "en")

