(ns properties.aut_nkc
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "aut-nkc")

(name-as-in "aut-nkc" "" "zh-hant")
(name-as-in "aut-nkc" "AUT NKC" "zh-hans")
(name-as-in "aut-nkc" "идентификатор NKC" "ru")
(name-as-in "aut-nkc" "AUT NKC" "pt")
(name-as-in "aut-nkc" "identifiant bibliothèque nationale tchèque" "fr")
(name-as-in "aut-nkc" "AUT NKC" "es")
(name-as-in "aut-nkc" "" "ja")
(name-as-in "aut-nkc" "NKCR" "de")
(name-as-in "aut-nkc" "AUT NKC" "en")

(descr-as-in "aut-nkc" "" "zh-hant")
(descr-as-in "aut-nkc" "捷克共和国国家机关文件（捷克共和国国家图书馆）编号" "zh-hans")
(descr-as-in "aut-nkc" "код в Национальной библиотеке Чехии" "ru")
(descr-as-in "aut-nkc" "" "pt")
(descr-as-in "aut-nkc" "" "fr")
(descr-as-in "aut-nkc" "Identificador del archivo de autoridad nacional de la República Checa (Biblioteca Nacional de República Checa)" "es")
(descr-as-in "aut-nkc" "" "ja")
(descr-as-in "aut-nkc" "Datenbanklink zum Portal der Nationalbibliothek der Tschechischen Republik" "de")
(descr-as-in "aut-nkc" "National authority file of the Czech Republic (National Library of CR) ID" "en")

