(ns properties.commons_category
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "commons-category")

(name-as-in "commons-category" "維基資源共享分類" "zh-hant")
(name-as-in "commons-category" "共享资源分类" "zh-hans")
(name-as-in "commons-category" "категория на Викискладе" "ru")
(name-as-in "commons-category" "categoria no Commons" "pt")
(name-as-in "commons-category" "catégorie Commons" "fr")
(name-as-in "commons-category" "categoría en Commons" "es")
(name-as-in "commons-category" "コモンズのカテゴリ" "ja")
(name-as-in "commons-category" "Commons-Kategorie" "de")
(name-as-in "commons-category" "Commons category" "en")

(descr-as-in "commons-category" "與此項目有關的維基共享資源分類 (略去 Category: 字首)" "zh-hant")
(descr-as-in "commons-category" "包含与该项有关的文件的维基共享资源分类的名称（没有前缀“Category”）" "zh-hans")
(descr-as-in "commons-category" "название категории в Wikimedia Commons (указывать без префикса "Category")" "ru")
(descr-as-in "commons-category" "nome da categoria na Wikimedia Commons que contém os ficheiros relacionados com o item (sem o prefixo Categoria:)" "pt")
(descr-as-in "commons-category" "nom de la catégorie de Wikimedia Commons (sans le préfixe "Category:")" "fr")
(descr-as-in "commons-category" "nombre de la categoría de Wikimedia Commons que contiene archivos relacionados con este elemento (sin el prefijo "Categoría")" "es")
(descr-as-in "commons-category" "この項目に関連するファイルを含むウィキメディア・コモンズのカテゴリの名前（接頭辞"Category:"は除く）" "ja")
(descr-as-in "commons-category" "Name der Kategorie auf Wikimedia Commons, welche Dateien zu dem Objekt (item) beinhaltet (ohne das Präfix "Category")" "de")
(descr-as-in "commons-category" "name of the Wikimedia Commons category containing files related to this item (without the prefix "Category")" "en")

