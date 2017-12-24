(ns clazzes.heinrich_burkhardt
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Heinrich Burkhardt")

(name-as-in "Heinrich Burkhardt" "" "zh-hk")
(name-as-in "Heinrich Burkhardt" "" "pt")
(name-as-in "Heinrich Burkhardt" "Heinrich Burkhardt" "en")
(name-as-in "Heinrich Burkhardt" "Heinrich Burkhardt" "fr")
(name-as-in "Heinrich Burkhardt" "" "zh-tw")
(name-as-in "Heinrich Burkhardt" "Heinrich Burkhardt" "de")
(name-as-in "Heinrich Burkhardt" "" "ru")
(name-as-in "Heinrich Burkhardt" "Heinrich Burkhardt" "es")
(name-as-in "Heinrich Burkhardt" "" "ja")
(name-as-in "Heinrich Burkhardt" "" "zh-cn")
(name-as-in "Heinrich Burkhardt" "" "zh-sg")

(descr-as-in "Heinrich Burkhardt" "" "zh-hk")
(descr-as-in "Heinrich Burkhardt" "" "pt")
(descr-as-in "Heinrich Burkhardt" "German mathematician" "en")
(descr-as-in "Heinrich Burkhardt" "mathématicien allemand" "fr")
(descr-as-in "Heinrich Burkhardt" "" "zh-tw")
(descr-as-in "Heinrich Burkhardt" "deutscher Mathematiker" "de")
(descr-as-in "Heinrich Burkhardt" "" "ru")
(descr-as-in "Heinrich Burkhardt" "matemático alemán" "es")
(descr-as-in "Heinrich Burkhardt" "" "ja")
(descr-as-in "Heinrich Burkhardt" "" "zh-cn")
(descr-as-in "Heinrich Burkhardt" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Heinrich Burkhardt" "place-of-birth" "Q4126")

(refer-to ["properties.mathematics_genealogy_project_id"])
(fact claim "Heinrich Burkhardt" "mathematics-genealogy-project-id" "53045")

(refer-to ["properties.date_of_death"])
(fact claim "Heinrich Burkhardt" "date-of-death" "+1914-11-02T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Heinrich Burkhardt" "viaf-id" "30306401")

(refer-to ["properties.place_of_death"])
(fact claim "Heinrich Burkhardt" "place-of-death" "Q1726")

(refer-to ["properties.mactutor_id_biographies"])
(fact claim "Heinrich Burkhardt" "mactutor-id-biographies" "Burkhardt")

(refer-to ["properties.employer"])
(fact claim "Heinrich Burkhardt" "employer" "Q157808")
(refer-to ["clazzes.university_of_zurich"])
(fact claim "Heinrich Burkhardt" "employer" "University of Zurich")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Heinrich Burkhardt" "sex-or-gender" "male")

(refer-to ["properties.languages_spoken_written_or_signed"])
(refer-to ["clazzes.german"])
(fact claim "Heinrich Burkhardt" "languages-spoken-written-or-signed" "German")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Heinrich Burkhardt" "sudoc-authorities" "104086408")

(refer-to ["properties.hds_id"])
(fact claim "Heinrich Burkhardt" "hds-id" "43107")

(refer-to ["properties.member_of"])
(fact claim "Heinrich Burkhardt" "member-of" "Q543804")
(fact claim "Heinrich Burkhardt" "member-of" "Q684415")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Heinrich Burkhardt" "national-library-of-israel-id" "000520467")

(refer-to ["properties.snac_ark_id"])
(fact claim "Heinrich Burkhardt" "snac-ark-id" "w6cp9stt")

(refer-to ["properties.occupation"])
(fact claim "Heinrich Burkhardt" "occupation" "Q170790")
(fact claim "Heinrich Burkhardt" "occupation" "Q17486330")
(fact claim "Heinrich Burkhardt" "occupation" "Q1622272")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Heinrich Burkhardt" "country-of-citizenship" "Q183")

(refer-to ["properties.isni"])
(fact claim "Heinrich Burkhardt" "isni" "0000 0001 0962 7334")

(refer-to ["properties.gnd_id"])
(fact claim "Heinrich Burkhardt" "gnd-id" "117173967")

(refer-to ["properties.national_thesaurus_for_author_names_id"])
(fact claim "Heinrich Burkhardt" "national-thesaurus-for-author-names-id" "073337218")

(refer-to ["properties.educated_at"])
(fact claim "Heinrich Burkhardt" "educated-at" "Q152838")

(refer-to ["properties.open_library_id"])
(fact claim "Heinrich Burkhardt" "open-library-id" "OL2398298A")

(refer-to ["properties.instance_of"])
(fact claim "Heinrich Burkhardt" "instance-of" "Q5")

(refer-to ["properties.work_location"])
(fact claim "Heinrich Burkhardt" "work-location" "Q1726")
(fact claim "Heinrich Burkhardt" "work-location" "Q3033")
(fact claim "Heinrich Burkhardt" "work-location" "Q72")

(refer-to ["properties.given_name"])
(fact claim "Heinrich Burkhardt" "given-name" "Q2018484")

(refer-to ["properties.selibr"])
(fact claim "Heinrich Burkhardt" "selibr" "264411")

(refer-to ["properties.image"])
(fact claim "Heinrich Burkhardt" "image" "Burkhardt Heinrich.jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Heinrich Burkhardt" "date-of-birth" "+1861-10-10T00:00:00Z")
(fact claim "Heinrich Burkhardt" "date-of-birth" "+1861-10-15T00:00:00Z")

(refer-to ["properties.leopoldina_member_id"])
(fact claim "Heinrich Burkhardt" "leopoldina-member-id" "3124")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Heinrich Burkhardt" "library-of-congress-authority-id" "no96000419")
