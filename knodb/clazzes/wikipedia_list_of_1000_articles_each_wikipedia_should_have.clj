(ns clazzes.wikipedia_list_of_1000_articles_each_wikipedia_should_have
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Wikipedia:List of 1000 articles each Wikipedia should have")

(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-hk")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Wikipedia:Lista dos 1000 artigos essenciais" "pt")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Wikipedia:List of 1000 articles each Wikipedia should have" "en")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Wikipédia:Articles vitaux" "fr")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-tw")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Wikipedia:Liste von 1000 Artikeln, die es in jeder Wikipedia geben sollte" "de")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Википедия:Список статей, которые должны быть во всех языковых версиях" "ru")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Wikipedia:Lista de artículos que toda Wikipedia debería tener" "es")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Wikipedia:すべての言語版にあるべき項目の一覧" "ja")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-cn")
(name-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-sg")

(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-hk")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "pt")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "list of articles all Wikipedias should have" "en")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "liste d'articles que toutes les Wikipédias devraient avoir" "fr")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-tw")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "Liste wichtiger Artikel" "de")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "официальный список тем, единый для всех языковых версий" "ru")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "es")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "ja")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-cn")
(descr-as-in "Wikipedia:List of 1000 articles each Wikipedia should have" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Wikipedia:List of 1000 articles each Wikipedia should have" "instance-of" "Q14204246")
(fact claim "Wikipedia:List of 1000 articles each Wikipedia should have" "instance-of" "Q2352616")

(refer-to ["properties.different_from"])
(fact claim "Wikipedia:List of 1000 articles each Wikipedia should have" "different-from" "Q43375360")

(refer-to ["properties.topics_main_category"])
(fact claim "Wikipedia:List of 1000 articles each Wikipedia should have" "topic's-main-category" "Q8181072")
