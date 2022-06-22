package com.ilaydabykakova.kotlinclassesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ilaydabykakova.kotlinclassesandfunctions.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*
        test()

        mySum(10,20)
        val result = myMUltiply(10,20)
        textView.text = "Result: ${result}"

         */

        /*
        button.setOnClickListener {
            println("Clicked")  }

         */

        //Class
        val homer = Simpson("Homer Simpson",40,"Nuclear Controller")

        //Object & Instance
        /*
        homer.name = "Homer"
        homer.age = 40
        homer.job = "Nuclear Controller"
         */

        println(homer.name +" "+ homer.age +" "+ homer.job)
        //homer.hairColor = "Yellow"
        homer.changeHairColor()

        //Nullability
        //Nullable(?) && Non-null
        //Nullable String
        //!! vs ?

        var myString : String? = null
        //println(myString)

        var myAge : Int? = null
        //println(myAge!!* 10)

        //1) Null Safety
        if (myAge != null){
            println(myAge!!* 10)
        }else{
            println("myAge null")
        }
        //2) Null Safety(Safe Call)
        println(myAge?.compareTo(2))

        //3)elvis (null ise -100 çıkart demek)
        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)

    }

    fun test(){
        println("test function")
    }

    /*
    //Input & Return
    fun mySum(a:Int, b:Int){
        textView.text = "Result: ${a + b}"
    }
    fun myMUltiply(x:Int,y:Int): Int {

        return x * y
    }
    fun helloKotlin(view : View){
        textView.text = "Hello Kotlin"
    }

     */

    fun makeSimpson(view: View){

        name =  binding.nameText.text.toString()
        var age = binding.ageText.text.toString().toIntOrNull()
        val job = binding.jobText.text.toString()

        if (age == null){
            age = 0
        }else if (name == null){
            name = "Empty ! "
        }else if (job == null){
            name = "Empty ! "
        }

        val simpson = Simpson(name,age,job)

        binding.resultText.text = "Name: ${simpson.name} Age: ${simpson.age} Job: ${simpson.job}"

    }
    fun scopeExample(view: View){
        //Scope
        println(name)

    }
}