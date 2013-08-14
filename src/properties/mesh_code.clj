(ns properties.mesh-code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "mesh-code")

(name-as-in "mesh-code" "" "zh-hant")
(name-as-in "mesh-code" "" "zh-hans")
(name-as-in "mesh-code" "MeSH код" "ru")
(name-as-in "mesh-code" "" "pt")
(name-as-in "mesh-code" "arborescence MeSH" "fr")
(name-as-in "mesh-code" "" "es")
(name-as-in "mesh-code" "" "ja")
(name-as-in "mesh-code" "MeSH Code" "de")
(name-as-in "mesh-code" "MeSH Code" "en")

(descr-as-in "mesh-code" "" "zh-hant")
(descr-as-in "mesh-code" "" "zh-hans")
(descr-as-in "mesh-code" "код в иерархической классификации медицинских тем" "ru")
(descr-as-in "mesh-code" "" "pt")
(descr-as-in "mesh-code" "classification hierarchique de la base de donnée MeSH" "fr")
(descr-as-in "mesh-code" "" "es")
(descr-as-in "mesh-code" "" "ja")
(descr-as-in "mesh-code" "" "de")
(descr-as-in "mesh-code" "Medical Subject Headings (MeSH) codes are an index and thesaurus for the life sciences (≠ MeSH ID)" "en")

