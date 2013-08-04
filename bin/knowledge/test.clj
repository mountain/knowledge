(ns knowledge.test
  (:refer-clojure :exclude [==])
  (:require [clojure.test :as test])
  (:use clojure.core.logic
        predicates
        people.albert-einstein))

(test/deftest test-place-of-death 
  (test/is (= (first (first (run* [q]
    (fresh [x]
      (place-of-death "Albert Einstein" x)
        (== q [x])))))) "Princeton"))
