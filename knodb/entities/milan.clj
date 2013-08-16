(ns entities.milan
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Milan")

(name-as-in "Milan" "米蘭" "zh-hant")
(name-as-in "Milan" "米兰" "zh-hans")
(name-as-in "Milan" "Милан" "ru")
(name-as-in "Milan" "Milão" "pt")
(name-as-in "Milan" "Milan" "fr")
(name-as-in "Milan" "Milán" "es")
(name-as-in "Milan" "ミラノ" "ja")
(name-as-in "Milan" "Mailand" "de")
(name-as-in "Milan" "Milan" "en")

(descr-as-in "Milan" "" "zh-hant")
(descr-as-in "Milan" "" "zh-hans")
(descr-as-in "Milan" "коммуна Италии" "ru")
(descr-as-in "Milan" "comuna italiana" "pt")
(descr-as-in "Milan" "ville d'Italie" "fr")
(descr-as-in "Milan" "ciudad de Italia" "es")
(descr-as-in "Milan" "コムーネ" "ja")
(descr-as-in "Milan" "italienische Großstadt, Hauptstadt der Provinz Mailand" "de")
(descr-as-in "Milan" "second-largest city in Italy" "en")


(refer-to ["properties.local_dialing_code"])
(fact claim "Milan" "local-dialing-code" "02")

(refer-to ["properties.locator_map_image"])
(fact claim "Milan" "locator-map-image" "Map of comune of Milan (province of Milan, region Lombardy, Italy).svg")

(refer-to ["properties.type_of_administrative_division"])
(refer-to ["clazzes.comune"])
(fact claim "Milan" "type-of-administrative-division" "comune")

(refer-to ["properties.iso_3166_2"])
(fact claim "Milan" "iso-3166-2" "IT-MI")

(refer-to ["properties.time_zone"])
(refer-to ["clazzes.utc_01_00"])
(fact claim "Milan" "time-zone" "UTC+01:00")

(refer-to ["properties.head_of_government"])
(refer-to ["entities.giuliano_pisapia"])
(fact claim "Milan" "head-of-government" "Giuliano Pisapia")
(refer-to ["entities.gabriele_albertini"])
(fact claim "Milan" "head-of-government" "Gabriele Albertini")
(refer-to ["entities.marco_formentini"])
(fact claim "Milan" "head-of-government" "Marco Formentini")
(refer-to ["entities.giampiero_borghini"])
(fact claim "Milan" "head-of-government" "Giampiero Borghini")
(refer-to ["entities.letizia_moratti"])
(fact claim "Milan" "head-of-government" "Letizia Moratti")

(refer-to ["properties.openstreetmap_relation_id"])
(fact claim "Milan" "openstreetmap-relation-id" "44915")

(refer-to ["properties.istat_id"])
(fact claim "Milan" "istat-id" "015146")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Milan" "main-type-gnd" "geographical feature")

(refer-to ["properties.coordinate_location"])
(fact claim "Milan" "coordinate-location" "lng 9.1666666666667 lat 45.466666666667 alt ")

(refer-to ["properties.patron_saint"])
(refer-to ["entities.ambrose"])
(fact claim "Milan" "patron-saint" "Ambrose")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Milan" "coat-of-arms-image" "CoA Città di Milano.svg")

(refer-to ["properties.flag_image"])
(fact claim "Milan" "flag-image" "Flag of Milan.svg")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.city_with_millions_of_inhabitants"])
(fact claim "Milan" "instance-of" "city with millions of inhabitants")

(refer-to ["properties.shares_border_with"])
(refer-to ["entities.assago"])
(fact claim "Milan" "shares-border-with" "Assago")
(refer-to ["entities.arese"])
(fact claim "Milan" "shares-border-with" "Arese")
(refer-to ["entities.baranzate"])
(fact claim "Milan" "shares-border-with" "Baranzate")
(refer-to ["entities.bresso"])
(fact claim "Milan" "shares-border-with" "Bresso")
(refer-to ["entities.buccinasco"])
(fact claim "Milan" "shares-border-with" "Buccinasco")
(refer-to ["entities.cesano_boscone"])
(fact claim "Milan" "shares-border-with" "Cesano Boscone")
(refer-to ["entities.cologno_monzese"])
(fact claim "Milan" "shares-border-with" "Cologno Monzese")
(refer-to ["entities.corsico"])
(fact claim "Milan" "shares-border-with" "Corsico")
(refer-to ["entities.cormano"])
(fact claim "Milan" "shares-border-with" "Cormano")
(refer-to ["entities.cusago"])
(fact claim "Milan" "shares-border-with" "Cusago")
(refer-to ["entities.novate_milanese"])
(fact claim "Milan" "shares-border-with" "Novate Milanese")
(refer-to ["entities.opera"])
(fact claim "Milan" "shares-border-with" "Opera")
(refer-to ["entities.pero"])
(fact claim "Milan" "shares-border-with" "Pero")
(refer-to ["entities.peschiera_borromeo"])
(fact claim "Milan" "shares-border-with" "Peschiera Borromeo")
(refer-to ["entities.rho"])
(fact claim "Milan" "shares-border-with" "Rho")
(refer-to ["entities.rozzano"])
(fact claim "Milan" "shares-border-with" "Rozzano")
(refer-to ["entities.san_donato_milanese"])
(fact claim "Milan" "shares-border-with" "San Donato Milanese")
(refer-to ["entities.segrate"])
(fact claim "Milan" "shares-border-with" "Segrate")
(refer-to ["entities.sesto_san_giovanni"])
(fact claim "Milan" "shares-border-with" "Sesto San Giovanni")
(refer-to ["entities.settimo_milanese"])
(fact claim "Milan" "shares-border-with" "Settimo Milanese")
(refer-to ["entities.trezzano_sul_naviglio"])
(fact claim "Milan" "shares-border-with" "Trezzano sul Naviglio")
(refer-to ["entities.vimodrone"])
(fact claim "Milan" "shares-border-with" "Vimodrone")

(refer-to ["properties.country"])
(refer-to ["entities.italy"])
(fact claim "Milan" "country" "Italy")

(refer-to ["properties.twin_city"])
(refer-to ["entities.são_paulo_city"])
(fact claim "Milan" "twin-city" "São Paulo City")
(refer-to ["entities.chicago"])
(fact claim "Milan" "twin-city" "Chicago")
(refer-to ["entities.toronto"])
(fact claim "Milan" "twin-city" "Toronto")
(refer-to ["entities.melbourne"])
(fact claim "Milan" "twin-city" "Melbourne")
(refer-to ["entities.tel_aviv"])
(fact claim "Milan" "twin-city" "Tel Aviv")
(refer-to ["entities.kraków"])
(fact claim "Milan" "twin-city" "Kraków")
(refer-to ["entities.saint_petersburg"])
(fact claim "Milan" "twin-city" "Saint Petersburg")
(refer-to ["entities.osaka_city"])
(fact claim "Milan" "twin-city" "Osaka City")
(refer-to ["entities.shanghai"])
(fact claim "Milan" "twin-city" "Shanghai")
(refer-to ["entities.dakar"])
(fact claim "Milan" "twin-city" "Dakar")
(refer-to ["entities.lyon"])
(fact claim "Milan" "twin-city" "Lyon")
(refer-to ["entities.birmingham"])
(fact claim "Milan" "twin-city" "Birmingham")
(refer-to ["entities.bethlehem"])
(fact claim "Milan" "twin-city" "Bethlehem")
(refer-to ["entities.frankfurt"])
(fact claim "Milan" "twin-city" "Frankfurt")

(refer-to ["properties.postal_code"])
(fact claim "Milan" "postal-code" "20121")
(fact claim "Milan" "postal-code" "20122")
(fact claim "Milan" "postal-code" "20123")
(fact claim "Milan" "postal-code" "20124")
(fact claim "Milan" "postal-code" "20125")
(fact claim "Milan" "postal-code" "20126")
(fact claim "Milan" "postal-code" "20127")
(fact claim "Milan" "postal-code" "20128")
(fact claim "Milan" "postal-code" "20129")
(fact claim "Milan" "postal-code" "20131")
(fact claim "Milan" "postal-code" "20132")
(fact claim "Milan" "postal-code" "20133")
(fact claim "Milan" "postal-code" "20134")
(fact claim "Milan" "postal-code" "20135")
(fact claim "Milan" "postal-code" "20136")
(fact claim "Milan" "postal-code" "20137")
(fact claim "Milan" "postal-code" "20138")
(fact claim "Milan" "postal-code" "20139")
(fact claim "Milan" "postal-code" "20141")
(fact claim "Milan" "postal-code" "20142")
(fact claim "Milan" "postal-code" "20143")
(fact claim "Milan" "postal-code" "20144")
(fact claim "Milan" "postal-code" "20145")
(fact claim "Milan" "postal-code" "20146")
(fact claim "Milan" "postal-code" "20147")
(fact claim "Milan" "postal-code" "20148")
(fact claim "Milan" "postal-code" "20149")
(fact claim "Milan" "postal-code" "20151")
(fact claim "Milan" "postal-code" "20152")
(fact claim "Milan" "postal-code" "20153")
(fact claim "Milan" "postal-code" "20154")
(fact claim "Milan" "postal-code" "20155")
(fact claim "Milan" "postal-code" "20156")
(fact claim "Milan" "postal-code" "20157")
(fact claim "Milan" "postal-code" "20158")
(fact claim "Milan" "postal-code" "20159")
(fact claim "Milan" "postal-code" "20161")
(fact claim "Milan" "postal-code" "20162")

(refer-to ["properties.contains_administrative_division"])
(refer-to ["entities.zone_1_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 1 of Milan")
(refer-to ["entities.zone_2_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 2 of Milan")
(refer-to ["entities.zone_3_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 3 of Milan")
(refer-to ["entities.zone_4_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 4 of Milan")
(refer-to ["entities.zone_5_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 5 of Milan")
(refer-to ["entities.zone_6_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 6 of Milan")
(refer-to ["entities.zone_7_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 7 of Milan")
(refer-to ["entities.zone_8_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 8 of Milan")
(refer-to ["entities.zone_9_of_milan"])
(fact claim "Milan" "contains-administrative-division" "Zone 9 of Milan")

(refer-to ["properties.flag"])
(refer-to ["clazzes.flag_of_milan"])
(fact claim "Milan" "flag" "flag of Milan")

(refer-to ["properties.is_in_the_administrative_unit"])
(refer-to ["entities.province_of_milan"])
(fact claim "Milan" "is-in-the-administrative-unit" "Province of Milan")

(refer-to ["properties.commons_category"])
(refer-to ["entities.milan"])
(fact claim "Milan" "commons-category" "Milan")