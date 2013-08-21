(ns clazzes.cultural_property
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "cultural property")

(name-as-in "cultural property" "Kulturgut" "de")
(name-as-in "cultural property" "" "zh-hk")
(name-as-in "cultural property" "" "zh-tw")
(name-as-in "cultural property" "культурное достояние" "ru")
(name-as-in "cultural property" "" "pt")
(name-as-in "cultural property" "cultural property" "en")
(name-as-in "cultural property" "" "zh-cn")
(name-as-in "cultural property" "bien culturel" "fr")
(name-as-in "cultural property" "" "es")
(name-as-in "cultural property" "" "zh-sg")
(name-as-in "cultural property" "" "ja")
(name-as-in "cultural property" "" "zh-hans")
(name-as-in "cultural property" "" "zh-hant")

(descr-as-in "cultural property" "etwas was als kultureller Wert Bestand hat und bewahrt wird" "de")
(descr-as-in "cultural property" "" "zh-hk")
(descr-as-in "cultural property" "" "zh-tw")
(descr-as-in "cultural property" "" "ru")
(descr-as-in "cultural property" "" "pt")
(descr-as-in "cultural property" "physical constituents of the cultural heritage" "en")
(descr-as-in "cultural property" "" "zh-cn")
(descr-as-in "cultural property" "propriété faisant partie du patrimoine culturel" "fr")
(descr-as-in "cultural property" "" "es")
(descr-as-in "cultural property" "" "zh-sg")
(descr-as-in "cultural property" "" "ja")
(descr-as-in "cultural property" "" "zh-hans")
(descr-as-in "cultural property" "" "zh-hant")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "cultural property" "main-type-gnd" "term")

(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.cultural_heritage"])
(fact claim "cultural property" "subclass-of" "cultural heritage")

(refer-to ["properties.image"])
(fact claim "cultural property" "image" "Kulturdenkmal 4 Sprachen.jpg")

(refer-to ["properties.commons_category"])
(fact claim "cultural property" "commons-category" "Distinctive emblems for the Protection of Cultural Property")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "cultural property" "bncf-thesaurus" "8167")
