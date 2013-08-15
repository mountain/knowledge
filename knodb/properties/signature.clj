(ns properties.signature
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "signature")

(name-as-in "signature" "簽名" "zh-hant")
(name-as-in "signature" "签名" "zh-hans")
(name-as-in "signature" "подпись" "ru")
(name-as-in "signature" "assinatura" "pt")
(name-as-in "signature" "signature" "fr")
(name-as-in "signature" "firma" "es")
(name-as-in "signature" "署名" "ja")
(name-as-in "signature" "Unterschrift" "de")
(name-as-in "signature" "signature" "en")

(descr-as-in "signature" "" "zh-hant")
(descr-as-in "signature" "" "zh-hans")
(descr-as-in "signature" "" "ru")
(descr-as-in "signature" "imagem da assinatura de uma pessoa" "pt")
(descr-as-in "signature" "image de la signature d'une personne" "fr")
(descr-as-in "signature" "imagen de la firma de una persona" "es")
(descr-as-in "signature" "その人物の署名の画像" "ja")
(descr-as-in "signature" "Bild der Unterschrift einer Person" "de")
(descr-as-in "signature" "image of a person's signature" "en")

