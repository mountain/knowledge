(ns properties.isni_iso_27729
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "isni-iso-27729")

(name-as-in "isni-iso-27729" "國際標準名稱標識符" "zh-hant")
(name-as-in "isni-iso-27729" "ISNI（ISO 27729）" "zh-hans")
(name-as-in "isni-iso-27729" "идентификатор ISNI" "ru")
(name-as-in "isni-iso-27729" "ISNI" "pt")
(name-as-in "isni-iso-27729" "identifiant ISNI" "fr")
(name-as-in "isni-iso-27729" "ISNI" "es")
(name-as-in "isni-iso-27729" "ISNI" "ja")
(name-as-in "isni-iso-27729" "ISNI" "de")
(name-as-in "isni-iso-27729" "ISNI (ISO 27729)" "en")

(descr-as-in "isni-iso-27729" "" "zh-hant")
(descr-as-in "isni-iso-27729" "" "zh-hans")
(descr-as-in "isni-iso-27729" "" "ru")
(descr-as-in "isni-iso-27729" "" "pt")
(descr-as-in "isni-iso-27729" "Code international normalisé des noms. 16 chiffres non significatifs. Exemple : 0000 0001 0886 1508. (A l'affichage seulement, l'identifiant est précédé des lettres ISNI suivies d'un espace. Les 16 chiffres se présentent par blocs de quatre, séparés entre eux par un espace.)" "fr")
(descr-as-in "isni-iso-27729" "International Standard Name Identifier (usar los 20 caracteres sin guiones ni espacios)" "es")
(descr-as-in "isni-iso-27729" "国際標準識別子。-を含まない16文字の識別子を使用。" "ja")
(descr-as-in "isni-iso-27729" "International Standard Name Identifier (Eingabe mit Leerzeichen. Beispiel: 0000 0001 0886 1508.)" "de")
(descr-as-in "isni-iso-27729" "International Standard Name Identifier. 16 digits dumb identifier. Example: 0000 0001 0886 1508. (When displayed only it is preceded by the letters ISNI, separated from the identifier by a space, and the 16 digits are displayed as four blocks of four digits, with each block separated from the next by a space.)" "en")

