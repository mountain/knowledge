(ns properties.image
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "image")

(name-as-in "image" "圖片" "zh-hant")
(name-as-in "image" "图像" "zh-hans")
(name-as-in "image" "изображение" "ru")
(name-as-in "image" "imagem" "pt")
(name-as-in "image" "image" "fr")
(name-as-in "image" "imagen" "es")
(name-as-in "image" "画像" "ja")
(name-as-in "image" "Bild" "de")
(name-as-in "image" "image" "en")

(descr-as-in "image" "" "zh-hant")
(descr-as-in "image" "" "zh-hans")
(descr-as-in "image" "соответствующая иллюстрация" "ru")
(descr-as-in "image" "uma ilustração relevante" "pt")
(descr-as-in "image" "image illustrant l'élément" "fr")
(descr-as-in "image" "imagen ilustrativa del elemento" "es")
(descr-as-in "image" "関連する画像、挿絵" "ja")
(descr-as-in "image" "entsprechende Darstellung" "de")
(descr-as-in "image" "a relevant illustration; more specific properties should be used when more description is required" "en")

