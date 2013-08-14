(ns properties.archives-at
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "archives-at")

(name-as-in "archives-at" "" "zh-hant")
(name-as-in "archives-at" "" "zh-hans")
(name-as-in "archives-at" "архивы хранятся в" "ru")
(name-as-in "archives-at" "" "pt")
(name-as-in "archives-at" "localisation des archives" "fr")
(name-as-in "archives-at" "archivado en" "es")
(name-as-in "archives-at" "" "ja")
(name-as-in "archives-at" "archiviert in" "de")
(name-as-in "archives-at" "archives at" "en")

(descr-as-in "archives-at" "" "zh-hant")
(descr-as-in "archives-at" "" "zh-hans")
(descr-as-in "archives-at" "организация, в которой хранятся архивы персоны" "ru")
(descr-as-in "archives-at" "" "pt")
(descr-as-in "archives-at" "institution qui collecte les archives concernant le sujet" "fr")
(descr-as-in "archives-at" "institución que recoge los archivos sobre el tema" "es")
(descr-as-in "archives-at" "" "ja")
(descr-as-in "archives-at" "Institution mit den Archiven des Datenobjekts" "de")
(descr-as-in "archives-at" "the institution holding the subject's archives" "en")

