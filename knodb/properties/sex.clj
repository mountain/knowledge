(ns properties.sex
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "sex")

(name-as-in "sex" "性別" "zh-hant")
(name-as-in "sex" "性别" "zh-hans")
(name-as-in "sex" "пол" "ru")
(name-as-in "sex" "sexo" "pt")
(name-as-in "sex" "sexe" "fr")
(name-as-in "sex" "sexo" "es")
(name-as-in "sex" "性別" "ja")
(name-as-in "sex" "Geschlecht" "de")
(name-as-in "sex" "sex" "en")

(descr-as-in "sex" "應由下面擇一：人: 男性 (Q6581097）、女性（Q6581072）、或雙性人（Q1097630); 动物: 雄性（Q44148）、或雌性（Q43445）" "zh-hant")
(descr-as-in "sex" "应由下面择一：人: 男性(Q6581097）、女性（Q6581072）、或双性人（Q1097630); 动物: 雄性（Q44148）、或雌性（Q43445）" "zh-hans")
(descr-as-in "sex" "должно быть одним из: мужской пол (Q6581097), женский пол (Q6581072) или интерсексуальность (Q1097630)" "ru")
(descr-as-in "sex" "para seres humanos deve-se usar: masculino (Q6581097), feminino (Q6581072) ou transexual/intersexual (Q10970630) ou o valor especial desconhecido" "pt")
(descr-as-in "sex" "distinction de sexe ; doit valoir masculin (Q6581097), féminin (Q6581072) ou intersexe (Q1097630)" "fr")
(descr-as-in "sex" "para humanos: masculino (Q6581097), femenino (Q6581072) o intersexual (Q1097630); para otras especies: macho (Q44148) o hembra (Q43445)" "es")
(descr-as-in "sex" "人間に対しては次の内の一つ: 男性 (Q6581097)、女性 (Q6581072)、半陰陽 (Q1097630); 他の生物に対しては: オス (Q44148) またはメス (Q43445)" "ja")
(descr-as-in "sex" "körperliche Ausstattung der Person. Bitte nur verwenden: männlich (Q6581097), weiblich (Q6581072), Intersexualität (Q1097630) oder den speziellen Wert unbekannt." "de")
(descr-as-in "sex" "for humans, should be one of  male (Q6581097), female (Q6581072), intersex (Q1097630), or the special  unknown value; for animals: male animal (Q44148) or female animal (Q43445)" "en")

