package com.george.kotlin.function

/**
 * 高阶函数是指函数或者Lambda函数的参数又是一个函数或者Lambda函数
 */


//在Kotlin中，函数是一等公民

//Kotlin的Lambda是一个匿名对象，可以使用inline修饰方法，
// 这样当方法在编译时就会拆解方法调用为语句调用，
// 进而减少创建不必要的对象
inline fun onlyIf(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) {
        block()
    }
}

val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int,
                l: Int, m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int, t: Int, u: Int, v: Int,w:Int ->
    print("正常输出")
}

fun main(args: Array<String>): Unit {
    onlyIf(true) {
        print("打印日志")
    }

    var runnable = Runnable { println("Runnable::run") }
    val function: () -> Unit
    function = runnable::run

    onlyIf(true, function)

    lambdaA(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
}