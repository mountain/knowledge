(ns entities.swiss-literary-archives
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Swiss Literary Archives")

(name-as-in "Swiss Literary Archives" "" "zh-hant")
(name-as-in "Swiss Literary Archives" "" "zh-hans")
(name-as-in "Swiss Literary Archives" "Швейцарский литературный архив" "ru")
(name-as-in "Swiss Literary Archives" "" "pt")
(name-as-in "Swiss Literary Archives" "Archives littéraires suisses" "fr")
(name-as-in "Swiss Literary Archives" "" "es")
(name-as-in "Swiss Literary Archives" "" "ja")
(name-as-in "Swiss Literary Archives" "Schweizerisches Literaturarchiv" "de")
(name-as-in "Swiss Literary Archives" "Swiss Literary Archives" "en")

(descr-as-in "Swiss Literary Archives" "" "zh-hant")
(descr-as-in "Swiss Literary Archives" "" "zh-hans")
(descr-as-in "Swiss Literary Archives" "" "ru")
(descr-as-in "Swiss Literary Archives" "" "pt")
(descr-as-in "Swiss Literary Archives" "" "fr")
(descr-as-in "Swiss Literary Archives" "" "es")
(descr-as-in "Swiss Literary Archives" "" "ja")
(descr-as-in "Swiss Literary Archives" "" "de")
(descr-as-in "Swiss Literary Archives" "" "en")

(fact claim "Swiss Literary Archives" "main-type-gnd" "geographical feature")

(fact claim "Swiss Literary Archives" "country" "Switzerland")

(fact claim "Swiss Literary Archives" "is-in-the-administrative-unit" "Bern")

(fact claim "Swiss Literary Archives" "is-in-the-administrative-unit" "Canton of Bern")

(fact claim "Swiss Literary Archives" "pcp-reference-number" "8835")

(fact claim "Swiss Literary Archives" "instance-of" "cultural property")

