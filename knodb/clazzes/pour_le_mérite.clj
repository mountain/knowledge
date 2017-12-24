(ns clazzes.pour_le_mérite
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Pour le Mérite")

(name-as-in "Pour le Mérite" "藍馬克斯勳章" "zh-hk")
(name-as-in "Pour le Mérite" "Pour le Mérite" "pt")
(name-as-in "Pour le Mérite" "Pour le Mérite" "en")
(name-as-in "Pour le Mérite" "ordre Pour le Mérite" "fr")
(name-as-in "Pour le Mérite" "藍馬克斯勳章" "zh-tw")
(name-as-in "Pour le Mérite" "Pour le Mérite" "de")
(name-as-in "Pour le Mérite" "Pour le Mérite" "ru")
(name-as-in "Pour le Mérite" "Pour le Mérite" "es")
(name-as-in "Pour le Mérite" "プール・ル・メリット勲章" "ja")
(name-as-in "Pour le Mérite" "蓝马克斯勋章" "zh-cn")
(name-as-in "Pour le Mérite" "蓝马克斯勋章" "zh-sg")

(descr-as-in "Pour le Mérite" "" "zh-hk")
(descr-as-in "Pour le Mérite" "" "pt")
(descr-as-in "Pour le Mérite" "Kingdom of Prussia's highest order of merit" "en")
(descr-as-in "Pour le Mérite" "plus haute décoration militaire prussienne entre 1740 et 1918" "fr")
(descr-as-in "Pour le Mérite" "" "zh-tw")
(descr-as-in "Pour le Mérite" "eine der bedeutendsten Auszeichnungen Preußens" "de")
(descr-as-in "Pour le Mérite" "орден Королевства Пруссия" "ru")
(descr-as-in "Pour le Mérite" "" "es")
(descr-as-in "Pour le Mérite" "" "ja")
(descr-as-in "Pour le Mérite" "" "zh-cn")
(descr-as-in "Pour le Mérite" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "Pour le Mérite" "subclass-of" "Q1788716")
(fact claim "Pour le Mérite" "subclass-of" "Q5124642")

(refer-to ["properties.country"])
(fact claim "Pour le Mérite" "country" "Q38872")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.pour_le_mérite"])
(fact claim "Pour le Mérite" "commons-category" "Pour le Mérite")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Pour le Mérite" "encyclopædia-britannica-online-id" "topic/Pour-le-Merite")

(refer-to ["properties.viaf_id"])
(fact claim "Pour le Mérite" "viaf-id" "191580284")

(refer-to ["properties.service_ribbon_image"])
(fact claim "Pour le Mérite" "service-ribbon-image" "D-PRU Pour le Merite 1 BAR.svg")

(refer-to ["properties.babelnet_id"])
(fact claim "Pour le Mérite" "babelnet-id" "02298262n")

(refer-to ["properties.topics_main_category"])
(fact claim "Pour le Mérite" "topic's-main-category" "Q10160092")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Pour le Mérite" "sudoc-authorities" "032468326")

(refer-to ["properties.bnf_id"])
(fact claim "Pour le Mérite" "bnf-id" "12349276r")

(refer-to ["properties.freebase_id"])
(fact claim "Pour le Mérite" "freebase-id" "/m/01qy58")

(refer-to ["properties.inception"])
(fact claim "Pour le Mérite" "inception" "+1668-00-00T00:00:00Z")

(refer-to ["properties.official_website"])
(fact claim "Pour le Mérite" "official-website" "http://www.orden-pourlemerite.de/")

(refer-to ["properties.gnd_id"])
(fact claim "Pour le Mérite" "gnd-id" "4133445-0")

(refer-to ["properties.described_by_source"])
(fact claim "Pour le Mérite" "described-by-source" "Q2041543")

(refer-to ["properties.instance_of"])
(fact claim "Pour le Mérite" "instance-of" "Q18328097")
(fact claim "Pour le Mérite" "instance-of" "Q193622")
(fact claim "Pour le Mérite" "instance-of" "Q2003221")

(refer-to ["properties.image"])
(fact claim "Pour le Mérite" "image" "Kruis van de Orde Pour le Mérite 1914.gif")

(refer-to ["properties.category_for_recipients_of_this_award"])
(fact claim "Pour le Mérite" "category-for-recipients-of-this-award" "Q6254305")
