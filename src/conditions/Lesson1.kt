package conditions

fun main(args: Array<String>) {
    val x:Int = 3
    val y:Int = 5

//    1.if
        if (x < y){
            println("$x is less than $y")
        }

//    2.if ...else...
        if(x > y){
            println("$x is greater than $y")
        }else{
            println("$x is less than $y")
        }

//    3.if ...else if ...else
        if (x > y){
            println("$x is greater than $y")
        }else if(y >= 5){
            println("$y is greater than or equal to $x")
        }else{
            println("CLosing the program")
        }

//    if statement as an expression
    val results =  if (x == 3 ){
        println("$x is equals to 3")
    }else if(y >= 5){
        println("$y is greater than or equal to $x")
    }else{
        println("CLosing the program")
    }
    println(results)

//    when statement
    //    when(state){
    //        state1 -> println("hello world")
    //        state2 -> println("hello world")
    //        state3 -> println("hello world")
    //        state4 -> println("hello world")
    //    }

    println("Enter your age : ")
    val myAge:String = readLine()!!    //ask user to enter age

//    val age:Int= 17
    var age_as_int:Int = myAge.toInt()
//    toInt -->converts data into integer

    when(age_as_int){
        12 -> println("Join class 6")
        13 -> println("Join class 7")
        14 -> println("Join class 8")
        15 -> println("Join form one")
        17 -> println("GETTING AN ID SOON")
    }

    println("This is an age app ")
    println("Please enter your age:  ")
    val miaka:String = readLine()!!
    var miaka_kama_int:Int =miaka.toInt()
//    modulus is used
    miaka_kama_int %=2

    when(miaka_kama_int){
        0 -> println("Your age is even")
        1 -> println("Your age is odd")
    }






}
