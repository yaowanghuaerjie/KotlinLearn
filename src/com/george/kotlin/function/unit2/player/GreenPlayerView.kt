package com.george.kotlin.function.unit2.player

import javax.swing.JOptionPane

class GreenPlayerView : PlayerView {
    override fun getPlayButton() {
        println("按钮替换为蓝色button")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, "显示蓝色播放器", "蓝色播放器", JOptionPane.DEFAULT_OPTION)
    }
}