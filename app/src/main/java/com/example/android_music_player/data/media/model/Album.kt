package com.example.android_music_player.data.media.model

data class Album(val id: Long,
                 val album: String,
                 val artist: String,
                 val art: String?) {
    override fun equals(other: Any?): Boolean {
        return id == (other as Album).id
    }
}

