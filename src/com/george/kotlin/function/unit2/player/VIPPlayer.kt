package com.george.kotlin.function.unit2.player

import javax.swing.JOptionPane

val TITLE = "播放器标题"
val MESSAGE = "播放器消息"

class VIPPlayer(var title: String?, var message: String?) : PlayerView {

    init {
        println("主构造函数")
        title = title ?: TITLE
        message = message ?: MESSAGE
    }

    constructor() : this(TITLE, MESSAGE) {
        println("无参构造方法")
    }

    constructor(message: String?) : this(MESSAGE, message) {
        println("一个参构造方法")
    }

    override fun getPlayButton() {
        println("VIP button")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, title, message, JOptionPane.DEFAULT_OPTION)
    }

}