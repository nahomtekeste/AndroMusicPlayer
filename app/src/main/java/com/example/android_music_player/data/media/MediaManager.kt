package com.example.android_music_player.data.media

import com.example.android_music_player.data.media.model.Album
import com.example.android_music_player.data.media.model.Artist
import com.example.android_music_player.data.media.model.Genre
import com.example.android_music_player.data.media.model.Track

/**
 * Created by denis on 01/01/2018.
 */
interface MediaManager {
    fun scanTracks(): ArrayList<Track>

    fun scanAlbums(): ArrayList<Album>
    fun scanAlbumTracks(albumID: Long): ArrayList<Track>
    fun getAlbumImagePath(albumID: Long): String?

    fun scanArtists(): ArrayList<Artist>
    fun scanArtistTracks(artistID: Long): ArrayList<Track>

    fun scanGenres(): ArrayList<Genre>
    fun scanGenreTracks(genreID: Long): ArrayList<Track>
}