package com.george.kotlin.unit2

import java.io.File

/**
 * 扩展函数：扩展函数的静态解析
 */
fun main(args: Array<String>) {
    var file = File("KotlinLearn.iml")
    println(file.readText())
}
