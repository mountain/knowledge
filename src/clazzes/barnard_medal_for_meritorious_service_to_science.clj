(ns clazzes.barnard_medal_for_meritorious_service_to_science
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Barnard Medal for Meritorious Service to Science")

(name-as-in "Barnard Medal for Meritorious Service to Science" "" "zh-hant")
(name-as-in "Barnard Medal for Meritorious Service to Science" "" "zh-hans")
(name-as-in "Barnard Medal for Meritorious Service to Science" "" "ru")
(name-as-in "Barnard Medal for Meritorious Service to Science" "" "pt")
(name-as-in "Barnard Medal for Meritorious Service to Science" "Médaille Barnard" "fr")
(name-as-in "Barnard Medal for Meritorious Service to Science" "" "es")
(name-as-in "Barnard Medal for Meritorious Service to Science" "" "ja")
(name-as-in "Barnard Medal for Meritorious Service to Science" "Barnard-Medaille" "de")
(name-as-in "Barnard Medal for Meritorious Service to Science" "Barnard Medal for Meritorious Service to Science" "en")

(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "zh-hant")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "zh-hans")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "ru")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "pt")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "fr")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "es")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "ja")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "de")
(descr-as-in "Barnard Medal for Meritorious Service to Science" "" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "Barnard Medal for Meritorious Service to Science" "main-type-gnd" "term")
