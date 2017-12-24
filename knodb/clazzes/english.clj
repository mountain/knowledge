(ns clazzes.english
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "English")

(name-as-in "English" "英語" "zh-hk")
(name-as-in "English" "inglês" "pt")
(name-as-in "English" "English" "en")
(name-as-in "English" "anglais" "fr")
(name-as-in "English" "英語" "zh-tw")
(name-as-in "English" "Englisch" "de")
(name-as-in "English" "английский язык" "ru")
(name-as-in "English" "inglés" "es")
(name-as-in "English" "英語" "ja")
(name-as-in "English" "英语" "zh-cn")
(name-as-in "English" "" "zh-sg")

(descr-as-in "English" "" "zh-hk")
(descr-as-in "English" "língua germânica ocidental" "pt")
(descr-as-in "English" "West Germanic language originating in England" "en")
(descr-as-in "English" "langue germanique originaire d'Angleterre" "fr")
(descr-as-in "English" "" "zh-tw")
(descr-as-in "English" "westgermanische Sprache" "de")
(descr-as-in "English" "плюрицентрический германский язык" "ru")
(descr-as-in "English" "idioma originario de Inglaterra" "es")
(descr-as-in "English" "インド・ヨーロッパ語族のゲルマン語派に属し、イギリス・イングランド地方発祥の言語" "ja")
(descr-as-in "English" "" "zh-cn")
(descr-as-in "English" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "English" "subclass-of" "Q1346342")

(refer-to ["properties.has_grammatical_case"])
(fact claim "English" "has-grammatical-case" "Q146233")
(fact claim "English" "has-grammatical-case" "Q131105")

(refer-to ["properties.history_of_topic"])
(fact claim "English" "history-of-topic" "Q784975")

(refer-to ["properties.commons_category"])
(fact claim "English" "commons-category" "English language")

(refer-to ["properties.unesco_language_status"])
(fact claim "English" "unesco-language-status" "Q20672086")

(refer-to ["properties.page_banner"])
(fact claim "English" "page-banner" "Welcome banner.jpg")

(refer-to ["properties.ethnologue_com_code"])
(fact claim "English" "ethnologue_com-code" "eng")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "English" "encyclopædia-britannica-online-id" "topic/English-language")

(refer-to ["properties.distribution_map"])
(fact claim "English" "distribution-map" "Anglospeak.png")

(refer-to ["properties.aat_id"])
(fact claim "English" "aat-id" "300388277")

(refer-to ["properties.iso_639_3_code"])
(fact claim "English" "iso-639-3-code" "eng")

(refer-to ["properties.writing_system"])
(fact claim "English" "writing-system" "Q754673")

(refer-to ["properties.isbn_identifier_group"])
(fact claim "English" "isbn-identifier-group" "978-0")
(fact claim "English" "isbn-identifier-group" "978-1")

(refer-to ["properties.unesco_thesaurus_id"])
(fact claim "English" "unesco-thesaurus-id" "concept2371")

(refer-to ["properties.gost_7_75_97_code"])
(fact claim "English" "gost-7_75-97-code" "анг 045")

(refer-to ["properties.babelnet_id"])
(fact claim "English" "babelnet-id" "00030862n")

(refer-to ["properties.short_name"])
(fact claim "English" "short-name" "monolingualtext")
(fact claim "English" "short-name" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "English" "topic's-main-category" "Q7923975")

(refer-to ["properties.label_in_sign_language"])
(fact claim "English" "label-in-sign-language" "Csc-anglès-spreadthesign.ogv")

(refer-to ["properties.wals_lect_code"])
(fact claim "English" "wals-lect-code" "eng")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "English" "permanent-duplicated-item" "Q22001659")
(fact claim "English" "permanent-duplicated-item" "Q23014481")

(refer-to ["properties.linguistic_typology"])
(fact claim "English" "linguistic-typology" "Q651641")
(fact claim "English" "linguistic-typology" "Q178435")
(fact claim "English" "linguistic-typology" "Q7888721")
(fact claim "English" "linguistic-typology" "Q7200373")
(fact claim "English" "linguistic-typology" "Q318917")

(refer-to ["properties.psh_id"])
(fact claim "English" "psh-id" "6754")

(refer-to ["properties.sudoc_authorities"])
(fact claim "English" "sudoc-authorities" "027219232")

(refer-to ["properties.linguasphere_code"])
(fact claim "English" "linguasphere-code" "52-ABA")

(refer-to ["properties.hds_id"])
(fact claim "English" "hds-id" "11198")

(refer-to ["properties.bnf_id"])
(fact claim "English" "bnf-id" "119308987")

(refer-to ["properties.signed_form"])
(fact claim "English" "signed-form" "Q10302194")

(refer-to ["properties.catalog"])
(fact claim "English" "catalog" "Q5460604")

(refer-to ["properties.freebase_id"])
(fact claim "English" "freebase-id" "/m/02h40lc")
(fact claim "English" "freebase-id" "/m/04l")

(refer-to ["properties.abs_ascl_code"])
(fact claim "English" "abs-ascl-code" "1201")

(refer-to ["properties.glottolog_code"])
(fact claim "English" "glottolog-code" "stan1293")

(refer-to ["properties.ndl_auth_id"])
(fact claim "English" "ndl-auth-id" "00561788")

(refer-to ["properties.gnd_id"])
(fact claim "English" "gnd-id" "4014777-0")

(refer-to ["properties.described_by_source"])
(fact claim "English" "described-by-source" "Q20078554")

(refer-to ["properties.language_regulatory_body"])
(fact claim "English" "language-regulatory-body" "")

(refer-to ["properties.instance_of"])
(fact claim "English" "instance-of" "Q33742")
(fact claim "English" "instance-of" "Q1288568")

(refer-to ["properties.number_of_speakers"])
(fact claim "English" "number-of-speakers" "quantity")
(fact claim "English" "number-of-speakers" "quantity")

(refer-to ["properties.wikimedia_language_code"])
(fact claim "English" "wikimedia-language-code" "en")

(refer-to ["properties.part_of"])
(fact claim "English" "part-of" "Q1346342")
(fact claim "English" "part-of" "Q5329170")

(refer-to ["properties.has_grammatical_mood"])
(fact claim "English" "has-grammatical-mood" "Q682111")
(fact claim "English" "has-grammatical-mood" "Q473746")

(refer-to ["properties.ne_se_id"])
(fact claim "English" "ne_se-id" "engelska")

(refer-to ["properties.iso_639_1_code"])
(fact claim "English" "iso-639-1-code" "en")

(refer-to ["properties.different_from"])
(fact claim "English" "different-from" "Q182")

(refer-to ["properties.nyt_topic_id"])
(fact claim "English" "nyt-topic-id" "subject/english-language")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "English" "bncf-thesaurus" "6546")

(refer-to ["properties.iso_639_2_code"])
(fact claim "English" "iso-639-2-code" "eng")

(refer-to ["properties.topics_main_wikimedia_portal"])
(fact claim "English" "topic's-main-wikimedia-portal" "Q11109963")

(refer-to ["properties.native_label"])
(fact claim "English" "native-label" "monolingualtext")

(refer-to ["properties.ietf_language_tag"])
(fact claim "English" "ietf-language-tag" "en")

(refer-to ["properties.indigenous_to"])
(fact claim "English" "indigenous-to" "Q21")

(refer-to ["properties.quora_topic_id"])
(fact claim "English" "quora-topic-id" "English-language")
