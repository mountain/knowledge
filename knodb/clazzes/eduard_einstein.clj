(ns clazzes.eduard_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Eduard Einstein")

(name-as-in "Eduard Einstein" "" "zh-hk")
(name-as-in "Eduard Einstein" "Eduard Einstein" "pt")
(name-as-in "Eduard Einstein" "Eduard Einstein" "en")
(name-as-in "Eduard Einstein" "Eduard Einstein" "fr")
(name-as-in "Eduard Einstein" "" "zh-tw")
(name-as-in "Eduard Einstein" "Eduard Einstein" "de")
(name-as-in "Eduard Einstein" "Эдуард Эйнштейн" "ru")
(name-as-in "Eduard Einstein" "Eduard Einstein" "es")
(name-as-in "Eduard Einstein" "エドゥアルト・アインシュタイン" "ja")
(name-as-in "Eduard Einstein" "" "zh-cn")
(name-as-in "Eduard Einstein" "" "zh-sg")

(descr-as-in "Eduard Einstein" "" "zh-hk")
(descr-as-in "Eduard Einstein" "" "pt")
(descr-as-in "Eduard Einstein" "second son of Albert Einstein and his first wife Mileva Marić" "en")
(descr-as-in "Eduard Einstein" "fils du physicien allemand Albert Einstein" "fr")
(descr-as-in "Eduard Einstein" "" "zh-tw")
(descr-as-in "Eduard Einstein" "Sohn Albert Einsteins" "de")
(descr-as-in "Eduard Einstein" "сын Альберта Эйнштейна и его жены Милевы Марич" "ru")
(descr-as-in "Eduard Einstein" "" "es")
(descr-as-in "Eduard Einstein" "" "ja")
(descr-as-in "Eduard Einstein" "" "zh-cn")
(descr-as-in "Eduard Einstein" "" "zh-sg")


(refer-to ["properties.place_of_birth"])
(fact claim "Eduard Einstein" "place-of-birth" "Q72")

(refer-to ["properties.date_of_death"])
(fact claim "Eduard Einstein" "date-of-death" "+1965-10-25T00:00:00Z")

(refer-to ["properties.viaf_id"])
(fact claim "Eduard Einstein" "viaf-id" "42634344")

(refer-to ["properties.place_of_death"])
(fact claim "Eduard Einstein" "place-of-death" "Q72")
(fact claim "Eduard Einstein" "place-of-death" "Q577131")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Eduard Einstein" "sex-or-gender" "male")

(refer-to ["properties.father"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Eduard Einstein" "father" "Albert Einstein")

(refer-to ["properties.family"])
(fact claim "Eduard Einstein" "family" "Q3292175")

(refer-to ["properties.native_language"])
(refer-to ["clazzes.german"])
(fact claim "Eduard Einstein" "native-language" "German")

(refer-to ["properties.languages_spoken_written_or_signed"])
(refer-to ["clazzes.german"])
(fact claim "Eduard Einstein" "languages-spoken-written-or-signed" "German")

(refer-to ["properties.bnf_id"])
(fact claim "Eduard Einstein" "bnf-id" "119548033")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Eduard Einstein" "national-library-of-israel-id" "000473694")

(refer-to ["properties.freebase_id"])
(fact claim "Eduard Einstein" "freebase-id" "/m/07wpwv")

(refer-to ["properties.fast_id"])
(fact claim "Eduard Einstein" "fast-id" "1474726")

(refer-to ["properties.manner_of_death"])
(fact claim "Eduard Einstein" "manner-of-death" "Q3739104")

(refer-to ["properties.occupation"])
(fact claim "Eduard Einstein" "occupation" "Q211346")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Eduard Einstein" "wikitree-person-id" "Einstein-40")

(refer-to ["properties.country_of_citizenship"])
(fact claim "Eduard Einstein" "country-of-citizenship" "Q39")

(refer-to ["properties.isni"])
(fact claim "Eduard Einstein" "isni" "0000 0000 2893 5490")

(refer-to ["properties.sibling"])
(refer-to ["clazzes.hans_albert_einstein"])
(fact claim "Eduard Einstein" "sibling" "Hans Albert Einstein")
(fact claim "Eduard Einstein" "sibling" "Q468357")

(refer-to ["properties.gnd_id"])
(fact claim "Eduard Einstein" "gnd-id" "118810928")

(refer-to ["properties.educated_at"])
(refer-to ["clazzes.university_of_zurich"])
(fact claim "Eduard Einstein" "educated-at" "University of Zurich")

(refer-to ["properties.instance_of"])
(fact claim "Eduard Einstein" "instance-of" "Q5")

(refer-to ["properties.cause_of_death"])
(fact claim "Eduard Einstein" "cause-of-death" "Q12202")

(refer-to ["properties.family_name"])
(fact claim "Eduard Einstein" "family-name" "Q16834800")

(refer-to ["properties.given_name"])
(fact claim "Eduard Einstein" "given-name" "Q18031774")

(refer-to ["properties.mother"])
(fact claim "Eduard Einstein" "mother" "Q76346")

(refer-to ["properties.date_of_birth"])
(fact claim "Eduard Einstein" "date-of-birth" "+1910-07-28T00:00:00Z")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Eduard Einstein" "library-of-congress-authority-id" "n85254722")
