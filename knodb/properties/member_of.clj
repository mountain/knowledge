(ns properties.member_of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "member-of")

(name-as-in "member-of" "所屬組織" "zh-hk")
(name-as-in "member-of" "membro de" "pt")
(name-as-in "member-of" "member of" "en")
(name-as-in "member-of" "membre de" "fr")
(name-as-in "member-of" "所屬組織" "zh-tw")
(name-as-in "member-of" "Mitglied von" "de")
(name-as-in "member-of" "участник организации или клуба" "ru")
(name-as-in "member-of" "miembro de" "es")
(name-as-in "member-of" "所属グループ" "ja")
(name-as-in "member-of" "所属组织" "zh-cn")
(name-as-in "member-of" "所属组织" "zh-sg")

(descr-as-in "member-of" "" "zh-hk")
(descr-as-in "member-of" "a organização ao qual se pertence" "pt")
(descr-as-in "member-of" "organization or club to which the subject belongs. Do not use for membership in ethnic or social groups, nor for holding a position such as a member of parliament (use P39 for that)." "en")
(descr-as-in "member-of" "est membre d'une organisation spécifique. Ne doit pas être utilisé pour les groupe ethniques et sociaux" "fr")
(descr-as-in "member-of" "" "zh-tw")
(descr-as-in "member-of" "Mitglied einer Organisation oder Vereinigung (nicht für ethnische oder soziale Gruppen oder Parlamentsmitglieder zu verwenden)" "de")
(descr-as-in "member-of" "член указанной организации или клуба. Не использовать для членства в этнических или социальных группах, указания членов парламента (используйте P39)" "ru")
(descr-as-in "member-of" "es miembro de una organización específica. No debe ser usada para grupos étnicos o sociales." "es")
(descr-as-in "member-of" "主題人物が自発的な構成員となっている／いた組織（クラブ・協会など）。このプロパティは民族(P172)や社会集団には使用しない。議会・政府の一員などはP39を使用する" "ja")
(descr-as-in "member-of" "" "zh-cn")
(descr-as-in "member-of" "" "zh-sg")

