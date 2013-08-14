(ns properties.native-language
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "native-language")

(name-as-in "native-language" "母語" "zh-hant")
(name-as-in "native-language" "母语" "zh-hans")
(name-as-in "native-language" "родной язык" "ru")
(name-as-in "native-language" "língua materna" "pt")
(name-as-in "native-language" "langue maternelle" "fr")
(name-as-in "native-language" "lengua materna" "es")
(name-as-in "native-language" "母語" "ja")
(name-as-in "native-language" "Muttersprache" "de")
(name-as-in "native-language" "native language" "en")

(descr-as-in "native-language" "" "zh-hant")
(descr-as-in "native-language" "" "zh-hans")
(descr-as-in "native-language" "язык, который персона знает с рождения" "ru")
(descr-as-in "native-language" "língua materna do sujeito" "pt")
(descr-as-in "native-language" "première langue apprise par le sujet" "fr")
(descr-as-in "native-language" "idioma que la persona aprendió de manera nativa" "es")
(descr-as-in "native-language" "その人物が母語として習得した言語" "ja")
(descr-as-in "native-language" "in der frühen Kindheit ohne Unterricht erlernte Erstsprache" "de")
(descr-as-in "native-language" "language that a person learned natively" "en")

