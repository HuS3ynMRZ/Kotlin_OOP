package com.example.classestrial

open class Musician (name: String?, private var instrument: String?, age: Int?){
    //assigning constructor values to class properties
    //Encapsulation
    var name : String? = name
        private set
        get

    var age : Int? = age
        get
        private set

    private val bandName: String = "Metallica"

    fun returnBandName(password: String?): String{
        if (password == "Metal"){
            return bandName
        }else{
            return "Dur bas bayira"
        }
    }
}