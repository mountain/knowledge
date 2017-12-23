(defproject knowledge "0.0.0"
  
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.fzakaria/slf4j-timbre "0.3.8"]
                 [org.clojure/core.logic "0.8.11"]
                 [clj-http "3.7.0"]
                 [cheshire "5.8.0"]]

  :source-paths ["src" "codegen" "knodb"]
  :test-paths ["test"]
  :resource-paths ["resource"]

  :main codegen.main)
