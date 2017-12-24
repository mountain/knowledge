(ns properties.total_reserves
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "total-reserves")

(name-as-in "total-reserves" "" "zh-hk")
(name-as-in "total-reserves" "total de reservas" "pt")
(name-as-in "total-reserves" "total reserves" "en")
(name-as-in "total-reserves" "réserves totales" "fr")
(name-as-in "total-reserves" "" "zh-tw")
(name-as-in "total-reserves" "Gesamtreserven" "de")
(name-as-in "total-reserves" "суммарные запасы" "ru")
(name-as-in "total-reserves" "reservas totales" "es")
(name-as-in "total-reserves" "" "ja")
(name-as-in "total-reserves" "" "zh-cn")
(name-as-in "total-reserves" "" "zh-sg")

(descr-as-in "total-reserves" "" "zh-hk")
(descr-as-in "total-reserves" "" "pt")
(descr-as-in "total-reserves" "total reserves comprise holdings of monetary gold, special drawing rights, reserves of IMF members held by the IMF, and holdings of foreign exchange under the control of monetary authorities" "en")
(descr-as-in "total-reserves" "les réserves totales comprennent les avoirs en or monétaire, les droits de tirage spéciaux, les réserves des membres du FMI détenus par le FMI et les avoirs en devises sous le contrôle des autorités monétaires" "fr")
(descr-as-in "total-reserves" "" "zh-tw")
(descr-as-in "total-reserves" "gesamte Reserven einschließlich Besitz von monetärem Gold, speziellen Bezugsrechten, Reserven von IWF Mitgliedern die vom IWF gehalten werden und Besitz von ausländischen Währungen unter der Kontrolle von monetären Authoritäten" "de")
(descr-as-in "total-reserves" "" "ru")
(descr-as-in "total-reserves" "" "es")
(descr-as-in "total-reserves" "" "ja")
(descr-as-in "total-reserves" "" "zh-cn")
(descr-as-in "total-reserves" "" "zh-sg")

