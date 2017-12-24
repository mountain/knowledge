(ns clazzes.great_soviet_encyclopedia_1969–1978
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Great Soviet Encyclopedia (1969–1978)")

(name-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-hk")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "Grande Enciclopédia Soviética 1969–1978" "pt")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "Great Soviet Encyclopedia (1969–1978)" "en")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "Grande Encyclopédie soviétique 1969–1978" "fr")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-tw")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "Große Sowjetische Enzyklopädie (1969–1978)" "de")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "Большая советская энциклопедия, 1969—1978" "ru")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "Gran Enciclopedia Soviética 1969-1978" "es")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "ソビエト大百科事典 (1969年-1978年)" "ja")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-cn")
(name-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-sg")

(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-hk")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "" "pt")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "3rd edition of Soviet universal encyclopedia" "en")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "" "fr")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-tw")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "dritte Auflage der sowjetischen Universal-Enzyklopädie" "de")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "третье издание советской универсальной энциклопедии" "ru")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "tercera edición de la enciclopedia universal soviética" "es")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "ソビエト大百科辞典の第三版" "ja")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-cn")
(descr-as-in "Great Soviet Encyclopedia (1969–1978)" "" "zh-sg")


(refer-to ["properties.oclc_control_number"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "oclc-control-number" "14476314")

(refer-to ["properties.publication_date"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "publication-date" "+1969-00-00T00:00:00Z")

(refer-to ["properties.place_of_publication"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "place-of-publication" "Q649")

(refer-to ["properties.rsl_editions"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "rsl-editions" "006792287")

(refer-to ["properties.edition_number"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "edition-number" "3")

(refer-to ["properties.wikidata_property"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "wikidata-property" "Q2924")

(refer-to ["properties.editor"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "editor" "Q83552")

(refer-to ["properties.subtitle"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "subtitle" "monolingualtext")

(refer-to ["properties.edition_or_translation_of"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "edition-or-translation-of" "Q234535")

(refer-to ["properties.language_of_work_or_name"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "language-of-work-or-name" "Q7737")

(refer-to ["properties.followed_by"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "followed-by" "Q1768199")

(refer-to ["properties.instance_of"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "instance-of" "Q3331189")

(refer-to ["properties.publisher"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "publisher" "Q5061737")

(refer-to ["properties.title"])
(fact claim "Great Soviet Encyclopedia (1969–1978)" "title" "monolingualtext")
