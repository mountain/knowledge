(ns codegen.main
  (:use codegen.generator)
  (:gen-class))

(defn -main []
  (genq 0 "Q937"))