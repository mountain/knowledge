(ns clazzes.human
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "human")

(name-as-in "human" "人類" "zh-hk")
(name-as-in "human" "ser humano" "pt")
(name-as-in "human" "human" "en")
(name-as-in "human" "être humain" "fr")
(name-as-in "human" "人類" "zh-tw")
(name-as-in "human" "Mensch" "de")
(name-as-in "human" "человек" "ru")
(name-as-in "human" "ser humano" "es")
(name-as-in "human" "ヒト" "ja")
(name-as-in "human" "人类" "zh-cn")
(name-as-in "human" "人类" "zh-sg")

(descr-as-in "human" "靈長目人科人屬的物種" "zh-hk")
(descr-as-in "human" "espécie da família Hominidae" "pt")
(descr-as-in "human" "common name of Homo sapiens (Q15978631), unique extant species of the genus Homo" "en")
(descr-as-in "human" "individu membre de la société humaine ; nom commun de l’espèce Homo sapiens (Q15978631), la seule espèce restante du genre Homo – distinct de  « humain fictif » (Q15632617) et de « humain possiblement fictif » (Q21070568)" "fr")
(descr-as-in "human" "靈長目人科人屬的物種" "zh-tw")
(descr-as-in "human" "höheres Säugetier aus der Ordnung der Primaten, Trivialname von Homo sapiens und Homo sapiens sapiens" "de")
(descr-as-in "human" "человек как часть сообщества; обиходное название Homo sapiens (Q15978631), вид из семейства Гоминид, единственный сохранившийся вид рода Люди" "ru")
(descr-as-in "human" "individuo de la especie Homo Sapiens; especie animal perteneciente a la familia Hominidae, única superviviente del género Homo" "es")
(descr-as-in "human" "ヒト科の種" "ja")
(descr-as-in "human" "灵长目人科人属的物种" "zh-cn")
(descr-as-in "human" "灵长目人科人属的物种" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "human" "subclass-of" "Q215627")

(refer-to ["properties.product_or_material_produced"])
(fact claim "human" "product-or-material-produced" "Q8205328")
(fact claim "human" "product-or-material-produced" "Q3619132")

(refer-to ["properties.commons_category"])
(fact claim "human" "commons-category" "People")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "human" "encyclopædia-britannica-online-id" "topic/human-being")

(refer-to ["properties.has_quality"])
(fact claim "human" "has-quality" "Q202444")
(fact claim "human" "has-quality" "Q3577052")
(fact claim "human" "has-quality" "Q48277")
(fact claim "human" "has-quality" "Q17888")
(fact claim "human" "has-quality" "Q853516")
(fact claim "human" "has-quality" "Q742609")
(fact claim "human" "has-quality" "Q101352")
(fact claim "human" "has-quality" "Q18534278")
(fact claim "human" "has-quality" "Q238372")
(fact claim "human" "has-quality" "Q1314553")
(fact claim "human" "has-quality" "Q1847641")

(refer-to ["properties.us_national_archives_identifier"])
(fact claim "human" "us-national-archives-identifier" "10639765")

(refer-to ["properties.babelnet_id"])
(fact claim "human" "babelnet-id" "00044576n")

(refer-to ["properties.topics_main_category"])
(fact claim "human" "topic's-main-category" "Q6697530")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "human" "permanent-duplicated-item" "Q22828631")

(refer-to ["properties.studied_by"])
(fact claim "human" "studied-by" "Q23404")

(refer-to ["properties.exact_match"])
(fact claim "human" "exact-match" "http://xmlns.com/foaf/spec/Person")

(refer-to ["properties.psh_id"])
(fact claim "human" "psh-id" "2693")

(refer-to ["properties.has_effect"])
(fact claim "human" "has-effect" "Q16686448")

(refer-to ["properties.catalog"])
(refer-to ["clazzes.wikipedia_list_of_1000_articles_each_wikipedia_should_have"])
(fact claim "human" "catalog" "Wikipedia:List of 1000 articles each Wikipedia should have")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "human" "national-library-of-israel-id" "000710772")

(refer-to ["properties.topics_main_template"])
(fact claim "human" "topic's-main-template" "Q6249834")
(fact claim "human" "topic's-main-template" "Q20829728")

(refer-to ["properties.freebase_id"])
(fact claim "human" "freebase-id" "/m/0dgw9r")

(refer-to ["properties.properties_for_this_type"])
(fact claim "human" "properties-for-this-type" "Q21")
(fact claim "human" "properties-for-this-type" "Q569")
(fact claim "human" "properties-for-this-type" "Q570")
(fact claim "human" "properties-for-this-type" "Q735")
(fact claim "human" "properties-for-this-type" "Q734")
(fact claim "human" "properties-for-this-type" "Q27")
(fact claim "human" "properties-for-this-type" "Q106")
(fact claim "human" "properties-for-this-type" "Q18")
(fact claim "human" "properties-for-this-type" "Q19")
(fact claim "human" "properties-for-this-type" "Q20")
(fact claim "human" "properties-for-this-type" "Q26")
(fact claim "human" "properties-for-this-type" "Q119")
(fact claim "human" "properties-for-this-type" "Q746")
(fact claim "human" "properties-for-this-type" "Q1317")
(fact claim "human" "properties-for-this-type" "Q214")
(fact claim "human" "properties-for-this-type" "Q1038")
(fact claim "human" "properties-for-this-type" "Q140")
(fact claim "human" "properties-for-this-type" "Q102")
(fact claim "human" "properties-for-this-type" "Q1442")
(fact claim "human" "properties-for-this-type" "Q1636")
(fact claim "human" "properties-for-this-type" "Q1532")
(fact claim "human" "properties-for-this-type" "Q1477")
(fact claim "human" "properties-for-this-type" "Q25")
(fact claim "human" "properties-for-this-type" "Q22")
(fact claim "human" "properties-for-this-type" "Q2889")
(fact claim "human" "properties-for-this-type" "Q1412")
(fact claim "human" "properties-for-this-type" "Q108")
(fact claim "human" "properties-for-this-type" "Q497")
(fact claim "human" "properties-for-this-type" "Q496")
(fact claim "human" "properties-for-this-type" "Q586")
(fact claim "human" "properties-for-this-type" "Q640")
(fact claim "human" "properties-for-this-type" "Q1254")
(fact claim "human" "properties-for-this-type" "Q2456")
(refer-to ["clazzes.albert_einstein"])
(fact claim "human" "properties-for-this-type" "Albert Einstein")
(fact claim "human" "properties-for-this-type" "Q2021")
(fact claim "human" "properties-for-this-type" "Q103")

(refer-to ["properties.uses"])
(fact claim "human" "uses" "Q8205328")

(refer-to ["properties.omegawiki_defined_meaning"])
(fact claim "human" "omegawiki-defined-meaning" "2234")

(refer-to ["properties.gnd_id"])
(fact claim "human" "gnd-id" "4038639-9")

(refer-to ["properties.said_to_be_the_same_as"])
(fact claim "human" "said-to-be-the-same-as" "Q15978631")

(refer-to ["properties.has_part"])
(fact claim "human" "has-part" "Q23852")

(refer-to ["properties.described_by_source"])
(fact claim "human" "described-by-source" "Q2627728")
(fact claim "human" "described-by-source" "Q302556")
(fact claim "human" "described-by-source" "Q602358")
(fact claim "human" "described-by-source" "Q24515684")
(fact claim "human" "described-by-source" "Q19180675")
(fact claim "human" "described-by-source" "Q4173137")
(fact claim "human" "described-by-source" "Q4086271")

(refer-to ["properties.instance_of"])
(fact claim "human" "instance-of" "Q502895")
(fact claim "human" "instance-of" "Q22302160")

(refer-to ["properties.part_of"])
(fact claim "human" "part-of" "Q1156970")
(fact claim "human" "part-of" "Q16502")

(refer-to ["properties.equivalent_class"])
(fact claim "human" "equivalent-class" "http://dbpedia.org/ontology/Person")
(fact claim "human" "equivalent-class" "http://schema.org/Person")

(refer-to ["properties.ne_se_id"])
(fact claim "human" "ne_se-id" "människan")

(refer-to ["properties.image"])
(fact claim "human" "image" "Akha cropped hires.JPG")
(fact claim "human" "image" "Cape Dombey people.jpg")

(refer-to ["properties.jstor_topic_id"])
(fact claim "human" "jstor-topic-id" "humans")

(refer-to ["properties.quora_topic_id"])
(fact claim "human" "quora-topic-id" "Humans")
