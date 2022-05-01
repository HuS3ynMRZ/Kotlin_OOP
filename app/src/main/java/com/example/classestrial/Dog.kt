package com.example.classestrial

class Dog: Animal() {

    fun test(){
        super.sing()
    }
    override fun sing() {
        println("I am a dog")
    }
}