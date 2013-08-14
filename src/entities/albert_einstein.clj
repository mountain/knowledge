(ns entities.albert-einstein
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

(fact claim "Albert Einstein" "award-received" "Barnard Medal for Meritorious Service to Science")

(fact claim "Albert Einstein" "award-received" "Nobel Prize in Physics")

(fact claim "Albert Einstein" "award-received" "Gold Medal of the Royal Astronomical Society")

(fact claim "Albert Einstein" "award-received" "Prix Jules Janssen")

(fact claim "Albert Einstein" "award-received" "Matteucci Medal")

(fact claim "Albert Einstein" "award-received" "Max Planck Medal")

(fact claim "Albert Einstein" "award-received" "Franklin Medal")

(fact claim "Albert Einstein" "award-received" "Copley Medal")

(fact claim "Albert Einstein" "member-of" "Royal Society")

(fact claim "Albert Einstein" "archives-at" "Swiss Literary Archives")

(fact claim "Albert Einstein" "lccn-identifier" "n79022889")

(fact claim "Albert Einstein" "bnf-identifier" "119016075")

(fact claim "Albert Einstein" "native-language" "German")

(fact claim "Albert Einstein" "sudoc-identifier" "026849186")

(fact claim "Albert Einstein" "musicbrainz-artist-id" "c98c325e-7277-46e8-8b44-e3517f3e041a")

(fact claim "Albert Einstein" "viaf-identifier" "75121530")

(fact claim "Albert Einstein" "occupation-person" "physicist")

(fact claim "Albert Einstein" "gnd-identifier" "118529579")

(fact claim "Albert Einstein" "date-of-birth" "+00000001879-03-14T00:00:00Z")

(fact claim "Albert Einstein" "main-type-gnd" "person")

(fact claim "Albert Einstein" "ndl-identifier" "00438728")

(fact claim "Albert Einstein" "mathematics-genealogy-project-identifier" "53269")

(fact claim "Albert Einstein" "signature" "Albert Einstein signature 1934.svg")

(fact claim "Albert Einstein" "child" "Hans Albert Einstein")

(fact claim "Albert Einstein" "child" "Eduard Einstein")

(fact claim "Albert Einstein" "child" "Lieserl Einstein")

(fact claim "Albert Einstein" "place-of-death" "Princeton")

(fact claim "Albert Einstein" "sex" "male")

(fact claim "Albert Einstein" "father" "Hermann Einstein")

(fact claim "Albert Einstein" "alma-mater" "Luitpold Gymnasium")

(fact claim "Albert Einstein" "alma-mater" "ETH Zurich")

(fact claim "Albert Einstein" "spouse" "Mileva Marić")

(fact claim "Albert Einstein" "spouse" "Elsa Einstein")

(fact claim "Albert Einstein" "country-of-citizenship" "Austria-Hungary")

(fact claim "Albert Einstein" "country-of-citizenship" "Kingdom of Prussia")

(fact claim "Albert Einstein" "country-of-citizenship" "Austria")

(fact claim "Albert Einstein" "country-of-citizenship" "United States of America")

(fact claim "Albert Einstein" "country-of-citizenship" "Kingdom of Württemberg")

(fact claim "Albert Einstein" "country-of-citizenship" "")

(fact claim "Albert Einstein" "country-of-citizenship" "Switzerland")

(fact claim "Albert Einstein" "image" "Albert Einstein Head.jpg")

(fact claim "Albert Einstein" "image" "Einstein patentoffice full.jpg")

(fact claim "Albert Einstein" "image" "Albert Einstein (Nobel).jpg")

(fact claim "Albert Einstein" "image" "Albert Einstein portrait.jpg")

(fact claim "Albert Einstein" "image" "Einstein 1921 portrait2.jpg")

(fact claim "Albert Einstein" "place-of-birth" "Ulm")

(fact claim "Albert Einstein" "date-of-death" "+00000001955-04-18T00:00:00Z")

(fact claim "Albert Einstein" "commons-category" "Albert Einstein")

