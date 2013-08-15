(ns entities.eth_zurich
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Organization "ETH Zurich")

(name-as-in "ETH Zurich" "蘇黎世聯邦理工學院" "zh-hant")
(name-as-in "ETH Zurich" "苏黎世联邦理工学院" "zh-hans")
(name-as-in "ETH Zurich" "Швейцарская высшая техническая школа Цюриха" "ru")
(name-as-in "ETH Zurich" "Instituto Federal de Tecnologia de Zurique" "pt")
(name-as-in "ETH Zurich" "École polytechnique fédérale de Zurich" "fr")
(name-as-in "ETH Zurich" "Escuela Politécnica Federal de Zúrich" "es")
(name-as-in "ETH Zurich" "チューリッヒ工科大学" "ja")
(name-as-in "ETH Zurich" "ETH Zürich" "de")
(name-as-in "ETH Zurich" "ETH Zurich" "en")

(descr-as-in "ETH Zurich" "" "zh-hant")
(descr-as-in "ETH Zurich" "" "zh-hans")
(descr-as-in "ETH Zurich" "высшее учебное заведение в городе Цюрих, Швейцария" "ru")
(descr-as-in "ETH Zurich" "" "pt")
(descr-as-in "ETH Zurich" "" "fr")
(descr-as-in "ETH Zurich" "universidad pública pionera en investigaciones en Europa" "es")
(descr-as-in "ETH Zurich" "" "ja")
(descr-as-in "ETH Zurich" "Technisch-naturwissenschaftliche Hochschule in Zürich, Schweiz" "de")
(descr-as-in "ETH Zurich" "Swiss Federal Institute of Technology in Zurich" "en")


(refer-to ["properties.instance_of"])
(refer-to ["clazzes.institute_of_technology"])
(fact claim "ETH Zurich" "instance-of" "Institute of technology")

(refer-to ["properties.logo_image"])
(fact claim "ETH Zurich" "logo-image" "ETH Zürich wordmark.svg")

(refer-to ["properties.country"])
(refer-to ["entities.switzerland"])
(fact claim "ETH Zurich" "country" "Switzerland")

(refer-to ["properties.commons_category"])
(refer-to ["entities.eth_zurich"])
(fact claim "ETH Zurich" "commons-category" "ETH Zurich")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.organization"])
(fact claim "ETH Zurich" "main-type-gnd" "organization")

(refer-to ["properties.headquarters_location"])
(fact claim "ETH Zurich" "headquarters-location" "Q14565994")
