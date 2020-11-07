package com.george.kotlin.function.unit2.player

interface PlayerView{
    fun getPlayButton()

    fun showView()
}

class MediaPlayerView(playerView: PlayerView):PlayerView by playerView