(ns properties.birth_name
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "birth-name")

(name-as-in "birth-name" "出生姓名" "zh-hant")
(name-as-in "birth-name" "出生姓名" "zh-hans")
(name-as-in "birth-name" "имя при рождении" "ru")
(name-as-in "birth-name" "" "pt")
(name-as-in "birth-name" "nom de naissance" "fr")
(name-as-in "birth-name" "nombre de nacimiento" "es")
(name-as-in "birth-name" "出生名" "ja")
(name-as-in "birth-name" "Geburtsname" "de")
(name-as-in "birth-name" "birth name" "en")

(descr-as-in "birth-name" "" "zh-hant")
(descr-as-in "birth-name" "" "zh-hans")
(descr-as-in "birth-name" "если отличается от текущего" "ru")
(descr-as-in "birth-name" "" "pt")
(descr-as-in "birth-name" "nom à la naissance, s'il diffère du nom usuel" "fr")
(descr-as-in "birth-name" "nombre al nacer, solamente usar si es diferente al nombre actual" "es")
(descr-as-in "birth-name" "出生時の名前。現在の名前と異なる場合に使用する。" "ja")
(descr-as-in "birth-name" "nur falls er sich vom aktuellen Namen unterscheidet" "de")
(descr-as-in "birth-name" "name at birth, only if different from current name" "en")

