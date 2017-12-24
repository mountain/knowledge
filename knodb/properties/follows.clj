(ns properties.follows
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "follows")

(name-as-in "follows" "上一項" "zh-hk")
(name-as-in "follows" "precedido por" "pt")
(name-as-in "follows" "follows" "en")
(name-as-in "follows" "précédé par" "fr")
(name-as-in "follows" "上一項" "zh-tw")
(name-as-in "follows" "Vorgänger" "de")
(name-as-in "follows" "предыдущее по порядку" "ru")
(name-as-in "follows" "precedido por" "es")
(name-as-in "follows" "前" "ja")
(name-as-in "follows" "上一项" "zh-cn")
(name-as-in "follows" "上一项" "zh-sg")

(descr-as-in "follows" "某主題中的上一個項目" "zh-hk")
(descr-as-in "follows" "O objeto que imediatamente precede o item numa série da qual o item faz parte. Use P1365 (substituiu) se o item foi substituído (p./ex: pessoa ou estado que se seguiu no cargo, posição, etc.); use P167 (estrutura substituída) para estruturas." "pt")
(descr-as-in "follows" "immediately prior item in some series of which the subject is part. Use P1365 (replaces) if the preceding item was replaced, e.g. political offices, states and there is no identity between precedent and following geographic unit" "en")
(descr-as-in "follows" "prédécesseur immédiat dans la série dont fait partie l'élément. Utiliser P1365 (a remplacé) si l'item précédent a été remplacé (élu, etc.)" "fr")
(descr-as-in "follows" "某主題中的上一個項目" "zh-tw")
(descr-as-in "follows" "unmittelbarer Vorgänger eines Datenobjekts in einer Serie. Verwende P1365 (ersetzt), wenn das Vorgängerobjekt ersetzt wurde, z.B. Ämter, geographische Einheiten und keine Identität zwischen geografischem Vorgänger- und Nachfolgeobjekt besteht" "de")
(descr-as-in "follows" "элемент, непосредственно предшествующий данному в некоторой череде элементов. Используйте P1365, если предшественник был заменён, т.е. в политических должностях, государствах, организациях" "ru")
(descr-as-in "follows" "inmediato predecesor en alguna serie de la que el elemento forma parte" "es")
(descr-as-in "follows" "この項目が含まれる一連でこの前の順序にある項目。置き換わるもの（役職等）の先代はP1365を使用。" "ja")
(descr-as-in "follows" "某主题中的上一个项目" "zh-cn")
(descr-as-in "follows" "某主题中的上一个项目" "zh-sg")

