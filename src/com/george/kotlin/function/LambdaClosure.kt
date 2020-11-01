package com.george.kotlin.function


/**
 * Kotlin 的lambda参数是有上限的，最多22个
 */
val prinit = { name: String ->
    println(name)
}

fun main(args: Array<String>) {
    //如果Lambda没有参数，可以省略箭头符号->
    val thead = Thread({})
    //如果Lambda是函数的最后一个参数，可以将大括号放在小括号外面
    val thread1 = Thread() {}
    //如果函数只有一个参数，并且这个参数就是Lambda，则可以省略小括号
    val thread2 = Thread {}


}