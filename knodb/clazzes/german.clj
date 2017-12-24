(ns clazzes.german
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "German")

(name-as-in "German" "德語" "zh-hk")
(name-as-in "German" "alemão" "pt")
(name-as-in "German" "German" "en")
(name-as-in "German" "allemand" "fr")
(name-as-in "German" "德語" "zh-tw")
(name-as-in "German" "Deutsch" "de")
(name-as-in "German" "немецкий язык" "ru")
(name-as-in "German" "alemán" "es")
(name-as-in "German" "ドイツ語" "ja")
(name-as-in "German" "德语" "zh-cn")
(name-as-in "German" "" "zh-sg")

(descr-as-in "German" "語言" "zh-hk")
(descr-as-in "German" "língua germânica ocidental" "pt")
(descr-as-in "German" "West Germanic language" "en")
(descr-as-in "German" "langue germanique occidentale" "fr")
(descr-as-in "German" "語言" "zh-tw")
(descr-as-in "German" "westgermanische Sprache" "de")
(descr-as-in "German" "германский язык, государственный язык Германии, Швейцарии, Австрии, Бельгии, Лихтенштейна и Люксембурга" "ru")
(descr-as-in "German" "Lengua germana" "es")
(descr-as-in "German" "言語" "ja")
(descr-as-in "German" "德国语言" "zh-cn")
(descr-as-in "German" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "German" "subclass-of" "Q52040")

(refer-to ["properties.has_grammatical_case"])
(fact claim "German" "has-grammatical-case" "Q131105")
(fact claim "German" "has-grammatical-case" "Q146233")
(fact claim "German" "has-grammatical-case" "Q145599")
(fact claim "German" "has-grammatical-case" "Q146078")

(refer-to ["properties.commons_category"])
(fact claim "German" "commons-category" "German language")

(refer-to ["properties.unesco_language_status"])
(fact claim "German" "unesco-language-status" "Q20672086")

(refer-to ["properties.page_banner"])
(fact claim "German" "page-banner" "Welcome banner.jpg")

(refer-to ["properties.ethnologue_com_code"])
(fact claim "German" "ethnologue_com-code" "deu")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "German" "encyclopædia-britannica-online-id" "topic/German-language")

(refer-to ["properties.dewey_decimal_classification"])
(fact claim "German" "dewey-decimal-classification" "430")

(refer-to ["properties.subreddit"])
(fact claim "German" "subreddit" "de")

(refer-to ["properties.distribution_map"])
(fact claim "German" "distribution-map" "Legal statuses of German in Europe.svg")

(refer-to ["properties.has_tense"])
(fact claim "German" "has-tense" "Q192613")
(fact claim "German" "has-tense" "Q501405")
(fact claim "German" "has-tense" "Q1994301")
(fact claim "German" "has-tense" "Q625420")

(refer-to ["properties.iso_639_3_code"])
(fact claim "German" "iso-639-3-code" "deu")

(refer-to ["properties.writing_system"])
(fact claim "German" "writing-system" "Q8229")

(refer-to ["properties.isbn_identifier_group"])
(fact claim "German" "isbn-identifier-group" "978-3")

(refer-to ["properties.unesco_thesaurus_id"])
(fact claim "German" "unesco-thesaurus-id" "concept2002")

(refer-to ["properties.gost_7_75_97_code"])
(fact claim "German" "gost-7_75-97-code" "нем 481")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "German" "us-national-archives-identifier" "10640847")

(refer-to ["properties.babelnet_id"])
(fact claim "German" "babelnet-id" "00040293n")

(refer-to ["properties.short_name"])
(fact claim "German" "short-name" "monolingualtext")
(fact claim "German" "short-name" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "German" "topic's-main-category" "Q7142706")

(refer-to ["properties.encyclopædia_universalis_online_id"])
(fact claim "German" "encyclopædia-universalis-online-id" "allemandes-langue-et-litteratures-langue")

(refer-to ["properties.wals_lect_code"])
(fact claim "German" "wals-lect-code" "ger")
(fact claim "German" "wals-lect-code" "gbl")
(fact claim "German" "wals-lect-code" "gha")
(fact claim "German" "wals-lect-code" "gma")
(fact claim "German" "wals-lect-code" "gth")
(fact claim "German" "wals-lect-code" "gti")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "German" "permanent-duplicated-item" "Q13203198")

(refer-to ["properties.linguistic_typology"])
(fact claim "German" "linguistic-typology" "Q539808")
(fact claim "German" "linguistic-typology" "Q1516105")
(fact claim "German" "linguistic-typology" "Q178435")
(fact claim "German" "linguistic-typology" "Q651641")
(fact claim "German" "linguistic-typology" "Q7888721")
(fact claim "German" "linguistic-typology" "Q7806656")
(fact claim "German" "linguistic-typology" "Q318917")

(refer-to ["properties.country_of_origin"])
(fact claim "German" "country-of-origin" "Q183")

(refer-to ["properties.psh_id"])
(fact claim "German" "psh-id" "6753")

(refer-to ["properties.sudoc_authorities"])
(fact claim "German" "sudoc-authorities" "027789829")

(refer-to ["properties.bnf_id"])
(fact claim "German" "bnf-id" "119756721")

(refer-to ["properties.catalog"])
(fact claim "German" "catalog" "Q5460604")

(refer-to ["properties.freebase_id"])
(fact claim "German" "freebase-id" "/m/04306rv")

(refer-to ["properties.glottolog_code"])
(fact claim "German" "glottolog-code" "stan1295")

(refer-to ["properties.omegawiki_defined_meaning"])
(fact claim "German" "omegawiki-defined-meaning" "5688")

(refer-to ["properties.ndl_auth_id"])
(fact claim "German" "ndl-auth-id" "00561611")

(refer-to ["properties.gnd_id"])
(fact claim "German" "gnd-id" "4113292-0")

(refer-to ["properties.language_regulatory_body"])
(fact claim "German" "language-regulatory-body" "Q1939300")
(fact claim "German" "language-regulatory-body" "Q1664834")

(refer-to ["properties.instance_of"])
(fact claim "German" "instance-of" "Q34770")

(refer-to ["properties.bbc_things_id"])
(fact claim "German" "bbc-things-id" "aa0ee16d-df96-4b90-aaf2-7cdb30552726")

(refer-to ["properties.number_of_speakers"])
(fact claim "German" "number-of-speakers" "quantity")
(fact claim "German" "number-of-speakers" "quantity")

(refer-to ["properties.wikimedia_language_code"])
(fact claim "German" "wikimedia-language-code" "de")

(refer-to ["properties.part_of"])
(fact claim "German" "part-of" "Q26721")

(refer-to ["properties.has_grammatical_mood"])
(fact claim "German" "has-grammatical-mood" "Q682111")
(fact claim "German" "has-grammatical-mood" "Q22716")
(fact claim "German" "has-grammatical-mood" "Q473746")

(refer-to ["properties.iso_639_1_code"])
(fact claim "German" "iso-639-1-code" "de")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "German" "bncf-thesaurus" "186")

(refer-to ["properties.iso_639_2_code"])
(fact claim "German" "iso-639-2-code" "deu")
(fact claim "German" "iso-639-2-code" "ger")

(refer-to ["properties.native_label"])
(fact claim "German" "native-label" "monolingualtext")

(refer-to ["properties.ietf_language_tag"])
(fact claim "German" "ietf-language-tag" "de")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "German" "library-of-congress-authority-id" "sh85054365")

(refer-to ["properties.quora_topic_id"])
(fact claim "German" "quora-topic-id" "German-language")
