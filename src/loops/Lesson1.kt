package loops

import java.util.*

//for loops
//syntax
fun main(args: Array<String>) {
    for (i in 1..5){
        if (i ==4){
            println("$i is equal to 4")
        }else{
            println("$i is not equal to 4")
//            println("$i ")

        }
    }


    println()
    for (i in 0..20 step 2){
        if (i ==4){
            println("$i is equal to 4")
        }else{
            println("$i is not equal to 4")
//            println("$i ")

        }
    }

    println()

//    printing in reverse order

    for (i in 20 downTo 1){
        println(i)
    }

    println()
//    while loop

    var a = 0
    while (a < 10){
        println(a)
        a++
    }

    println()

    var b = 1
    do{
        println(b)
        b++
    }while (b < 10)



//    assignment : FIZZBUZZ

    println()

    println("FIZZBUZZ assignment")

    var x:Int =1
    for(x in 1..100){
        if(x % 15 ==0){
            println("$x FIZZBUZZ")
        }else if(x %3==0){
            println("$x FIZZ")
        }else if(x %5==0) {
            println("$x BUZZ")
        }else{
            println("$x")
        }
    }























//    Arrays
//    functions











}