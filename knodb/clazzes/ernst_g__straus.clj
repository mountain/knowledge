(ns clazzes.ernst_g__straus
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Ernst G. Straus")

(name-as-in "Ernst G. Straus" "" "zh-hk")
(name-as-in "Ernst G. Straus" "Ernst Gabor Straus" "pt")
(name-as-in "Ernst G. Straus" "Ernst G. Straus" "en")
(name-as-in "Ernst G. Straus" "Ernst G. Straus" "fr")
(name-as-in "Ernst G. Straus" "" "zh-tw")
(name-as-in "Ernst G. Straus" "Ernst Gabor Straus" "de")
(name-as-in "Ernst G. Straus" "Эрнст Штраус" "ru")
(name-as-in "Ernst G. Straus" "Ernst G. Straus" "es")
(name-as-in "Ernst G. Straus" "エルンスト・G・シュトラウス" "ja")
(name-as-in "Ernst G. Straus" "" "zh-cn")
(name-as-in "Ernst G. Straus" "" "zh-sg")

(descr-as-in "Ernst G. Straus" "" "zh-hk")
(descr-as-in "Ernst G. Straus" "" "pt")
(descr-as-in "Ernst G. Straus" "German-American mathematician" "en")
(descr-as-in "Ernst G. Straus" "mathématicien" "fr")
(descr-as-in "Ernst G. Straus" "" "zh-tw")
(descr-as-in "Ernst G. Straus" "deutsch-amerikanischer Mathematiker" "de")
(descr-as-in "Ernst G. Straus" "американский математик" "ru")
(descr-as-in "Ernst G. Straus" "matemático de Alemania y Estados Unidos" "es")
(descr-as-in "Ernst G. Straus" "" "ja")
(descr-as-in "Ernst G. Straus" "" "zh-cn")
(descr-as-in "Ernst G. Straus" "" "zh-sg")


(refer-to ["properties.field_of_work"])
(fact claim "Ernst G. Straus" "field-of-work" "Q76592")

(refer-to ["properties.place_of_birth"])
(fact claim "Ernst G. Straus" "place-of-birth" "Q1726")

(refer-to ["properties.mathematics_genealogy_project_id"])
(fact claim "Ernst G. Straus" "mathematics-genealogy-project-id" "48496")

(refer-to ["properties.date_of_death"])
(fact claim "Ernst G. Straus" "date-of-death" "+1983-07-12T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Ernst G. Straus" "viaf-id" "24140131")

(refer-to ["properties.student_of"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Ernst G. Straus" "student-of" "Albert Einstein")

(refer-to ["properties.place_of_death"])
(fact claim "Ernst G. Straus" "place-of-death" "Q65")

(refer-to ["properties.mactutor_id_biographies"])
(fact claim "Ernst G. Straus" "mactutor-id-biographies" "Straus")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Ernst G. Straus" "sex-or-gender" "male")

(refer-to ["properties.share_catalogue_author_id"])
(fact claim "Ernst G. Straus" "share-catalogue-author-id" "50669")

(refer-to ["properties.zbmath_author_id"])
(fact claim "Ernst G. Straus" "zbmath-author-id" "straus.ernst-g")

(refer-to ["properties.languages_spoken_written_or_signed"])
(fact claim "Ernst G. Straus" "languages-spoken-written-or-signed" "Q188")

(refer-to ["properties.erdős_number"])
(fact claim "Ernst G. Straus" "erdős-number" "quantity")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Ernst G. Straus" "sudoc-authorities" "032871724")

(refer-to ["properties.bnf_id"])
(fact claim "Ernst G. Straus" "bnf-id" "12381718v")

(refer-to ["properties.doctoral_advisor"])
(fact claim "Ernst G. Straus" "doctoral-advisor" "Q381349")

(refer-to ["properties.occupation"])
(fact claim "Ernst G. Straus" "occupation" "Q170790")
(fact claim "Ernst G. Straus" "occupation" "Q1622272")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Ernst G. Straus" "country-of-citizenship" "Q183")
(fact claim "Ernst G. Straus" "country-of-citizenship" "Q30")

(refer-to ["properties.isni"])
(fact claim "Ernst G. Straus" "isni" "0000 0001 1608 5772")

(refer-to ["properties.gnd_id"])
(fact claim "Ernst G. Straus" "gnd-id" "142458333")

(refer-to ["properties.educated_at"])
(fact claim "Ernst G. Straus" "educated-at" "Q174158")

(refer-to ["properties.dblp_id"])
(fact claim "Ernst G. Straus" "dblp-id" "33/5110")

(refer-to ["properties.instance_of"])
(fact claim "Ernst G. Straus" "instance-of" "Q5")

(refer-to ["properties.given_name"])
(fact claim "Ernst G. Straus" "given-name" "Q292691")

(refer-to ["properties.date_of_birth"])
(fact claim "Ernst G. Straus" "date-of-birth" "+1922-02-25T00:00:00Z")
(fact claim "Ernst G. Straus" "date-of-birth" "+1922-02-15T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Ernst G. Straus" "library-of-congress-authority-id" "no00027923")
