(ns properties.date-of-birth
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "date-of-birth")

(name-as-in "date-of-birth" "出生日期" "zh-hant")
(name-as-in "date-of-birth" "出生日期" "zh-hans")
(name-as-in "date-of-birth" "дата рождения" "ru")
(name-as-in "date-of-birth" "data de nascimento" "pt")
(name-as-in "date-of-birth" "date de naissance" "fr")
(name-as-in "date-of-birth" "fecha de nacimiento" "es")
(name-as-in "date-of-birth" "生年月日" "ja")
(name-as-in "date-of-birth" "Geburtsdatum" "de")
(name-as-in "date-of-birth" "date of birth" "en")

(descr-as-in "date-of-birth" "" "zh-hant")
(descr-as-in "date-of-birth" "" "zh-hans")
(descr-as-in "date-of-birth" "день, месяц, год, в который субъект был рождён" "ru")
(descr-as-in "date-of-birth" "" "pt")
(descr-as-in "date-of-birth" "date à laquelle la personne est née" "fr")
(descr-as-in "date-of-birth" "fecha en la cual nació el sujeto" "es")
(descr-as-in "date-of-birth" "その人物が生まれた日付" "ja")
(descr-as-in "date-of-birth" "Datum, an dem eine Person geboren wurde" "de")
(descr-as-in "date-of-birth" "date on which the subject was born" "en")

