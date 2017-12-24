(ns clazzes.nobel_prize_in_physics
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Nobel Prize in Physics")

(name-as-in "Nobel Prize in Physics" "" "zh-hk")
(name-as-in "Nobel Prize in Physics" "Nobel de Física" "pt")
(name-as-in "Nobel Prize in Physics" "Nobel Prize in Physics" "en")
(name-as-in "Nobel Prize in Physics" "prix Nobel de physique" "fr")
(name-as-in "Nobel Prize in Physics" "" "zh-tw")
(name-as-in "Nobel Prize in Physics" "Nobelpreis für Physik" "de")
(name-as-in "Nobel Prize in Physics" "Нобелевская премия по физике" "ru")
(name-as-in "Nobel Prize in Physics" "Premio Nobel de Física" "es")
(name-as-in "Nobel Prize in Physics" "ノーベル物理学賞" "ja")
(name-as-in "Nobel Prize in Physics" "" "zh-cn")
(name-as-in "Nobel Prize in Physics" "" "zh-sg")

(descr-as-in "Nobel Prize in Physics" "" "zh-hk")
(descr-as-in "Nobel Prize in Physics" "" "pt")
(descr-as-in "Nobel Prize in Physics" "a yearly award given by the Royal Swedish Academy of Sciences for those who conferred the most outstanding contributions for mankind in the field of physics" "en")
(descr-as-in "Nobel Prize in Physics" "" "fr")
(descr-as-in "Nobel Prize in Physics" "" "zh-tw")
(descr-as-in "Nobel Prize in Physics" "Preis, der einmal im Jahr von der Königlichen Schwedischen Akademie der Wissenschaften vergeben wird" "de")
(descr-as-in "Nobel Prize in Physics" "" "ru")
(descr-as-in "Nobel Prize in Physics" "Otorgado anualmente por la Real Academia Sueca de las Ciencias" "es")
(descr-as-in "Nobel Prize in Physics" "" "ja")
(descr-as-in "Nobel Prize in Physics" "" "zh-cn")
(descr-as-in "Nobel Prize in Physics" "" "zh-sg")


(refer-to ["properties.commons_category"])
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Nobel Prize in Physics" "commons-category" "Nobel Prize in Physics")

(refer-to ["properties.encyclopædia_britannica_online_id"])
(fact claim "Nobel Prize in Physics" "encyclopædia-britannica-online-id" "topic/Nobel-Prize-in-Physics")

(refer-to ["properties.topics_main_category"])
(fact claim "Nobel Prize in Physics" "topic's-main-category" "Q5838087")

(refer-to ["properties.winner"])
(fact claim "Nobel Prize in Physics" "winner" "Q57092")
(fact claim "Nobel Prize in Physics" "winner" "Q133232")
(fact claim "Nobel Prize in Physics" "winner" "Q131729")
(fact claim "Nobel Prize in Physics" "winner" "Q127234")
(fact claim "Nobel Prize in Physics" "winner" "Q41688")
(fact claim "Nobel Prize in Physics" "winner" "Q133747")
(fact claim "Nobel Prize in Physics" "winner" "Q37463")
(fact claim "Nobel Prize in Physics" "winner" "Q35149")
(fact claim "Nobel Prize in Physics" "winner" "Q160522")
(fact claim "Nobel Prize in Physics" "winner" "Q131721")
(fact claim "Nobel Prize in Physics" "winner" "Q47285")
(fact claim "Nobel Prize in Physics" "winner" "Q57077")
(fact claim "Nobel Prize in Physics" "winner" "Q7186")
(fact claim "Nobel Prize in Physics" "winner" "Q79000")
(fact claim "Nobel Prize in Physics" "winner" "Q36488")
(fact claim "Nobel Prize in Physics" "winner" "Q83297")
(fact claim "Nobel Prize in Physics" "winner" "Q9021")
(fact claim "Nobel Prize in Physics" "winner" "Q57067")
(fact claim "Nobel Prize in Physics" "winner" "Q41269")
(fact claim "Nobel Prize in Physics" "winner" "Q62891")
(fact claim "Nobel Prize in Physics" "winner" "Q160518")
(fact claim "Nobel Prize in Physics" "winner" "Q57068")

(refer-to ["properties.freebase_id"])
(fact claim "Nobel Prize in Physics" "freebase-id" "/m/0dt39")

(refer-to ["properties.inception"])
(fact claim "Nobel Prize in Physics" "inception" "+1901-00-00T00:00:00Z")

(refer-to ["properties.official_website"])
(fact claim "Nobel Prize in Physics" "official-website" "http://nobelprize.org/")

(refer-to ["properties.gnd_id"])
(fact claim "Nobel Prize in Physics" "gnd-id" "7511828-2")

(refer-to ["properties.conferred_by"])
(fact claim "Nobel Prize in Physics" "conferred-by" "Q191583")

(refer-to ["properties.instance_of"])
(fact claim "Nobel Prize in Physics" "instance-of" "Q7191")
(fact claim "Nobel Prize in Physics" "instance-of" "Q11448906")

(refer-to ["properties.part_of"])
(fact claim "Nobel Prize in Physics" "part-of" "Q7191")

(refer-to ["properties.image"])
(fact claim "Nobel Prize in Physics" "image" "Nobel prize medal.svg")

(refer-to ["properties.category_for_recipients_of_this_award"])
(fact claim "Nobel Prize in Physics" "category-for-recipients-of-this-award" "Q5838087")
(fact claim "Nobel Prize in Physics" "category-for-recipients-of-this-award" "Q9605223")

(refer-to ["properties.quora_topic_id"])
(fact claim "Nobel Prize in Physics" "quora-topic-id" "Nobel-Prize-in-Physics")
