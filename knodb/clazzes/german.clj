(ns clazzes.german
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "German")

(name-as-in "German" "" "zh-hant")
(name-as-in "German" "德语" "zh-hans")
(name-as-in "German" "немецкий язык" "ru")
(name-as-in "German" "língua alemã" "pt")
(name-as-in "German" "allemand" "fr")
(name-as-in "German" "alemán" "es")
(name-as-in "German" "ドイツ語" "ja")
(name-as-in "German" "Deutsch" "de")
(name-as-in "German" "German" "en")

(descr-as-in "German" "" "zh-hant")
(descr-as-in "German" "" "zh-hans")
(descr-as-in "German" "германский язык индоевропейской семьи" "ru")
(descr-as-in "German" "língua falada principalmente na Alemanha" "pt")
(descr-as-in "German" "langue germanique" "fr")
(descr-as-in "German" "lengua indoeuropea" "es")
(descr-as-in "German" "言語" "ja")
(descr-as-in "German" "germanische Sprache, die in und um Deutschland gesprochen wird" "de")
(descr-as-in "German" "West Germanic language" "en")


(refer-to ["properties.iso_639_3"])
(fact claim "German" "iso-639-3" "deu")

(refer-to ["properties.language_family"])
(refer-to ["clazzes.indo_european_languages"])
(fact claim "German" "language-family" "Indo-European languages")

(refer-to ["properties.gost_7_75_97_code"])
(fact claim "German" "gost-7_75-97-code" "нем 481")

(refer-to ["properties.wikimedia_language_code"])
(fact claim "German" "wikimedia-language-code" "de")

(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "German" "main-type-gnd" "term")

(refer-to ["properties.iso_639_1"])
(fact claim "German" "iso-639-1" "de")

(refer-to ["properties.iso_639_2"])
(fact claim "German" "iso-639-2" "deu")
(fact claim "German" "iso-639-2" "ger")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "German" "bncf-thesaurus" "186")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.language"])
(fact claim "German" "instance-of" "language")

(refer-to ["properties.writing_system"])
(refer-to ["entities.latin_script_alphabet"])
(fact claim "German" "writing-system" "Latin script alphabet")

(refer-to ["properties.language_group"])
(refer-to ["clazzes.west_germanic_languages"])
(fact claim "German" "language-group" "West Germanic languages")

(refer-to ["properties.language_branch"])
(refer-to ["clazzes.germanic_languages"])
(fact claim "German" "language-branch" "Germanic languages")

(refer-to ["properties.commons_category"])
(fact claim "German" "commons-category" "German language")
