(ns clazzes.josiah_willard_gibbs_lectureship
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Josiah Willard Gibbs Lectureship")

(name-as-in "Josiah Willard Gibbs Lectureship" "" "zh-hk")
(name-as-in "Josiah Willard Gibbs Lectureship" "Gibbs Lecture" "pt")
(name-as-in "Josiah Willard Gibbs Lectureship" "Josiah Willard Gibbs Lectureship" "en")
(name-as-in "Josiah Willard Gibbs Lectureship" "Conférence Gibbs" "fr")
(name-as-in "Josiah Willard Gibbs Lectureship" "" "zh-tw")
(name-as-in "Josiah Willard Gibbs Lectureship" "Gibbs Lecture" "de")
(name-as-in "Josiah Willard Gibbs Lectureship" "Гиббсовская лекция" "ru")
(name-as-in "Josiah Willard Gibbs Lectureship" "" "es")
(name-as-in "Josiah Willard Gibbs Lectureship" "" "ja")
(name-as-in "Josiah Willard Gibbs Lectureship" "约西亚·威拉德·吉布斯讲座" "zh-cn")
(name-as-in "Josiah Willard Gibbs Lectureship" "" "zh-sg")

(descr-as-in "Josiah Willard Gibbs Lectureship" "" "zh-hk")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "pt")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "en")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "fr")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "zh-tw")
(descr-as-in "Josiah Willard Gibbs Lectureship" "Auszeichnung" "de")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "ru")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "es")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "ja")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "zh-cn")
(descr-as-in "Josiah Willard Gibbs Lectureship" "" "zh-sg")


(refer-to ["properties.country"])
(fact claim "Josiah Willard Gibbs Lectureship" "country" "Q30")

(refer-to ["properties.instance_of"])
(fact claim "Josiah Willard Gibbs Lectureship" "instance-of" "Q618779")
