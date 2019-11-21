package com.example.android_music_player.data.main


/**

 * Created by denis on 17/01/2018.

 */
interface MainManager {
    fun callAction(action: EnumMainManager)
    fun getAction(): PublishSubject<EnumMainManager>
}