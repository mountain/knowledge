(ns clazzes.physicist
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "physicist")

(name-as-in "physicist" "物理學家" "zh-hk")
(name-as-in "physicist" "físico" "pt")
(name-as-in "physicist" "physicist" "en")
(name-as-in "physicist" "physicien" "fr")
(name-as-in "physicist" "物理學家" "zh-tw")
(name-as-in "physicist" "Physiker" "de")
(name-as-in "physicist" "физик" "ru")
(name-as-in "physicist" "físico" "es")
(name-as-in "physicist" "物理学者" "ja")
(name-as-in "physicist" "物理学家" "zh-cn")
(name-as-in "physicist" "物理学家" "zh-sg")

(descr-as-in "physicist" "" "zh-hk")
(descr-as-in "physicist" "cientista que investiga Física" "pt")
(descr-as-in "physicist" "scientist who does research in physics" "en")
(descr-as-in "physicist" "scientifique étudiant la physique" "fr")
(descr-as-in "physicist" "" "zh-tw")
(descr-as-in "physicist" "Naturwissenschaftler der Physik" "de")
(descr-as-in "physicist" "учёный, специализирующийся в одной из областей физики" "ru")
(descr-as-in "physicist" "científico que se dedica al estudio de las ciencias físicas" "es")
(descr-as-in "physicist" "" "ja")
(descr-as-in "physicist" "" "zh-cn")
(descr-as-in "physicist" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "physicist" "subclass-of" "Q901")

(refer-to ["properties.soc_code_2010"])
(fact claim "physicist" "soc-code-2010" "19-2012")

(refer-to ["properties.isco_occupation_code"])
(fact claim "physicist" "isco-occupation-code" "2111")

(refer-to ["properties.commons_category"])
(fact claim "physicist" "commons-category" "Physicists")

(refer-to ["properties.dewey_decimal_classification"])
(fact claim "physicist" "dewey-decimal-classification" "530.092")

(refer-to ["properties.male_form_of_label"])
(fact claim "physicist" "male-form-of-label" "monolingualtext")
(fact claim "physicist" "male-form-of-label" "monolingualtext")
(fact claim "physicist" "male-form-of-label" "monolingualtext")
(fact claim "physicist" "male-form-of-label" "monolingualtext")

(refer-to ["properties.aat_id"])
(fact claim "physicist" "aat-id" "300025816")

(refer-to ["properties.topics_main_category"])
(fact claim "physicist" "topic's-main-category" "Q7217521")

(refer-to ["properties.bnf_id"])
(fact claim "physicist" "bnf-id" "119338770")

(refer-to ["properties.rome_occupation_code_v3"])
(fact claim "physicist" "rome-occupation-code-v3" "K2402")

(refer-to ["properties.freebase_id"])
(fact claim "physicist" "freebase-id" "/m/05snw")

(refer-to ["properties.fast_id"])
(fact claim "physicist" "fast-id" "1063014")

(refer-to ["properties.field_of_this_occupation"])
(fact claim "physicist" "field-of-this-occupation" "Q413")

(refer-to ["properties.ndl_auth_id"])
(fact claim "physicist" "ndl-auth-id" "00561125")

(refer-to ["properties.gnd_id"])
(fact claim "physicist" "gnd-id" "4045968-8")

(refer-to ["properties.instance_of"])
(fact claim "physicist" "instance-of" "Q28640")

(refer-to ["properties.image"])
(fact claim "physicist" "image" "P Physicist.png")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "physicist" "bncf-thesaurus" "28902")

(refer-to ["properties.female_form_of_label"])
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")
(fact claim "physicist" "female-form-of-label" "monolingualtext")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "physicist" "library-of-congress-authority-id" "sh85101651")

(refer-to ["properties.quora_topic_id"])
(fact claim "physicist" "quora-topic-id" "Physicists")
