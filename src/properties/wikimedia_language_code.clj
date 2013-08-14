(ns properties.wikimedia-language-code
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "wikimedia-language-code")

(name-as-in "wikimedia-language-code" "維基媒體語言代碼" "zh-hant")
(name-as-in "wikimedia-language-code" "维基媒体语言代码" "zh-hans")
(name-as-in "wikimedia-language-code" "код языка в проектах Викимедиа" "ru")
(name-as-in "wikimedia-language-code" "código de língua da Wikimedia" "pt")
(name-as-in "wikimedia-language-code" "code de langue Wikimedia" "fr")
(name-as-in "wikimedia-language-code" "código Wikimedia del idioma" "es")
(name-as-in "wikimedia-language-code" "ウィキメディア言語コード" "ja")
(name-as-in "wikimedia-language-code" "Wikimedia Sprachcode" "de")
(name-as-in "wikimedia-language-code" "Wikimedia language code" "en")

(descr-as-in "wikimedia-language-code" "維基媒體項目上使用的語言代碼" "zh-hant")
(descr-as-in "wikimedia-language-code" "维基媒体项目上使用的语言代码" "zh-hans")
(descr-as-in "wikimedia-language-code" "например, код раздела Википедии" "ru")
(descr-as-in "wikimedia-language-code" "código para os vários idiomas usados pelo projetos da Wikimedia" "pt")
(descr-as-in "wikimedia-language-code" "code utilisé pour cette langue par les projets Wikimedia" "fr")
(descr-as-in "wikimedia-language-code" "código lingüístico usado por los proyectos Wikimedia" "es")
(descr-as-in "wikimedia-language-code" "ウィキメディア・プロジェクトで使用されている言語コード" "ja")
(descr-as-in "wikimedia-language-code" "Kürzel der Sprache, wie es in den Wikimedia-Projekten verwendet wird" "de")
(descr-as-in "wikimedia-language-code" "language code as used by Wikimedia projects" "en")

