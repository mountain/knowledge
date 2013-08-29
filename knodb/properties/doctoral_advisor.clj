(ns properties.doctoral_advisor
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "doctoral-advisor")

(name-as-in "doctoral-advisor" "博士生導師" "zh-hant")
(name-as-in "doctoral-advisor" "博士生导师" "zh-hans")
(name-as-in "doctoral-advisor" "научный руководитель" "ru")
(name-as-in "doctoral-advisor" "orientador de doutorado" "pt")
(name-as-in "doctoral-advisor" "directeur de thèse" "fr")
(name-as-in "doctoral-advisor" "director de tesis" "es")
(name-as-in "doctoral-advisor" "指導教授" "ja")
(name-as-in "doctoral-advisor" "Doktorvater" "de")
(name-as-in "doctoral-advisor" "doctoral advisor" "en")

(descr-as-in "doctoral-advisor" "指導本項目博士論文的人" "zh-hant")
(descr-as-in "doctoral-advisor" "指导本项目博士论文的人" "zh-hans")
(descr-as-in "doctoral-advisor" "человек, курировавший подготовку диссертации" "ru")
(descr-as-in "doctoral-advisor" "" "pt")
(descr-as-in "doctoral-advisor" "personne ayant dirigé les études doctorales du sujet" "fr")
(descr-as-in "doctoral-advisor" "persona que supervisó la tesis del sujeto" "es")
(descr-as-in "doctoral-advisor" "その人物の博士論文の指導をした人物" "ja")
(descr-as-in "doctoral-advisor" "Person, welche den Studenten bei seiner Doktorarbeit betreut" "de")
(descr-as-in "doctoral-advisor" "person who supervised the doctorate or PhD thesis of the subject" "en")

