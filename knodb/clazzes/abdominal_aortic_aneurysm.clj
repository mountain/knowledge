(ns clazzes.abdominal_aortic_aneurysm
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "abdominal aortic aneurysm")

(name-as-in "abdominal aortic aneurysm" "" "zh-hk")
(name-as-in "abdominal aortic aneurysm" "aneurisma de aorta abdominal" "pt")
(name-as-in "abdominal aortic aneurysm" "abdominal aortic aneurysm" "en")
(name-as-in "abdominal aortic aneurysm" "anévrisme de l'aorte abdominale" "fr")
(name-as-in "abdominal aortic aneurysm" "" "zh-tw")
(name-as-in "abdominal aortic aneurysm" "Bauchaortenaneurysma" "de")
(name-as-in "abdominal aortic aneurysm" "аневризма брюшной аорты" "ru")
(name-as-in "abdominal aortic aneurysm" "aneurisma de aorta abdominal" "es")
(name-as-in "abdominal aortic aneurysm" "" "ja")
(name-as-in "abdominal aortic aneurysm" "" "zh-cn")
(name-as-in "abdominal aortic aneurysm" "" "zh-sg")

(descr-as-in "abdominal aortic aneurysm" "" "zh-hk")
(descr-as-in "abdominal aortic aneurysm" "" "pt")
(descr-as-in "abdominal aortic aneurysm" "aortic aneurysm that is located in the abdominal aorta" "en")
(descr-as-in "abdominal aortic aneurysm" "" "fr")
(descr-as-in "abdominal aortic aneurysm" "" "zh-tw")
(descr-as-in "abdominal aortic aneurysm" "Erkrankung der Hauptschlagader" "de")
(descr-as-in "abdominal aortic aneurysm" "" "ru")
(descr-as-in "abdominal aortic aneurysm" "" "es")
(descr-as-in "abdominal aortic aneurysm" "" "ja")
(descr-as-in "abdominal aortic aneurysm" "" "zh-cn")
(descr-as-in "abdominal aortic aneurysm" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "abdominal aortic aneurysm" "subclass-of" "Q616003")

(refer-to ["properties.umls_cui"])
(fact claim "abdominal aortic aneurysm" "umls-cui" "C0162871")

(refer-to ["properties.genetic_association"])
(fact claim "abdominal aortic aneurysm" "genetic-association" "Q14872724")
(fact claim "abdominal aortic aneurysm" "genetic-association" "Q535544")
(fact claim "abdominal aortic aneurysm" "genetic-association" "Q18052219")

(refer-to ["properties.commons_category"])
(fact claim "abdominal aortic aneurysm" "commons-category" "Abdominal aortic aneurysm")

(refer-to ["properties.icd_10"])
(fact claim "abdominal aortic aneurysm" "icd-10" "I71.3")
(fact claim "abdominal aortic aneurysm" "icd-10" "I71.4")

(refer-to ["properties.icd_9"])
(fact claim "abdominal aortic aneurysm" "icd-9" "441.3")
(fact claim "abdominal aortic aneurysm" "icd-9" "441.4")

(refer-to ["properties.medical_specialty"])
(fact claim "abdominal aortic aneurysm" "medical-specialty" "Q1498222")

(refer-to ["properties.gard_rare_disease_id"])
(fact claim "abdominal aortic aneurysm" "gard-rare-disease-id" "9181")

(refer-to ["properties.diseasesdb"])
(fact claim "abdominal aortic aneurysm" "diseasesdb" "792")

(refer-to ["properties.exact_match"])
(fact claim "abdominal aortic aneurysm" "exact-match" "http://purl.obolibrary.org/obo/DOID_7693")
(fact claim "abdominal aortic aneurysm" "exact-match" "http://identifiers.org/doid/DOID:7693")

(refer-to ["properties.internetmedicin_se_id"])
(fact claim "abdominal aortic aneurysm" "internetmedicin_se-id" "1523")

(refer-to ["properties.medlineplus_id"])
(fact claim "abdominal aortic aneurysm" "medlineplus-id" "000162")

(refer-to ["properties.freebase_id"])
(fact claim "abdominal aortic aneurysm" "freebase-id" "/m/03g23y")

(refer-to ["properties.mesh_id"])
(fact claim "abdominal aortic aneurysm" "mesh-id" "D017544")

(refer-to ["properties.emedicine"])
(fact claim "abdominal aortic aneurysm" "emedicine" "756735")
(fact claim "abdominal aortic aneurysm" "emedicine" "416266")

(refer-to ["properties.disease_ontology_id"])
(fact claim "abdominal aortic aneurysm" "disease-ontology-id" "DOID:7693")

(refer-to ["properties.instance_of"])
(fact claim "abdominal aortic aneurysm" "instance-of" "Q12136")

(refer-to ["properties.image"])
(fact claim "abdominal aortic aneurysm" "image" "AneurysmAortaWithArrows.jpg")
(fact claim "abdominal aortic aneurysm" "image" "Abdominal Aortic Aneurysm Location.png")

(refer-to ["properties.omim_id"])
(fact claim "abdominal aortic aneurysm" "omim-id" "100070")
(fact claim "abdominal aortic aneurysm" "omim-id" "609782")
(fact claim "abdominal aortic aneurysm" "omim-id" "611891")
(fact claim "abdominal aortic aneurysm" "omim-id" "614375")

(refer-to ["properties.jstor_topic_id"])
(fact claim "abdominal aortic aneurysm" "jstor-topic-id" "abdominal-aortic-aneurysm")

(refer-to ["properties.nci_thesaurus_id"])
(fact claim "abdominal aortic aneurysm" "nci-thesaurus-id" "C27000")
