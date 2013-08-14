(ns properties.locator_map_image
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "locator-map-image")

(name-as-in "locator-map-image" "地理位置圖" "zh-hant")
(name-as-in "locator-map-image" "地理位置图图像" "zh-hans")
(name-as-in "locator-map-image" "изображение карты" "ru")
(name-as-in "locator-map-image" "mapa de localização" "pt")
(name-as-in "locator-map-image" "carte de localisation" "fr")
(name-as-in "locator-map-image" "mapa de localización" "es")
(name-as-in "locator-map-image" "位置地図画像" "ja")
(name-as-in "locator-map-image" "Lagekarte" "de")
(name-as-in "locator-map-image" "locator map image" "en")

(descr-as-in "locator-map-image" "" "zh-hant")
(descr-as-in "locator-map-image" "" "zh-hans")
(descr-as-in "locator-map-image" "изображение географической карты, которая показывает местоположение объекта" "ru")
(descr-as-in "locator-map-image" "mapa que salienta a localização de determinado local" "pt")
(descr-as-in "locator-map-image" "image de carte permettant de situer l'élément" "fr")
(descr-as-in "locator-map-image" "imagen de mapa que destaca la localización del sujeto" "es")
(descr-as-in "locator-map-image" "" "ja")
(descr-as-in "locator-map-image" "Landkarte, die den geographischen Ort des Objekts hervorhebt" "de")
(descr-as-in "locator-map-image" "geographic map image which highlights the location of the subject" "en")

