(ns clazzes.nobel-prize-in-physics
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Nobel Prize in Physics")

(name-as-in "Nobel Prize in Physics" "諾貝爾物理學獎" "zh-hant")
(name-as-in "Nobel Prize in Physics" "诺贝尔物理学奖" "zh-hans")
(name-as-in "Nobel Prize in Physics" "Нобелевская премия по физике" "ru")
(name-as-in "Nobel Prize in Physics" "Nobel de Física" "pt")
(name-as-in "Nobel Prize in Physics" "Prix Nobel de physique" "fr")
(name-as-in "Nobel Prize in Physics" "" "es")
(name-as-in "Nobel Prize in Physics" "ノーベル物理学賞" "ja")
(name-as-in "Nobel Prize in Physics" "Nobelpreis für Physik" "de")
(name-as-in "Nobel Prize in Physics" "Nobel Prize in Physics" "en")

(descr-as-in "Nobel Prize in Physics" "" "zh-hant")
(descr-as-in "Nobel Prize in Physics" "" "zh-hans")
(descr-as-in "Nobel Prize in Physics" "" "ru")
(descr-as-in "Nobel Prize in Physics" "" "pt")
(descr-as-in "Nobel Prize in Physics" "" "fr")
(descr-as-in "Nobel Prize in Physics" "" "es")
(descr-as-in "Nobel Prize in Physics" "" "ja")
(descr-as-in "Nobel Prize in Physics" "" "de")
(descr-as-in "Nobel Prize in Physics" "Awarded once a year by the Royal Swedish Academy of Sciences" "en")

(fact claim "Nobel Prize in Physics" "part-of" "Nobel prize")

(fact claim "Nobel Prize in Physics" "commons-category" "Nobel Prize in Physics")

(fact claim "Nobel Prize in Physics" "image" "David Wineland 2008.jpg")

(fact claim "Nobel Prize in Physics" "image" "Nobel Prize diplom Wilhelm Conrad Röntgen.jpg")

(fact claim "Nobel Prize in Physics" "image" "Portrait of Albert Einstein and Others (1879-1955), Physicist.jpg")

(fact claim "Nobel Prize in Physics" "main-type-gnd" "term")

(fact claim "Nobel Prize in Physics" "subclass-of" "Nobel prize")

