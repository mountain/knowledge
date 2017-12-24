(ns clazzes.inventor
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "inventor")

(name-as-in "inventor" "發明家" "zh-hk")
(name-as-in "inventor" "inventor" "pt")
(name-as-in "inventor" "inventor" "en")
(name-as-in "inventor" "inventeur" "fr")
(name-as-in "inventor" "發明家" "zh-tw")
(name-as-in "inventor" "Erfinder" "de")
(name-as-in "inventor" "изобретатель" "ru")
(name-as-in "inventor" "inventor" "es")
(name-as-in "inventor" "発明家" "ja")
(name-as-in "inventor" "发明家" "zh-cn")
(name-as-in "inventor" "发明家" "zh-sg")

(descr-as-in "inventor" "" "zh-hk")
(descr-as-in "inventor" "pessoa que cria algo novo" "pt")
(descr-as-in "inventor" "person that devises a new device, method, composition, or process" "en")
(descr-as-in "inventor" "personne qui renouvelle, augmente ou modifie la science ou l'art" "fr")
(descr-as-in "inventor" "" "zh-tw")
(descr-as-in "inventor" "Person, die durch eigene schöpferische Leistung eine zuvor nicht bekannte Lösung im Bereich der Technik hervorbringt" "de")
(descr-as-in "inventor" "" "ru")
(descr-as-in "inventor" "individuo que idea, crea o concibe algo que no existía antes" "es")
(descr-as-in "inventor" "" "ja")
(descr-as-in "inventor" "" "zh-cn")
(descr-as-in "inventor" "" "zh-sg")


(refer-to ["properties.subclass_of"])
(fact claim "inventor" "subclass-of" "Q2500638")

(refer-to ["properties.commons_category"])
(fact claim "inventor" "commons-category" "Inventors")

(refer-to ["properties.male_form_of_label"])
(fact claim "inventor" "male-form-of-label" "monolingualtext")
(fact claim "inventor" "male-form-of-label" "monolingualtext")
(fact claim "inventor" "male-form-of-label" "monolingualtext")

(refer-to ["properties.topics_main_category"])
(fact claim "inventor" "topic's-main-category" "Q6528885")

(refer-to ["properties.wikidata_property"])
(fact claim "inventor" "wikidata-property" "Q61")

(refer-to ["properties.field_of_this_occupation"])
(fact claim "inventor" "field-of-this-occupation" "Q18119757")

(refer-to ["properties.ndl_auth_id"])
(fact claim "inventor" "ndl-auth-id" "00563032")

(refer-to ["properties.gnd_id"])
(fact claim "inventor" "gnd-id" "4015222-4")

(refer-to ["properties.instance_of"])
(fact claim "inventor" "instance-of" "Q28640")

(refer-to ["properties.bncf_thesaurus"])
(fact claim "inventor" "bncf-thesaurus" "53062")

(refer-to ["properties.female_form_of_label"])
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")
(fact claim "inventor" "female-form-of-label" "monolingualtext")

(refer-to ["properties.quora_topic_id"])
(fact claim "inventor" "quora-topic-id" "Inventors")
