(ns clazzes.switzerland
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Switzerland")

(name-as-in "Switzerland" "瑞士" "zh-hk")
(name-as-in "Switzerland" "Suíça" "pt")
(name-as-in "Switzerland" "Switzerland" "en")
(name-as-in "Switzerland" "Suisse" "fr")
(name-as-in "Switzerland" "瑞士" "zh-tw")
(name-as-in "Switzerland" "Schweiz" "de")
(name-as-in "Switzerland" "Швейцария" "ru")
(name-as-in "Switzerland" "Suiza" "es")
(name-as-in "Switzerland" "スイス" "ja")
(name-as-in "Switzerland" "瑞士" "zh-cn")
(name-as-in "Switzerland" "瑞士" "zh-sg")

(descr-as-in "Switzerland" "西歐國家" "zh-hk")
(descr-as-in "Switzerland" "república federal composta por 26 estados, chamados de cantões" "pt")
(descr-as-in "Switzerland" "federal republic in Western Europe" "en")
(descr-as-in "Switzerland" "pays d'Europe" "fr")
(descr-as-in "Switzerland" "西歐國家" "zh-tw")
(descr-as-in "Switzerland" "Staat in Mitteleuropa" "de")
(descr-as-in "Switzerland" "страна в Центральной Европе" "ru")
(descr-as-in "Switzerland" "país de Europa" "es")
(descr-as-in "Switzerland" "西ヨーロッパに位置する国家" "ja")
(descr-as-in "Switzerland" "西欧国家" "zh-cn")
(descr-as-in "Switzerland" "西欧国家" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.switzerland"])
(fact claim "Switzerland" "country" "Switzerland")

(refer-to ["properties.head_of_government"])
(fact claim "Switzerland" "head-of-government" "")

(refer-to ["properties.ppp_gdp_per_capita"])
(fact claim "Switzerland" "ppp-gdp-per-capita" "quantity")

(refer-to ["properties.locator_map_image"])
(fact claim "Switzerland" "locator-map-image" "Europe-Switzerland.svg")
(fact claim "Switzerland" "locator-map-image" "LocationSwitzerland.svg")

(refer-to ["properties.commons_gallery"])
(fact claim "Switzerland" "commons-gallery" "Confoederatio Helvetica")

(refer-to ["properties.catholic_encyclopedia_id"])
(fact claim "Switzerland" "catholic-encyclopedia-id" "14358a")

(refer-to ["properties.inflation_rate"])
(fact claim "Switzerland" "inflation-rate" "quantity")

(refer-to ["properties.gdp_ppp"])
(fact claim "Switzerland" "gdp-ppp" "quantity")

(refer-to ["properties.lir"])
(fact claim "Switzerland" "lir" "805")

(refer-to ["properties.history_of_topic"])
(fact claim "Switzerland" "history-of-topic" "Q208761")

(refer-to ["properties.geography_of_topic"])
(fact claim "Switzerland" "geography-of-topic" "Q215941")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.switzerland"])
(fact claim "Switzerland" "commons-category" "Switzerland")

(refer-to ["properties.page_banner"])
(fact claim "Switzerland" "page-banner" "Sörenberg banner.jpg")

(refer-to ["properties.gacs_id"])
(fact claim "Switzerland" "gacs-id" "397")

(refer-to ["properties.ioc_country_code"])
(fact claim "Switzerland" "ioc-country-code" "SUI")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Switzerland" "encyclopædia-britannica-online-id" "place/Switzerland")

(refer-to ["properties.shares_border_with"])
(fact claim "Switzerland" "shares-border-with" "Q40")
(fact claim "Switzerland" "shares-border-with" "Q347")
(fact claim "Switzerland" "shares-border-with" "Q183")
(fact claim "Switzerland" "shares-border-with" "Q142")
(fact claim "Switzerland" "shares-border-with" "Q38")

(refer-to ["properties.dewey_decimal_classification"])
(fact claim "Switzerland" "dewey-decimal-classification" "2--494")

(refer-to ["properties.emergency_phone_number"])
(fact claim "Switzerland" "emergency-phone-number" "Q1061257")
(fact claim "Switzerland" "emergency-phone-number" "Q4547615")
(fact claim "Switzerland" "emergency-phone-number" "Q11185210")
(fact claim "Switzerland" "emergency-phone-number" "Q25648814")
(fact claim "Switzerland" "emergency-phone-number" "Q26258266")
(fact claim "Switzerland" "emergency-phone-number" "Q25648888")
(fact claim "Switzerland" "emergency-phone-number" "Q25648913")

(refer-to ["properties.licence_plate_code"])
(fact claim "Switzerland" "licence-plate-code" "CH")

(refer-to ["properties.coordinate_of_southernmost_point"])
(fact claim "Switzerland" "coordinate-of-southernmost-point" "lng 9.01705027 lat 45.8179357 alt ")

(refer-to ["properties.foundational_text"])
(fact claim "Switzerland" "foundational-text" "Q662637")
(fact claim "Switzerland" "foundational-text" "Q30921")

(refer-to ["properties.subreddit"])
(fact claim "Switzerland" "subreddit" "switzerland")

(refer-to ["properties.viaf_id"])
(fact claim "Switzerland" "viaf-id" "154323889")

(refer-to ["properties.emlo_location_id"])
(fact claim "Switzerland" "emlo-location-id" "a42115ec-30ee-4004-9be2-f98494a3ed7e")

(refer-to ["properties.coordinate_of_westernmost_point"])
(fact claim "Switzerland" "coordinate-of-westernmost-point" "lng 5.9561348 lat 46.13244515 alt ")

(refer-to ["properties.uic_alphabetical_country_code"])
(fact claim "Switzerland" "uic-alphabetical-country-code" "CH")

(refer-to ["properties.real_gross_domestic_product_growth_rate"])
(fact claim "Switzerland" "real-gross-domestic-product-growth-rate" "quantity")

(refer-to ["properties.currency"])
(fact claim "Switzerland" "currency" "Q25344")

(refer-to ["properties.musicbrainz_area_id"])
(fact claim "Switzerland" "musicbrainz-area-id" "1333ff06-8e3d-3c8e-9f3a-13a2a38b41df")

(refer-to ["properties.coat_of_arms"])
(fact claim "Switzerland" "coat-of-arms" "Q189560")

(refer-to ["properties.diplomatic_relation"])
(fact claim "Switzerland" "diplomatic-relation" "Q16")
(fact claim "Switzerland" "diplomatic-relation" "Q38")
(fact claim "Switzerland" "diplomatic-relation" "Q183")
(fact claim "Switzerland" "diplomatic-relation" "Q408")
(fact claim "Switzerland" "diplomatic-relation" "Q347")
(fact claim "Switzerland" "diplomatic-relation" "Q252")
(fact claim "Switzerland" "diplomatic-relation" "Q403")
(fact claim "Switzerland" "diplomatic-relation" "Q184")
(fact claim "Switzerland" "diplomatic-relation" "Q801")
(fact claim "Switzerland" "diplomatic-relation" "Q145")
(fact claim "Switzerland" "diplomatic-relation" "Q142")
(fact claim "Switzerland" "diplomatic-relation" "Q1016")
(fact claim "Switzerland" "diplomatic-relation" "Q414")
(fact claim "Switzerland" "diplomatic-relation" "Q40")
(fact claim "Switzerland" "diplomatic-relation" "Q35")
(fact claim "Switzerland" "diplomatic-relation" "Q159583")
(fact claim "Switzerland" "diplomatic-relation" "Q1246")
(fact claim "Switzerland" "diplomatic-relation" "Q217")
(fact claim "Switzerland" "diplomatic-relation" "Q843")
(fact claim "Switzerland" "diplomatic-relation" "Q854")
(fact claim "Switzerland" "diplomatic-relation" "Q218")
(fact claim "Switzerland" "diplomatic-relation" "Q258")
(fact claim "Switzerland" "diplomatic-relation" "Q928")
(fact claim "Switzerland" "diplomatic-relation" "Q833")
(fact claim "Switzerland" "diplomatic-relation" "Q79")
(fact claim "Switzerland" "diplomatic-relation" "Q96")
(fact claim "Switzerland" "diplomatic-relation" "Q43")
(fact claim "Switzerland" "diplomatic-relation" "Q458")
(fact claim "Switzerland" "diplomatic-relation" "Q77")
(fact claim "Switzerland" "diplomatic-relation" "Q865")
(fact claim "Switzerland" "diplomatic-relation" "Q30")
(fact claim "Switzerland" "diplomatic-relation" "Q794")
(fact claim "Switzerland" "diplomatic-relation" "Q227")
(fact claim "Switzerland" "diplomatic-relation" "Q399")
(fact claim "Switzerland" "diplomatic-relation" "Q148")
(fact claim "Switzerland" "diplomatic-relation" "Q41")
(fact claim "Switzerland" "diplomatic-relation" "Q884")
(fact claim "Switzerland" "diplomatic-relation" "Q159")

(refer-to ["properties.unesco_thesaurus_id"])
(fact claim "Switzerland" "unesco-thesaurus-id" "concept924")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "Switzerland" "us-national-archives-identifier" "10045644")

(refer-to ["properties.babelnet_id"])
(fact claim "Switzerland" "babelnet-id" "00069666n")

(refer-to ["properties.short_name"])
(fact claim "Switzerland" "short-name" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "Switzerland" "topic's-main-category" "Q1456250")

(refer-to ["properties.encyclopædia_universalis_online_id"])
(fact claim "Switzerland" "encyclopædia-universalis-online-id" "suisse")

(refer-to ["properties.iso_3166_1_alpha_3_code"])
(fact claim "Switzerland" "iso-3166-1-alpha-3-code" "CHE")

(refer-to ["properties.geonames_id"])
(fact claim "Switzerland" "geonames-id" "2658434")

(refer-to ["properties.yso_id"])
(fact claim "Switzerland" "yso-id" "105295")

(refer-to ["properties.openstreetmap_relation_identifier"])
(fact claim "Switzerland" "openstreetmap-relation-identifier" "51701")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "Switzerland" "permanent-duplicated-item" "Q20829665")

(refer-to ["properties.tgn_id"])
(fact claim "Switzerland" "tgn-id" "7011731")

(refer-to ["properties.stw_thesaurus_for_economics_id"])
(fact claim "Switzerland" "stw-thesaurus-for-economics-id" "16972-1")

(refer-to ["properties.category_of_associated_people"])
(fact claim "Switzerland" "category-of-associated-people" "Q3919882")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Switzerland" "nkcr-aut-id" "ge131576")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Switzerland" "official-language" "German")
(fact claim "Switzerland" "official-language" "Q652")
(fact claim "Switzerland" "official-language" "Q150")

(refer-to ["properties.coordinate_of_easternmost_point"])
(fact claim "Switzerland" "coordinate-of-easternmost-point" "lng 10.49234033 lat 46.6151637 alt ")

(refer-to ["properties.mains_voltage"])
(fact claim "Switzerland" "mains-voltage" "quantity")

(refer-to ["properties.capital"])
(fact claim "Switzerland" "capital" "Q70")
(fact claim "Switzerland" "capital" "")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Switzerland" "sudoc-authorities" "026438658")

(refer-to ["properties.hds_id"])
(fact claim "Switzerland" "hds-id" "9825")

(refer-to ["properties.fips_10_4_countries_and_regions"])
(fact claim "Switzerland" "fips-10-4-countries-and-regions" "SZ")

(refer-to ["properties.population"])
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")
(fact claim "Switzerland" "population" "quantity")

(refer-to ["properties.bnf_id"])
(fact claim "Switzerland" "bnf-id" "11868612h")

(refer-to ["properties.top_level_internet_domain"])
(fact claim "Switzerland" "top-level-internet-domain" "Q39676")

(refer-to ["properties.public_holiday"])
(fact claim "Switzerland" "public-holiday" "Q38087")

(refer-to ["properties.member_of"])
(fact claim "Switzerland" "member-of" "Q1065")
(fact claim "Switzerland" "member-of" "Q41550")
(fact claim "Switzerland" "member-of" "Q8908")
(fact claim "Switzerland" "member-of" "Q42262")
(fact claim "Switzerland" "member-of" "Q7825")
(fact claim "Switzerland" "member-of" "Q166546")
(fact claim "Switzerland" "member-of" "Q151991")
(fact claim "Switzerland" "member-of" "Q81299")
(fact claim "Switzerland" "member-of" "Q191384")
(fact claim "Switzerland" "member-of" "Q827525")
(fact claim "Switzerland" "member-of" "Q656801")
(fact claim "Switzerland" "member-of" "Q1043527")
(fact claim "Switzerland" "member-of" "Q899770")
(fact claim "Switzerland" "member-of" "Q340195")
(fact claim "Switzerland" "member-of" "Q188822")
(fact claim "Switzerland" "member-of" "Q782942")
(fact claim "Switzerland" "member-of" "Q1377612")
(fact claim "Switzerland" "member-of" "Q663492")
(fact claim "Switzerland" "member-of" "Q1072120")
(fact claim "Switzerland" "member-of" "Q8475")
(fact claim "Switzerland" "member-of" "Q1480793")
(fact claim "Switzerland" "member-of" "Q842490")
(fact claim "Switzerland" "member-of" "Q826700")

(refer-to ["properties.catalog"])
(refer-to ["clazzes.wikipedia_list_of_1000_articles_each_wikipedia_should_have"])
(fact claim "Switzerland" "catalog" "Wikipedia:List of 1000 articles each Wikipedia should have")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Switzerland" "national-library-of-israel-id" "000128739")

(refer-to ["properties.freebase_id"])
(fact claim "Switzerland" "freebase-id" "/m/06mzp")

(refer-to ["properties.contains_administrative_territorial_entity"])
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12079")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12094")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11972")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12146")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12172")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11911")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12640")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11917")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11922")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11925")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12755")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12121")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12738")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12592")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12573")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12746")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12697")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12433")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11929")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12724")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12713")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12404")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q834")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q12771")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11933")
(fact claim "Switzerland" "contains-administrative-territorial-entity" "Q11943")

(refer-to ["properties.fast_id"])
(fact claim "Switzerland" "fast-id" "1205401")

(refer-to ["properties.iso_3166_1_numeric_code"])
(fact claim "Switzerland" "iso-3166-1-numeric-code" "756")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Switzerland" "coat-of-arms-image" "Coat of Arms of Switzerland (Pantone).svg")

(refer-to ["properties.coordinate_of_northernmost_point"])
(fact claim "Switzerland" "coordinate-of-northernmost-point" "lng 8.57 lat 47.8 alt ")

(refer-to ["properties.coordinate_location"])
(fact claim "Switzerland" "coordinate-location" "lng 8.231973 lat 46.798562 alt ")

(refer-to ["properties.electrical_plug_type"])
(fact claim "Switzerland" "electrical-plug-type" "Q1378312")
(fact claim "Switzerland" "electrical-plug-type" "Q2335530")

(refer-to ["properties.nla_australia_id"])
(fact claim "Switzerland" "nla-australia-id" "35535063")

(refer-to ["properties.tripadvisor_id"])
(fact claim "Switzerland" "tripadvisor-id" "Tourism-g188045")

(refer-to ["properties.wikidata_project"])
(fact claim "Switzerland" "wikidata-project" "https://www.wikidata.org/wiki/Wikidata:WikiProject_Suisse")

(refer-to ["properties.mobile_country_code"])
(fact claim "Switzerland" "mobile-country-code" "228")

(refer-to ["properties.inception"])
(fact claim "Switzerland" "inception" "+1848-09-12T00:00:00Z")

(refer-to ["properties.trunk_prefix"])
(fact claim "Switzerland" "trunk-prefix" "0")

(refer-to ["properties.flag"])
(fact claim "Switzerland" "flag" "Q124020")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "Switzerland" "gran-enciclopèdia-catalana-id" "0017257")
(fact claim "Switzerland" "gran-enciclopèdia-catalana-id" "0064490")

(refer-to ["properties.mesh_id"])
(fact claim "Switzerland" "mesh-id" "D013557")

(refer-to ["properties.category_for_films_shot_at_this_location"])
(fact claim "Switzerland" "category-for-films-shot-at-this-location" "Q7140379")

(refer-to ["properties.omegawiki_defined_meaning"])
(fact claim "Switzerland" "omegawiki-defined-meaning" "6791")

(refer-to ["properties.nuts_code"])
(fact claim "Switzerland" "nuts-code" "CH0")
(fact claim "Switzerland" "nuts-code" "CH")

(refer-to ["properties.isni"])
(fact claim "Switzerland" "isni" "0000 0001 2299 4614")
(fact claim "Switzerland" "isni" "0000 0001 2297 4701")

(refer-to ["properties.driving_side"])
(fact claim "Switzerland" "driving-side" "Q14565199")

(refer-to ["properties.official_website"])
(fact claim "Switzerland" "official-website" "http://www.admin.ch/")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Switzerland" "ndl-auth-id" "00871917")

(refer-to ["properties.marriageable_age"])
(fact claim "Switzerland" "marriageable-age" "quantity")

(refer-to ["properties.insee_countries_and_foreign_territories_code"])
(fact claim "Switzerland" "insee-countries-and-foreign-territories-code" "99140")

(refer-to ["properties.gnd_id"])
(fact claim "Switzerland" "gnd-id" "4053881-3")

(refer-to ["properties.nominal_gdp_per_capita"])
(fact claim "Switzerland" "nominal-gdp-per-capita" "quantity")

(refer-to ["properties.continent"])
(fact claim "Switzerland" "continent" "Q46")

(refer-to ["properties.le_monde_diplomatique_subject_id"])
(fact claim "Switzerland" "le-monde-diplomatique-subject-id" "pays/suisse")

(refer-to ["properties.iso_3166_1_alpha_2_code"])
(fact claim "Switzerland" "iso-3166-1-alpha-2-code" "CH")

(refer-to ["properties.instance_of"])
(fact claim "Switzerland" "instance-of" "Q3624078")
(fact claim "Switzerland" "instance-of" "Q6256")
(fact claim "Switzerland" "instance-of" "Q123480")
(fact claim "Switzerland" "instance-of" "Q160016")
(fact claim "Switzerland" "instance-of" "Q170156")
(fact claim "Switzerland" "instance-of" "Q43702")

(refer-to ["properties.legislative_body"])
(fact claim "Switzerland" "legislative-body" "Q684719")

(refer-to ["properties.uic_numerical_country_code"])
(fact claim "Switzerland" "uic-numerical-country-code" "85")

(refer-to ["properties.deepest_point"])
(fact claim "Switzerland" "deepest-point" "Q14379")

(refer-to ["properties.demonym"])
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")
(fact claim "Switzerland" "demonym" "monolingualtext")

(refer-to ["properties.dmoz_id"])
(fact claim "Switzerland" "dmoz-id" "Regional/Europe/Switzerland/")

(refer-to ["properties.office_held_by_head_of_state"])
(fact claim "Switzerland" "office-held-by-head-of-state" "Q30917")

(refer-to ["properties.office_held_by_head_of_government"])
(fact claim "Switzerland" "office-held-by-head-of-government" "")

(refer-to ["properties.age_of_majority"])
(fact claim "Switzerland" "age-of-majority" "quantity")

(refer-to ["properties.country_calling_code"])
(fact claim "Switzerland" "country-calling-code" "+41")

(refer-to ["properties.ipa_transcription"])
(fact claim "Switzerland" "ipa-transcription" "ˈsʋæɪts")

(refer-to ["properties.image"])
(fact claim "Switzerland" "image" "Flag-map of Switzerland.svg")

(refer-to ["properties.nyt_topic_id"])
(fact claim "Switzerland" "nyt-topic-id" "destination/switzerland")

(refer-to ["properties.head_of_state"])
(fact claim "Switzerland" "head-of-state" "Q30917")

(refer-to ["properties.category_of_people_buried_here"])
(fact claim "Switzerland" "category-of-people-buried-here" "Q8328800")

(refer-to ["properties.category_for_people_who_died_here"])
(fact claim "Switzerland" "category-for-people-who-died-here" "Q6334741")

(refer-to ["properties.twitter_username"])
(fact claim "Switzerland" "twitter-username" "Suisse")

(refer-to ["properties.located_in_time_zone"])
(fact claim "Switzerland" "located-in-time-zone" "Q25989")
(fact claim "Switzerland" "located-in-time-zone" "Q6655")
(fact claim "Switzerland" "located-in-time-zone" "Q6723")
(fact claim "Switzerland" "located-in-time-zone" "Q16919450")

(refer-to ["properties.topics_main_wikimedia_portal"])
(fact claim "Switzerland" "topic's-main-wikimedia-portal" "Q3247839")

(refer-to ["properties.highest_point"])
(fact claim "Switzerland" "highest-point" "Q3403")

(refer-to ["properties.executive_body"])
(fact claim "Switzerland" "executive-body" "Q30917")

(refer-to ["properties.official_name"])
(fact claim "Switzerland" "official-name" "monolingualtext")
(fact claim "Switzerland" "official-name" "monolingualtext")
(fact claim "Switzerland" "official-name" "monolingualtext")
(fact claim "Switzerland" "official-name" "monolingualtext")
(fact claim "Switzerland" "official-name" "monolingualtext")

(refer-to ["properties.anthem"])
(fact claim "Switzerland" "anthem" "Q182536")

(refer-to ["properties.nominal_gdp"])
(fact claim "Switzerland" "nominal-gdp" "quantity")

(refer-to ["properties.category_for_people_born_here"])
(fact claim "Switzerland" "category-for-people-born-here" "Q7463350")

(refer-to ["properties.basic_form_of_government"])
(fact claim "Switzerland" "basic-form-of-government" "Q2523556")
(fact claim "Switzerland" "basic-form-of-government" "Q512187")

(refer-to ["properties.total_reserves"])
(fact claim "Switzerland" "total-reserves" "quantity")

(refer-to ["properties.motto_text"])
(fact claim "Switzerland" "motto-text" "monolingualtext")
(fact claim "Switzerland" "motto-text" "monolingualtext")
(fact claim "Switzerland" "motto-text" "monolingualtext")
(fact claim "Switzerland" "motto-text" "monolingualtext")
(fact claim "Switzerland" "motto-text" "monolingualtext")

(refer-to ["properties.area"])
(fact claim "Switzerland" "area" "quantity")

(refer-to ["properties.flag_image"])
(fact claim "Switzerland" "flag-image" "Flag of Switzerland.svg")

(refer-to ["properties.unemployment_rate"])
(fact claim "Switzerland" "unemployment-rate" "quantity")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Switzerland" "library-of-congress-authority-id" "n79062978")

(refer-to ["properties.motto"])
(fact claim "Switzerland" "motto" "Q2717243")

(refer-to ["properties.human_development_index"])
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")
(fact claim "Switzerland" "human-development-index" "quantity")

(refer-to ["properties.quora_topic_id"])
(refer-to ["clazzes.switzerland"])
(fact claim "Switzerland" "quora-topic-id" "Switzerland")

(refer-to ["properties.named_after"])
(fact claim "Switzerland" "named-after" "Q12433")
