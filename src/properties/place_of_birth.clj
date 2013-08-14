(ns properties.place-of-birth
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "place-of-birth")

(name-as-in "place-of-birth" "出生地" "zh-hant")
(name-as-in "place-of-birth" "出生地" "zh-hans")
(name-as-in "place-of-birth" "место рождения" "ru")
(name-as-in "place-of-birth" "local de nascimento" "pt")
(name-as-in "place-of-birth" "lieu de naissance" "fr")
(name-as-in "place-of-birth" "lugar de nacimiento" "es")
(name-as-in "place-of-birth" "出生地" "ja")
(name-as-in "place-of-birth" "Geburtsort" "de")
(name-as-in "place-of-birth" "place of birth" "en")

(descr-as-in "place-of-birth" "" "zh-hant")
(descr-as-in "place-of-birth" "" "zh-hans")
(descr-as-in "place-of-birth" "" "ru")
(descr-as-in "place-of-birth" "local de nascimento da pessoa (o mais específico possível)" "pt")
(descr-as-in "place-of-birth" "lieu où la personne est née, le plus spécifique possible (exemple : ville plutôt que pays)" "fr")
(descr-as-in "place-of-birth" "Sitio donde nació una persona. Usar el sitio más específico disponible." "es")
(descr-as-in "place-of-birth" "最も詳細かつ知られた出生地（例：国ではなく市）" "ja")
(descr-as-in "place-of-birth" "Ort, in dem ein Mensch geboren wurde" "de")
(descr-as-in "place-of-birth" "the most specific known (e.g. city instead of country)" "en")

