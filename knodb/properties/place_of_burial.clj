(ns properties.place_of_burial
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "place-of-burial")

(name-as-in "place-of-burial" "墓地" "zh-hant")
(name-as-in "place-of-burial" "埋葬地" "zh-hans")
(name-as-in "place-of-burial" "место погребения" "ru")
(name-as-in "place-of-burial" "local de enterro" "pt")
(name-as-in "place-of-burial" "lieu d'enterrement" "fr")
(name-as-in "place-of-burial" "lugar de sepultura" "es")
(name-as-in "place-of-burial" "埋葬地" "ja")
(name-as-in "place-of-burial" "Begräbnisort" "de")
(name-as-in "place-of-burial" "place of burial" "en")

(descr-as-in "place-of-burial" "一個人的墳墓、埋葬地、骨灰撒放地點，等 (例：城市或墳場)。" "zh-hant")
(descr-as-in "place-of-burial" "一个人的坟墓、埋葬地、骨灰撒放地点，等 (例：城市或坟场)。" "zh-hans")
(descr-as-in "place-of-burial" "" "ru")
(descr-as-in "place-of-burial" "local onde o sujeito está enterrado" "pt")
(descr-as-in "place-of-burial" "lieu où le sujet est enterré" "fr")
(descr-as-in "place-of-burial" "lugar donde el sujeto se encuentra sepultado" "es")
(descr-as-in "place-of-burial" "この人の埋葬された場所（例：墓地、市など）。複数ある場合がある（例：改葬、再葬、記念碑、分骨など）。" "ja")
(descr-as-in "place-of-burial" "Ort des Grabes" "de")
(descr-as-in "place-of-burial" "location of grave, resting place, place of ash-scattering, etc, (e.g. city or cemetery) for a person. There may be several places: e.g. re-burials, cenotaphs, parts of body buried separately." "en")

