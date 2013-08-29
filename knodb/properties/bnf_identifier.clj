(ns properties.bnf_identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "bnf-identifier")

(name-as-in "bnf-identifier" "BNF" "zh-hant")
(name-as-in "bnf-identifier" "BNF" "zh-hans")
(name-as-in "bnf-identifier" "идентификатор BNF" "ru")
(name-as-in "bnf-identifier" "BNF" "pt")
(name-as-in "bnf-identifier" "identifiant BnF" "fr")
(name-as-in "bnf-identifier" "Identificador BnF" "es")
(name-as-in "bnf-identifier" "BNF" "ja")
(name-as-in "bnf-identifier" "BnF" "de")
(name-as-in "bnf-identifier" "BnF identifier" "en")

(descr-as-in "bnf-identifier" "" "zh-hant")
(descr-as-in "bnf-identifier" "" "zh-hans")
(descr-as-in "bnf-identifier" "библиотечный номер в Национальной библиотеке Франции (Bibliothèque nationale de France)" "ru")
(descr-as-in "bnf-identifier" "número de controlo de autoridade pela BNF (Bibliothèque nationale de France)" "pt")
(descr-as-in "bnf-identifier" "identifiant d'autorité dans http://catalogue.bnf.fr (y compris le dernier caractère pour ark)" "fr")
(descr-as-in "bnf-identifier" "identificador en el catálogo de la Biblioteca Nacional de Francia" "es")
(descr-as-in "bnf-identifier" "フランス国立図書館の管理番号" "ja")
(descr-as-in "bnf-identifier" "Normdatennummer der französischen Nationalbibliothek" "de")
(descr-as-in "bnf-identifier" "control number for the subject issued by BNF (Bibliothèque nationale de France)" "en")

