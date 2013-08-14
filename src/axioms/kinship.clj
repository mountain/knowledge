(ns axioms.kinship
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "grandfather")
(fact Property "grandchild")

(doseq [[x y z] (distinct (run* [q]
  (fresh [x y z]
    (conde
      [(Person x) (Person y) (Person z) (claim x "father" y) (claim y "father" z)]
      [(Person x) (Person y) (Person z) (claim x "father" y) (claim z "child" y)]
      [(Person x) (Person y) (Person z) (claim y "child" x) (claim y "father" z)]
      [(Person x) (Person y) (Person z) (claim y "child" x) (claim z "child" y)])
    (== q [x y z]))))]
  (do
    (println x y z)
    (claim x "grandfather" z)
    (claim z "grandchild" x)))
