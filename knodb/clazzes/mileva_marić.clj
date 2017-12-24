(ns clazzes.mileva_marić
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Mileva Marić")

(name-as-in "Mileva Marić" "" "zh-hk")
(name-as-in "Mileva Marić" "Mileva Marić" "pt")
(name-as-in "Mileva Marić" "Mileva Marić" "en")
(name-as-in "Mileva Marić" "Mileva Marić" "fr")
(name-as-in "Mileva Marić" "" "zh-tw")
(name-as-in "Mileva Marić" "Mileva Marić" "de")
(name-as-in "Mileva Marić" "Милева Эйнштейн-Марич" "ru")
(name-as-in "Mileva Marić" "Mileva Marić" "es")
(name-as-in "Mileva Marić" "ミレヴァ・マリッチ" "ja")
(name-as-in "Mileva Marić" "" "zh-cn")
(name-as-in "Mileva Marić" "" "zh-sg")

(descr-as-in "Mileva Marić" "" "zh-hk")
(descr-as-in "Mileva Marić" "" "pt")
(descr-as-in "Mileva Marić" "Serbian mathematician and wife of Albert Einstein" "en")
(descr-as-in "Mileva Marić" "mathématicienne serbe" "fr")
(descr-as-in "Mileva Marić" "" "zh-tw")
(descr-as-in "Mileva Marić" "serbische Physikerin und Mathematikerin, Ehefrau Albert Einsteins" "de")
(descr-as-in "Mileva Marić" "первая жена Альберта Эйнштейна, преподаватель физики и математики по образованию" "ru")
(descr-as-in "Mileva Marić" "matemática serbia" "es")
(descr-as-in "Mileva Marić" "" "ja")
(descr-as-in "Mileva Marić" "" "zh-cn")
(descr-as-in "Mileva Marić" "" "zh-sg")


(refer-to ["properties.commons_category"])
(refer-to ["clazzes.mileva_marić"])
(fact claim "Mileva Marić" "commons-category" "Mileva Marić")

(refer-to ["properties.place_of_birth"])
(fact claim "Mileva Marić" "place-of-birth" "Q913768")

(refer-to ["properties.date_of_death"])
(fact claim "Mileva Marić" "date-of-death" "+1948-08-04T00:00:00Z")

(refer-to ["properties.geni_com_profile_id"])
(fact claim "Mileva Marić" "geni_com-profile-id" "Mileva-Einstein/6000000009517887680")

(refer-to ["properties.viaf_id"])
(fact claim "Mileva Marić" "viaf-id" "7408788")

(refer-to ["properties.ethnic_group"])
(fact claim "Mileva Marić" "ethnic-group" "Q127885")

(refer-to ["properties.place_of_death"])
(fact claim "Mileva Marić" "place-of-death" "Q72")

(refer-to ["properties.image_of_grave"])
(fact claim "Mileva Marić" "image-of-grave" "Гроб Милеве Марић-Ајнштајн.jpg")

(refer-to ["properties.sex_or_gender"])
(fact claim "Mileva Marić" "sex-or-gender" "Q6581072")

(refer-to ["properties.father"])
(fact claim "Mileva Marić" "father" "Q30250395")

(refer-to ["properties.family"])
(fact claim "Mileva Marić" "family" "Q3292175")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Mileva Marić" "nkcr-aut-id" "jx20050826002")

(refer-to ["properties.languages_spoken_written_or_signed"])
(refer-to ["clazzes.german"])
(fact claim "Mileva Marić" "languages-spoken-written-or-signed" "German")
(fact claim "Mileva Marić" "languages-spoken-written-or-signed" "Q9299")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Mileva Marić" "sudoc-authorities" "02866616X")

(refer-to ["properties.hds_id"])
(fact claim "Mileva Marić" "hds-id" "42929")

(refer-to ["properties.bnf_id"])
(fact claim "Mileva Marić" "bnf-id" "120454597")

(refer-to ["properties.freebase_id"])
(fact claim "Mileva Marić" "freebase-id" "/m/01rywh")

(refer-to ["properties.child"])
(refer-to ["clazzes.lieserl_einstein"])
(fact claim "Mileva Marić" "child" "Lieserl Einstein")
(refer-to ["clazzes.eduard_einstein"])
(fact claim "Mileva Marić" "child" "Eduard Einstein")
(refer-to ["clazzes.hans_albert_einstein"])
(fact claim "Mileva Marić" "child" "Hans Albert Einstein")

(refer-to ["properties.snac_ark_id"])
(fact claim "Mileva Marić" "snac-ark-id" "w6j773j8")

(refer-to ["properties.fast_id"])
(fact claim "Mileva Marić" "fast-id" "162703")

(refer-to ["properties.occupation"])
(fact claim "Mileva Marić" "occupation" "Q170790")
(fact claim "Mileva Marić" "occupation" "Q901")
(fact claim "Mileva Marić" "occupation" "Q37226")
(refer-to ["clazzes.physicist"])
(fact claim "Mileva Marić" "occupation" "physicist")

(refer-to ["properties.spouse"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Mileva Marić" "spouse" "Albert Einstein")

(refer-to ["properties.residence"])
(fact claim "Mileva Marić" "residence" "Q55630")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Mileva Marić" "wikitree-person-id" "Marić-75")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Mileva Marić" "country-of-citizenship" "Q183")
(fact claim "Mileva Marić" "country-of-citizenship" "Q39")
(fact claim "Mileva Marić" "country-of-citizenship" "Q28513")

(refer-to ["properties.relative"])
(fact claim "Mileva Marić" "relative" "Q30254601")

(refer-to ["properties.isni"])
(fact claim "Mileva Marić" "isni" "0000 0001 1036 843X")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Mileva Marić" "ndl-auth-id" "00466039")

(refer-to ["properties.sibling"])
(fact claim "Mileva Marić" "sibling" "Q30253195")
(fact claim "Mileva Marić" "sibling" "Q30253327")

(refer-to ["properties.gnd_id"])
(fact claim "Mileva Marić" "gnd-id" "118688405")

(refer-to ["properties.national_thesaurus_for_author_names_id"])
(fact claim "Mileva Marić" "national-thesaurus-for-author-names-id" "102111049")

(refer-to ["properties.educated_at"])
(refer-to ["clazzes.university_of_zurich"])
(fact claim "Mileva Marić" "educated-at" "University of Zurich")
(refer-to ["clazzes.eth_zurich"])
(fact claim "Mileva Marić" "educated-at" "ETH Zurich")
(fact claim "Mileva Marić" "educated-at" "Q151510")

(refer-to ["properties.open_library_id"])
(fact claim "Mileva Marić" "open-library-id" "OL4909444A")

(refer-to ["properties.lac_id"])
(fact claim "Mileva Marić" "lac-id" "1006J6197")

(refer-to ["properties.instance_of"])
(fact claim "Mileva Marić" "instance-of" "Q5")

(refer-to ["properties.nukat_warsawu_authorities"])
(fact claim "Mileva Marić" "nukat-warsawu-authorities" "n2009136312")

(refer-to ["properties.family_name"])
(fact claim "Mileva Marić" "family-name" "Q21449580")

(refer-to ["properties.bne_id"])
(fact claim "Mileva Marić" "bne-id" "XX887199")

(refer-to ["properties.given_name"])
(fact claim "Mileva Marić" "given-name" "Q19967628")

(refer-to ["properties.mother"])
(fact claim "Mileva Marić" "mother" "Q30250473")

(refer-to ["properties.selibr"])
(fact claim "Mileva Marić" "selibr" "184711")

(refer-to ["properties.image"])
(fact claim "Mileva Marić" "image" "Mileva Maric.jpg")
(fact claim "Mileva Marić" "image" "Mileva Maric 1912.jpg")

(refer-to ["properties.place_of_interment"])
(fact claim "Mileva Marić" "place-of-interment" "Q1457378")

(refer-to ["properties.name_in_native_language"])
(fact claim "Mileva Marić" "name-in-native-language" "monolingualtext")

(refer-to ["properties.bibsys_id"])
(fact claim "Mileva Marić" "bibsys-id" "90600109")

(refer-to ["properties.date_of_birth"])
(fact claim "Mileva Marić" "date-of-birth" "+1875-12-19T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Mileva Marić" "library-of-congress-authority-id" "n85163829")
