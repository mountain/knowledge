(ns clazzes.category_albert_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Category:Albert Einstein")

(name-as-in "Category:Albert Einstein" "" "zh-hk")
(name-as-in "Category:Albert Einstein" "Categoria:Albert Einstein" "pt")
(name-as-in "Category:Albert Einstein" "Category:Albert Einstein" "en")
(name-as-in "Category:Albert Einstein" "Catégorie:Albert Einstein" "fr")
(name-as-in "Category:Albert Einstein" "" "zh-tw")
(name-as-in "Category:Albert Einstein" "Kategorie:Albert Einstein" "de")
(name-as-in "Category:Albert Einstein" "Категория:Альберт Эйнштейн" "ru")
(name-as-in "Category:Albert Einstein" "Categoría:Albert Einstein" "es")
(name-as-in "Category:Albert Einstein" "Category:アルベルト・アインシュタイン" "ja")
(name-as-in "Category:Albert Einstein" "" "zh-cn")
(name-as-in "Category:Albert Einstein" "" "zh-sg")

(descr-as-in "Category:Albert Einstein" "維基媒體分類" "zh-hk")
(descr-as-in "Category:Albert Einstein" "categoria de um projeto da Wikimedia" "pt")
(descr-as-in "Category:Albert Einstein" "Wikimedia category" "en")
(descr-as-in "Category:Albert Einstein" "page de catégorie d'un projet Wikimedia" "fr")
(descr-as-in "Category:Albert Einstein" "維基媒體分類" "zh-tw")
(descr-as-in "Category:Albert Einstein" "Wikimedia-Kategorie" "de")
(descr-as-in "Category:Albert Einstein" "категория в проекте Викимедиа" "ru")
(descr-as-in "Category:Albert Einstein" "categoría de Wikimedia" "es")
(descr-as-in "Category:Albert Einstein" "ウィキメディアのカテゴリ" "ja")
(descr-as-in "Category:Albert Einstein" "维基媒体分类" "zh-cn")
(descr-as-in "Category:Albert Einstein" "维基媒体分类" "zh-sg")


(refer-to ["properties.commons_category"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Category:Albert Einstein" "commons-category" "Albert Einstein")

(refer-to ["properties.instance_of"])
(fact claim "Category:Albert Einstein" "instance-of" "Q4167836")

(refer-to ["properties.categorys_main_topic"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Category:Albert Einstein" "category's-main-topic" "Albert Einstein")
