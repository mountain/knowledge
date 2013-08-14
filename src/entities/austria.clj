(ns entities.austria
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Austria")

(name-as-in "Austria" "奧地利" "zh-hant")
(name-as-in "Austria" "奥地利" "zh-hans")
(name-as-in "Austria" "Австрия" "ru")
(name-as-in "Austria" "Áustria" "pt")
(name-as-in "Austria" "Autriche" "fr")
(name-as-in "Austria" "Austria" "es")
(name-as-in "Austria" "オーストリア" "ja")
(name-as-in "Austria" "Österreich" "de")
(name-as-in "Austria" "Austria" "en")

(descr-as-in "Austria" "中歐國家" "zh-hant")
(descr-as-in "Austria" "中欧国家" "zh-hans")
(descr-as-in "Austria" "государство в Западной Европе" "ru")
(descr-as-in "Austria" "" "pt")
(descr-as-in "Austria" "pays d'Europe" "fr")
(descr-as-in "Austria" "país de Europa" "es")
(descr-as-in "Austria" "" "ja")
(descr-as-in "Austria" "Staat in Mitteleuropa" "de")
(descr-as-in "Austria" "federal republic in Central Europe" "en")

(fact claim "Austria" "iso-3166-1-alpha-2" "AT")

(fact claim "Austria" "locator-map-image" "EU-Austria.svg")

(fact claim "Austria" "iso-3166-1-alpha-3" "AUT")

(fact claim "Austria" "member-of" "United Nations")

(fact claim "Austria" "member-of" "Organisation for Economic Co-operation and Development")

(fact claim "Austria" "member-of" "Organization for Security and Co-operation in Europe")

(fact claim "Austria" "country-calling-code" "+43")

(fact claim "Austria" "basic-form-of-government" "republic")

(fact claim "Austria" "iso-3166-1-numeric" "040")

(fact claim "Austria" "highest-point" "Grossglockner")

(fact claim "Austria" "head-of-government" "Werner Faymann")

(fact claim "Austria" "openstreetmap-relation-id" "16239")

(fact claim "Austria" "main-type-gnd" "geographical feature")

(fact claim "Austria" "coordinate-location" "lng 14 lat 48 alt ")

(fact claim "Austria" "nuts-code" "AT")

(fact claim "Austria" "coat-of-arms-image" "Austria Bundesadler 2.svg")

(fact claim "Austria" "bncf-thesaurus" "37765")

(fact claim "Austria" "continent" "Europe")

(fact claim "Austria" "flag-image" "Flag of Austria.svg")

(fact claim "Austria" "anthem" "Land der Berge, Land am Strome")

(fact claim "Austria" "instance-of" "sovereign state")

(fact claim "Austria" "instance-of" "republic")

(fact claim "Austria" "instance-of" "country")

(fact claim "Austria" "instance-of" "member state of the European Union")

(fact claim "Austria" "top-level-domain" ".at")

(fact claim "Austria" "head-of-state" "Heinz Fischer")

(fact claim "Austria" "capital" "Vienna")

(fact claim "Austria" "shares-border-with" "Germany")

(fact claim "Austria" "shares-border-with" "Italy")

(fact claim "Austria" "shares-border-with" "Liechtenstein")

(fact claim "Austria" "shares-border-with" "Switzerland")

(fact claim "Austria" "shares-border-with" "Czech Republic")

(fact claim "Austria" "shares-border-with" "Hungary")

(fact claim "Austria" "shares-border-with" "Slovakia")

(fact claim "Austria" "shares-border-with" "Slovenia")

(fact claim "Austria" "official-language" "German")

(fact claim "Austria" "currency" "euro")

(fact claim "Austria" "contains-administrative-division" "Burgenland")

(fact claim "Austria" "contains-administrative-division" "Carinthia")

(fact claim "Austria" "contains-administrative-division" "Lower Austria")

(fact claim "Austria" "contains-administrative-division" "Upper Austria")

(fact claim "Austria" "contains-administrative-division" "Salzburg")

(fact claim "Austria" "contains-administrative-division" "Styria")

(fact claim "Austria" "contains-administrative-division" "Tyrol")

(fact claim "Austria" "contains-administrative-division" "Vorarlberg")

(fact claim "Austria" "contains-administrative-division" "Vienna")

(fact claim "Austria" "legislative-body" "National Council of Austria")

(fact claim "Austria" "legislative-body" "Federal Council of Austria")

(fact claim "Austria" "flag" "Flag of Austria")

(fact claim "Austria" "licence-plate-code" "A")

(fact claim "Austria" "commons-category" "Austria")

