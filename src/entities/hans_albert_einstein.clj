(ns entities.hans-albert-einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Person "Hans Albert Einstein")

(name-as-in "Hans Albert Einstein" "漢斯·阿爾伯特·愛因斯坦" "zh-hant")
(name-as-in "Hans Albert Einstein" "汉斯·阿尔伯特·爱因斯坦" "zh-hans")
(name-as-in "Hans Albert Einstein" "" "ru")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "pt")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "fr")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "es")
(name-as-in "Hans Albert Einstein" "ハンス・アルベルト・アインシュタイン" "ja")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "de")
(name-as-in "Hans Albert Einstein" "Hans Albert Einstein" "en")

(descr-as-in "Hans Albert Einstein" "" "zh-hant")
(descr-as-in "Hans Albert Einstein" "" "zh-hans")
(descr-as-in "Hans Albert Einstein" "" "ru")
(descr-as-in "Hans Albert Einstein" "" "pt")
(descr-as-in "Hans Albert Einstein" "" "fr")
(descr-as-in "Hans Albert Einstein" "" "es")
(descr-as-in "Hans Albert Einstein" "" "ja")
(descr-as-in "Hans Albert Einstein" "Professor für Hydraulik und Sohn Albert Einsteins" "de")
(descr-as-in "Hans Albert Einstein" "" "en")

(fact claim "Hans Albert Einstein" "lccn-identifier" "n85802437")

(fact claim "Hans Albert Einstein" "isni-iso-27729" "0000 0001 0982 7635")

(fact claim "Hans Albert Einstein" "native-language" "German")

(fact claim "Hans Albert Einstein" "viaf-identifier" "67420636")

(fact claim "Hans Albert Einstein" "brother" "Eduard Einstein")

(fact claim "Hans Albert Einstein" "gnd-identifier" "143075845")

(fact claim "Hans Albert Einstein" "date-of-birth" "+00000001904-05-14T00:00:00Z")

(fact claim "Hans Albert Einstein" "main-type-gnd" "person")

(fact claim "Hans Albert Einstein" "sister" "Lieserl Einstein")

(fact claim "Hans Albert Einstein" "mathematics-genealogy-project-identifier" "30930")

(fact claim "Hans Albert Einstein" "child" "Bernhard Caesar Einstein")

(fact claim "Hans Albert Einstein" "place-of-death" "Woods Hole, Massachusetts")

(fact claim "Hans Albert Einstein" "sex" "male")

(fact claim "Hans Albert Einstein" "father" "Albert Einstein")

(fact claim "Hans Albert Einstein" "mother" "Mileva Marić")

(fact claim "Hans Albert Einstein" "alma-mater" "ETH Zurich")

(fact claim "Hans Albert Einstein" "country-of-citizenship" "Switzerland")

(fact claim "Hans Albert Einstein" "country-of-citizenship" "United States of America")

(fact claim "Hans Albert Einstein" "place-of-birth" "Zurich")

(fact claim "Hans Albert Einstein" "place-of-birth" "Bern")

(fact claim "Hans Albert Einstein" "date-of-death" "+00000001973-07-26T00:00:00Z")

