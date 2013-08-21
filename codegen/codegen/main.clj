(ns codegen.main
  (:use codegen.crawler)
  (:gen-class))

(defn -main []
  (visit-entity 0 "Q937"))