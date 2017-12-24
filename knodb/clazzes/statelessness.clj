(ns clazzes.statelessness
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "statelessness")

(name-as-in "statelessness" "無國籍" "zh-hk")
(name-as-in "statelessness" "apátrida" "pt")
(name-as-in "statelessness" "statelessness" "en")
(name-as-in "statelessness" "apatride" "fr")
(name-as-in "statelessness" "無國籍" "zh-tw")
(name-as-in "statelessness" "staatenlos" "de")
(name-as-in "statelessness" "апатрид" "ru")
(name-as-in "statelessness" "apátrida" "es")
(name-as-in "statelessness" "無国籍" "ja")
(name-as-in "statelessness" "无国籍" "zh-cn")
(name-as-in "statelessness" "无国籍" "zh-sg")

(descr-as-in "statelessness" "" "zh-hk")
(descr-as-in "statelessness" "" "pt")
(descr-as-in "statelessness" "status of a person who is not a citizen/national of any country" "en")
(descr-as-in "statelessness" "statut d'une personne qui n'a la nationalité d'aucun pays" "fr")
(descr-as-in "statelessness" "" "zh-tw")
(descr-as-in "statelessness" "Eigenschaft einer Person ohne Staatsangehörigkeit" "de")
(descr-as-in "statelessness" "физическое лицо, не имеющее какого-либо гражданства или подданства" "ru")
(descr-as-in "statelessness" "condición de una persona que no es ciudadano de ningún país" "es")
(descr-as-in "statelessness" "" "ja")
(descr-as-in "statelessness" "" "zh-cn")
(descr-as-in "statelessness" "" "zh-sg")


(refer-to ["properties.commons_category"])
(fact claim "statelessness" "commons-category" "Statelessness")

(refer-to ["properties.encyclopedia_of_modern_ukraine_id"])
(fact claim "statelessness" "encyclopedia-of-modern-ukraine-id" "43095")

(refer-to ["properties.topics_main_category"])
(fact claim "statelessness" "topic's-main-category" "Q7730293")

(refer-to ["properties.freebase_id"])
(fact claim "statelessness" "freebase-id" "/m/02p31x7")

(refer-to ["properties.ndl_auth_id"])
(fact claim "statelessness" "ndl-auth-id" "00567908")

(refer-to ["properties.gnd_id"])
(fact claim "statelessness" "gnd-id" "4182628-0")

(refer-to ["properties.image"])
(fact claim "statelessness" "image" "UN-laissez-passer.jpg")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "statelessness" "bncf-thesaurus" "41591")

(refer-to ["properties.quora_topic_id"])
(fact claim "statelessness" "quora-topic-id" "Statelessness")
