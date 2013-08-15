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


(refer-to ["properties.iso_3166_1_alpha_2"])
(fact claim "Austria" "iso-3166-1-alpha-2" "AT")

(refer-to ["properties.locator_map_image"])
(fact claim "Austria" "locator-map-image" "EU-Austria.svg")

(refer-to ["properties.iso_3166_1_alpha_3"])
(fact claim "Austria" "iso-3166-1-alpha-3" "AUT")

(refer-to ["properties.member_of"])
(refer-to ["entities.united_nations"])
(fact claim "Austria" "member-of" "United Nations")
(refer-to ["entities.organisation_for_economic_co_operation_and_development"])
(fact claim "Austria" "member-of" "Organisation for Economic Co-operation and Development")
(refer-to ["entities.organization_for_security_and_co_operation_in_europe"])
(fact claim "Austria" "member-of" "Organization for Security and Co-operation in Europe")

(refer-to ["properties.country_calling_code"])
(fact claim "Austria" "country-calling-code" "+43")

(refer-to ["properties.basic_form_of_government"])
(refer-to ["clazzes.republic"])
(fact claim "Austria" "basic-form-of-government" "republic")

(refer-to ["properties.iso_3166_1_numeric"])
(fact claim "Austria" "iso-3166-1-numeric" "040")

(refer-to ["properties.highest_point"])
(refer-to ["entities.grossglockner"])
(fact claim "Austria" "highest-point" "Grossglockner")

(refer-to ["properties.head_of_government"])
(refer-to ["entities.werner_faymann"])
(fact claim "Austria" "head-of-government" "Werner Faymann")

(refer-to ["properties.openstreetmap_relation_id"])
(fact claim "Austria" "openstreetmap-relation-id" "16239")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Austria" "main-type-gnd" "geographical feature")

(refer-to ["properties.coordinate_location"])
(fact claim "Austria" "coordinate-location" "lng 14 lat 48 alt ")

(refer-to ["properties.nuts_code"])
(fact claim "Austria" "nuts-code" "AT")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Austria" "coat-of-arms-image" "Austria Bundesadler 2.svg")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "Austria" "bncf-thesaurus" "37765")

(refer-to ["properties.continent"])
(refer-to ["entities.europe"])
(fact claim "Austria" "continent" "Europe")

(refer-to ["properties.flag_image"])
(fact claim "Austria" "flag-image" "Flag of Austria.svg")

(refer-to ["properties.anthem"])
(refer-to ["entities.land_der_berge_land_am_strome"])
(fact claim "Austria" "anthem" "Land der Berge, Land am Strome")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.sovereign_state"])
(fact claim "Austria" "instance-of" "sovereign state")
(refer-to ["clazzes.republic"])
(fact claim "Austria" "instance-of" "republic")
(refer-to ["clazzes.country"])
(fact claim "Austria" "instance-of" "country")
(refer-to ["entities.member_state_of_the_european_union"])
(fact claim "Austria" "instance-of" "member state of the European Union")

(refer-to ["properties.top_level_domain"])
(refer-to ["clazzes._at"])
(fact claim "Austria" "top-level-domain" ".at")

(refer-to ["properties.head_of_state"])
(refer-to ["entities.heinz_fischer"])
(fact claim "Austria" "head-of-state" "Heinz Fischer")

(refer-to ["properties.capital"])
(refer-to ["entities.vienna"])
(fact claim "Austria" "capital" "Vienna")

(refer-to ["properties.shares_border_with"])
(refer-to ["entities.germany"])
(fact claim "Austria" "shares-border-with" "Germany")
(refer-to ["entities.italy"])
(fact claim "Austria" "shares-border-with" "Italy")
(refer-to ["entities.liechtenstein"])
(fact claim "Austria" "shares-border-with" "Liechtenstein")
(refer-to ["entities.switzerland"])
(fact claim "Austria" "shares-border-with" "Switzerland")
(refer-to ["entities.czech_republic"])
(fact claim "Austria" "shares-border-with" "Czech Republic")
(refer-to ["entities.hungary"])
(fact claim "Austria" "shares-border-with" "Hungary")
(refer-to ["entities.slovakia"])
(fact claim "Austria" "shares-border-with" "Slovakia")
(refer-to ["entities.slovenia"])
(fact claim "Austria" "shares-border-with" "Slovenia")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Austria" "official-language" "German")

(refer-to ["properties.currency"])
(refer-to ["clazzes.euro"])
(fact claim "Austria" "currency" "euro")

(refer-to ["properties.contains_administrative_division"])
(refer-to ["entities.burgenland"])
(fact claim "Austria" "contains-administrative-division" "Burgenland")
(refer-to ["entities.carinthia"])
(fact claim "Austria" "contains-administrative-division" "Carinthia")
(refer-to ["entities.lower_austria"])
(fact claim "Austria" "contains-administrative-division" "Lower Austria")
(refer-to ["entities.upper_austria"])
(fact claim "Austria" "contains-administrative-division" "Upper Austria")
(refer-to ["entities.salzburg"])
(fact claim "Austria" "contains-administrative-division" "Salzburg")
(refer-to ["entities.styria"])
(fact claim "Austria" "contains-administrative-division" "Styria")
(refer-to ["entities.tyrol"])
(fact claim "Austria" "contains-administrative-division" "Tyrol")
(refer-to ["entities.vorarlberg"])
(fact claim "Austria" "contains-administrative-division" "Vorarlberg")
(refer-to ["entities.vienna"])
(fact claim "Austria" "contains-administrative-division" "Vienna")

(refer-to ["properties.legislative_body"])
(refer-to ["clazzes.national_council_of_austria"])
(fact claim "Austria" "legislative-body" "National Council of Austria")
(refer-to ["clazzes.federal_council_of_austria"])
(fact claim "Austria" "legislative-body" "Federal Council of Austria")

(refer-to ["properties.flag"])
(refer-to ["clazzes.flag_of_austria"])
(fact claim "Austria" "flag" "Flag of Austria")

(refer-to ["properties.licence_plate_code"])
(fact claim "Austria" "licence-plate-code" "A")

(refer-to ["properties.commons_category"])
(refer-to ["entities.austria"])
(fact claim "Austria" "commons-category" "Austria")
