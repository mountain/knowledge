(ns properties.gnd_identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "gnd-identifier")

(name-as-in "gnd-identifier" "GND" "zh-hant")
(name-as-in "gnd-identifier" "GND" "zh-hans")
(name-as-in "gnd-identifier" "идентификатор GND" "ru")
(name-as-in "gnd-identifier" "GND" "pt")
(name-as-in "gnd-identifier" "identifiant GND" "fr")
(name-as-in "gnd-identifier" "identificador GND" "es")
(name-as-in "gnd-identifier" "GND識別子" "ja")
(name-as-in "gnd-identifier" "GND-Nummer" "de")
(name-as-in "gnd-identifier" "GND identifier" "en")

(descr-as-in "gnd-identifier" "德國國家圖書館聯合權威檔" "zh-hant")
(descr-as-in "gnd-identifier" "德国国家图书馆联合权威档" "zh-hans")
(descr-as-in "gnd-identifier" "международная система классификации и систематизации" "ru")
(descr-as-in "gnd-identifier" "ficheiro de autoridade sobre o assunto" "pt")
(descr-as-in "gnd-identifier" "Numéro de la notice d'autorité dans le Gemeinsame Normdatei (GND)" "fr")
(descr-as-in "gnd-identifier" "número de registro de autoridad en el Gemeinsame Normdatei (GND)" "es")
(descr-as-in "gnd-identifier" "名前、主題、組織に関する国際典拠ファイル" "ja")
(descr-as-in "gnd-identifier" "internationale Normdatei für Personennamen, Körperschaften und Schlagworte (bitte nicht Typ n eintragen = Name, mehrdeutig)" "de")
(descr-as-in "gnd-identifier" "international authority file of names, subjects, and organizations (please don't use type n = name, disambiguation)" "en")

