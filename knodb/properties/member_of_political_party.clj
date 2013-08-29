(ns properties.member_of_political_party
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "member-of-political-party")

(name-as-in "member-of-political-party" "所屬政黨" "zh-hant")
(name-as-in "member-of-political-party" "所属政党" "zh-hans")
(name-as-in "member-of-political-party" "член политической партии" "ru")
(name-as-in "member-of-political-party" "membro do partido político" "pt")
(name-as-in "member-of-political-party" "parti politique" "fr")
(name-as-in "member-of-political-party" "miembro del partido político" "es")
(name-as-in "member-of-political-party" "所属政党" "ja")
(name-as-in "member-of-political-party" "Politische Partei" "de")
(name-as-in "member-of-political-party" "member of political party" "en")

(descr-as-in "member-of-political-party" "" "zh-hant")
(descr-as-in "member-of-political-party" "" "zh-hans")
(descr-as-in "member-of-political-party" "политическая партия, членом которой является (или являлась) данная персона" "ru")
(descr-as-in "member-of-political-party" "" "pt")
(descr-as-in "member-of-political-party" "parti dont la personne est membre" "fr")
(descr-as-in "member-of-political-party" "partido político del cual forma parte" "es")
(descr-as-in "member-of-political-party" "その政治家が所属しているまたは所属していた政党" "ja")
(descr-as-in "member-of-political-party" "politische Partei, deren Mitglied die Person ist oder war" "de")
(descr-as-in "member-of-political-party" "the political party of which this politician is or has been a member" "en")

