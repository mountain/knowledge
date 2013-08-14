(ns knowledge.test
  (:refer-clojure :exclude [==])
  (:require [clojure.test :as test])
  (:use clojure.core.logic
        meta.meta
        entities.albert_einstein))

(println (map first (run* [q]
  (fresh [x]
    (Person x)
      (== q [x])))))

(test/deftest test-facts 
  (let [results (set (map first (run* [q]  (fresh [x] (Person x) (== q [x])))))]
  (test/is
    (and (not (empty results))
      (empty (disj results
        "Elsa Einstein" "Hans Albert Einstein" "Albert Einstein" "Hermann Einstein"))))))

(println (run* [q]
  (fresh [x]
    (claim "Albert Einstein" "place-of-birth" x)
      (== q [x]))))

(test/deftest test-place-of-death 
  (test/is (= (first (first (run* [q]
    (fresh [x]
      (claim "Albert Einstein" "place-of-birth" x)
        (== q [x]))))) "Ulm")))

(println (run* [q]
  (fresh [x]
    (claim "Hermann Einstein" "grand-father" x)
      (== q [x]))))

(test/deftest test-grand-father 
  (let [results (set (map first (run* [q]  (fresh [x] (claim "Hermann Einstein" "grand-father" x) (== q [x])))))]
  (test/is
    (and (not (empty results))
      (empty (disj results
        "Elsa Einstein" "Hans Albert Einstein" "Lieserl Einstein"))))))
