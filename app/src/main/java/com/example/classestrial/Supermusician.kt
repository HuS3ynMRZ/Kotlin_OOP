package com.example.classestrial

class Supermusician(name: String?, instrument: String?, age: Int?) : Musician(name, instrument, age) {

    fun sing(){
        println("Dig a hole\n" +
                "Fireworks exploding in my hands\n" +
                "If I could paint the sky\n" +
                "Well all the stars would shine a bloody red")
    }
}