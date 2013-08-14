(ns properties.head_of_government
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "head-of-government")

(name-as-in "head-of-government" "政府首長" "zh-hant")
(name-as-in "head-of-government" "政府首长" "zh-hans")
(name-as-in "head-of-government" "глава правительства" "ru")
(name-as-in "head-of-government" "chefe de governo local" "pt")
(name-as-in "head-of-government" "chef de l'exécutif" "fr")
(name-as-in "head-of-government" "jefe de gobierno" "es")
(name-as-in "head-of-government" "地方行政府の長" "ja")
(name-as-in "head-of-government" "Leiter eines Regierungs- oder Verwaltungsorgans" "de")
(name-as-in "head-of-government" "head of government" "en")

(descr-as-in "head-of-government" "村鎮、城市、直轄區、國家或其他行政區域的最高管治者" "zh-hant")
(descr-as-in "head-of-government" "村镇、城市、直辖区、国家或其他行政区域的最高管治者" "zh-hans")
(descr-as-in "head-of-government" "высшее административное лицо, глава исполнительного органа города, муниципалитета, страны или другой правительственной структуры" "ru")
(descr-as-in "head-of-government" "" "pt")
(descr-as-in "head-of-government" "personne publique chargée du pouvoir exécutif (quel que soit le niveau, y compris national)" "fr")
(descr-as-in "head-of-government" "máxima autoridad administrativa y legislativa de un pueblo, ciudad, municipio, país u otros organismos gubernamentales" "es")
(descr-as-in "head-of-government" "地方行政府（市、町、その他の自治体）の首長" "ja")
(descr-as-in "head-of-government" "Leiter einer öffentlichen Einrichtung der Exekutive (ungeachtet der Ebene, einschließlich der nationalen)" "de")
(descr-as-in "head-of-government" "head of the executive power of a town, city, municipality, state, country, or other governmental body" "en")

