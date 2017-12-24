(ns meta.meta
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic))

(defn refer-to [refrences]
  (doseq [reference refrences]
    (try
      (use (symbol reference))
      (catch Exception e (println "warnning: " reference " could not be found or loading error!")))))

(defrel claim subj pred obj)

(defrel name-as-in obj name lang)

(defrel descr-as-in obj name lang)

(defrel Entity name)

(defrel Property name)

(defrel Term name)
