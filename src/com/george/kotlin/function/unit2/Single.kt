package com.george.kotlin.function.unit2

class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}

class StringUtils {
    companion object {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
    }
}

fun main(args: Array<String>) {
    StringUtils.isEmpty("=======")
}
