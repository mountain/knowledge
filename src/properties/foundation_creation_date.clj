(ns properties.foundation_creation_date
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "foundation_creation-date")

(name-as-in "foundation_creation-date" "成立日期" "zh-hant")
(name-as-in "foundation_creation-date" "成立日期" "zh-hans")
(name-as-in "foundation_creation-date" "дата основания/создания" "ru")
(name-as-in "foundation_creation-date" "data de fundação/criação" "pt")
(name-as-in "foundation_creation-date" "date de fondation" "fr")
(name-as-in "foundation_creation-date" "fecha de fundación/creación" "es")
(name-as-in "foundation_creation-date" "設立日・作成日" "ja")
(name-as-in "foundation_creation-date" "Gründungs-/Erstellungsdatum" "de")
(name-as-in "foundation_creation-date" "foundation/creation date" "en")

(descr-as-in "foundation_creation-date" "" "zh-hant")
(descr-as-in "foundation_creation-date" "" "zh-hans")
(descr-as-in "foundation_creation-date" "" "ru")
(descr-as-in "foundation_creation-date" "" "pt")
(descr-as-in "foundation_creation-date" "quand une organistation/un objet a été fondé/créé" "fr")
(descr-as-in "foundation_creation-date" "fecha en la cual fue fundada/creada la organización u objeto" "es")
(descr-as-in "foundation_creation-date" "組織・事物が設立・作成された年月日" "ja")
(descr-as-in "foundation_creation-date" "Datum, an dem eine Organisation/ein Objekt gegründet/erstellt wurde" "de")
(descr-as-in "foundation_creation-date" "when the organization/object was founded/created" "en")

