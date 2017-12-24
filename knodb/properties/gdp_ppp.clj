(ns properties.gdp_ppp
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "gdp-ppp")

(name-as-in "gdp-ppp" "" "zh-hk")
(name-as-in "gdp-ppp" "" "pt")
(name-as-in "gdp-ppp" "GDP (PPP)" "en")
(name-as-in "gdp-ppp" "produit intérieur brut à parité de pouvoir d'achat" "fr")
(name-as-in "gdp-ppp" "" "zh-tw")
(name-as-in "gdp-ppp" "" "de")
(name-as-in "gdp-ppp" "ВВП (ППС)" "ru")
(name-as-in "gdp-ppp" "PBI (PPA)" "es")
(name-as-in "gdp-ppp" "" "ja")
(name-as-in "gdp-ppp" "" "zh-cn")
(name-as-in "gdp-ppp" "" "zh-sg")

(descr-as-in "gdp-ppp" "" "zh-hk")
(descr-as-in "gdp-ppp" "" "pt")
(descr-as-in "gdp-ppp" "Gross domestic product (GDP) at purchasing power parity (current international $)" "en")
(descr-as-in "gdp-ppp" "PIB permettant une comparaison entre pays du pouvoir d'achat des devises nationales" "fr")
(descr-as-in "gdp-ppp" "" "zh-tw")
(descr-as-in "gdp-ppp" "" "de")
(descr-as-in "gdp-ppp" "валовой внутренний продукт по паритету покупательной способности" "ru")
(descr-as-in "gdp-ppp" "producto bruto interno (PBI) en paridad de poder adquisitivo" "es")
(descr-as-in "gdp-ppp" "" "ja")
(descr-as-in "gdp-ppp" "" "zh-cn")
(descr-as-in "gdp-ppp" "" "zh-sg")

