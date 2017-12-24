(ns properties.sbn_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "sbn-id")

(name-as-in "sbn-id" "" "zh-hk")
(name-as-in "sbn-id" "identificador SBN" "pt")
(name-as-in "sbn-id" "SBN ID" "en")
(name-as-in "sbn-id" "identifiant SBN" "fr")
(name-as-in "sbn-id" "" "zh-tw")
(name-as-in "sbn-id" "SBN-ID" "de")
(name-as-in "sbn-id" "код SBN" "ru")
(name-as-in "sbn-id" "identificador SBN" "es")
(name-as-in "sbn-id" "ICCU典拠コード" "ja")
(name-as-in "sbn-id" "" "zh-cn")
(name-as-in "sbn-id" "" "zh-sg")

(descr-as-in "sbn-id" "" "zh-hk")
(descr-as-in "sbn-id" "" "pt")
(descr-as-in "sbn-id" "identifier issued by National Library Service (SBN) of Italy" "en")
(descr-as-in "sbn-id" "Code d'autorité du Service bibliothécaire national (SBN) sous l'autorité de l'Institut central du catalogue unique des bibliothèques italiennes et des informations bibliographiques (ICCU)" "fr")
(descr-as-in "sbn-id" "" "zh-tw")
(descr-as-in "sbn-id" "Normdatennummer der Italienischen Nationalbibliothek" "de")
(descr-as-in "sbn-id" "номер в каталоге Национальной библиотечной службы Италии" "ru")
(descr-as-in "sbn-id" "número de control de autoridad del Servicio Nacional de Bibliotecas (SBN) de Italia" "es")
(descr-as-in "sbn-id" "ICCU（イタリア図書館総合目録・書誌情報中央研究所）の典拠コントロール番号" "ja")
(descr-as-in "sbn-id" "" "zh-cn")
(descr-as-in "sbn-id" "" "zh-sg")

