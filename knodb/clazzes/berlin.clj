(ns clazzes.berlin
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Berlin")

(name-as-in "Berlin" "柏林" "zh-hk")
(name-as-in "Berlin" "Berlim" "pt")
(name-as-in "Berlin" "Berlin" "en")
(name-as-in "Berlin" "Berlin" "fr")
(name-as-in "Berlin" "柏林" "zh-tw")
(name-as-in "Berlin" "Berlin" "de")
(name-as-in "Berlin" "Берлин" "ru")
(name-as-in "Berlin" "Berlín" "es")
(name-as-in "Berlin" "ベルリン" "ja")
(name-as-in "Berlin" "柏林" "zh-cn")
(name-as-in "Berlin" "柏林" "zh-sg")

(descr-as-in "Berlin" "德國首都" "zh-hk")
(descr-as-in "Berlin" "cidade e capital alemã" "pt")
(descr-as-in "Berlin" "capital city of Germany" "en")
(descr-as-in "Berlin" "capitale et ville-État de l'Allemagne" "fr")
(descr-as-in "Berlin" "德國首都" "zh-tw")
(descr-as-in "Berlin" "Hauptstadt und Land der Bundesrepublik Deutschland" "de")
(descr-as-in "Berlin" "столица и одна из федеральных земель Германии" "ru")
(descr-as-in "Berlin" "ciudad capital de Alemania" "es")
(descr-as-in "Berlin" "ドイツの首都" "ja")
(descr-as-in "Berlin" "德国首都" "zh-cn")
(descr-as-in "Berlin" "德国首都" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Berlin" "country" "Q183")
(fact claim "Berlin" "country" "Q16957")
(fact claim "Berlin" "country" "Q55300")
(fact claim "Berlin" "country" "Q7318")
(refer-to ["clazzes.weimar_republic"])
(fact claim "Berlin" "country" "Weimar Republic")
(fact claim "Berlin" "country" "Q43287")
(refer-to ["clazzes.kingdom_of_prussia"])
(fact claim "Berlin" "country" "Kingdom of Prussia")
(fact claim "Berlin" "country" "Q157367")
(fact claim "Berlin" "country" "Q148499")
(fact claim "Berlin" "country" "Q150981")

(refer-to ["properties.head_of_government"])
(fact claim "Berlin" "head-of-government" "Q8863")
(fact claim "Berlin" "head-of-government" "Q60957")
(fact claim "Berlin" "head-of-government" "Q61085")
(fact claim "Berlin" "head-of-government" "Q60957")
(fact claim "Berlin" "head-of-government" "Q2567")
(fact claim "Berlin" "head-of-government" "Q552483")
(fact claim "Berlin" "head-of-government" "Q68748")
(fact claim "Berlin" "head-of-government" "Q215756")
(fact claim "Berlin" "head-of-government" "Q705862")
(fact claim "Berlin" "head-of-government" "Q2514")
(fact claim "Berlin" "head-of-government" "Q96399")
(fact claim "Berlin" "head-of-government" "Q650878")
(fact claim "Berlin" "head-of-government" "Q69232")
(fact claim "Berlin" "head-of-government" "Q213561")
(fact claim "Berlin" "head-of-government" "Q102844")

(refer-to ["properties.locator_map_image"])
(fact claim "Berlin" "locator-map-image" "Locator map Berlin in Germany.svg")

(refer-to ["properties.commons_gallery"])
(refer-to ["clazzes.berlin"])
(fact claim "Berlin" "commons-gallery" "Berlin")

(refer-to ["properties.award_received"])
(fact claim "Berlin" "award-received" "Q3323440")

(refer-to ["properties.catholic_encyclopedia_id"])
(fact claim "Berlin" "catholic-encyclopedia-id" "02493b")

(refer-to ["properties.great_russian_encyclopedia_online_id"])
(fact claim "Berlin" "great-russian-encyclopedia-online-id" "1860540")

(refer-to ["properties.history_of_topic"])
(fact claim "Berlin" "history-of-topic" "Q679741")

(refer-to ["properties.geography_of_topic"])
(fact claim "Berlin" "geography-of-topic" "Q5535125")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.berlin"])
(fact claim "Berlin" "commons-category" "Berlin")

(refer-to ["properties.page_banner"])
(fact claim "Berlin" "page-banner" "Berlin banner 2.jpg")

(refer-to ["properties.gacs_id"])
(fact claim "Berlin" "gacs-id" "28603")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Berlin" "encyclopædia-britannica-online-id" "place/Berlin")

(refer-to ["properties.shares_border_with"])
(fact claim "Berlin" "shares-border-with" "Q1208")
(fact claim "Berlin" "shares-border-with" "Q6115")
(fact claim "Berlin" "shares-border-with" "Q6181")
(fact claim "Berlin" "shares-border-with" "Q6178")
(fact claim "Berlin" "shares-border-with" "Q6173")
(fact claim "Berlin" "shares-border-with" "Q6146")
(fact claim "Berlin" "shares-border-with" "Q6142")
(fact claim "Berlin" "shares-border-with" "Q1711")
(fact claim "Berlin" "shares-border-with" "Q6139")
(fact claim "Berlin" "shares-border-with" "Q6119")
(fact claim "Berlin" "shares-border-with" "Q104192")
(fact claim "Berlin" "shares-border-with" "Q640426")

(refer-to ["properties.dewey_decimal_classification"])
(fact claim "Berlin" "dewey-decimal-classification" "2--43155")

(refer-to ["properties.licence_plate_code"])
(fact claim "Berlin" "licence-plate-code" "B")
(fact claim "Berlin" "licence-plate-code" "I")

(refer-to ["properties.subreddit"])
(fact claim "Berlin" "subreddit" "berlin")

(refer-to ["properties.viaf_id"])
(fact claim "Berlin" "viaf-id" "122530980")

(refer-to ["properties.emlo_location_id"])
(fact claim "Berlin" "emlo-location-id" "c224d808-aa0c-410f-8ccd-786b2a4b38f8")

(refer-to ["properties.iso_3166_2_code"])
(fact claim "Berlin" "iso-3166-2-code" "DE-BE")

(refer-to ["properties.musicbrainz_area_id"])
(fact claim "Berlin" "musicbrainz-area-id" "c9ac1239-e832-41bc-9930-e252a1fd1105")

(refer-to ["properties.coat_of_arms"])
(fact claim "Berlin" "coat-of-arms" "Q819737")

(refer-to ["properties.located_in_the_administrative_territorial_entity"])
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Q183")
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Q7318")
(refer-to ["clazzes.free_state_of_prussia"])
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Free State of Prussia")
(refer-to ["clazzes.kingdom_of_prussia"])
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Kingdom of Prussia")
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Q700264")
(refer-to ["clazzes.kingdom_of_prussia"])
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Kingdom of Prussia")
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Q157367")
(fact claim "Berlin" "located-in-the-administrative-territorial-entity" "Q148499")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "Berlin" "us-national-archives-identifier" "10044845")
(fact claim "Berlin" "us-national-archives-identifier" "10044974")

(refer-to ["properties.babelnet_id"])
(fact claim "Berlin" "babelnet-id" "00010025n")

(refer-to ["properties.short_name"])
(fact claim "Berlin" "short-name" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "Berlin" "topic's-main-category" "Q4579913")

(refer-to ["properties.encyclopædia_universalis_online_id"])
(fact claim "Berlin" "encyclopædia-universalis-online-id" "berlin")

(refer-to ["properties.postal_code"])
(fact claim "Berlin" "postal-code" "10115–14199")

(refer-to ["properties.german_municipality_key"])
(fact claim "Berlin" "german-municipality-key" "11000000")

(refer-to ["properties.location_map"])
(fact claim "Berlin" "location-map" "Berlin, administrative divisions (+districts +boroughs +pop) - de - colored (less colors).svg")

(refer-to ["properties.geonames_id"])
(fact claim "Berlin" "geonames-id" "2950157")

(refer-to ["properties.yso_id"])
(fact claim "Berlin" "yso-id" "105612")

(refer-to ["properties.pronunciation_audio"])
(fact claim "Berlin" "pronunciation-audio" "De-Berlin.ogg")
(fact claim "Berlin" "pronunciation-audio" "De-Berlin-2.ogg")
(fact claim "Berlin" "pronunciation-audio" "Berlintitle.ogg")
(fact claim "Berlin" "pronunciation-audio" "Pl-Berlin.ogg")
(fact claim "Berlin" "pronunciation-audio" "Cs-Berlín.ogg")
(fact claim "Berlin" "pronunciation-audio" "Nl-Berlijn.ogg")
(fact claim "Berlin" "pronunciation-audio" "Jer-Bèrlîn.ogg")

(refer-to ["properties.openstreetmap_relation_identifier"])
(fact claim "Berlin" "openstreetmap-relation-identifier" "62422")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "Berlin" "permanent-duplicated-item" "Q21286937")

(refer-to ["properties.tgn_id"])
(fact claim "Berlin" "tgn-id" "7209904")

(refer-to ["properties.stw_thesaurus_for_economics_id"])
(fact claim "Berlin" "stw-thesaurus-for-economics-id" "16830-0")

(refer-to ["properties.time_of_earliest_written_record"])
(fact claim "Berlin" "time-of-earliest-written-record" "+1237-00-00T00:00:00Z")
(fact claim "Berlin" "time-of-earliest-written-record" "+1244-00-00T00:00:00Z")

(refer-to ["properties.category_of_associated_people"])
(fact claim "Berlin" "category-of-associated-people" "Q6151539")

(refer-to ["properties.collage_image"])
(fact claim "Berlin" "collage-image" "Collage Berlin2.jpg")

(refer-to ["properties.nomisma_id"])
(fact claim "Berlin" "nomisma-id" "berlin")

(refer-to ["properties.german_district_key"])
(fact claim "Berlin" "german-district-key" "11")
(fact claim "Berlin" "german-district-key" "11000")

(refer-to ["properties.lau"])
(fact claim "Berlin" "lau" "11000000")

(refer-to ["properties.sister_city"])
(fact claim "Berlin" "sister-city" "Q65")
(fact claim "Berlin" "sister-city" "Q2807")
(fact claim "Berlin" "sister-city" "Q406")
(fact claim "Berlin" "sister-city" "Q270")
(fact claim "Berlin" "sister-city" "Q649")
(fact claim "Berlin" "sister-city" "Q239")
(fact claim "Berlin" "sister-city" "Q3630")
(fact claim "Berlin" "sister-city" "Q269")
(fact claim "Berlin" "sister-city" "Q1489")
(fact claim "Berlin" "sister-city" "Q956")
(fact claim "Berlin" "sister-city" "Q1490")
(fact claim "Berlin" "sister-city" "Q1486")
(refer-to ["clazzes.prague"])
(fact claim "Berlin" "sister-city" "Prague")
(fact claim "Berlin" "sister-city" "Q3935")
(fact claim "Berlin" "sister-city" "Q84")
(fact claim "Berlin" "sister-city" "Q1781")
(fact claim "Berlin" "sister-city" "Q90")
(fact claim "Berlin" "sister-city" "Q9005")

(refer-to ["properties.facebook_places_id"])
(fact claim "Berlin" "facebook-places-id" "111175118906315")

(refer-to ["properties.elevation_above_sea_level"])
(fact claim "Berlin" "elevation-above-sea-level" "quantity")

(refer-to ["properties.hds_id"])
(fact claim "Berlin" "hds-id" "6583")

(refer-to ["properties.fips_10_4_countries_and_regions"])
(fact claim "Berlin" "fips-10-4-countries-and-regions" "GM16")

(refer-to ["properties.population"])
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")
(fact claim "Berlin" "population" "quantity")

(refer-to ["properties.bnf_id"])
(fact claim "Berlin" "bnf-id" "15298132w")

(refer-to ["properties.catalog"])
(refer-to ["clazzes.wikipedia_list_of_1000_articles_each_wikipedia_should_have"])
(fact claim "Berlin" "catalog" "Wikipedia:List of 1000 articles each Wikipedia should have")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Berlin" "national-library-of-israel-id" "000974947")

(refer-to ["properties.freebase_id"])
(fact claim "Berlin" "freebase-id" "/m/0156q")

(refer-to ["properties.contains_administrative_territorial_entity"])
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q163966")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158893")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q163012")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158095")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158083")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158064")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158106")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q4071168")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158089")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q119284")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q329609")
(fact claim "Berlin" "contains-administrative-territorial-entity" "Q158876")

(refer-to ["properties.fast_id"])
(fact claim "Berlin" "fast-id" "1204829")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Berlin" "coat-of-arms-image" "Coat of arms of Berlin.svg")

(refer-to ["properties.ringgold_id"])
(fact claim "Berlin" "ringgold-id" "273870")

(refer-to ["properties.coordinate_location"])
(fact claim "Berlin" "coordinate-location" "lng 13.383333333333 lat 52.516666666667 alt ")

(refer-to ["properties.capital_of"])
(fact claim "Berlin" "capital-of" "Q183")
(fact claim "Berlin" "capital-of" "Q7318")
(refer-to ["clazzes.kingdom_of_prussia"])
(fact claim "Berlin" "capital-of" "Kingdom of Prussia")
(refer-to ["clazzes.weimar_republic"])
(fact claim "Berlin" "capital-of" "Weimar Republic")
(fact claim "Berlin" "capital-of" "Q157367")
(refer-to ["clazzes.free_state_of_prussia"])
(fact claim "Berlin" "capital-of" "Free State of Prussia")
(fact claim "Berlin" "capital-of" "Q2415901")

(refer-to ["properties.genealogical_gazetteer_gov_id"])
(fact claim "Berlin" "genealogical-gazetteer-gov-id" "BERLINJO62PM")

(refer-to ["properties.inception"])
(fact claim "Berlin" "inception" "+1237-00-00T00:00:00Z")

(refer-to ["properties.flag"])
(fact claim "Berlin" "flag" "Q819691")

(refer-to ["properties.highest_judicial_authority"])
(fact claim "Berlin" "highest-judicial-authority" "Q2515458")

(refer-to ["properties.mesh_id"])
(fact claim "Berlin" "mesh-id" "D001604")

(refer-to ["properties.category_for_films_shot_at_this_location"])
(fact claim "Berlin" "category-for-films-shot-at-this-location" "Q6769919")

(refer-to ["properties.nuts_code"])
(fact claim "Berlin" "nuts-code" "DE3")
(fact claim "Berlin" "nuts-code" "DE30")
(fact claim "Berlin" "nuts-code" "DE300")

(refer-to ["properties.isni"])
(fact claim "Berlin" "isni" "0000 0001 2341 9654")

(refer-to ["properties.enclave_within"])
(fact claim "Berlin" "enclave-within" "Q1208")

(refer-to ["properties.official_website"])
(fact claim "Berlin" "official-website" "https://www.berlin.de/")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Berlin" "ndl-auth-id" "00629194")

(refer-to ["properties.gnd_id"])
(fact claim "Berlin" "gnd-id" "4005728-8")

(refer-to ["properties.described_by_source"])
(fact claim "Berlin" "described-by-source" "Q302556")
(fact claim "Berlin" "described-by-source" "Q19180675")
(fact claim "Berlin" "described-by-source" "Q602358")
(fact claim "Berlin" "described-by-source" "Q4114391")
(fact claim "Berlin" "described-by-source" "Q4173137")

(refer-to ["properties.lac_id"])
(fact claim "Berlin" "lac-id" "0053C1712")

(refer-to ["properties.instance_of"])
(fact claim "Berlin" "instance-of" "Q1901835")
(fact claim "Berlin" "instance-of" "Q200250")
(fact claim "Berlin" "instance-of" "Q257391")
(fact claim "Berlin" "instance-of" "Q1549591")
(fact claim "Berlin" "instance-of" "Q1221156")
(fact claim "Berlin" "instance-of" "Q262166")
(fact claim "Berlin" "instance-of" "Q1637706")
(fact claim "Berlin" "instance-of" "Q133442")
(fact claim "Berlin" "instance-of" "Q1307779")
(fact claim "Berlin" "instance-of" "Q515")
(fact claim "Berlin" "instance-of" "Q15974307")
(fact claim "Berlin" "instance-of" "Q707813")

(refer-to ["properties.legislative_body"])
(fact claim "Berlin" "legislative-body" "Q640859")

(refer-to ["properties.part_of"])
(fact claim "Berlin" "part-of" "Q648102")
(fact claim "Berlin" "part-of" "Q15781847")

(refer-to ["properties.demonym"])
(fact claim "Berlin" "demonym" "monolingualtext")
(fact claim "Berlin" "demonym" "monolingualtext")

(refer-to ["properties.dmoz_id"])
(fact claim "Berlin" "dmoz-id" "Regional/Europe/Germany/States/Berlin/")
(fact claim "Berlin" "dmoz-id" "World/Deutsch/Regional/Europa/Deutschland/Berlin/")
(fact claim "Berlin" "dmoz-id" "World/Español/Regional/Europa/Alemania/Estados/Berlín/")
(fact claim "Berlin" "dmoz-id" "World/Esperanto/Regionoj/Eŭropo/Germanio/Berlino/")
(fact claim "Berlin" "dmoz-id" "World/Français/Régional/Europe/Allemagne/Etats_fédérés/Berlin/")
(fact claim "Berlin" "dmoz-id" "World/Italiano/Regionale/Europa/Germania/Berlino/")
(fact claim "Berlin" "dmoz-id" "World/Polski/Regionalne/Europa/Niemcy/Berlin/")
(fact claim "Berlin" "dmoz-id" "World/Svenska/Regionalt/Europa/Tyskland/Städer_och_kommuner/Berlin/")
(fact claim "Berlin" "dmoz-id" "World/Russian/Страны_и_регионы/Европа/Германия/Берлин/")
(fact claim "Berlin" "dmoz-id" "World/Japanese/地域/ヨーロッパ/ドイツ/市町村/ベルリン/")

(refer-to ["properties.office_held_by_head_of_government"])
(fact claim "Berlin" "office-held-by-head-of-government" "Q641159")

(refer-to ["properties.bne_id"])
(fact claim "Berlin" "bne-id" "XX451163")

(refer-to ["properties.replaces"])
(fact claim "Berlin" "replaces" "Q321674")

(refer-to ["properties.selibr"])
(fact claim "Berlin" "selibr" "161170")

(refer-to ["properties.local_dialing_code"])
(fact claim "Berlin" "local-dialing-code" "030")

(refer-to ["properties.ipa_transcription"])
(fact claim "Berlin" "ipa-transcription" "bɛɐ̯ˈliːn")
(fact claim "Berlin" "ipa-transcription" "bərˈlɪn")
(fact claim "Berlin" "ipa-transcription" "bɛʁ.lɛ̃")

(refer-to ["properties.image"])
(fact claim "Berlin" "image" "Cityscape Berlin.jpg")

(refer-to ["properties.category_of_people_buried_here"])
(fact claim "Berlin" "category-of-people-buried-here" "Q7975011")

(refer-to ["properties.located_in_or_next_to_body_of_water"])
(fact claim "Berlin" "located-in-or-next-to-body-of-water" "Q1684")
(fact claim "Berlin" "located-in-or-next-to-body-of-water" "Q3908364")
(fact claim "Berlin" "located-in-or-next-to-body-of-water" "Q697916")
(fact claim "Berlin" "located-in-or-next-to-body-of-water" "Q1682")
(fact claim "Berlin" "located-in-or-next-to-body-of-water" "Q161455")
(fact claim "Berlin" "located-in-or-next-to-body-of-water" "Q694789")

(refer-to ["properties.category_for_people_who_died_here"])
(fact claim "Berlin" "category-for-people-who-died-here" "Q9217674")

(refer-to ["properties.located_in_time_zone"])
(fact claim "Berlin" "located-in-time-zone" "Q6655")
(fact claim "Berlin" "located-in-time-zone" "Q25989")
(fact claim "Berlin" "located-in-time-zone" "Q6723")

(refer-to ["properties.topics_main_wikimedia_portal"])
(fact claim "Berlin" "topic's-main-wikimedia-portal" "Q3248436")

(refer-to ["properties.highest_point"])
(fact claim "Berlin" "highest-point" "Q19259618")

(refer-to ["properties.german_regional_key"])
(fact claim "Berlin" "german-regional-key" "11")

(refer-to ["properties.official_name"])
(fact claim "Berlin" "official-name" "monolingualtext")

(refer-to ["properties.native_label"])
(fact claim "Berlin" "native-label" "monolingualtext")

(refer-to ["properties.category_for_people_born_here"])
(fact claim "Berlin" "category-for-people-born-here" "Q15068755")

(refer-to ["properties.area"])
(fact claim "Berlin" "area" "quantity")

(refer-to ["properties.archives_at"])
(fact claim "Berlin" "archives-at" "Q1610731")

(refer-to ["properties.flag_image"])
(fact claim "Berlin" "flag-image" "Flag of Berlin.svg")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Berlin" "library-of-congress-authority-id" "n79034972")

(refer-to ["properties.quora_topic_id"])
(refer-to ["clazzes.berlin"])
(fact claim "Berlin" "quora-topic-id" "Berlin")
