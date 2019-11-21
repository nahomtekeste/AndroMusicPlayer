package com.example.android_music_player.data

import com.example.android_music_player.data.playlist.PlaylistManager
import com.example.android_music_player.data.media.MediaManager

/**

 * Created by denis on 01/01/2018.

 */

interface DataManager : MediaManager,
    PlaylistManager {
}