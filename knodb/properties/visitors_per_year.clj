(ns properties.visitors_per_year
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "visitors-per-year")

(name-as-in "visitors-per-year" "每年訪客數量" "zh-hk")
(name-as-in "visitors-per-year" "visitantes anuais" "pt")
(name-as-in "visitors-per-year" "visitors per year" "en")
(name-as-in "visitors-per-year" "nombre de visiteurs par an" "fr")
(name-as-in "visitors-per-year" "每年訪客人數" "zh-tw")
(name-as-in "visitors-per-year" "Besucher pro Jahr" "de")
(name-as-in "visitors-per-year" "число посетителей в год" "ru")
(name-as-in "visitors-per-year" "visitantes anuales" "es")
(name-as-in "visitors-per-year" "年間訪問者数" "ja")
(name-as-in "visitors-per-year" "每年访客人数" "zh-cn")
(name-as-in "visitors-per-year" "每年访客人数" "zh-sg")

(descr-as-in "visitors-per-year" "每年到此地參觀的訪客人數" "zh-hk")
(descr-as-in "visitors-per-year" "número de pessoas que visitam um lugar a cada ano" "pt")
(descr-as-in "visitors-per-year" "number of people visiting a location each year" "en")
(descr-as-in "visitors-per-year" "nombre de personnes qui visitent un lieu chaque année" "fr")
(descr-as-in "visitors-per-year" "每年到此地參觀的訪客人數" "zh-tw")
(descr-as-in "visitors-per-year" "Anzahl der Menschen, die den Ort pro Jahr besuchen" "de")
(descr-as-in "visitors-per-year" "число людей, посетивших некоторый объект за год" "ru")
(descr-as-in "visitors-per-year" "número de personas que visitan un lugar cada año" "es")
(descr-as-in "visitors-per-year" "年間の訪問者数" "ja")
(descr-as-in "visitors-per-year" "每年到此地旅游的访客人数" "zh-cn")
(descr-as-in "visitors-per-year" "每年到此地旅游的访客人数" "zh-sg")

