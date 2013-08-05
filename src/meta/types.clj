(ns meta.types
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic))

(defrel Term name)

(defrel Person name)

(defrel Organization name)

(defrel Geographical-feature name)
