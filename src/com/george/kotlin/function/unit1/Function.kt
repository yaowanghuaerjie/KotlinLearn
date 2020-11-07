package com.george.kotlin.function.unit1

/**
 * Kotlin 函数
 */

fun function1() {
    var str = "hello"
    //函数嵌套,用途：在某些条件下触发递归的函数不希望被外部函数访问到的函数
    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }
    //当函数有默认值时，可以不用传参
    say()
}

/**
 * 参数设置默认值
 */
fun print(name: String = "george"): String {
    println(name)
    return name
}


fun main(args: Array<String>) {
    print()
    function1()
}