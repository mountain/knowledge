(ns properties
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic))

(defrel award-received subj obj)

(defrel member-of subj obj)

(defrel lccn-identifier subj obj)

(defrel bnf-identifier subj obj)

(defrel native-language subj obj)

(defrel sudoc-identifier subj obj)

(defrel musicbrainz-artist-id subj obj)

(defrel viaf-identifier subj obj)

(defrel occupation-person subj obj)

(defrel gnd-identifier subj obj)

(defrel date-of-birth subj obj)

(defrel ndl-identifier subj obj)

(defrel mathematics-genealogy-project-identifier subj obj)

(defrel signature subj obj)

(defrel child subj obj)

(defrel spouse subj obj)
