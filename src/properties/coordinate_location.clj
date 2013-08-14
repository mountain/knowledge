(ns properties.coordinate-location
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "coordinate-location")

(name-as-in "coordinate-location" "地理坐標" "zh-hant")
(name-as-in "coordinate-location" "地理坐标" "zh-hans")
(name-as-in "coordinate-location" "географические координаты" "ru")
(name-as-in "coordinate-location" "coordenadas" "pt")
(name-as-in "coordinate-location" "coordonnées géographiques" "fr")
(name-as-in "coordinate-location" "coordenadas" "es")
(name-as-in "coordinate-location" "位置座標" "ja")
(name-as-in "coordinate-location" "geographische Koordinate" "de")
(name-as-in "coordinate-location" "coordinate location" "en")

(descr-as-in "coordinate-location" "" "zh-hant")
(descr-as-in "coordinate-location" "" "zh-hans")
(descr-as-in "coordinate-location" "географические координаты данного предмета" "ru")
(descr-as-in "coordinate-location" "coordenadas geográficas da entidade" "pt")
(descr-as-in "coordinate-location" "coordonnées géographiques d'un objet" "fr")
(descr-as-in "coordinate-location" "coordenadas geográficas de la entidad" "es")
(descr-as-in "coordinate-location" "主語の座標" "ja")
(descr-as-in "coordinate-location" "Koordinate des Objekts" "de")
(descr-as-in "coordinate-location" "coordinates of the subject" "en")

