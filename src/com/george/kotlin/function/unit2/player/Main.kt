package com.george.kotlin.function.unit2.player

/**
 * 用户需求：音乐播放器，有系统内置的两种颜色的皮肤，
 * 每个用户都可以选择自己的播放器皮肤颜色，当不同的
 * 用户登录以后，显示不同的播放器皮肤，同时需要注意皮肤颜色的可扩展性
 */
fun main(args: Array<String>) {
    val user = User(1,"name",PlayerViewType.VIP())

    PlayerUI.get().showPlayer(user)
}