(ns clazzes.albert_einstein
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Albert Einstein")

(name-as-in "Albert Einstein" "" "zh-hk")
(name-as-in "Albert Einstein" "" "pt")
(name-as-in "Albert Einstein" "Albert Einstein" "en")
(name-as-in "Albert Einstein" "" "fr")
(name-as-in "Albert Einstein" "" "zh-tw")
(name-as-in "Albert Einstein" "" "de")
(name-as-in "Albert Einstein" "" "ru")
(name-as-in "Albert Einstein" "" "es")
(name-as-in "Albert Einstein" "" "ja")
(name-as-in "Albert Einstein" "" "zh-cn")
(name-as-in "Albert Einstein" "" "zh-sg")

(descr-as-in "Albert Einstein" "" "zh-hk")
(descr-as-in "Albert Einstein" "" "pt")
(descr-as-in "Albert Einstein" "Physicist (permanent duplicate item)" "en")
(descr-as-in "Albert Einstein" "" "fr")
(descr-as-in "Albert Einstein" "" "zh-tw")
(descr-as-in "Albert Einstein" "" "de")
(descr-as-in "Albert Einstein" "" "ru")
(descr-as-in "Albert Einstein" "" "es")
(descr-as-in "Albert Einstein" "" "ja")
(descr-as-in "Albert Einstein" "" "zh-cn")
(descr-as-in "Albert Einstein" "" "zh-sg")


(refer-to ["properties.instance_of"])
(fact claim "Albert Einstein" "instance-of" "Q21286738")

(refer-to ["properties.permanent_duplicated_item"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Albert Einstein" "permanent-duplicated-item" "Albert Einstein")
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " "University of Zurich")
(refer-to ["clazzes.karl_ferdinands_universität"])
(fact claim "Albert Einstein" "employer" "Karl-Ferdinands-Universität")
(refer-to ["clazzes.eth_zurich"])
(fact claim "Albert Einstein" "employer" "ETH Zurich")
(refer-to ["clazzes.manchester_cover_ang"])
(fact claim "Albert Einstein" "employer" "Manchester cover ang")
(refer-to ["clazzes.princeton_university"])
(fact claim "Albert Einstein" "employer" "Princeton University")
(refer-to ["clazzes.leiden_university"])
(fact claim "Albert Einstein" "employer" "Leiden University")
(refer-to ["clazzes.university_of_bern"])
(fact claim "Albert Einstein" "employer" "University of Bern")
(refer-to ["clazzes.deutsche_physikalische_gesellschaft"])
(fact claim "Albert Einstein" "employer" "Deutsche Physikalische Gesellschaft")
(refer-to ["clazzes.humboldt_university_of_berlin"])
(fact claim "Albert Einstein" "employer" "Humboldt University of Berlin")
(refer-to ["clazzes.prussian_academy_of_sciences"])
(fact claim "Albert Einstein" "employer" "Prussian Academy of Sciences")

(refer-to ["properties.sex_or_gender"])
(refer-to ["clazzes.male"])
(fact claim "Albert Einstein" "sex-or-gender" "male")

(refer-to ["properties.gtaa_id"])
(fact claim "Albert Einstein" "gtaa-id" "96461")

(refer-to ["properties.share_catalogue_author_id"])
(fact claim "Albert Einstein" "share-catalogue-author-id" "690")

(refer-to ["properties.topics_main_category"])
(refer-to ["clazzes.category_albert_einstein"])
(fact claim "Albert Einstein" "topic's-main-category" "Category:Albert Einstein")

(refer-to ["properties.encyclopædia_universalis_online_id"])
(fact claim "Albert Einstein" "encyclopædia-universalis-online-id" "albert-einstein")

(refer-to ["properties.father"])
(refer-to ["clazzes.hermann_einstein"])
(fact claim "Albert Einstein" "father" "Hermann Einstein")

(refer-to ["properties.pronunciation_audio"])
(fact claim "Albert Einstein" "pronunciation-audio" "De-Albert Einstein-Pronuciation.ogg")

(refer-to ["properties.isfdb_author_id"])
(fact claim "Albert Einstein" "isfdb-author-id" "99141")

(refer-to ["properties.permanent_duplicated_item"])
(fact claim "Albert Einstein" "permanent-duplicated-item" "Q21200226")
(fact claim "Albert Einstein" "permanent-duplicated-item" "Q25696257")
(refer-to ["clazzes.albert_einstein"])
(fact claim "Albert Einstein" "permanent-duplicated-item" "Albert Einstein")

(refer-to ["properties.familypedia_person_id"])
(fact claim "Albert Einstein" "familypedia-person-id" "Albert_Einstein_(1879-1955)")

(refer-to ["properties.bridgeman_artist_id"])
(fact claim "Albert Einstein" "bridgeman-artist-id" "41865")

(refer-to ["properties.les_archives_du_spectacle_id"])
(fact claim "Albert Einstein" "les-archives-du-spectacle-id" "145134")

(refer-to ["properties.familysearch_person_id"])
(fact claim "Albert Einstein" "familysearch-person-id" "LZNC-TDG")

(refer-to ["properties.nkcr_aut_id"])
(fact claim "Albert Einstein" "nkcr-aut-id" "jn19990002019")

(refer-to ["properties.inpho_id"])
(fact claim "Albert Einstein" "inpho-id" "thinker/2958")

(refer-to ["properties.zbmath_author_id"])
(fact claim "Albert Einstein" "zbmath-author-id" "einstein.albert")

(refer-to ["properties.student"])
(refer-to ["clazzes.ernst_g__straus"])
(fact claim "Albert Einstein" "student" "Ernst G. Straus")

(refer-to ["properties.nsk_id"])
(fact claim "Albert Einstein" "nsk-id" "000012537")

(refer-to ["properties.native_language"])
(refer-to ["clazzes.german"])
(fact claim "Albert Einstein" "native-language" "German")

(refer-to ["properties.filmportal_id"])
(fact claim "Albert Einstein" "filmportal-id" "4533e35f16964c939b82033bb6259e32")

(refer-to ["properties.discogs_artist_id"])
(fact claim "Albert Einstein" "discogs-artist-id" "430935")

(refer-to ["properties.languages_spoken_written_or_signed"])
(refer-to ["clazzes.english"])
(fact claim "Albert Einstein" "languages-spoken-written-or-signed" "English")
(refer-to ["clazzes.german"])
(fact claim "Albert Einstein" "languages-spoken-written-or-signed" "German")

(refer-to ["properties.erdős_number"])
(fact claim "Albert Einstein" "erdős-number" "quantity")

(refer-to ["properties.inspire_hep_author_id"])
(fact claim "Albert Einstein" "inspire-hep-author-id" "A.Einstein.1")

(refer-to ["properties.sudoc_authorities"])
(fact claim "Albert Einstein" "sudoc-authorities" "026849186")

(refer-to ["properties.hds_id"])
(fact claim "Albert Einstein" "hds-id" "28814")

(refer-to ["properties.described_at_url"])
(fact claim "Albert Einstein" "described-at-url" "http://www.einsteinsommerhaus.de/index.php?id=539&no_cache=1")
(fact claim "Albert Einstein" "described-at-url" "https://www.ige.ch/de/ueber-uns/einstein.html")

(refer-to ["properties.ncl_id"])
(fact claim "Albert Einstein" "ncl-id" "369710")

(refer-to ["properties.librivox_author_id"])
(fact claim "Albert Einstein" "librivox-author-id" "1035")

(refer-to ["properties.researcherid"])
(fact claim "Albert Einstein" "researcherid" "I-6013-2012")

(refer-to ["properties.bnf_id"])
(fact claim "Albert Einstein" "bnf-id" "119016075")

(refer-to ["properties.doctoral_advisor"])
(refer-to ["clazzes.alfred_kleiner"])
(fact claim "Albert Einstein" "doctoral-advisor" "Alfred Kleiner")
(refer-to ["clazzes.heinrich_burkhardt"])
(fact claim "Albert Einstein" "doctoral-advisor" "Heinrich Burkhardt")

(refer-to ["properties.signature"])
(fact claim "Albert Einstein" "signature" "Albert Einstein signature 1934.svg")

(refer-to ["properties.member_of"])
(refer-to ["clazzes.royal_society"])
(fact claim "Albert Einstein" "member-of" "Royal Society")
(refer-to ["clazzes.prussian_academy_of_sciences"])
(fact claim "Albert Einstein" "member-of" "Prussian Academy of Sciences")
(refer-to ["clazzes.german_academy_of_sciences_leopoldina"])
(fact claim "Albert Einstein" "member-of" "German Academy of Sciences Leopoldina")
(refer-to ["clazzes.lincean_academy"])
(fact claim "Albert Einstein" "member-of" "Lincean Academy")
(refer-to ["clazzes.american_philosophical_society"])
(fact claim "Albert Einstein" "member-of" "American Philosophical Society")
(refer-to ["clazzes.bavarian_academy_of_sciences_and_humanities"])
(fact claim "Albert Einstein" "member-of" "Bavarian Academy of Sciences and Humanities")
(refer-to ["clazzes.göttingen_academy_of_sciences"])
(fact claim "Albert Einstein" "member-of" "Göttingen Academy of Sciences")
(refer-to ["clazzes.academy_of_sciences_of_the_ussr"])
(fact claim "Albert Einstein" "member-of" "Academy of Sciences of the USSR")
(refer-to ["clazzes.french_academy_of_sciences"])
(fact claim "Albert Einstein" "member-of" "French Academy of Sciences")
(refer-to ["clazzes.royal_swedish_academy_of_sciences"])
(fact claim "Albert Einstein" "member-of" "Royal Swedish Academy of Sciences")
(refer-to ["clazzes.royal_netherlands_academy_of_arts_and_sciences"])
(fact claim "Albert Einstein" "member-of" "Royal Netherlands Academy of Arts and Sciences")
(refer-to ["clazzes.american_academy_of_arts_and_sciences"])
(fact claim "Albert Einstein" "member-of" "American Academy of Arts and Sciences")
(refer-to ["clazzes.russian_academy_of_sciences"])
(fact claim "Albert Einstein" "member-of" "Russian Academy of Sciences")
(refer-to ["clazzes.indian_national_science_academy"])
(fact claim "Albert Einstein" "member-of" "Indian National Science Academy")
(refer-to ["clazzes.accademia_nazionale_delle_scienze_detta_dei_xl"])
(fact claim "Albert Einstein" "member-of" "Accademia Nazionale delle Scienze detta dei XL")

(refer-to ["properties.catalog"])
(refer-to ["clazzes.wikipedia_list_of_1000_articles_each_wikipedia_should_have"])
(fact claim "Albert Einstein" "catalog" "Wikipedia:List of 1000 articles each Wikipedia should have")

(refer-to ["properties.cultureel_woordenboek_identifier"])
(fact claim "Albert Einstein" "cultureel-woordenboek-identifier" "natuurkunde-scheikunde-en-sterrenkunde/albert-einstein")

(refer-to ["properties.national_library_of_israel_id"])
(fact claim "Albert Einstein" "national-library-of-israel-id" "000042773")

(refer-to ["properties.freebase_id"])
(fact claim "Albert Einstein" "freebase-id" "/m/0jcx")

(refer-to ["properties.child"])
(refer-to ["clazzes.hans_albert_einstein"])
(fact claim "Albert Einstein" "child" "Hans Albert Einstein")
(refer-to ["clazzes.eduard_einstein"])
(fact claim "Albert Einstein" "child" "Eduard Einstein")
(refer-to ["clazzes.lieserl_einstein"])
(fact claim "Albert Einstein" "child" "Lieserl Einstein")

(refer-to ["properties.snac_ark_id"])
(fact claim "Albert Einstein" "snac-ark-id" "w69k499r")

(refer-to ["properties.fast_id"])
(fact claim "Albert Einstein" "fast-id" "32023")

(refer-to ["properties.biblionet_author_id"])
(fact claim "Albert Einstein" "biblionet-author-id" "157")

(refer-to ["properties.nobel_prize_people_nomination_id"])
(fact claim "Albert Einstein" "nobel-prize-people-nomination-id" "2728")

(refer-to ["properties.occupation"])
(refer-to ["clazzes.theoretical_physicist"])
(fact claim "Albert Einstein" "occupation" "theoretical physicist")
(refer-to ["clazzes.philosopher_of_science"])
(fact claim "Albert Einstein" "occupation" "philosopher of science")
(refer-to ["clazzes.inventor"])
(fact claim "Albert Einstein" "occupation" "inventor")
(refer-to ["clazzes.science_writer"])
(fact claim "Albert Einstein" "occupation" "science writer")
(refer-to ["clazzes.educationalist"])
(fact claim "Albert Einstein" "occupation" "educationalist")
(refer-to ["clazzes.university_teacher"])
(fact claim "Albert Einstein" "occupation" "university teacher")
(refer-to ["clazzes.professor"])
(fact claim "Albert Einstein" "occupation" "professor")
(refer-to ["clazzes.physicist"])
(fact claim "Albert Einstein" "occupation" "physicist")
(refer-to ["clazzes.non_fiction_writer"])
(fact claim "Albert Einstein" "occupation" "non-fiction writer")

(refer-to ["properties.nla_australia_id"])
(fact claim "Albert Einstein" "nla-australia-id" "36582360")

(refer-to ["properties.knaw_past_member_id"])
(fact claim "Albert Einstein" "knaw-past-member-id" "PE00000116")

(refer-to ["properties.spouse"])
(refer-to ["clazzes.elsa_einstein"])
(fact claim "Albert Einstein" "spouse" "Elsa Einstein")
(refer-to ["clazzes.mileva_marić"])
(fact claim "Albert Einstein" "spouse" "Mileva Marić")

(refer-to ["properties.project_gutenberg_author_id"])
(fact claim "Albert Einstein" "project-gutenberg-author-id" "1630")

(refer-to ["properties.residence"])
(refer-to ["clazzes.einsteinhaus_caputh"])
(fact claim "Albert Einstein" "residence" "Einsteinhaus Caputh")
(refer-to ["clazzes.einsteinhaus"])
(fact claim "Albert Einstein" "residence" "Einsteinhaus")

(refer-to ["properties.uk_national_archives_id"])
(fact claim "Albert Einstein" "uk-national-archives-id" "F51776")

(refer-to ["properties.wikitree_person_id"])
(fact claim "Albert Einstein" "wikitree-person-id" "Einstein-1")

(refer-to ["properties.nobel_prize_id"])
(fact claim "Albert Einstein" "nobel-prize-id" "physics/laureates/1921/einstein")

(refer-to ["properties.atomic_heritage_foundation_id"])
(fact claim "Albert Einstein" "atomic-heritage-foundation-id" "albert-einstein")

(refer-to ["properties.country_of_citizenship"])
(refer-to ["clazzes.kingdom_of_württemberg"])
(fact claim "Albert Einstein" "country-of-citizenship" "Kingdom of Württemberg")
(refer-to ["clazzes.statelessness"])
(fact claim "Albert Einstein" "country-of-citizenship" "statelessness")
(refer-to ["clazzes.switzerland"])
(fact claim "Albert Einstein" "country-of-citizenship" "Switzerland")
(refer-to ["clazzes.free_state_of_prussia"])
(fact claim "Albert Einstein" "country-of-citizenship" "Free State of Prussia")
(refer-to ["clazzes.united_states_of_america"])
(fact claim "Albert Einstein" "country-of-citizenship" "United States of America")
(refer-to ["clazzes.austria_hungary"])
(fact claim "Albert Einstein" "country-of-citizenship" "Austria-Hungary")
(refer-to ["clazzes.kingdom_of_prussia"])
(fact claim "Albert Einstein" "country-of-citizenship" "Kingdom of Prussia")
(refer-to ["clazzes.weimar_republic"])
(fact claim "Albert Einstein" "country-of-citizenship" "Weimar Republic")

(refer-to ["properties.gran_enciclopèdia_catalana_id"])
(fact claim "Albert Einstein" "gran-enciclopèdia-catalana-id" "0023623")

(refer-to ["properties.significant_event"])
(refer-to ["clazzes.nazi_book_burnings"])
(fact claim "Albert Einstein" "significant-event" "Nazi book burnings")

(refer-to ["properties.isni"])
(fact claim "Albert Einstein" "isni" "0000 0000 7704 0933")
(fact claim "Albert Einstein" "isni" "0000 0001 2281 955X")

(refer-to ["properties.egaxa_id"])
(fact claim "Albert Einstein" "egaxa-id" "000837931")

(refer-to ["properties.official_website"])
(fact claim "Albert Einstein" "official-website" "http://einstein.biz/")

(refer-to ["properties.ndl_auth_id"])
(fact claim "Albert Einstein" "ndl-auth-id" "00438728")

(refer-to ["properties.sibling"])
(refer-to ["clazzes.maja_einstein"])
(fact claim "Albert Einstein" "sibling" "Maja Einstein")

(refer-to ["properties.gnd_id"])
(fact claim "Albert Einstein" "gnd-id" "118529579")

(refer-to ["properties.port_person_id"])
(fact claim "Albert Einstein" "port-person-id" "184328")

(refer-to ["properties.online_books_page_author_id"])
(fact claim "Albert Einstein" "online-books-page-author-id" "Einstein, Albert, 1879-1955")

(refer-to ["properties.national_portrait_gallery_london_person_id"])
(fact claim "Albert Einstein" "national-portrait-gallery-london-person-id" "mp73025")

(refer-to ["properties.described_by_source"])
(refer-to ["clazzes.larousse_encyclopedia_online"])
(fact claim "Albert Einstein" "described-by-source" "Larousse Encyclopedia online")
(refer-to ["clazzes.biblioteca_europea_di_informazione_e_cultura"])
(fact claim "Albert Einstein" "described-by-source" "Biblioteca Europea di Informazione e Cultura")
(refer-to ["clazzes.great_soviet_encyclopedia_1969–1978"])
(fact claim "Albert Einstein" "described-by-source" "Great Soviet Encyclopedia (1969–1978)")

(refer-to ["properties.national_thesaurus_for_author_names_id"])
(fact claim "Albert Einstein" "national-thesaurus-for-author-names-id" "068350767")

(refer-to ["properties.educated_at"])
(refer-to ["clazzes.eth_zurich"])
(fact claim "Albert Einstein" "educated-at" "ETH Zurich")
(refer-to ["clazzes.luitpold_gymnasium"])
(fact claim "Albert Einstein" "educated-at" "Luitpold-Gymnasium")
(refer-to ["clazzes.alte_kantonsschule_aarau"])
(fact claim "Albert Einstein" "educated-at" "Alte Kantonsschule Aarau")
(refer-to ["clazzes.university_of_zurich"])
(fact claim "Albert Einstein" "educated-at" "University of Zurich")

(refer-to ["properties.genealogics_org_person_id"])
(fact claim "Albert Einstein" "genealogics_org-person-id" "I00482340")

(refer-to ["properties.open_library_id"])
(fact claim "Albert Einstein" "open-library-id" "OL3175986A")

(refer-to ["properties.musicbrainz_artist_id"])
(fact claim "Albert Einstein" "musicbrainz-artist-id" "c98c325e-7277-46e8-8b44-e3517f3e041a")

(refer-to ["properties.munzinger_iba"])
(fact claim "Albert Einstein" "munzinger-iba" "00000000666")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.human"])
(fact claim "Albert Einstein" "instance-of" "human")

(refer-to ["properties.nukat_warsawu_authorities"])
(fact claim "Albert Einstein" "nukat-warsawu-authorities" "n95300836")

(refer-to ["properties.cause_of_death"])
(refer-to ["clazzes.abdominal_aortic_aneurysm"])
(fact claim "Albert Einstein" "cause-of-death" "abdominal aortic aneurysm")

(refer-to ["properties.jewage_person_id"])
(fact claim "Albert Einstein" "jewage-person-id" "P0520433729")

(refer-to ["properties.dmoz_id"])
(fact claim "Albert Einstein" "dmoz-id" "Science/Physics/History/People/Einstein,_Albert/")
(fact claim "Albert Einstein" "dmoz-id" "World/Français/Sciences/Physique/Histoire/Personnages_historiques/Einstein,_Albert/")
(fact claim "Albert Einstein" "dmoz-id" "World/Deutsch/Wissenschaft/Naturwissenschaften/Physik/Personen/Einstein,_Albert/")
(fact claim "Albert Einstein" "dmoz-id" "World/Español/Ciencia_y_tecnología/Física/Historia/Biografías/Einstein,_Albert/")

(refer-to ["properties.family_name"])
(refer-to ["clazzes.einstein"])
(fact claim "Albert Einstein" "family-name" "Einstein")

(refer-to ["properties.work_location"])
(refer-to ["clazzes.bern"])
(fact claim "Albert Einstein" "work-location" "Bern")
(refer-to ["clazzes.prague"])
(fact claim "Albert Einstein" "work-location" "Prague")
(refer-to ["clazzes.zurich"])
(fact claim "Albert Einstein" "work-location" "Zurich")
(refer-to ["clazzes.berlin"])
(fact claim "Albert Einstein" "work-location" "Berlin")
(refer-to ["clazzes.caputh"])
(fact claim "Albert Einstein" "work-location" "Caputh")
(refer-to ["clazzes.princeton"])
(fact claim "Albert Einstein" "work-location" "Princeton")

(refer-to ["properties.bne_id"])
(fact claim "Albert Einstein" "bne-id" "XX834035")

(refer-to ["properties.given_name"])
(refer-to ["clazzes.albert"])
(fact claim "Albert Einstein" "given-name" "Albert")

(refer-to ["properties.mother"])
(refer-to ["clazzes.pauline_koch"])
(fact claim "Albert Einstein" "mother" "Pauline Koch")

(refer-to ["properties.commons_creator_page"])
(refer-to ["clazzes.albert_einstein"])
(fact claim "Albert Einstein" "commons-creator-page" "Albert Einstein")

(refer-to ["properties.selibr"])
(fact claim "Albert Einstein" "selibr" "184709")

(refer-to ["properties.ne_se_id"])
(fact claim "Albert Einstein" "ne_se-id" "albert-einstein")

(refer-to ["properties.academic_tree_id"])
(fact claim "Albert Einstein" "academic-tree-id" "3611")

(refer-to ["properties.place_of_origin_switzerland"])
(refer-to ["clazzes.zurich"])
(fact claim "Albert Einstein" "place-of-origin-switzerland" "Zurich")

(refer-to ["properties.image"])
(fact claim "Albert Einstein" "image" "Albert Einstein Head.jpg")

(refer-to ["properties.nyt_topic_id"])
(fact claim "Albert Einstein" "nyt-topic-id" "person/albert-einstein")

(refer-to ["properties.dialnet_author_id"])
(fact claim "Albert Einstein" "dialnet-author-id" "278727")

(refer-to ["properties.imdb_id"])
(fact claim "Albert Einstein" "imdb-id" "nm0251868")

(refer-to ["properties.notable_work"])
(refer-to ["clazzes.special_relativity"])
(fact claim "Albert Einstein" "notable-work" "special relativity")
(refer-to ["clazzes.general_relativity"])
(fact claim "Albert Einstein" "notable-work" "general relativity")
(refer-to ["clazzes.brownian_motion"])
(fact claim "Albert Einstein" "notable-work" "Brownian motion")
(refer-to ["clazzes.photoelectric_effect"])
(fact claim "Albert Einstein" "notable-work" "photoelectric effect")

(refer-to ["properties.encyclopedia_of_australian_science_id"])
(fact claim "Albert Einstein" "encyclopedia-of-australian-science-id" "P000386b")

(refer-to ["properties.place_of_interment"])
(refer-to ["clazzes.national_museum_of_health_and_medicine"])
(fact claim "Albert Einstein" "place-of-interment" "National Museum of Health and Medicine")

(refer-to ["properties.cths_person_id"])
(fact claim "Albert Einstein" "cths-person-id" "117243")

(refer-to ["properties.conor_id"])
(fact claim "Albert Einstein" "conor-id" "7912035")

(refer-to ["properties.name_in_native_language"])
(fact claim "Albert Einstein" "name-in-native-language" "monolingualtext")

(refer-to ["properties.google_scholar_author_id"])
(fact claim "Albert Einstein" "google-scholar-author-id" "qc6CJjYAAAAJ")

(refer-to ["properties.bibsys_id"])
(fact claim "Albert Einstein" "bibsys-id" "90053072")

(refer-to ["properties.date_of_birth"])
(fact claim "Albert Einstein" "date-of-birth" "+1879-03-14T00:00:00Z")

(refer-to ["properties.ptbnp_id"])
(fact claim "Albert Einstein" "ptbnp-id" "26339")

(refer-to ["properties.lnb_id"])
(fact claim "Albert Einstein" "lnb-id" "000027126")

(refer-to ["properties.nndb_people_id"])
(fact claim "Albert Einstein" "nndb-people-id" "302/000022236")

(refer-to ["properties.ra_collections_id"])
(fact claim "Albert Einstein" "ra-collections-id" "22021")

(refer-to ["properties.commemorative_plaque_image"])
(fact claim "Albert Einstein" "commemorative-plaque-image" "Einstein deska.jpg")
(fact claim "Albert Einstein" "commemorative-plaque-image" "8839 - Milano - Via Bigli - Palazzo Olivazzi - Lapide Albert Einstein - Foto Giovanni Dall'Orto - 14-Apr-2007.jpg")
(fact claim "Albert Einstein" "commemorative-plaque-image" "Home Albert Einstein 1895 Memorial.jpg")
(fact claim "Albert Einstein" "commemorative-plaque-image" "Einstein-barrakka.JPG")
(fact claim "Albert Einstein" "commemorative-plaque-image" "Albert Einstein - Andräschule Salzburg.PNG")
(fact claim "Albert Einstein" "commemorative-plaque-image" "05w Denkmal Albert Einstein.jpg")
(fact claim "Albert Einstein" "commemorative-plaque-image" "Einstein Plaque.jpg")

(refer-to ["properties.nominated_for"])
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")
(refer-to ["clazzes.nobel_prize_in_physics"])
(fact claim "Albert Einstein" "nominated-for" "Nobel Prize in Physics")

(refer-to ["properties.leopoldina_member_id"])
(fact claim "Albert Einstein" "leopoldina-member-id" "3232")

(refer-to ["properties.ulan_id"])
(fact claim "Albert Einstein" "ulan-id" "500240971")

(refer-to ["properties.archives_at"])
(refer-to ["clazzes.swiss_literary_archives"])
(fact claim "Albert Einstein" "archives-at" "Swiss Literary Archives")

(refer-to ["properties.national_library_of_greece_id"])
(fact claim "Albert Einstein" "national-library-of-greece-id" "76370")

(refer-to ["properties.werelate_person_id"])
(fact claim "Albert Einstein" "werelate-person-id" "Albert_Einstein_(1)")

(refer-to ["properties.library_of_congress_authority_id"])
(fact claim "Albert Einstein" "library-of-congress-authority-id" "n79022889")

(refer-to ["properties.quora_topic_id"])
(fact claim "Albert Einstein" "quora-topic-id" "Albert-Einstein-physicist")

(refer-to ["properties.dbnl_author_id"])
(fact claim "Albert Einstein" "dbnl-author-id" "eins001")

(refer-to ["properties.openmlol_author_id"])
(fact claim "Albert Einstein" "openmlol-author-id" "22128")

(refer-to ["properties.british_museum_person_institution"])
(fact claim "Albert Einstein" "british-museum-person-institution" "9689")
