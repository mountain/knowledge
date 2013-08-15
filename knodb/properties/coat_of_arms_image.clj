(ns properties.coat_of_arms_image
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "coat-of-arms-image")

(name-as-in "coat-of-arms-image" "徽章圖像" "zh-hant")
(name-as-in "coat-of-arms-image" "徽章图像" "zh-hans")
(name-as-in "coat-of-arms-image" "изображение герба" "ru")
(name-as-in "coat-of-arms-image" "imagem do brasão" "pt")
(name-as-in "coat-of-arms-image" "image du blason" "fr")
(name-as-in "coat-of-arms-image" "imagen del escudo" "es")
(name-as-in "coat-of-arms-image" "紋章の画像" "ja")
(name-as-in "coat-of-arms-image" "Wappen" "de")
(name-as-in "coat-of-arms-image" "coat of arms image" "en")

(descr-as-in "coat-of-arms-image" "" "zh-hant")
(descr-as-in "coat-of-arms-image" "" "zh-hans")
(descr-as-in "coat-of-arms-image" "изображение герба данного элемента" "ru")
(descr-as-in "coat-of-arms-image" "imagem do brasão do item em questão" "pt")
(descr-as-in "coat-of-arms-image" "image du blason" "fr")
(descr-as-in "coat-of-arms-image" "imagen del escudo de armas del elemento" "es")
(descr-as-in "coat-of-arms-image" "その項目の紋章の画像" "ja")
(descr-as-in "coat-of-arms-image" "Abbildung des Wappenschilds" "de")
(descr-as-in "coat-of-arms-image" "image of the item's coat of arms" "en")

