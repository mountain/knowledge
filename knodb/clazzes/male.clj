(ns clazzes.male
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "male")

(name-as-in "male" "男性" "zh-hk")
(name-as-in "male" "masculino" "pt")
(name-as-in "male" "male" "en")
(name-as-in "male" "masculin" "fr")
(name-as-in "male" "男性" "zh-tw")
(name-as-in "male" "männlich" "de")
(name-as-in "male" "мужской пол" "ru")
(name-as-in "male" "masculino" "es")
(name-as-in "male" "男性" "ja")
(name-as-in "male" "男性" "zh-cn")
(name-as-in "male" "男性" "zh-sg")

(descr-as-in "male" "人類性別，只用於屬性P21" "zh-hk")
(descr-as-in "male" "pessoa que é do sexo masculino (usar com a propriedade P21 para indicar o sexo ou género)" "pt")
(descr-as-in "male" "human who is male (use with Property:P21 sex or gender). For groups of males use with ''subclass of (P279)''" "en")
(descr-as-in "male" "élément à utiliser dans P21 (sexe ou genre) pour signifier que la personne est de sexe masculin" "fr")
(descr-as-in "male" "人類性別，只用於屬性P21" "zh-tw")
(descr-as-in "male" "wird benutzt für die Eigenschaft: Geschlecht (P21) um anzuzeigen, dass die Person männlich ist" "de")
(descr-as-in "male" "используется в свойстве P21 (пол человека)" "ru")
(descr-as-in "male" "género humano (utilizar con la propiedad P21)" "es")
(descr-as-in "male" "Property:P21（性別） で主語が男性であると示すために用いられる" "ja")
(descr-as-in "male" "人类性别，只用于属性P21" "zh-cn")
(descr-as-in "male" "人类性别，只用于属性P21" "zh-sg")


(refer-to ["properties.wikidata_usage_instructions"])
(fact claim "male" "wikidata-usage-instructions" "monolingualtext")
(fact claim "male" "wikidata-usage-instructions" "monolingualtext")
(fact claim "male" "wikidata-usage-instructions" "monolingualtext")
(fact claim "male" "wikidata-usage-instructions" "monolingualtext")

(refer-to ["properties.subclass_of"])
(fact claim "male" "subclass-of" "Q44148")

(refer-to ["properties.has_quality"])
(fact claim "male" "has-quality" "Q12308941")

(refer-to ["properties.unicode_character"])
(fact claim "male" "unicode-character" "🚹")

(refer-to ["properties.short_name"])
(fact claim "male" "short-name" "monolingualtext")
(fact claim "male" "short-name" "monolingualtext")
(fact claim "male" "short-name" "monolingualtext")

(refer-to ["properties.opposite_of"])
(fact claim "male" "opposite-of" "Q6581072")

(refer-to ["properties.instance_of"])
(fact claim "male" "instance-of" "Q48264")
(fact claim "male" "instance-of" "Q4369513")
(fact claim "male" "instance-of" "Q48277")

(refer-to ["properties.image"])
(fact claim "male" "image" "Mars symbol.svg")

(refer-to ["properties.different_from"])
(fact claim "male" "different-from" "Q8441")
