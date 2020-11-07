package com.george.kotlin.function.unit2.player

sealed class PlayerViewType {
    object GREEN : PlayerViewType()
    object BLUE : PlayerViewType()
    class VIP(val title: String? = null, val message: String? = null) : PlayerViewType()
}

fun getPlayerView(type: PlayerViewType) = when (type) {
    PlayerViewType.GREEN -> GreenPlayerView()
    PlayerViewType.BLUE -> BluePlayerView()
    is PlayerViewType.VIP -> VIPPlayer(type.title, type.message)
}