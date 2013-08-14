(ns properties.bncf_thesaurus
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "bncf-thesaurus")

(name-as-in "bncf-thesaurus" "BNCF" "zh-hant")
(name-as-in "bncf-thesaurus" "BNCF" "zh-hans")
(name-as-in "bncf-thesaurus" "идентификатор BNCF" "ru")
(name-as-in "bncf-thesaurus" "BNCF" "pt")
(name-as-in "bncf-thesaurus" "identifiant du thésaurus de la BNCF" "fr")
(name-as-in "bncf-thesaurus" "BNCF" "es")
(name-as-in "bncf-thesaurus" "BNCFシソーラス" "ja")
(name-as-in "bncf-thesaurus" "BNCF" "de")
(name-as-in "bncf-thesaurus" "BNCF Thesaurus" "en")

(descr-as-in "bncf-thesaurus" "" "zh-hant")
(descr-as-in "bncf-thesaurus" "" "zh-hans")
(descr-as-in "bncf-thesaurus" "идентификатор в итальянском национальном тезаурусе" "ru")
(descr-as-in "bncf-thesaurus" "" "pt")
(descr-as-in "bncf-thesaurus" "identifiant du thésaurus italien de la Bibliothèque nationale centrale de Florence" "fr")
(descr-as-in "bncf-thesaurus" "" "es")
(descr-as-in "bncf-thesaurus" "イタリアのフィレンツェ国立中央図書館のシソーラス" "ja")
(descr-as-in "bncf-thesaurus" "bibliographischer Eintrag der italienischen Nationalbibliothek" "de")
(descr-as-in "bncf-thesaurus" "link to Italian national thesaurus at BNCF" "en")

