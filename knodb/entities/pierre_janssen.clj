(ns entities.pierre_janssen
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Pierre Janssen")

(name-as-in "Pierre Janssen" "Jules Janssen" "de")
(name-as-in "Pierre Janssen" "皮埃爾·讓森" "zh-hk")
(name-as-in "Pierre Janssen" "皮埃爾·讓森" "zh-tw")
(name-as-in "Pierre Janssen" "Жансен, Пьер Жюль Сезар" "ru")
(name-as-in "Pierre Janssen" "Pierre Janssen" "pt")
(name-as-in "Pierre Janssen" "Pierre Janssen" "en")
(name-as-in "Pierre Janssen" "皮埃尔·让森" "zh-cn")
(name-as-in "Pierre Janssen" "Jules Janssen" "fr")
(name-as-in "Pierre Janssen" "Pierre Janssen" "es")
(name-as-in "Pierre Janssen" "皮埃尔·让森" "zh-sg")
(name-as-in "Pierre Janssen" "ピエール・ジャンサン" "ja")
(name-as-in "Pierre Janssen" "皮埃尔·让森" "zh-hans")
(name-as-in "Pierre Janssen" "皮埃爾·讓森" "zh-hant")

(descr-as-in "Pierre Janssen" "französischer Astronom" "de")
(descr-as-in "Pierre Janssen" "" "zh-hk")
(descr-as-in "Pierre Janssen" "" "zh-tw")
(descr-as-in "Pierre Janssen" "" "ru")
(descr-as-in "Pierre Janssen" "" "pt")
(descr-as-in "Pierre Janssen" "French astronomer" "en")
(descr-as-in "Pierre Janssen" "" "zh-cn")
(descr-as-in "Pierre Janssen" "astronome français" "fr")
(descr-as-in "Pierre Janssen" "" "es")
(descr-as-in "Pierre Janssen" "" "zh-sg")
(descr-as-in "Pierre Janssen" "" "ja")
(descr-as-in "Pierre Janssen" "" "zh-hans")
(descr-as-in "Pierre Janssen" "" "zh-hant")


(refer-to ["properties.award_received"])
(refer-to ["clazzes.chevalier_de_la_légion_d’honneur"])
(fact claim "Pierre Janssen" "award-received" "Chevalier de la Légion d’Honneur")
(refer-to ["clazzes.rumford_medal"])
(fact claim "Pierre Janssen" "award-received" "Rumford Medal")

(refer-to ["properties.member_of"])
(refer-to ["entities.royal_society"])
(fact claim "Pierre Janssen" "member-of" "Royal Society")
(refer-to ["entities.french_academy_of_sciences"])
(fact claim "Pierre Janssen" "member-of" "French Academy of Sciences")
(refer-to ["entities.société_philomathique_de_paris"])
(fact claim "Pierre Janssen" "member-of" "Société Philomathique de Paris")
(refer-to ["clazzes.bureau_des_longitudes"])
(fact claim "Pierre Janssen" "member-of" "Bureau des Longitudes")
(refer-to ["clazzes.société_française_de_photographie"])
(fact claim "Pierre Janssen" "member-of" "Société française de photographie")
(fact claim "Pierre Janssen" "member-of" "Q3092099")

(refer-to ["properties.lccn_identifier"])
(fact claim "Pierre Janssen" "lccn-identifier" "n2008071394")

(refer-to ["properties.bnf_identifier"])
(fact claim "Pierre Janssen" "bnf-identifier" "12109740z")

(refer-to ["properties.isni_iso_27729"])
(fact claim "Pierre Janssen" "isni-iso-27729" "0000 0001 2135 6637")

(refer-to ["properties.sudoc_identifier"])
(fact claim "Pierre Janssen" "sudoc-identifier" "029478804")

(refer-to ["properties.viaf_identifier"])
(fact claim "Pierre Janssen" "viaf-identifier" "61576849")

(refer-to ["properties.birth_name"])
(fact claim "Pierre Janssen" "birth-name" "Pierre Jules César Janssen")

(refer-to ["properties.occupation_person"])
(refer-to ["clazzes.astronomer"])
(fact claim "Pierre Janssen" "occupation-person" "astronomer")

(refer-to ["properties.gnd_identifier"])
(fact claim "Pierre Janssen" "gnd-identifier" "117083259")

(refer-to ["properties.date_of_birth"])
(fact claim "Pierre Janssen" "date-of-birth" "+00000001824-02-22T00:00:00Z")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Pierre Janssen" "main-type-gnd" "person")

(refer-to ["properties.place_of_burial"])
(refer-to ["entities.père_lachaise_cemetery"])
(fact claim "Pierre Janssen" "place-of-burial" "Père Lachaise Cemetery")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.meudon"])
(fact claim "Pierre Janssen" "place-of-death" "Meudon")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Pierre Janssen" "sex" "male")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.france"])
(fact claim "Pierre Janssen" "country-of-citizenship" "France")

(refer-to ["properties.image"])
(fact claim "Pierre Janssen" "image" "Jean Jacques Henner - Jules Janssen Orsay.jpg")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.paris"])
(fact claim "Pierre Janssen" "place-of-birth" "Paris")

(refer-to ["properties.date_of_death"])
(fact claim "Pierre Janssen" "date-of-death" "+00000001907-12-23T00:00:00Z")

(refer-to ["properties.commons_category"])
(fact claim "Pierre Janssen" "commons-category" "Jules Janssen")
