package com.george.kotlin.function.unit2

interface Animal {
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("Wang wang Wang")
    }
}

class Cat:Animal{
    override fun bark() {
        println("miao miao miao")
    }
}

class Zoo(animal: Animal) : Animal by animal

fun main(args: Array<String>) {
    Zoo(Dog()).bark()
    Zoo(Cat()).bark()
}