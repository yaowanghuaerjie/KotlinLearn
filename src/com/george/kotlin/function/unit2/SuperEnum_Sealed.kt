package com.george.kotlin.function.unit2

sealed class SuperCommand {
    object UP : SuperCommand()
    object DOWN : SuperCommand()
    object LEFT : SuperCommand()
    object RIGHT : SuperCommand()
    class PACE(var pace: Int) : SuperCommand()
}
data class Tank(var color: String,
                var name: String)

fun exec(tank: Tank, superCommand: SuperCommand): Nothing = when (superCommand) {

    SuperCommand.UP -> TODO()
    SuperCommand.DOWN -> TODO()
    SuperCommand.LEFT -> TODO()
    SuperCommand.RIGHT -> TODO()
    is SuperCommand.PACE -> TODO()
}