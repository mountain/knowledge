(ns clazzes.academy_of_sciences_of_the_ussr
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Academy of Sciences of the USSR")

(name-as-in "Academy of Sciences of the USSR" "" "zh-hk")
(name-as-in "Academy of Sciences of the USSR" "Academia de Ciências da União Soviética" "pt")
(name-as-in "Academy of Sciences of the USSR" "Academy of Sciences of the USSR" "en")
(name-as-in "Academy of Sciences of the USSR" "Académie des sciences d'URSS" "fr")
(name-as-in "Academy of Sciences of the USSR" "" "zh-tw")
(name-as-in "Academy of Sciences of the USSR" "Akademie der Wissenschaften der UdSSR" "de")
(name-as-in "Academy of Sciences of the USSR" "Академия наук СССР" "ru")
(name-as-in "Academy of Sciences of the USSR" "Academia de Ciencias de la Unión Soviética" "es")
(name-as-in "Academy of Sciences of the USSR" "ソビエト連邦科学アカデミー" "ja")
(name-as-in "Academy of Sciences of the USSR" "" "zh-cn")
(name-as-in "Academy of Sciences of the USSR" "" "zh-sg")

(descr-as-in "Academy of Sciences of the USSR" "" "zh-hk")
(descr-as-in "Academy of Sciences of the USSR" "" "pt")
(descr-as-in "Academy of Sciences of the USSR" "scientific institution" "en")
(descr-as-in "Academy of Sciences of the USSR" "institution scientifique soviétique" "fr")
(descr-as-in "Academy of Sciences of the USSR" "" "zh-tw")
(descr-as-in "Academy of Sciences of the USSR" "" "de")
(descr-as-in "Academy of Sciences of the USSR" "высшее научное учреждение СССР, объединявшее ведущих учёных страны" "ru")
(descr-as-in "Academy of Sciences of the USSR" "" "es")
(descr-as-in "Academy of Sciences of the USSR" "" "ja")
(descr-as-in "Academy of Sciences of the USSR" "" "zh-cn")
(descr-as-in "Academy of Sciences of the USSR" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Academy of Sciences of the USSR" "country" "Q15180")

(refer-to ["properties.award_received"])
(fact claim "Academy of Sciences of the USSR" "award-received" "Q185493")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.academy_of_sciences_of_the_ussr"])
(fact claim "Academy of Sciences of the USSR" "commons-category" "Academy of Sciences of the USSR")

(refer-to ["properties.headquarters_location"])
(fact claim "Academy of Sciences of the USSR" "headquarters-location" "Q649")

(refer-to ["properties.topics_main_category"])
(fact claim "Academy of Sciences of the USSR" "topic's-main-category" "Q7018769")

(refer-to ["properties.inception"])
(fact claim "Academy of Sciences of the USSR" "inception" "+1925-01-01T00:00:00Z")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Academy of Sciences of the USSR" "dissolved-abolished-or-demolished" "+1991-01-01T00:00:00Z")

(refer-to ["properties.logo_image"])
(fact claim "Academy of Sciences of the USSR" "logo-image" "Academy-of-Sciences-USSR-logo.png")

(refer-to ["properties.instance_of"])
(fact claim "Academy of Sciences of the USSR" "instance-of" "Q414147")

(refer-to ["properties.replaces"])
(fact claim "Academy of Sciences of the USSR" "replaces" "Q4345832")

(refer-to ["properties.replaced_by"])
(fact claim "Academy of Sciences of the USSR" "replaced-by" "Q83172")
