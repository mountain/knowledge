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

(defrel Common-name name)

(defrel Q22302160 name)

(defrel Q151885 name)

(defrel Q190995 name)

(defrel Q4167836 name)

(defrel Q21286738 name)

(defrel Q11862829 name)

(defrel Q14204246 name)

(defrel Q19887878 name)

(defrel Q11266439 name)

(defrel Q3336843 name)

(defrel Q11344 name)

(defrel Q178648 name)

(defrel Q3624078 name)

(defrel Q6256 name)

(defrel Common-name name)

(defrel Q22302160 name)

(defrel Q151885 name)

(defrel Q190995 name)

(defrel Q4167836 name)

(defrel Q21286738 name)

(defrel Q11862829 name)

(defrel Q14204246 name)

(defrel Q19887878 name)

(defrel Q11266439 name)

(defrel Q3336843 name)

(defrel Q11344 name)

(defrel Q178648 name)

(defrel Q3624078 name)

(defrel Q6256 name)
