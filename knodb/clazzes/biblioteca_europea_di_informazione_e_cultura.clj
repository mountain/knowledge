(ns clazzes.biblioteca_europea_di_informazione_e_cultura
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Biblioteca Europea di Informazione e Cultura")

(name-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-hk")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "" "pt")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "Biblioteca Europea di Informazione e Cultura" "en")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "Biblioteca Europea di Informazione e Cultura" "fr")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-tw")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "Biblioteca Europea di Informazione e Cultura" "de")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "Европейская библиотека по информации и культуре" "ru")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "Biblioteca Europea de Información y Cultura" "es")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "" "ja")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-cn")
(name-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-sg")

(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-hk")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "pt")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "library in Milan" "en")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "bibliothèque numérique italienne aux contenus sélectifs" "fr")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-tw")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "de")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "ru")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "es")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "ja")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-cn")
(descr-as-in "Biblioteca Europea di Informazione e Cultura" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "country" "Q38")

(refer-to ["properties.commons_category"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "commons-category" "BEIC")

(refer-to ["properties.eu_vat_number"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "eu-vat-number" "IT07469510965")

(refer-to ["properties.commons_institution_page"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "commons-institution-page" "BEIC")

(refer-to ["properties.postal_code"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "postal-code" "20121")

(refer-to ["properties.coordinate_location"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "coordinate-location" "lng 9.1891237 lat 45.4649112 alt ")

(refer-to ["properties.inception"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "inception" "+2004-00-00T00:00:00Z")

(refer-to ["properties.official_website"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "official-website" "http://beic.it")

(refer-to ["properties.gnd_id"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "gnd-id" "4747568-7")

(refer-to ["properties.instance_of"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "instance-of" "Q7075")

(refer-to ["properties.international_standard_identifier_for_libraries"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "international-standard-identifier-for-libraries" "IT-MI1358")

(refer-to ["properties.located_at_street_address"])
(fact claim "Biblioteca Europea di Informazione e Cultura" "located-at-street-address" "Via Silvio Pellico, 1, Milan")
