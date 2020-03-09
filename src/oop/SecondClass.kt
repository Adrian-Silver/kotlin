package oop

//classes that are passed in data just ; like functions
//() are known as constructors

class BenzS200(owner:String,number_plate:Int,val color:String = "pink"){
    var mwenye_gari:String  //empty to store incoming data
    var plati:Int   //empty to store incoming data
    var origin :String ="Germany"

//    mwenye_gari: class property
//    plati: class property

    init {
        this.mwenye_gari = owner
        this.plati = number_plate

    }


    fun printDetails():Unit{
        println("The owner is $mwenye_gari and the number plate is $plati")
        println("Color is $color")
    }


}

fun main(args: Array<String>) {
    val b1 = BenzS200( "Silver",1234)
    b1.printDetails()
    println(b1.origin)

//    ASSIGNMENT: create a ___class to calculate:
//    a. sum of 2 no.s
//            b. product of 2 no.s
//            c. div of 2 no.s
//            d. modulus of 2 no.s
//


}