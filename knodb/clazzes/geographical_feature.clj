(ns clazzes.geographical_feature
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "geographical feature")

(name-as-in "geographical feature" "地理特徵" "zh-hant")
(name-as-in "geographical feature" "地理特征" "zh-hans")
(name-as-in "geographical feature" "географический объект" "ru")
(name-as-in "geographical feature" "objeto geográfico" "pt")
(name-as-in "geographical feature" "lieu" "fr")
(name-as-in "geographical feature" "lugar" "es")
(name-as-in "geographical feature" "場所" "ja")
(name-as-in "geographical feature" "geographisches Objekt" "de")
(name-as-in "geographical feature" "geographical feature" "en")

(descr-as-in "geographical feature" "地方或地理名稱（用於屬性:P107“GND 類別）" "zh-hant")
(descr-as-in "geographical feature" "地方或地理名称（用于属性:P107“GND 类别）" "zh-hans")
(descr-as-in "geographical feature" "достаточно устойчивое образование, имеющее определённое местоположение (используется с Property:P107)" "ru")
(descr-as-in "geographical feature" "lugar ou nome geográfico" "pt")
(descr-as-in "geographical feature" "objet géographique" "fr")
(descr-as-in "geographical feature" "lugar o nombre geográfico" "es")
(descr-as-in "geographical feature" "場所または地名" "ja")
(descr-as-in "geographical feature" "Objekt, welches mittels Geodaten eindeutig referenzierbar ist oder war. (Auch astronomische Körper)" "de")
(descr-as-in "geographical feature" "place or geographic name (use with Property:P107 main type (GND))" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "geographical feature" "main-type-gnd" "term")

(refer-to ["properties.image"])
(fact claim "geographical feature" "image" "Terrace field yunnan china.jpg")
(fact claim "geographical feature" "image" "Paris Night.jpg")
(fact claim "geographical feature" "image" "Alpha centauri.jpg")
