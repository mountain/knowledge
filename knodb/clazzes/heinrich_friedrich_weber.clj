(ns clazzes.heinrich_friedrich_weber
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Heinrich Friedrich Weber")

(name-as-in "Heinrich Friedrich Weber" "" "zh-hk")
(name-as-in "Heinrich Friedrich Weber" "Heinrich Friedrich Weber" "pt")
(name-as-in "Heinrich Friedrich Weber" "Heinrich Friedrich Weber" "en")
(name-as-in "Heinrich Friedrich Weber" "Heinrich Friedrich Weber" "fr")
(name-as-in "Heinrich Friedrich Weber" "" "zh-tw")
(name-as-in "Heinrich Friedrich Weber" "Heinrich Friedrich Weber" "de")
(name-as-in "Heinrich Friedrich Weber" "Генрих Фридрих Вебер" "ru")
(name-as-in "Heinrich Friedrich Weber" "Heinrich Friedrich Weber" "es")
(name-as-in "Heinrich Friedrich Weber" "ハインリヒ・ウェーバー" "ja")
(name-as-in "Heinrich Friedrich Weber" "" "zh-cn")
(name-as-in "Heinrich Friedrich Weber" "" "zh-sg")

(descr-as-in "Heinrich Friedrich Weber" "" "zh-hk")
(descr-as-in "Heinrich Friedrich Weber" "" "pt")
(descr-as-in "Heinrich Friedrich Weber" "German physicist" "en")
(descr-as-in "Heinrich Friedrich Weber" "physicien suisse" "fr")
(descr-as-in "Heinrich Friedrich Weber" "" "zh-tw")
(descr-as-in "Heinrich Friedrich Weber" "Schweizer Physiker" "de")
(descr-as-in "Heinrich Friedrich Weber" "" "ru")
(descr-as-in "Heinrich Friedrich Weber" "físico alemán" "es")
(descr-as-in "Heinrich Friedrich Weber" "" "ja")
(descr-as-in "Heinrich Friedrich Weber" "" "zh-cn")
(descr-as-in "Heinrich Friedrich Weber" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Heinrich Friedrich Weber" "place-of-birth" "Q555609")

(refer-to ["properties.mathematics_genealogy_project_id"])
(fact claim "Heinrich Friedrich Weber" "mathematics-genealogy-project-id" "127770")

(refer-to ["properties.date_of_death"])
(fact claim "Heinrich Friedrich Weber" "date-of-death" "+1912-05-24T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Heinrich Friedrich Weber" "viaf-id" "8158389")

(refer-to ["properties.place_of_death"])
(fact claim "Heinrich Friedrich Weber" "place-of-death" "Q72")

(refer-to ["properties.mactutor_id_biographies"])
(fact claim "Heinrich Friedrich Weber" "mactutor-id-biographies" "Weber_Heinrich_F")

(refer-to ["properties.employer"])
(fact claim "Heinrich Friedrich Weber" "employer" "Q11942")

(refer-to ["properties.sex_or_gender"])
(fact claim "Heinrich Friedrich Weber" "sex-or-gender" "Q6581097")

(refer-to ["properties.student"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Heinrich Friedrich Weber" "student" "Albert Einstein")

(refer-to ["properties.hds_id"])
(fact claim "Heinrich Friedrich Weber" "hds-id" "31704")

(refer-to ["properties.doctoral_advisor"])
(fact claim "Heinrich Friedrich Weber" "doctoral-advisor" "Q76359")

(refer-to ["properties.freebase_id"])
(fact claim "Heinrich Friedrich Weber" "freebase-id" "/m/026xb6r")

(refer-to ["properties.snac_ark_id"])
(fact claim "Heinrich Friedrich Weber" "snac-ark-id" "w6rn55c3")

(refer-to ["properties.occupation"])
(fact claim "Heinrich Friedrich Weber" "occupation" "Q169470")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Heinrich Friedrich Weber" "country-of-citizenship" "Q151624")
(fact claim "Heinrich Friedrich Weber" "country-of-citizenship" "Q43287")
(fact claim "Heinrich Friedrich Weber" "country-of-citizenship" "Q39")

(refer-to ["properties.gnd_id"])
(fact claim "Heinrich Friedrich Weber" "gnd-id" "117163120")

(refer-to ["properties.educated_at"])
(fact claim "Heinrich Friedrich Weber" "educated-at" "Q154561")

(refer-to ["properties.instance_of"])
(fact claim "Heinrich Friedrich Weber" "instance-of" "Q5")

(refer-to ["properties.family_name"])
(fact claim "Heinrich Friedrich Weber" "family-name" "Q1409226")

(refer-to ["properties.given_name"])
(fact claim "Heinrich Friedrich Weber" "given-name" "Q2018484")

(refer-to ["properties.academic_tree_id"])
(fact claim "Heinrich Friedrich Weber" "academic-tree-id" "82154")

(refer-to ["properties.image"])
(fact claim "Heinrich Friedrich Weber" "image" "Heinrich Friedrich Weber.jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Heinrich Friedrich Weber" "date-of-birth" "+1843-11-07T00:00:00Z")
