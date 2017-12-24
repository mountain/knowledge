(ns properties.tgn_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "tgn-id")

(name-as-in "tgn-id" "" "zh-hk")
(name-as-in "tgn-id" "identificador TGN" "pt")
(name-as-in "tgn-id" "TGN ID" "en")
(name-as-in "tgn-id" "identifiant Thesaurus of Geographic Names" "fr")
(name-as-in "tgn-id" "" "zh-tw")
(name-as-in "tgn-id" "TGN-ID" "de")
(name-as-in "tgn-id" "код TGN" "ru")
(name-as-in "tgn-id" "identificador TGN" "es")
(name-as-in "tgn-id" "" "ja")
(name-as-in "tgn-id" "" "zh-cn")
(name-as-in "tgn-id" "" "zh-sg")

(descr-as-in "tgn-id" "" "zh-hk")
(descr-as-in "tgn-id" "" "pt")
(descr-as-in "tgn-id" "identifier in the Getty Thesaurus of Geographic Names" "en")
(descr-as-in "tgn-id" "" "fr")
(descr-as-in "tgn-id" "" "zh-tw")
(descr-as-in "tgn-id" "Nummer im Getty Thesaurus of Geographic Names" "de")
(descr-as-in "tgn-id" "Getty Thesaurus of Geographic Names ID" "ru")
(descr-as-in "tgn-id" "identificador en el Getty Thesaurus of Geographic Names" "es")
(descr-as-in "tgn-id" "" "ja")
(descr-as-in "tgn-id" "" "zh-cn")
(descr-as-in "tgn-id" "" "zh-sg")

