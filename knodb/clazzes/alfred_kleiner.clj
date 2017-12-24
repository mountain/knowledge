(ns clazzes.alfred_kleiner
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Alfred Kleiner")

(name-as-in "Alfred Kleiner" "阿爾弗雷德·克萊納" "zh-hk")
(name-as-in "Alfred Kleiner" "Alfred Kleiner" "pt")
(name-as-in "Alfred Kleiner" "Alfred Kleiner" "en")
(name-as-in "Alfred Kleiner" "Alfred Kleiner" "fr")
(name-as-in "Alfred Kleiner" "" "zh-tw")
(name-as-in "Alfred Kleiner" "Alfred Kleiner" "de")
(name-as-in "Alfred Kleiner" "Альфред Кляйнер" "ru")
(name-as-in "Alfred Kleiner" "Alfred Kleiner" "es")
(name-as-in "Alfred Kleiner" "アルフレート・クライナー" "ja")
(name-as-in "Alfred Kleiner" "" "zh-cn")
(name-as-in "Alfred Kleiner" "" "zh-sg")

(descr-as-in "Alfred Kleiner" "" "zh-hk")
(descr-as-in "Alfred Kleiner" "" "pt")
(descr-as-in "Alfred Kleiner" "Swiss physicist" "en")
(descr-as-in "Alfred Kleiner" "physicien suisse" "fr")
(descr-as-in "Alfred Kleiner" "" "zh-tw")
(descr-as-in "Alfred Kleiner" "schweizer Physiker" "de")
(descr-as-in "Alfred Kleiner" "" "ru")
(descr-as-in "Alfred Kleiner" "físico suizo" "es")
(descr-as-in "Alfred Kleiner" "" "ja")
(descr-as-in "Alfred Kleiner" "" "zh-cn")
(descr-as-in "Alfred Kleiner" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Alfred Kleiner" "place-of-birth" "Q64977")

(refer-to ["properties.mathematics_genealogy_project_id"])
(fact claim "Alfred Kleiner" "mathematics-genealogy-project-id" "22998")

(refer-to ["properties.date_of_death"])
(fact claim "Alfred Kleiner" "date-of-death" "+1916-07-03T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Alfred Kleiner" "viaf-id" "90850407")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Alfred Kleiner" "sex-or-gender" "male")

(refer-to ["properties.doctoral_student"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Alfred Kleiner" "doctoral-student" "Albert Einstein")

(refer-to ["properties.hds_id"])
(fact claim "Alfred Kleiner" "hds-id" "46483")

(refer-to ["properties.doctoral_advisor"])
(fact claim "Alfred Kleiner" "doctoral-advisor" "Q6216016")

(refer-to ["properties.freebase_id"])
(fact claim "Alfred Kleiner" "freebase-id" "/m/0f_32k")

(refer-to ["properties.occupation"])
(fact claim "Alfred Kleiner" "occupation" "Q169470")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Alfred Kleiner" "country-of-citizenship" "Q39")

(refer-to ["properties.instance_of"])
(fact claim "Alfred Kleiner" "instance-of" "Q5")

(refer-to ["properties.given_name"])
(fact claim "Alfred Kleiner" "given-name" "Q3480335")

(refer-to ["properties.academic_tree_id"])
(fact claim "Alfred Kleiner" "academic-tree-id" "25711")

(refer-to ["properties.image"])
(fact claim "Alfred Kleiner" "image" "ETH-BIB-Kleiner, Alfred (1849-1916)-Portrait-Portr 10505.tif (cropped).jpg")

(refer-to ["properties.date_of_birth"])
(fact claim "Alfred Kleiner" "date-of-birth" "+1849-04-24T00:00:00Z")
