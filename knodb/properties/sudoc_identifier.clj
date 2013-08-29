(ns properties.sudoc_identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "sudoc-identifier")

(name-as-in "sudoc-identifier" "SUDOC" "zh-hant")
(name-as-in "sudoc-identifier" "SUDOC" "zh-hans")
(name-as-in "sudoc-identifier" "идентификатор SUDOC" "ru")
(name-as-in "sudoc-identifier" "SUDOC" "pt")
(name-as-in "sudoc-identifier" "identifiant SUDOC" "fr")
(name-as-in "sudoc-identifier" "SUDOC" "es")
(name-as-in "sudoc-identifier" "SUDOC" "ja")
(name-as-in "sudoc-identifier" "SUDOC" "de")
(name-as-in "sudoc-identifier" "SUDOC identifier" "en")

(descr-as-in "sudoc-identifier" "" "zh-hant")
(descr-as-in "sudoc-identifier" "" "zh-hans")
(descr-as-in "sudoc-identifier" "номер в Système universitaire de documentation - библиотечном каталоге французских вузов" "ru")
(descr-as-in "sudoc-identifier" "Documentação do sistema de universidade francesa" "pt")
(descr-as-in "sudoc-identifier" "numéro d'autorité au SUDOC (Système universitaire de documentation)" "fr")
(descr-as-in "sudoc-identifier" "número de control de autoría de SUDOC (système universitaire de documentation, sistema universitario de documentación)" "es")
(descr-as-in "sudoc-identifier" "SUDOC（フランス大学図書館総合目録）の典拠管理番号" "ja")
(descr-as-in "sudoc-identifier" "Normdatennummer des gleichnamigen französischen Bibliotheksverbunds" "de")
(descr-as-in "sudoc-identifier" "authority control number per SUDOC (système universitaire de documentation)" "en")

