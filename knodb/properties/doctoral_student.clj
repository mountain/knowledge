(ns properties.doctoral_student
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "doctoral-student")

(name-as-in "doctoral-student" "" "zh-hant")
(name-as-in "doctoral-student" "博士生" "zh-hans")
(name-as-in "doctoral-student" "аспирант у" "ru")
(name-as-in "doctoral-student" "doutorando" "pt")
(name-as-in "doctoral-student" "étudiant de thèse" "fr")
(name-as-in "doctoral-student" "doctorando" "es")
(name-as-in "doctoral-student" "博士課程指導学生" "ja")
(name-as-in "doctoral-student" "Doktorand" "de")
(name-as-in "doctoral-student" "doctoral student" "en")

(descr-as-in "doctoral-student" "" "zh-hant")
(descr-as-in "doctoral-student" "" "zh-hans")
(descr-as-in "doctoral-student" "" "ru")
(descr-as-in "doctoral-student" "" "pt")
(descr-as-in "doctoral-student" "doctorant(s) supervisé(s) par le sujet" "fr")
(descr-as-in "doctoral-student" "" "es")
(descr-as-in "doctoral-student" "その人物が博士課程を指導した人物" "ja")
(descr-as-in "doctoral-student" "Person, die unter dem Doktorvater eine Promotion anstrebt(e)" "de")
(descr-as-in "doctoral-student" "doctoral student(s) of a professor" "en")

