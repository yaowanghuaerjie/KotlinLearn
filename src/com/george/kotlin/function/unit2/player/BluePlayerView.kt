package com.george.kotlin.function.unit2.player

import javax.swing.JOptionPane

class BluePlayerView : PlayerView {
    override fun getPlayButton() {
        println("按钮为绿色")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, "显示绿色播放器", "绿色播放器", JOptionPane.DEFAULT_OPTION)
    }
}