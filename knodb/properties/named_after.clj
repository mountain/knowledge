(ns properties.named_after
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "named-after")

(name-as-in "named-after" "得名於" "zh-hant")
(name-as-in "named-after" "得名自" "zh-hans")
(name-as-in "named-after" "названо в честь" "ru")
(name-as-in "named-after" "origem do nome" "pt")
(name-as-in "named-after" "nommé en référence à" "fr")
(name-as-in "named-after" "nombrado por" "es")
(name-as-in "named-after" "名前の由来" "ja")
(name-as-in "named-after" "benannt nach" "de")
(name-as-in "named-after" "named after" "en")

(descr-as-in "named-after" "啟發其名稱的事物、人物或事件（在至少一種語言中）" "zh-hant")
(descr-as-in "named-after" "启发其名称的事物、人物或事件（在至少一种语言中）" "zh-hans")
(descr-as-in "named-after" "" "ru")
(descr-as-in "named-after" "entidade ou evento que inspirou o nome do sujeito" "pt")
(descr-as-in "named-after" "quelque chose/quelqu'un qui a inspiré le nom de l'élément" "fr")
(descr-as-in "named-after" "entidad o evento que inspiró el nombre del elemento" "es")
(descr-as-in "named-after" "この項目の名前の由来となったもの・出来事" "ja")
(descr-as-in "named-after" "eine Person oder ein anderes Objekt ist der Namensgeber dieses Objekts" "de")
(descr-as-in "named-after" "entity or event that inspired the subject's name, or namesake (in at least one language)" "en")

