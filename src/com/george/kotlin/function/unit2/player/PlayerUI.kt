package com.george.kotlin.function.unit2.player

class PlayerUI private constructor() {
    companion object {
        fun get(): PlayerUI {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = PlayerUI()
    }

    fun showPlayer(user: User){
        MediaPlayerView(getPlayerView(user.playerType)).showView()
    }
}
