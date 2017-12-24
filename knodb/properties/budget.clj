(ns properties.budget
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "budget")

(name-as-in "budget" "預算" "zh-hk")
(name-as-in "budget" "orçamento" "pt")
(name-as-in "budget" "budget" "en")
(name-as-in "budget" "budget" "fr")
(name-as-in "budget" "預算" "zh-tw")
(name-as-in "budget" "Budget" "de")
(name-as-in "budget" "бюджет" "ru")
(name-as-in "budget" "presupuesto" "es")
(name-as-in "budget" "予算" "ja")
(name-as-in "budget" "预算" "zh-cn")
(name-as-in "budget" "预算" "zh-sg")

(descr-as-in "budget" "" "zh-hk")
(descr-as-in "budget" "" "pt")
(descr-as-in "budget" "assigned monetary amount for a project (for the estimated cost of a film, also commonly referred to as budget, use P2130)" "en")
(descr-as-in "budget" "" "fr")
(descr-as-in "budget" "" "zh-tw")
(descr-as-in "budget" "Geldbetrag, der für ein Projekt zur Verfügung steht" "de")
(descr-as-in "budget" "запланированная для проекта денежная сумма" "ru")
(descr-as-in "budget" "cantidad de dinero asignada a un proyecto" "es")
(descr-as-in "budget" "その建築物や予算に使用予定の金額（P2130も参照）" "ja")
(descr-as-in "budget" "" "zh-cn")
(descr-as-in "budget" "" "zh-sg")

