package com.george.kotlin.function.unit2

import java.io.Serializable

// final 允许继承
// hashCode toString getter setter equals copy
data class UserInfo(
        var id: String,
        var age: Int) : Serializable