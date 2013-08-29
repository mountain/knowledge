(ns properties.nuts_code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "nuts-code")

(name-as-in "nuts-code" "NUTS歐盟地區代碼" "zh-hant")
(name-as-in "nuts-code" "NUTS欧盟地区代码" "zh-hans")
(name-as-in "nuts-code" "код NUTS" "ru")
(name-as-in "nuts-code" "" "pt")
(name-as-in "nuts-code" "" "fr")
(name-as-in "nuts-code" "NUTS" "es")
(name-as-in "nuts-code" "" "ja")
(name-as-in "nuts-code" "NUTS" "de")
(name-as-in "nuts-code" "NUTS code" "en")

(descr-as-in "nuts-code" "" "zh-hant")
(descr-as-in "nuts-code" "" "zh-hans")
(descr-as-in "nuts-code" "" "ru")
(descr-as-in "nuts-code" "" "pt")
(descr-as-in "nuts-code" "" "fr")
(descr-as-in "nuts-code" "" "es")
(descr-as-in "nuts-code" "" "ja")
(descr-as-in "nuts-code" "Systematik der Gebietseinheiten für die Statistik in der Europäischen Union" "de")
(descr-as-in "nuts-code" "NUTS-Code of a region" "en")

