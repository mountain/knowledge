(ns properties.twin_city
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "twin-city")

(name-as-in "twin-city" "友好城市" "zh-hant")
(name-as-in "twin-city" "友好城市" "zh-hans")
(name-as-in "twin-city" "город-побратим" "ru")
(name-as-in "twin-city" "geminação" "pt")
(name-as-in "twin-city" "jumelage" "fr")
(name-as-in "twin-city" "ciudad hermana" "es")
(name-as-in "twin-city" "姉妹都市" "ja")
(name-as-in "twin-city" "Partnerkommune" "de")
(name-as-in "twin-city" "twin city" "en")

(descr-as-in "twin-city" "" "zh-hant")
(descr-as-in "twin-city" "" "zh-hans")
(descr-as-in "twin-city" "" "ru")
(descr-as-in "twin-city" "cidades com que é geminada" "pt")
(descr-as-in "twin-city" "villes jumelées ou soeurs" "fr")
(descr-as-in "twin-city" "ciudad que han firmado acuerdo de cooperación y desarrollo humano" "es")
(descr-as-in "twin-city" "" "ja")
(descr-as-in "twin-city" "andere Kommune, zu der eine Partnerschaft besteht (z. B. Städtepartnerschaft)" "de")
(descr-as-in "twin-city" "twin towns, sister cities, twinned municipalities and other localities" "en")

