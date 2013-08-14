(ns properties.headquarters_location
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "headquarters-location")

(name-as-in "headquarters-location" "總部位置" "zh-hant")
(name-as-in "headquarters-location" "总部位置" "zh-hans")
(name-as-in "headquarters-location" "расположение штаб-квартиры" "ru")
(name-as-in "headquarters-location" "sede" "pt")
(name-as-in "headquarters-location" "siège social" "fr")
(name-as-in "headquarters-location" "ubicación de la sede" "es")
(name-as-in "headquarters-location" "本部所在地" "ja")
(name-as-in "headquarters-location" "Hauptverwaltung" "de")
(name-as-in "headquarters-location" "headquarters location" "en")

(descr-as-in "headquarters-location" "" "zh-hant")
(descr-as-in "headquarters-location" "" "zh-hans")
(descr-as-in "headquarters-location" "" "ru")
(descr-as-in "headquarters-location" "local da sede de uma organização" "pt")
(descr-as-in "headquarters-location" "lieu où se trouve (ou s'est trouvé) le siège social d'une organisation" "fr")
(descr-as-in "headquarters-location" "ubicación específica donde se sitúa la sede de una organización" "es")
(descr-as-in "headquarters-location" "組織の本部が置かれている具体的な場所" "ja")
(descr-as-in "headquarters-location" "Ort oder Gebäude, in dem die Hauptverwaltung einer Organisation liegt" "de")
(descr-as-in "headquarters-location" "specific location where an organization's HQ is or has been situated" "en")

