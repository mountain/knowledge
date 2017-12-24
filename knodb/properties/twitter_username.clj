(ns properties.twitter_username
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "twitter-username")

(name-as-in "twitter-username" "Twitter用戶名" "zh-hk")
(name-as-in "twitter-username" "nome de utilizador no Twitter" "pt")
(name-as-in "twitter-username" "Twitter username" "en")
(name-as-in "twitter-username" "compte Twitter" "fr")
(name-as-in "twitter-username" "Twitter使用者名稱" "zh-tw")
(name-as-in "twitter-username" "Twitter-Benutzername" "de")
(name-as-in "twitter-username" "учётная запись в Твиттере" "ru")
(name-as-in "twitter-username" "nombre de usuario en Twitter" "es")
(name-as-in "twitter-username" "Twitterのユーザー名" "ja")
(name-as-in "twitter-username" "Twitter用户名" "zh-cn")
(name-as-in "twitter-username" "Twitter用户名" "zh-sg")

(descr-as-in "twitter-username" "" "zh-hk")
(descr-as-in "twitter-username" "nome de utilizador do item no Twitter" "pt")
(descr-as-in "twitter-username" "this item's username on Twitter" "en")
(descr-as-in "twitter-username" "nom du compte sur Twitter" "fr")
(descr-as-in "twitter-username" "" "zh-tw")
(descr-as-in "twitter-username" "Benutzername dieser Person oder Organisation auf Twitter" "de")
(descr-as-in "twitter-username" "имя пользователя в соц. сети Twitter" "ru")
(descr-as-in "twitter-username" "el nombre de usuario en Twitter" "es")
(descr-as-in "twitter-username" "この項目のTwitter上のユーザー名" "ja")
(descr-as-in "twitter-username" "" "zh-cn")
(descr-as-in "twitter-username" "" "zh-sg")

