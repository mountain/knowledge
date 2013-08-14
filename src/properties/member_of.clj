(ns properties.member-of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "member-of")

(name-as-in "member-of" "所屬團體" "zh-hant")
(name-as-in "member-of" "所属组织" "zh-hans")
(name-as-in "member-of" "членствует в" "ru")
(name-as-in "member-of" "membro de" "pt")
(name-as-in "member-of" "membre de" "fr")
(name-as-in "member-of" "miembro de" "es")
(name-as-in "member-of" "所属組織" "ja")
(name-as-in "member-of" "Mitglied von" "de")
(name-as-in "member-of" "member of" "en")

(descr-as-in "member-of" "" "zh-hant")
(descr-as-in "member-of" "" "zh-hans")
(descr-as-in "member-of" "добровольный член указанной организации или клуба. Не использовать для указания членства в этнических или социальных группах" "ru")
(descr-as-in "member-of" "a organização ao qual a pessoa pertence" "pt")
(descr-as-in "member-of" "la personne est membre d'une organisation spécifique. Ne doit pas être utilisé pour les groupe ethniques et sociaux" "fr")
(descr-as-in "member-of" "la persona es miembro de una organización específica" "es")
(descr-as-in "member-of" "この人が自発的な構成員となっている（だった）組織。このプロパティは民族や社会集団には使用しない。" "ja")
(descr-as-in "member-of" "Person ist/war freiwilliges Mitglied einer Gruppierung (nicht für ethnische oder soziale Gruppen zu verwenden)" "de")
(descr-as-in "member-of" "voluntary member of a specific organization or club. Must not be used to indicate membership in ethnic or social groups" "en")

