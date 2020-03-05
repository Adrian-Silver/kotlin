package functions

//a function is ablock of code that has a specific task e.g println()

//  fun nameOfFunction(){
//    code to execute
//  }

fun greetings1(){
    println("Hello world")
}

//2 types of functions can be called;
//a. can call an argument.
// b. can't call an argument     e.g
//a parameter is
//while an argument

//  NB:__find difference between argument & parameter

//functions that takes an argument
//parameter: a variable passed into a function during function creation
fun greetings2(name:String){
    println("Hello $name")
}

fun greetings3(name: String,age:Int){
    println("Hi I am $name,I am $age years old")
}


//TASK 1.
fun countchar(name:String){
    val x =name.length
    println(x)
}

fun sum(num_a:Int,num_b:Int){

    val ans:Int =num_a + num_b
    println(ans)
}

// has an error
//fun area(rad:Int){
//    val pie:Float =3.142F
//    val circle:Int =pie *rad *rad
//    println("the circle's radius is $circle")
//}

//  TASK 4. if no. is even or odd
fun checknum(num:Int){
    if (num %2 ==0){
        println("number is even")
    }else{
        println("number is odd")
    }
}


fun volume(radius:Int, height:Int){
    val p : Float = 3.142F
    val volume = p * height * radius * radius
    println("The volume is $volume")
}

fun fizzbuzz(num:Int){


        if(num % 15 ==0){
            println("$num FIZZBUZZ")
        }else if(num %3==0){
            println("$num FIZZ")
        }else if(num %5==0) {
            println("$num BUZZ")
        }else{
            println("$num")
        }

}



fun main(args: Array<String>) {
//    to call a function use greetings1()
//    MUST be in he main function

    greetings1()
    println("Hello once again")

    greetings2("John")   //"John is an argument"

    greetings3("John",23) //John is an argument


//    TASK:
//    1.create a function that enables the counting of the number
//    of characters in a loop/string




//    2. function that can calculate the sum of two numbers  (completed)

    sum(12,23)


//    3.function to calculate the area of a circle



//    4. check if number is even or odd

    checknum(26)


//    5. function to find volume of a cylinder

    volume(14,20)

//    6. function for fizzbuzz

    fizzbuzz(39)






}