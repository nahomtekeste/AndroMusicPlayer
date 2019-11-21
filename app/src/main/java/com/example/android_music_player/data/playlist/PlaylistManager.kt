package com.example.android_music_player.data.playlist

import com.example.android_music_player.data.media.model.Track
import com.example.android_music_player.data.playlist.model.Playlist

/**

 * Created by denis on 03/01/2018.

 */
interface PlaylistManager {
    fun scanPlaylist(): ArrayList<Playlist>
    fun createPlaylist(name: String)
    fun deletePlaylist(id: Long)
    fun addTracksToPlaylist(id: Long, tracks: ArrayList<Track>)
    fun deletePlaylistTrack(playlistId: Long, trackId: Long)
    fun playlistItemReorder(playlistId: Long, oldPos: Int, newPos: Int)
    fun getPlaylistTracks(id: Long): ArrayList<Track>
}

