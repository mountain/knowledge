(ns properties.musicbrainz-artist-id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "musicbrainz-artist-id")

(name-as-in "musicbrainz-artist-id" "MusicBrainz音樂家ID" "zh-hant")
(name-as-in "musicbrainz-artist-id" "MusicBrainz音乐家ID" "zh-hans")
(name-as-in "musicbrainz-artist-id" "идентификатор MusicBrainz для исполнителя" "ru")
(name-as-in "musicbrainz-artist-id" "identificador MusicBrainz de artista" "pt")
(name-as-in "musicbrainz-artist-id" "identifiant MusicBrainz de l'artiste" "fr")
(name-as-in "musicbrainz-artist-id" "identificador de artista MusicBrainz" "es")
(name-as-in "musicbrainz-artist-id" "MusicBrainzアーティストID" "ja")
(name-as-in "musicbrainz-artist-id" "MusicBrainz-Künstler-ID" "de")
(name-as-in "musicbrainz-artist-id" "MusicBrainz artist ID" "en")

(descr-as-in "musicbrainz-artist-id" "" "zh-hant")
(descr-as-in "musicbrainz-artist-id" "" "zh-hans")
(descr-as-in "musicbrainz-artist-id" "" "ru")
(descr-as-in "musicbrainz-artist-id" "" "pt")
(descr-as-in "musicbrainz-artist-id" "identifiant de l'artiste dans l'encyclopédie musicale MusicBrainz" "fr")
(descr-as-in "musicbrainz-artist-id" "" "es")
(descr-as-in "musicbrainz-artist-id" "MusicBrainzオープン音楽百科事典のアーティストID" "ja")
(descr-as-in "musicbrainz-artist-id" "ID des Künstlers in MusicBrainz" "de")
(descr-as-in "musicbrainz-artist-id" "artist identifier per the MusicBrainz open music encyclopedia" "en")

