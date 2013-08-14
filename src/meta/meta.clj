(ns meta.meta
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic))

(defrel claim subj pred obj)

(defrel name-as-in obj name lang)

(defrel descr-as-in obj name lang)

(defrel Term name)

(defrel Person name)

(defrel Organization name)

(defrel Geographical-feature name)

