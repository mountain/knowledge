(ns properties.flag
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "flag")

(name-as-in "flag" "旗幟描述" "zh-hant")
(name-as-in "flag" "旗帜" "zh-hans")
(name-as-in "flag" "описание флага" "ru")
(name-as-in "flag" "descrição da bandeira" "pt")
(name-as-in "flag" "drapeau (description)" "fr")
(name-as-in "flag" "descripción de la bandera" "es")
(name-as-in "flag" "旗の解説" "ja")
(name-as-in "flag" "Flagge (Beschreibung)" "de")
(name-as-in "flag" "flag" "en")

(descr-as-in "flag" "" "zh-hant")
(descr-as-in "flag" "" "zh-hans")
(descr-as-in "flag" "статья Википедии с описанием флага" "ru")
(descr-as-in "flag" "artigo da Wikipédia sobre a bandeira" "pt")
(descr-as-in "flag" "" "fr")
(descr-as-in "flag" "artículo de wikipedia donde describe la bandera" "es")
(descr-as-in "flag" "主語の旗について解説したウィキペディアの記事" "ja")
(descr-as-in "flag" "Beschreibung und Geschichte einer Flagge" "de")
(descr-as-in "flag" "subject's flag" "en")

