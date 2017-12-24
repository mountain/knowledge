(ns properties.start_time
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "start-time")

(name-as-in "start-time" "始於" "zh-hk")
(name-as-in "start-time" "data de início" "pt")
(name-as-in "start-time" "start time" "en")
(name-as-in "start-time" "date de début" "fr")
(name-as-in "start-time" "始於" "zh-tw")
(name-as-in "start-time" "Startzeitpunkt" "de")
(name-as-in "start-time" "дата начала" "ru")
(name-as-in "start-time" "fecha de inicio" "es")
(name-as-in "start-time" "開始日" "ja")
(name-as-in "start-time" "始于" "zh-cn")
(name-as-in "start-time" "始于" "zh-sg")

(descr-as-in "start-time" "某項開始存在的時間或聲明開始有效的時間" "zh-hk")
(descr-as-in "start-time" "qualificador que indica o início da validade de uma declaração" "pt")
(descr-as-in "start-time" "indicates the time an item begins to exist or a statement starts being valid" "en")
(descr-as-in "start-time" "qualificateur indiquant la date de début de validité pour une déclaration" "fr")
(descr-as-in "start-time" "某項開始存在的時間或聲明開始有效的時間" "zh-tw")
(descr-as-in "start-time" "Zeitpunkt, an dem eine Aussage wahr wurde oder ein Objekt zu existieren anfing" "de")
(descr-as-in "start-time" "указывает время начала существования элемента или время, с которого утверждение приобретает силу" "ru")
(descr-as-in "start-time" "fecha en que un elemento comienza a existir o una aseveración comienza a ser válida" "es")
(descr-as-in "start-time" "存在を開始したり、有効であると宣言された日付。おもに修飾子として使用される。組織等の設立はP571、機器設備の運用開始はP729を使用" "ja")
(descr-as-in "start-time" "某项开始存在的时间或声明开始有效的时间" "zh-cn")
(descr-as-in "start-time" "某项开始存在的时间或声明开始有效的时间" "zh-sg")

