(ns entities.nobel-prize-in-physics
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic
         types
         properties))

(fact Term "Nobel Prize in Physics")

(fact part-of "Nobel Prize in Physics" "Nobel prize")

(fact subclass-of "Nobel Prize in Physics" "award")

(fact commons-category "Nobel Prize in Physics" "Nobel Prize in Physics")

