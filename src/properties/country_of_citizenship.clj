(ns properties.country_of_citizenship
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "country-of-citizenship")

(name-as-in "country-of-citizenship" "國籍" "zh-hant")
(name-as-in "country-of-citizenship" "国籍" "zh-hans")
(name-as-in "country-of-citizenship" "гражданство" "ru")
(name-as-in "country-of-citizenship" "nacionalidade" "pt")
(name-as-in "country-of-citizenship" "pays de nationalité" "fr")
(name-as-in "country-of-citizenship" "país de nacionalidad" "es")
(name-as-in "country-of-citizenship" "国籍" "ja")
(name-as-in "country-of-citizenship" "Staatsangehörigkeit" "de")
(name-as-in "country-of-citizenship" "country of citizenship" "en")

(descr-as-in "country-of-citizenship" "" "zh-hant")
(descr-as-in "country-of-citizenship" "" "zh-hans")
(descr-as-in "country-of-citizenship" "" "ru")
(descr-as-in "country-of-citizenship" "" "pt")
(descr-as-in "country-of-citizenship" "État dont la personne possède la nationalité" "fr")
(descr-as-in "country-of-citizenship" "estado soberano del cual la persona es ciudadana" "es")
(descr-as-in "country-of-citizenship" "その人物を自国の市民として認めている国" "ja")
(descr-as-in "country-of-citizenship" "Staat, der die Person als Staatsangehöriger anerkennt oder anerkannte" "de")
(descr-as-in "country-of-citizenship" "country that recognizes, or has recognized, the person as its citizen" "en")

