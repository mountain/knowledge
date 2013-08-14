(ns entities.royal-society
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Organization "Royal Society")

(name-as-in "Royal Society" "皇家學會" "zh-hant")
(name-as-in "Royal Society" "皇家学会" "zh-hans")
(name-as-in "Royal Society" "Лондонское королевское общество" "ru")
(name-as-in "Royal Society" "Royal Society" "pt")
(name-as-in "Royal Society" "Royal Society" "fr")
(name-as-in "Royal Society" "Royal Society" "es")
(name-as-in "Royal Society" "王立協会" "ja")
(name-as-in "Royal Society" "Royal Society" "de")
(name-as-in "Royal Society" "Royal Society" "en")

(descr-as-in "Royal Society" "" "zh-hant")
(descr-as-in "Royal Society" "" "zh-hans")
(descr-as-in "Royal Society" "" "ru")
(descr-as-in "Royal Society" "" "pt")
(descr-as-in "Royal Society" "" "fr")
(descr-as-in "Royal Society" "" "es")
(descr-as-in "Royal Society" "" "ja")
(descr-as-in "Royal Society" "" "de")
(descr-as-in "Royal Society" "an English learned society for science" "en")

(fact claim "Royal Society" "commons-category" "Royal Society")

(fact claim "Royal Society" "main-type-gnd" "organization")

(fact claim "Royal Society" "foundation_creation-date" "+00000001660-11-01T00:00:00Z")

(fact claim "Royal Society" "image" "RoyalSociety20040420CopyrightKaihsuTai.jpg")

(fact claim "Royal Society" "image" "Royal Society Edinburgh.jpg")

