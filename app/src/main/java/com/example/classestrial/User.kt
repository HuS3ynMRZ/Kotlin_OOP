package com.example.classestrial

class User(nameInput: String, ageInput: Int) {
    //Properties
    var name : String? = nameInput
    var age: Int? = ageInput

    //Constructor vs init
    init {
        println("init shit")
    }
}