(ns clazzes.prussian_academy_of_sciences
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Prussian Academy of Sciences")

(name-as-in "Prussian Academy of Sciences" "普魯士科學院" "zh-hk")
(name-as-in "Prussian Academy of Sciences" "Academia de Ciências da Prússia" "pt")
(name-as-in "Prussian Academy of Sciences" "Prussian Academy of Sciences" "en")
(name-as-in "Prussian Academy of Sciences" "Académie royale des sciences de Prusse" "fr")
(name-as-in "Prussian Academy of Sciences" "普魯士科學院" "zh-tw")
(name-as-in "Prussian Academy of Sciences" "Preußische Akademie der Wissenschaften" "de")
(name-as-in "Prussian Academy of Sciences" "Прусская академия наук" "ru")
(name-as-in "Prussian Academy of Sciences" "Academia Prusiana de las Ciencias" "es")
(name-as-in "Prussian Academy of Sciences" "プロイセン科学アカデミー" "ja")
(name-as-in "Prussian Academy of Sciences" "普鲁士科学院" "zh-cn")
(name-as-in "Prussian Academy of Sciences" "普鲁士科学院" "zh-sg")

(descr-as-in "Prussian Academy of Sciences" "" "zh-hk")
(descr-as-in "Prussian Academy of Sciences" "" "pt")
(descr-as-in "Prussian Academy of Sciences" "academy of sciences" "en")
(descr-as-in "Prussian Academy of Sciences" "" "fr")
(descr-as-in "Prussian Academy of Sciences" "" "zh-tw")
(descr-as-in "Prussian Academy of Sciences" "1700 begründete in Berlin ansässige wissenschaftliche Akademie" "de")
(descr-as-in "Prussian Academy of Sciences" "академия наук в Берлине" "ru")
(descr-as-in "Prussian Academy of Sciences" "" "es")
(descr-as-in "Prussian Academy of Sciences" "" "ja")
(descr-as-in "Prussian Academy of Sciences" "" "zh-cn")
(descr-as-in "Prussian Academy of Sciences" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Prussian Academy of Sciences" "country" "Q183")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.prussian_academy_of_sciences"])
(fact claim "Prussian Academy of Sciences" "commons-category" "Prussian Academy of Sciences")

(refer-to ["properties.viaf_id"])
(fact claim "Prussian Academy of Sciences" "viaf-id" "138010007")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Prussian Academy of Sciences" "located-in-the-administrative-territorial-entity" "Q64")

(refer-to ["properties.topics_main_category"])
(fact claim "Prussian Academy of Sciences" "topic's-main-category" "Q8012951")

(refer-to ["properties.founded_by"])
(fact claim "Prussian Academy of Sciences" "founded-by" "Q151826")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Prussian Academy of Sciences" "sudoc-authorities" "032610696")

(refer-to ["properties.freebase_id"])
(fact claim "Prussian Academy of Sciences" "freebase-id" "/m/0260v1q")

(refer-to ["properties.inception"])
(fact claim "Prussian Academy of Sciences" "inception" "+1700-07-11T00:00:00Z")

(refer-to ["properties.manager_director"])
(fact claim "Prussian Academy of Sciences" "manager_director" "Q9047")

(refer-to ["properties.followed_by"])
(fact claim "Prussian Academy of Sciences" "followed-by" "Q49738")
(fact claim "Prussian Academy of Sciences" "followed-by" "Q219989")

(refer-to ["properties.gnd_id"])
(fact claim "Prussian Academy of Sciences" "gnd-id" "15514-7")

(refer-to ["properties.open_library_id"])
(fact claim "Prussian Academy of Sciences" "open-library-id" "OL6075461A")

(refer-to ["properties.instance_of"])
(fact claim "Prussian Academy of Sciences" "instance-of" "Q414147")

(refer-to ["properties.image"])
(fact claim "Prussian Academy of Sciences" "image" "Berlin Stabi UdL Eingang Preussische Akademie der Wissenschaften.jpg")

(refer-to ["properties.bhl_creator_id"])
(fact claim "Prussian Academy of Sciences" "bhl-creator-id" "10033")
