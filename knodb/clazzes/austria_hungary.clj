(ns clazzes.austria_hungary
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Austria-Hungary")

(name-as-in "Austria-Hungary" "" "zh-hk")
(name-as-in "Austria-Hungary" "Áustria-Hungria" "pt")
(name-as-in "Austria-Hungary" "Austria-Hungary" "en")
(name-as-in "Austria-Hungary" "Autriche-Hongrie" "fr")
(name-as-in "Austria-Hungary" "" "zh-tw")
(name-as-in "Austria-Hungary" "Österreich-Ungarn" "de")
(name-as-in "Austria-Hungary" "Австро-Венгрия" "ru")
(name-as-in "Austria-Hungary" "Imperio austrohúngaro" "es")
(name-as-in "Austria-Hungary" "オーストリア＝ハンガリー帝国" "ja")
(name-as-in "Austria-Hungary" "" "zh-cn")
(name-as-in "Austria-Hungary" "" "zh-sg")

(descr-as-in "Austria-Hungary" "" "zh-hk")
(descr-as-in "Austria-Hungary" "" "pt")
(descr-as-in "Austria-Hungary" "constitutional monarchic union  from 1867 to October 1918" "en")
(descr-as-in "Austria-Hungary" "ancien État d'Europe centrale" "fr")
(descr-as-in "Austria-Hungary" "" "zh-tw")
(descr-as-in "Austria-Hungary" "Gesamtstaat des Habsburgerreiches zwischen 1867 und 1918" "de")
(descr-as-in "Austria-Hungary" "историческое государство в Европе (1867-1918)" "ru")
(descr-as-in "Austria-Hungary" "antiguo estado europeo" "es")
(descr-as-in "Austria-Hungary" "" "ja")
(descr-as-in "Austria-Hungary" "" "zh-cn")
(descr-as-in "Austria-Hungary" "" "zh-sg")


(refer-to ["properties.country"])
(refer-to ["clazzes.austria_hungary"])
(fact claim "Austria-Hungary" "country" "Austria-Hungary")

(refer-to ["properties.locator_map_image"])
(fact claim "Austria-Hungary" "locator-map-image" "Austro-Hungarian Monarchy (1914).svg")

(refer-to ["properties.commons_gallery"])
(fact claim "Austria-Hungary" "commons-gallery" "Atlas of Austria-Hungary")

(refer-to ["properties.commons_category"])
(refer-to ["clazzes.austria_hungary"])
(fact claim "Austria-Hungary" "commons-category" "Austria-Hungary")

(refer-to ["properties.page_banner"])
(fact claim "Austria-Hungary" "page-banner" "Austria Hungary banner.jpg")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Austria-Hungary" "encyclopædia-britannica-online-id" "place/Austria-Hungary")

(refer-to ["properties.shares_border_with"])
(fact claim "Austria-Hungary" "shares-border-with" "Q38872")
(fact claim "Austria-Hungary" "shares-border-with" "Q153015")
(fact claim "Austria-Hungary" "shares-border-with" "Q154195")
(fact claim "Austria-Hungary" "shares-border-with" "Q43287")
(refer-to ["clazzes.switzerland"])
(fact claim "Austria-Hungary" "shares-border-with" "Switzerland")
(fact claim "Austria-Hungary" "shares-border-with" "Q347")
(fact claim "Austria-Hungary" "shares-border-with" "Q172579")
(fact claim "Austria-Hungary" "shares-border-with" "Q779011")
(fact claim "Austria-Hungary" "shares-border-with" "Q386496")
(fact claim "Austria-Hungary" "shares-border-with" "Q12560")
(fact claim "Austria-Hungary" "shares-border-with" "Q684030")
(fact claim "Austria-Hungary" "shares-border-with" "Q241748")
(fact claim "Austria-Hungary" "shares-border-with" "Q958291")
(fact claim "Austria-Hungary" "shares-border-with" "Q203493")
(fact claim "Austria-Hungary" "shares-border-with" "Q34266")

(refer-to ["properties.aat_id"])
(fact claim "Austria-Hungary" "aat-id" "300385965")

(refer-to ["properties.currency"])
(fact claim "Austria-Hungary" "currency" "Q306306")
(fact claim "Austria-Hungary" "currency" "Q303713")

(refer-to ["properties.encyclopedia_of_modern_ukraine_id"])
(fact claim "Austria-Hungary" "encyclopedia-of-modern-ukraine-id" "42409")

(refer-to ["properties.coat_of_arms"])
(fact claim "Austria-Hungary" "coat-of-arms" "Q2988066")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "Austria-Hungary" "us-national-archives-identifier" "10044586")

(refer-to ["properties.topics_main_category"])
(fact claim "Austria-Hungary" "topic's-main-category" "Q7025482")

(refer-to ["properties.yso_id"])
(fact claim "Austria-Hungary" "yso-id" "117131")

(refer-to ["properties.tgn_id"])
(fact claim "Austria-Hungary" "tgn-id" "6000511")

(refer-to ["properties.stw_thesaurus_for_economics_id"])
(fact claim "Austria-Hungary" "stw-thesaurus-for-economics-id" "30109-2")

(refer-to ["properties.category_of_associated_people"])
(fact claim "Austria-Hungary" "category-of-associated-people" "Q6994332")

(refer-to ["properties.official_language"])
(refer-to ["clazzes.german"])
(fact claim "Austria-Hungary" "official-language" "German")
(fact claim "Austria-Hungary" "official-language" "Q9067")

(refer-to ["properties.capital"])
(fact claim "Austria-Hungary" "capital" "Q1741")
(fact claim "Austria-Hungary" "capital" "Q1781")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Austria-Hungary" "sudoc-authorities" "02635991X")

(refer-to ["properties.population"])
(fact claim "Austria-Hungary" "population" "quantity")

(refer-to ["properties.bnf_id"])
(fact claim "Austria-Hungary" "bnf-id" "153768385")

(refer-to ["properties.follows"])
(fact claim "Austria-Hungary" "follows" "Q131964")

(refer-to ["properties.freebase_id"])
(fact claim "Austria-Hungary" "freebase-id" "/m/012m_")

(refer-to ["properties.coat_of_arms_image"])
(fact claim "Austria-Hungary" "coat-of-arms-image" "Imperial Coat of Arms of the Empire of Austria.svg")

(refer-to ["properties.coordinate_location"])
(fact claim "Austria-Hungary" "coordinate-location" "lng 16.35 lat 48.2 alt ")

(refer-to ["properties.inception"])
(fact claim "Austria-Hungary" "inception" "+1867-03-01T00:00:00Z")

(refer-to ["properties.flag"])
(fact claim "Austria-Hungary" "flag" "Q46835")

(refer-to ["properties.mesh_id"])
(fact claim "Austria-Hungary" "mesh-id" "D057235")

(refer-to ["properties.dissolved_abolished_or_demolished"])
(fact claim "Austria-Hungary" "dissolved-abolished-or-demolished" "+1918-11-11T00:00:00Z")
(fact claim "Austria-Hungary" "dissolved-abolished-or-demolished" "+1918-11-25T00:00:00Z")
(fact claim "Austria-Hungary" "dissolved-abolished-or-demolished" "+1918-10-29T00:00:00Z")
(fact claim "Austria-Hungary" "dissolved-abolished-or-demolished" "+1918-10-28T00:00:00Z")

(refer-to ["properties.gnd_id"])
(fact claim "Austria-Hungary" "gnd-id" "4075613-0")

(refer-to ["properties.has_part"])
(fact claim "Austria-Hungary" "has-part" "Q1879239")
(fact claim "Austria-Hungary" "has-part" "Q533534")

(refer-to ["properties.described_by_source"])
(fact claim "Austria-Hungary" "described-by-source" "Q678259")
(fact claim "Austria-Hungary" "described-by-source" "Q4114391")
(fact claim "Austria-Hungary" "described-by-source" "Q19180675")
(fact claim "Austria-Hungary" "described-by-source" "Q602358")

(refer-to ["properties.continent"])
(fact claim "Austria-Hungary" "continent" "Q46")

(refer-to ["properties.instance_of"])
(fact claim "Austria-Hungary" "instance-of" "Q3624078")
(fact claim "Austria-Hungary" "instance-of" "Q3024240")
(fact claim "Austria-Hungary" "instance-of" "Q48349")

(refer-to ["properties.legislative_body"])
(fact claim "Austria-Hungary" "legislative-body" "Q697775")

(refer-to ["properties.demonym"])
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")
(fact claim "Austria-Hungary" "demonym" "monolingualtext")

(refer-to ["properties.located_in_or_next_to_body_of_water"])
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q13924")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q6414")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q4127")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q1653")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q584")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q14369")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q14383")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q186901")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q548")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q1149087")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q13479615")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q552")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q1331973")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q577026")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q582675")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q212927")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q216488")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q973951")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q131210")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q156237")
(fact claim "Austria-Hungary" "located-in-or-next-to-body-of-water" "Q182445")

(refer-to ["properties.category_for_people_who_died_here"])
(fact claim "Austria-Hungary" "category-for-people-who-died-here" "Q10058430")

(refer-to ["properties.replaced_by"])
(fact claim "Austria-Hungary" "replaced-by" "Q268970")
(fact claim "Austria-Hungary" "replaced-by" "Q600018")
(fact claim "Austria-Hungary" "replaced-by" "Q140359")
(fact claim "Austria-Hungary" "replaced-by" "Q718374")
(fact claim "Austria-Hungary" "replaced-by" "Q203493")

(refer-to ["properties.topics_main_wikimedia_portal"])
(fact claim "Austria-Hungary" "topic's-main-wikimedia-portal" "Q11024801")

(refer-to ["properties.anthem"])
(fact claim "Austria-Hungary" "anthem" "Q30562")

(refer-to ["properties.category_for_people_born_here"])
(fact claim "Austria-Hungary" "category-for-people-born-here" "Q8042395")

(refer-to ["properties.basic_form_of_government"])
(fact claim "Austria-Hungary" "basic-form-of-government" "Q41614")
(fact claim "Austria-Hungary" "basic-form-of-government" "Q2994894")

(refer-to ["properties.area"])
(fact claim "Austria-Hungary" "area" "quantity")

(refer-to ["properties.flag_image"])
(fact claim "Austria-Hungary" "flag-image" "Flag of Austria-Hungary (1869-1918).svg")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Austria-Hungary" "library-of-congress-authority-id" "n50057161")

(refer-to ["properties.religion"])
(fact claim "Austria-Hungary" "religion" "Q9592")

(refer-to ["properties.quora_topic_id"])
(refer-to ["clazzes.austria_hungary"])
(fact claim "Austria-Hungary" "quora-topic-id" "Austria-Hungary")
