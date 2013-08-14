(ns properties.logo_image
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "logo-image")

(name-as-in "logo-image" "標誌圖像" "zh-hant")
(name-as-in "logo-image" "标志图像" "zh-hans")
(name-as-in "logo-image" "логотип" "ru")
(name-as-in "logo-image" "logotipo" "pt")
(name-as-in "logo-image" "logotype" "fr")
(name-as-in "logo-image" "logotipo" "es")
(name-as-in "logo-image" "ロゴ画像" "ja")
(name-as-in "logo-image" "Logo" "de")
(name-as-in "logo-image" "logo image" "en")

(descr-as-in "logo-image" "企業、組織或產品所使用的圖形標誌" "zh-hant")
(descr-as-in "logo-image" "企业、组织或产品所使用的图形标志" "zh-hans")
(descr-as-in "logo-image" "" "ru")
(descr-as-in "logo-image" "marca ou emblema gráfico usado geralmente por organizações e empresas comerciais" "pt")
(descr-as-in "logo-image" "marque graphique ou emblème communément utilisé par les entreprises commerciales et les organisations" "fr")
(descr-as-in "logo-image" "distintivo gráfico utilizado generalmente por organizaciones y empresas comerciales" "es")
(descr-as-in "logo-image" "民間企業や組織で使用されるグラフィック・マークまたは標章" "ja")
(descr-as-in "logo-image" "grafisch gestaltetes Wortzeichen" "de")
(descr-as-in "logo-image" "graphic mark or emblem commonly used by commercial enterprises, organizations and products" "en")

