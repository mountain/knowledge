(ns properties.local_dialing_code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "local-dialing-code")

(name-as-in "local-dialing-code" "電話區號" "zh-hant")
(name-as-in "local-dialing-code" "电话区号" "zh-hans")
(name-as-in "local-dialing-code" "местный телефонный код" "ru")
(name-as-in "local-dialing-code" "prefixo telefónico local" "pt")
(name-as-in "local-dialing-code" "indicatif téléphonique local" "fr")
(name-as-in "local-dialing-code" "prefijo telefónico local" "es")
(name-as-in "local-dialing-code" "市外局番" "ja")
(name-as-in "local-dialing-code" "Ortsvorwahl" "de")
(name-as-in "local-dialing-code" "local dialing code" "en")

(descr-as-in "local-dialing-code" "" "zh-hant")
(descr-as-in "local-dialing-code" "" "zh-hans")
(descr-as-in "local-dialing-code" "" "ru")
(descr-as-in "local-dialing-code" "" "pt")
(descr-as-in "local-dialing-code" "code téléphonique dédié de la ville" "fr")
(descr-as-in "local-dialing-code" "" "es")
(descr-as-in "local-dialing-code" "この都市・地域の市外局番" "ja")
(descr-as-in "local-dialing-code" "die Ortsnetzzahl für das örtliche Telefonnetz" "de")
(descr-as-in "local-dialing-code" "code dedicated to subject city by the area communication network" "en")

