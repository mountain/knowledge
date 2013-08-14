(ns knowledge.test
  (:refer-clojure :exclude [==])
  (:require [clojure.test :as test])
  (:use clojure.core.logic
        meta.meta
        entities.albert_einstein))

(refer-to ["axioms.kinship"])

(println (map first (run* [q]
  (fresh [x]
    (Person x)
      (== q [x])))))

(println (distinct (run* [q]
  (fresh [x y z]
    (conde
      [(Person x) (Person y) (Person z) (claim x "father" y) (claim y "father" z)]
      [(Person x) (Person y) (Person z) (claim x "father" y) (claim z "child" y)]
      [(Person x) (Person y) (Person z) (claim y "child" x) (claim y "father" z)]
      [(Person x) (Person y) (Person z) (claim y "child" x) (claim z "child" y)])
    (== q [x y z])))))

(println (run* [q]
  (fresh [x]
    (claim "Albert Einstein" "place-of-birth" x)
      (== q [x]))))

(println (run* [q]
  (fresh [x]
    (claim "Hermann Einstein" "grandchild" x)
      (== q [x]))))

(println (run* [q]
  (fresh [x]
    (claim "Hans Albert Einstein" "grandfather" x)
      (== q [x]))))

(test/deftest test-facts 
  (let [results (set (map first (run* [q]  (fresh [x] (Person x) (== q [x])))))]
  (test/is
    (and (not (empty? results))
      (empty? (disj results
        "Elsa Einstein" "Hans Albert Einstein" "Albert Einstein" "Hermann Einstein"))))))

(test/deftest test-place-of-death 
  (test/is (= (first (first (run* [q]
    (fresh [x]
      (claim "Albert Einstein" "place-of-birth" x)
        (== q [x]))))) "Ulm")))

(test/deftest test-grandfather 
  (let [results (set (map first (run* [q]  (fresh [x] (claim "Hans Albert Einstein" "grandfather" x) (== q [x])))))]
  (test/is
    (and (not (empty? results))
      (empty? (disj results
        "Hermann Einstein"))))))
