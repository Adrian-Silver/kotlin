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


//TASK 1. Count no. of characters
fun countchar(name:String){
    val x =name.length
    println(x)
}


//    TASK 2. sum
fun sum(num_a:Int,num_b:Int){

    val ans:Int =num_a + num_b
    println(ans)
    println()
    println()
}







// has an error
fun area(rad:Int){
    val pie: Float = 3.142F
    val circle =pie *rad *rad
    println("no.3. The circle's radius is $circle")
}

//  TASK 4. if no. is even or odd
fun checknum(num:Int){
    if (num %2 ==0){
        println("number is even")
    }else{
        println("number is odd")
    }
}


//    TASK 5. volume of a cylinder
fun volume(radius:Int, height:Int){
    val p : Float = 3.142F
    val volume = p * height * radius * radius
    println("The volume is $volume")
}

//      Task 6. FIZZBUZZ

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


//A function that returns a value.
//A function that returns a value has to specify the return
// type (Int,String, Double, Boolean)

//A function can return a useful value or non useful value
//useful values are like Int, String, Double etc
//Non-useful values can be a bare string i.e "hello world"

fun get_age():Int{
//    to return a value, use the "return" statement
    return 23
}

fun sum_of_two(num1:Int, num2:Int):Int{
//    Int: return type
    val sum:Int =num1 + num2
    return sum

}

fun get_name(username:String): String{
    return username
}

//returning non-useful data: use Unit type
fun sayHello():Unit{
    println("Hello World")
}
fun sayHello2(username: String):Unit{
    println("Hello World, my name is $username")
}

fun sayHello3(username: String, age: Int): Unit{
    val sentence = "My name is $username and I am $age years old."
    println(sentence)
}

//Default arguments. province is the default argument
fun getDetails(username: String, age: Int, province :String="Wuhan"){
    println("Name: $username")
    println("Age: $age")
    println("Province: $province")    //default argument
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
//    of characters in a loop/string      (not done)






//    2. function that can calculate the sum of two numbers  (completed)

    sum(12,23)


//    3.function to calculate the area of a circle

    area(14)


//    4. check if number is even or odd

    checknum(26)


//    5. function to find volume of a cylinder

    volume(14,20)

//    6. function for fizzbuzz

    fizzbuzz(39)


//    lesson Monday 9/3/2020
// getting the age (return)    get_age() returns int 23 to variable my_age
    val my_age: Int =get_age()
    println(my_age)


    val results : Int = sum_of_two(2,5)
    println(results)


    val jina:String = get_name("Silver")
    println(jina)

    sayHello()
    sayHello2("Gitau")
    sayHello3("Silver",3)

    getDetails("Silver",23)
    getDetails("Silver",23, "Shanghai")

//    Named arguments
    getDetails(province = "shanghai",username = "Silver",age = 23)


}