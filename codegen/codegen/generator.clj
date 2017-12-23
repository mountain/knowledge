(ns codegen.generator
  (:require [cheshire.core :refer :all])
  (:require [clojure.string :as string]))

(defn fname [label]
  (.replaceAll
    (.replaceAll
      (.replaceAll
        (.replaceAll
          (.replaceAll
            (.replaceAll
              (.replaceAll
                (.replaceAll
                  (.replaceAll
                    (.replaceAll
                      (.replaceAll (.toLowerCase label) " " "_")
                      "'" "")
                  "-" "_")
                "\\(" "")
              "\\)" "")
            "," "")
          "/" "_")
        "\\." "_")
      "\\+" "_")
    ":" "_")
  "^class$" "clazz"))

(defn dname [label]
  (.replaceAll
    (.replaceAll
      (.replaceAll
        (.replaceAll
          (.replaceAll
            (.replaceAll
              (.replaceAll
                (.replaceAll
                  (.replaceAll (.toLowerCase label) " " "-")
                "\\(" "")
              "\\)" "")
            "," "")
          "/" "_")
        "\\." "_")
      "\\+" "_")
    ":" "_")
  "^class$" "clazz"))

(defn rm-punct [text]
  (if-not (nil? text)
    (.replaceAll text "\"" "")))

(def pkgtable (atom {}))

(defn package-of [name] (if-let [result (find @pkgtable name)] (second result)))

(defn set-package [name pkg] (swap! pkgtable assoc name pkg))

(defn tname [label]
  (string/capitalize (dname label)))

(defn write-kinds [depth kind]
  (if-not (or (> depth 6) (nil? kind))
    (with-open [w (clojure.java.io/writer  "knodb/meta/meta.clj" :append true)]
      (.write w (str "\n(defrel " (tname kind) " name)\n")))))

(defn write-properties [depth name names descrs]
  (if-not (or (> depth 6) (nil? name))
    (with-open [w (clojure.java.io/writer  (str "knodb/properties/" (fname name) ".clj") :append false)]
      (.write w (str "(ns properties." (fname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic)\n")
      (.write w "   (:use meta.meta)")
      (.write w ")\n")
      (.write w (str "\n(fact Property \"" (dname name) "\")\n\n"))
      (doseq [[lang lname] names]
        (.write w (str "(name-as-in \"" (dname name) "\" \"" lname "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [[lang descr] descrs]
        (.write w (str "(descr-as-in \"" (dname name) "\" \"" (rm-punct descr) "\" \"" lang "\")\n")))
      (.write w "\n"))))

(defn write-clazz [depth name names descrs kind parents statements]
  (if-not (or (> depth 4) (nil? name) (nil? kind))
    (with-open [w (clojure.java.io/writer (str "knodb/clazzes/" (fname name) ".clj") :append false)]
      (.write w (str "(ns clazzes." (fname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic)\n")
      (.write w "   (:use meta.meta)")
      (.write w ")\n\n")
      (.write w (str "(fact " (tname kind) " \"" name "\")\n\n"))
      (doseq [[lang lname] names]
        (.write w (str "(name-as-in \"" name "\" \"" lname "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [[lang descr] descrs]
        (.write w (str "(descr-as-in \"" name "\" \"" (rm-punct descr) "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [stat statements]
        (.write w (str "\n(refer-to [\"properties." (fname (first stat)) "\"])\n"))
        (doseq [fact (second stat)]
          (if-not (nil? (package-of fact))
            (.write w (str "(refer-to [\"" (package-of fact) "." (fname fact) "\"])\n")))
          (.write w (str "(fact claim \"" name "\" \"" (dname (first stat)) "\" \"" fact "\")\n")))))))

(defn write-entity [depth name names descrs kind clazzes statements]
  (if-not (or (> depth 4) (nil? name) (nil? kind))
    (with-open [w (clojure.java.io/writer  (str "knodb/entities/" (fname name) ".clj") :append false)]
      (.write w (str "(ns entities." (fname name) "\n"))
      (.write w "   (:refer-clojure :exclude [==])\n")
      (.write w "   (:use clojure.core.logic)\n")
      (.write w "   (:use meta.meta)")
      (if-not (or (nil? clazzes) (empty clazzes))
        (do
          (.write w "\n")
          (.write w "   (:use [" (string/join " " (map #(str "clazzes." %) clazzes)) "])")))
      (if-not (or (nil? statements) (empty statements))
        (doseq [stat statements]
          (.write w "\n")
          (.write w (str "   (:use properties." (fname (first stat)) ")"))))
      (.write w ")\n\n")
      (.write w (str "(fact " (tname kind) " \"" name "\")\n\n"))
      (doseq [[lang lname] names]
        (.write w (str "(name-as-in \"" name "\" \"" lname "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [[lang descr] descrs]
        (.write w (str "(descr-as-in \"" name "\" \"" (rm-punct descr) "\" \"" lang "\")\n")))
      (.write w "\n")
      (doseq [stat statements]
        (.write w (str "\n(refer-to [\"properties." (fname (first stat)) "\"])\n"))
        (doseq [fact (second stat)]
          (if-not (nil? (package-of fact))
            (.write w (str "(refer-to [\"" (package-of fact) "." (fname fact) "\"])\n")))
          (.write w (str "(fact claim \"" name "\" \"" (dname (first stat)) "\" \"" fact "\")\n")))))))
