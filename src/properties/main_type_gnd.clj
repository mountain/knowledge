(ns properties.main_type_gnd
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "main-type-gnd")

(name-as-in "main-type-gnd" "主類別（GND）" "zh-hant")
(name-as-in "main-type-gnd" "主类型（GND）" "zh-hans")
(name-as-in "main-type-gnd" "GND-тип" "ru")
(name-as-in "main-type-gnd" "tipo de item (GND)" "pt")
(name-as-in "main-type-gnd" "type principal (GND)" "fr")
(name-as-in "main-type-gnd" "tipo principal (GND)" "es")
(name-as-in "main-type-gnd" "主要分類 (GND)" "ja")
(name-as-in "main-type-gnd" "Haupttyp (GND)" "de")
(name-as-in "main-type-gnd" "main type (GND)" "en")

(descr-as-in "main-type-gnd" "項目的主類型：人物Q215627、組織Q43229、事件Q1656682、創作Q386724、術語Q1969448、地理特征Q618123或者消歧義頁Q11651459（請參見Wikidata:Infoboxes task force)" "zh-hant")
(descr-as-in "main-type-gnd" "项目的主类型：人物Q215627、组织Q43229、事件Q1656682、创作Q386724、术语Q1969448、地理特征Q618123或者消歧义页Q11651459（请参见Wikidata:Infoboxes task force)" "zh-hans")
(descr-as-in "main-type-gnd" "один из 7 основных типов Q36578: личность, организация, событие, произведение, концепция (термин), место (географический объект) или страница значений" "ru")
(descr-as-in "main-type-gnd" "um dos seis principais tipos de item: pessoa, organização, evento, obra, termo e objeto geográfico" "pt")
(descr-as-in "main-type-gnd" "type principal : personne (Q215627), organisation (Q43229), évènement (Q1656682), œuvre (Q386724), terme (Q1969448), lieu (Q618123)" "fr")
(descr-as-in "main-type-gnd" "tipos principales de elementos: persona (Q215627), organización (Q43229), evento (Q1656682), obra (Q386724), término (Q1969448), lugar (Q618123 accidente geográfico)" "es")
(descr-as-in "main-type-gnd" "項目についての主要な型：人、組織、出来事、作品、用語、場所（地理的事物）、または曖昧さ回避ページ（使い方については Wikidata:Infoboxes task force を参照）" "ja")
(descr-as-in "main-type-gnd" "Art des Objekts: Person (individualisiert), Name (nicht individualisiert), Körperschaft (Organisation), Veranstaltung (Ereignis), Werk, Sachbegriff oder Geografikum" "de")
(descr-as-in "main-type-gnd" "main type of item: person (Q215627), organization (Q43229), event (Q1656682), creative work (Q386724), term (Q1969448), place (Q618123, geographical feature)" "en")

