(ns properties.top-level-domain
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "top-level-domain")

(name-as-in "top-level-domain" "頂級域名" "zh-hant")
(name-as-in "top-level-domain" "顶级域名" "zh-hans")
(name-as-in "top-level-domain" "домен верхнего уровня" "ru")
(name-as-in "top-level-domain" "domínio de topo" "pt")
(name-as-in "top-level-domain" "domaine internet" "fr")
(name-as-in "top-level-domain" "dominio de nivel superior" "es")
(name-as-in "top-level-domain" "トップレベルドメイン" "ja")
(name-as-in "top-level-domain" "Top-Level-Domain" "de")
(name-as-in "top-level-domain" "top-level domain" "en")

(descr-as-in "top-level-domain" "" "zh-hant")
(descr-as-in "top-level-domain" "" "zh-hans")
(descr-as-in "top-level-domain" "" "ru")
(descr-as-in "top-level-domain" "código do domínio de internet" "pt")
(descr-as-in "top-level-domain" "domaine de premier niveau pour une adresse internet" "fr")
(descr-as-in "top-level-domain" "dominio de Internet" "es")
(descr-as-in "top-level-domain" "その国・地域・組織に割り当てられたトップレベルドメイン" "ja")
(descr-as-in "top-level-domain" "oberste Ebene der Namensauflösung bei Internetadressen für ein Land, Territorium oder eine Organisation" "de")
(descr-as-in "top-level-domain" "Internet domain name system top-level code" "en")

