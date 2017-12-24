(ns clazzes.albert
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Albert")

(name-as-in "Albert" "" "zh-hk")
(name-as-in "Albert" "Albert" "pt")
(name-as-in "Albert" "Albert" "en")
(name-as-in "Albert" "Albert" "fr")
(name-as-in "Albert" "" "zh-tw")
(name-as-in "Albert" "Albert" "de")
(name-as-in "Albert" "Альберт/Альбер" "ru")
(name-as-in "Albert" "Albert" "es")
(name-as-in "Albert" "アルバート" "ja")
(name-as-in "Albert" "" "zh-cn")
(name-as-in "Albert" "" "zh-sg")

(descr-as-in "Albert" "男性人名" "zh-hk")
(descr-as-in "Albert" "prenome masculino" "pt")
(descr-as-in "Albert" "male given name" "en")
(descr-as-in "Albert" "prénom masculin" "fr")
(descr-as-in "Albert" "男性人名" "zh-tw")
(descr-as-in "Albert" "männlicher Vorname" "de")
(descr-as-in "Albert" "мужское личное имя - Albert" "ru")
(descr-as-in "Albert" "nombre masculino" "es")
(descr-as-in "Albert" "男性の名前 (Albert)" "ja")
(descr-as-in "Albert" "男性人名" "zh-cn")
(descr-as-in "Albert" "男性人名" "zh-sg")


(refer-to ["properties.commons_category"])
(fact claim "Albert" "commons-category" "Albert (given name)")

(refer-to ["properties.cologne_phonetics"])
(fact claim "Albert" "cologne-phonetics" "05172")

(refer-to ["properties.writing_system"])
(fact claim "Albert" "writing-system" "Q8229")

(refer-to ["properties.pronunciation_audio"])
(fact claim "Albert" "pronunciation-audio" "Pl-Albert.ogg")
(fact claim "Albert" "pronunciation-audio" "Fr-Albert.ogg")

(refer-to ["properties.family_name_identical_to_this_given_name"])
(fact claim "Albert" "family-name-identical-to-this-given-name" "Q10729205")

(refer-to ["properties.language_of_work_or_name"])
(fact claim "Albert" "language-of-work-or-name" "Q7026")
(fact claim "Albert" "language-of-work-or-name" "Q809")
(fact claim "Albert" "language-of-work-or-name" "Q150")
(refer-to ["clazzes.english"])
(fact claim "Albert" "language-of-work-or-name" "English")
(fact claim "Albert" "language-of-work-or-name" "Q9067")
(fact claim "Albert" "language-of-work-or-name" "Q9035")
(fact claim "Albert" "language-of-work-or-name" "Q9027")

(refer-to ["properties.name_day"])
(fact claim "Albert" "name-day" "Q2529")
(fact claim "Albert" "name-day" "Q2818")

(refer-to ["properties.soundex"])
(fact claim "Albert" "soundex" "A416")

(refer-to ["properties.significant_event"])
(fact claim "Albert" "significant-event" "Q21142040")
(fact claim "Albert" "significant-event" "Q21644845")

(refer-to ["properties.said_to_be_the_same_as"])
(fact claim "Albert" "said-to-be-the-same-as" "Q16799105")
(fact claim "Albert" "said-to-be-the-same-as" "Q2639235")
(fact claim "Albert" "said-to-be-the-same-as" "Q347243")
(fact claim "Albert" "said-to-be-the-same-as" "Q18180401")
(fact claim "Albert" "said-to-be-the-same-as" "Q18190437")
(fact claim "Albert" "said-to-be-the-same-as" "Q19970361")
(fact claim "Albert" "said-to-be-the-same-as" "Q613014")
(fact claim "Albert" "said-to-be-the-same-as" "Q23071230")
(fact claim "Albert" "said-to-be-the-same-as" "Q16320672")
(fact claim "Albert" "said-to-be-the-same-as" "Q4712286")
(fact claim "Albert" "said-to-be-the-same-as" "Q2588339")
(fact claim "Albert" "said-to-be-the-same-as" "Q38040671")
(fact claim "Albert" "said-to-be-the-same-as" "Q38040746")
(fact claim "Albert" "said-to-be-the-same-as" "Q38040796")

(refer-to ["properties.instance_of"])
(fact claim "Albert" "instance-of" "Q12308941")

(refer-to ["properties.dictionary_of_medieval_names_from_european_sources_entry"])
(refer-to ["clazzes.albert"])
(fact claim "Albert" "dictionary-of-medieval-names-from-european-sources-entry" "Albert")

(refer-to ["properties.ipa_transcription"])
(fact claim "Albert" "ipa-transcription" "ˈalbɛrt")
(fact claim "Albert" "ipa-transcription" "ˈælbɚt")
(fact claim "Albert" "ipa-transcription" "al.bɛʁ")

(refer-to ["properties.different_from"])
(fact claim "Albert" "different-from" "Q2637730")

(refer-to ["properties.given_name_version_for_other_gender"])
(fact claim "Albert" "given-name-version-for-other-gender" "Q687536")
(fact claim "Albert" "given-name-version-for-other-gender" "Q2639262")

(refer-to ["properties.caverphone"])
(fact claim "Albert" "caverphone" "APT111")

(refer-to ["properties.native_label"])
(fact claim "Albert" "native-label" "monolingualtext")
