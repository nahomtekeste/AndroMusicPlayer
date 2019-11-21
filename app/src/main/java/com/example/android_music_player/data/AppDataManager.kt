package com.example.android_music_player.data

import com.example.android_music_player.data.media.MediaManager
import com.example.android_music_player.data.media.model.Album
import com.example.android_music_player.data.media.model.Artist
import com.example.android_music_player.data.media.model.Genre
import com.example.android_music_player.data.media.model.Track
import com.example.android_music_player.data.playlist.PlaylistManager
import com.example.android_music_player.data.playlist.model.Playlist
import org.openjdk.tools.javac.util.Context
import javax.inject.Inject
import javax.inject.Singleton

/**

 * Created by denis on 01/01/2018.

 */

@Singleton
class AppDataManager
@Inject constructor( val context: Context,
                    private val mediaManager: MediaManager,
                    private val playlistManager: PlaylistManager
)
    : DataManager {

    // Media

     override fun scanAlbums(): ArrayList<Album> =
        mediaManager.scanAlbums()

    override fun scanTracks(): ArrayList<Track> =
        mediaManager.scanTracks()

     override fun scanArtists(): ArrayList<Artist> =
        mediaManager.scanArtists()

     override fun scanGenres(): ArrayList<Genre> =
        mediaManager.scanGenres()
     override fun scanAlbumTracks(albumID: Long): ArrayList<Track> =
        mediaManager.scanAlbumTracks(albumID)
     override fun scanArtistTracks(artistID: Long): ArrayList<Track> =
        mediaManager.scanArtistTracks(artistID)

     override fun scanGenreTracks(genreID: Long): ArrayList<Track> =
        mediaManager.scanGenreTracks(genreID)
     override fun getAlbumImagePath(albumID: Long): String? =
        mediaManager.getAlbumImagePath(albumID)
    // Playlist
    override fun scanPlaylist(): ArrayList<Playlist> =
        playlistManager.scanPlaylist()
     override fun createPlaylist(name: String) =
        playlistManager.createPlaylist(name)
     override fun deletePlaylist(id: Long) =
        playlistManager.deletePlaylist(id)
     override fun addTracksToPlaylist(id: Long, tracks: ArrayList<Track>) =
        playlistManager.addTracksToPlaylist(id, tracks)
     override fun getPlaylistTracks(id: Long): ArrayList<Track> =
        playlistManager.getPlaylistTracks(id)

     override fun deletePlaylistTrack(playlistId: Long, trackId: Long) =
        playlistManager.deletePlaylistTrack(playlistId, trackId)
     override fun playlistItemReorder(playlistId: Long, oldPos: Int, newPos: Int) =
        playlistManager.playlistItemReorder(playlistId, oldPos, newPos)
}