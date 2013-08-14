(ns properties.flag-image
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "flag-image")

(name-as-in "flag-image" "旗幟圖像" "zh-hant")
(name-as-in "flag-image" "旗帜图像" "zh-hans")
(name-as-in "flag-image" "изображение флага" "ru")
(name-as-in "flag-image" "imagem da bandeira" "pt")
(name-as-in "flag-image" "drapeau (image)" "fr")
(name-as-in "flag-image" "imagen de la bandera" "es")
(name-as-in "flag-image" "旗の画像" "ja")
(name-as-in "flag-image" "Flagge (Abbildung)" "de")
(name-as-in "flag-image" "flag image" "en")

(descr-as-in "flag-image" "項目的旗幟圖像" "zh-hant")
(descr-as-in "flag-image" "项的旗帜的图片" "zh-hans")
(descr-as-in "flag-image" "изображение флага элемента" "ru")
(descr-as-in "flag-image" "imagem da bandeira do item em questão" "pt")
(descr-as-in "flag-image" "image de l'emblème d'une nation" "fr")
(descr-as-in "flag-image" "Imagen de la bandera del elemento" "es")
(descr-as-in "flag-image" "国や地域の旗に関する画像" "ja")
(descr-as-in "flag-image" "Abbildung der Flagge" "de")
(descr-as-in "flag-image" "picture of the item's flag" "en")

