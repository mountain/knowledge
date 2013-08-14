(ns properties.official-language
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "official-language")

(name-as-in "official-language" "官方語言" "zh-hant")
(name-as-in "official-language" "官方语言" "zh-hans")
(name-as-in "official-language" "официальный язык" "ru")
(name-as-in "official-language" "língua oficial" "pt")
(name-as-in "official-language" "langue officielle" "fr")
(name-as-in "official-language" "idioma oficial" "es")
(name-as-in "official-language" "公用語" "ja")
(name-as-in "official-language" "Amtssprache" "de")
(name-as-in "official-language" "official language" "en")

(descr-as-in "official-language" "" "zh-hant")
(descr-as-in "official-language" "" "zh-hans")
(descr-as-in "official-language" "" "ru")
(descr-as-in "official-language" "" "pt")
(descr-as-in "official-language" "langue reconnue du pays" "fr")
(descr-as-in "official-language" "idioma oficial del elemento" "es")
(descr-as-in "official-language" "この項目が公用語としている言語" "ja")
(descr-as-in "official-language" "offizielle Sprache des Staates" "de")
(descr-as-in "official-language" "language designated as official by this item" "en")

