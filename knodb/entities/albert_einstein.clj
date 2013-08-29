(ns entities.albert_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Albert Einstein")

(name-as-in "Albert Einstein" "阿爾伯特·愛因斯坦" "zh-hant")
(name-as-in "Albert Einstein" "阿尔伯特·爱因斯坦" "zh-hans")
(name-as-in "Albert Einstein" "Альберт Эйнштейн" "ru")
(name-as-in "Albert Einstein" "Albert Einstein" "pt")
(name-as-in "Albert Einstein" "Albert Einstein" "fr")
(name-as-in "Albert Einstein" "Albert Einstein" "es")
(name-as-in "Albert Einstein" "アルベルト・アインシュタイン" "ja")
(name-as-in "Albert Einstein" "Albert Einstein" "de")
(name-as-in "Albert Einstein" "Albert Einstein" "en")

(descr-as-in "Albert Einstein" "" "zh-hant")
(descr-as-in "Albert Einstein" "" "zh-hans")
(descr-as-in "Albert Einstein" "физик-теоретик, один из основателей современной теоретической физики, лауреат Нобелевской премии, общественный деятель-гуманист" "ru")
(descr-as-in "Albert Einstein" "" "pt")
(descr-as-in "Albert Einstein" "physicien allemand" "fr")
(descr-as-in "Albert Einstein" "físico de Alemania" "es")
(descr-as-in "Albert Einstein" "" "ja")
(descr-as-in "Albert Einstein" "theoretischer Physiker" "de")
(descr-as-in "Albert Einstein" "German-American physicist and founder of the theory of relativity and gravity" "en")


(refer-to ["properties.award_received"])
(refer-to ["clazzes.barnard_medal_for_meritorious_service_to_science"])
(fact claim "Albert Einstein" "award-received" "Barnard Medal for Meritorious Service to Science")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "award-received" "Nobel Prize in Physics")
(refer-to ["clazzes.gold_medal_of_the_royal_astronomical_society"])
(fact claim "Albert Einstein" "award-received" "Gold Medal of the Royal Astronomical Society")
(refer-to ["clazzes.prix_jules_janssen"])
(fact claim "Albert Einstein" "award-received" "Prix Jules Janssen")
(refer-to ["clazzes.matteucci_medal"])
(fact claim "Albert Einstein" "award-received" "Matteucci Medal")
(refer-to ["clazzes.max_planck_medal"])
(fact claim "Albert Einstein" "award-received" "Max Planck Medal")
(refer-to ["clazzes.franklin_medal"])
(fact claim "Albert Einstein" "award-received" "Franklin Medal")
(refer-to ["clazzes.copley_medal"])
(fact claim "Albert Einstein" "award-received" "Copley Medal")

(refer-to ["properties.member_of"])
(refer-to ["entities.royal_society"])
(fact claim "Albert Einstein" "member-of" "Royal Society")

(refer-to ["properties.archives_at"])
(refer-to ["entities.swiss_literary_archives"])
(fact claim "Albert Einstein" "archives-at" "Swiss Literary Archives")

(refer-to ["properties.lccn_identifier"])
(fact claim "Albert Einstein" "lccn-identifier" "n79022889")

(refer-to ["properties.bnf_identifier"])
(fact claim "Albert Einstein" "bnf-identifier" "119016075")

(refer-to ["properties.native_language"])
(refer-to ["clazzes.german"])
(fact claim "Albert Einstein" "native-language" "German")

(refer-to ["properties.sudoc_identifier"])
(fact claim "Albert Einstein" "sudoc-identifier" "026849186")

(refer-to ["properties.musicbrainz_artist_id"])
(fact claim "Albert Einstein" "musicbrainz-artist-id" "c98c325e-7277-46e8-8b44-e3517f3e041a")

(refer-to ["properties.viaf_identifier"])
(fact claim "Albert Einstein" "viaf-identifier" "75121530")

(refer-to ["properties.occupation_person"])
(refer-to ["clazzes.physicist"])
(fact claim "Albert Einstein" "occupation-person" "physicist")

(refer-to ["properties.gnd_identifier"])
(fact claim "Albert Einstein" "gnd-identifier" "118529579")

(refer-to ["properties.date_of_birth"])
(fact claim "Albert Einstein" "date-of-birth" "+00000001879-03-14T00:00:00Z")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.person"])
(fact claim "Albert Einstein" "main-type-gnd" "person")

(refer-to ["properties.ndl_identifier"])
(fact claim "Albert Einstein" "ndl-identifier" "00438728")

(refer-to ["properties.mathematics_genealogy_project_identifier"])
(fact claim "Albert Einstein" "mathematics-genealogy-project-identifier" "53269")

(refer-to ["properties.signature"])
(fact claim "Albert Einstein" "signature" "Albert Einstein signature 1934.svg")

(refer-to ["properties.child"])
(refer-to ["entities.hans_albert_einstein"])
(fact claim "Albert Einstein" "child" "Hans Albert Einstein")
(refer-to ["entities.eduard_einstein"])
(fact claim "Albert Einstein" "child" "Eduard Einstein")
(refer-to ["entities.lieserl_einstein"])
(fact claim "Albert Einstein" "child" "Lieserl Einstein")

(refer-to ["properties.place_of_death"])
(refer-to ["entities.princeton"])
(fact claim "Albert Einstein" "place-of-death" "Princeton")

(refer-to ["properties.sex"])
(refer-to ["clazzes.male"])
(fact claim "Albert Einstein" "sex" "male")

(refer-to ["properties.father"])
(refer-to ["entities.hermann_einstein"])
(fact claim "Albert Einstein" "father" "Hermann Einstein")

(refer-to ["properties.alma_mater"])
(refer-to ["entities.luitpold_gymnasium"])
(fact claim "Albert Einstein" "alma-mater" "Luitpold Gymnasium")
(refer-to ["entities.eth_zurich"])
(fact claim "Albert Einstein" "alma-mater" "ETH Zurich")

(refer-to ["properties.spouse"])
(refer-to ["entities.mileva_marić"])
(fact claim "Albert Einstein" "spouse" "Mileva Marić")
(refer-to ["entities.elsa_einstein"])
(fact claim "Albert Einstein" "spouse" "Elsa Einstein")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["entities.austria_hungary"])
(fact claim "Albert Einstein" "country-of-citizenship" "Austria-Hungary")
(refer-to ["entities.kingdom_of_prussia"])
(fact claim "Albert Einstein" "country-of-citizenship" "Kingdom of Prussia")
(refer-to ["entities.austria"])
(fact claim "Albert Einstein" "country-of-citizenship" "Austria")
(refer-to ["entities.united_states_of_america"])
(fact claim "Albert Einstein" "country-of-citizenship" "United States of America")
(refer-to ["entities.kingdom_of_württemberg"])
(fact claim "Albert Einstein" "country-of-citizenship" "Kingdom of Württemberg")
(fact claim "Albert Einstein" "country-of-citizenship" "")
(refer-to ["entities.switzerland"])
(fact claim "Albert Einstein" "country-of-citizenship" "Switzerland")

(refer-to ["properties.image"])
(fact claim "Albert Einstein" "image" "Albert Einstein Head.jpg")
(fact claim "Albert Einstein" "image" "Einstein patentoffice full.jpg")
(fact claim "Albert Einstein" "image" "Albert Einstein (Nobel).jpg")
(fact claim "Albert Einstein" "image" "Albert Einstein portrait.jpg")
(fact claim "Albert Einstein" "image" "Einstein 1921 portrait2.jpg")

(refer-to ["properties.place_of_birth"])
(refer-to ["entities.ulm"])
(fact claim "Albert Einstein" "place-of-birth" "Ulm")

(refer-to ["properties.date_of_death"])
(fact claim "Albert Einstein" "date-of-death" "+00000001955-04-18T00:00:00Z")

(refer-to ["properties.commons_category"])
(refer-to ["entities.albert_einstein"])
(fact claim "Albert Einstein" "commons-category" "Albert Einstein")
