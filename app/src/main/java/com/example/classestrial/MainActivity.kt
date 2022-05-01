package com.example.classestrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Huseyn", 21)
        //myUser.name = "Huseyn"
        //myUser.age = 21
        println(myUser.age)
        println(myUser.name)

        var james = Musician("James", "Guitar", 24)
        //james.age = 25
        println(james.age)
        println(james.returnBandName("Metal"))
        println(james.returnBandName("Model"))

        var lars = Supermusician("Lars", "Drums", 28)
        println(lars.name)
        println(lars.returnBandName("Metal"))
        lars.sing()

        //polymorphism is done by two ways

        //static poly
        println(Mathematics().sum())
        println(Mathematics().sum(4))
        println(Mathematics().sum(4, 8))

        //dynamic poly
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()
    }
}