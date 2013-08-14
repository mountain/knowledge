(ns knowledge.test
  (:refer-clojure :exclude [==])
  (:require [clojure.test :as test])
  (:use clojure.core.logic
        meta.meta
        entities.albert-einstein))

(test/deftest test-place-of-death 
  (test/is (= (first (first (run* [q]
    (fresh [x]
      (claim "Albert Einstein" "place-of-death" x)
        (== q [x])))))) "Princeton"))
