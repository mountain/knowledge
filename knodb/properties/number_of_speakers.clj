(ns properties.number_of_speakers
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "number-of-speakers")

(name-as-in "number-of-speakers" "語言使用者人數" "zh-hk")
(name-as-in "number-of-speakers" "número de falantes" "pt")
(name-as-in "number-of-speakers" "number of speakers" "en")
(name-as-in "number-of-speakers" "nombre de locuteurs" "fr")
(name-as-in "number-of-speakers" "語言使用者人數" "zh-tw")
(name-as-in "number-of-speakers" "Sprecher (Anzahl)" "de")
(name-as-in "number-of-speakers" "число носителей языка" "ru")
(name-as-in "number-of-speakers" "número de hablantes" "es")
(name-as-in "number-of-speakers" "話者人口" "ja")
(name-as-in "number-of-speakers" "语言使用者人数" "zh-cn")
(name-as-in "number-of-speakers" "" "zh-sg")

(descr-as-in "number-of-speakers" "" "zh-hk")
(descr-as-in "number-of-speakers" "número de pessoas que falam um idioma" "pt")
(descr-as-in "number-of-speakers" "number of people who speak a language" "en")
(descr-as-in "number-of-speakers" "nombre de personnes qui parle une langue" "fr")
(descr-as-in "number-of-speakers" "" "zh-tw")
(descr-as-in "number-of-speakers" "Anzahl der Personen, die die Sprache sprechen" "de")
(descr-as-in "number-of-speakers" "число людей, которые говорят на этом языке" "ru")
(descr-as-in "number-of-speakers" "número de personas que hablan un idioma" "es")
(descr-as-in "number-of-speakers" "主題の言語を話す人の数" "ja")
(descr-as-in "number-of-speakers" "" "zh-cn")
(descr-as-in "number-of-speakers" "" "zh-sg")

