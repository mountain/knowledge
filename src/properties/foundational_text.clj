(ns properties.foundational_text
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "foundational-text")

(name-as-in "foundational-text" "文本基礎" "zh-hant")
(name-as-in "foundational-text" "文本基础" "zh-hans")
(name-as-in "foundational-text" "основополагающий документ" "ru")
(name-as-in "foundational-text" "documento fundador" "pt")
(name-as-in "foundational-text" "texte fondateur" "fr")
(name-as-in "foundational-text" "texto fundacional" "es")
(name-as-in "foundational-text" "設立文" "ja")
(name-as-in "foundational-text" "Gründungsvertrag" "de")
(name-as-in "foundational-text" "foundational text" "en")

(descr-as-in "foundational-text" "" "zh-hant")
(descr-as-in "foundational-text" "" "zh-hans")
(descr-as-in "foundational-text" "" "ru")
(descr-as-in "foundational-text" "" "pt")
(descr-as-in "foundational-text" "texte créant une institution" "fr")
(descr-as-in "foundational-text" "texto por el cual una institución fue creada" "es")
(descr-as-in "foundational-text" "この機関の設立に関与した文章" "ja")
(descr-as-in "foundational-text" "" "de")
(descr-as-in "foundational-text" "text through which an institution has been created" "en")

