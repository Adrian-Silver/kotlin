package Lesson1.lesson1

//kotlin code gets executed/run only in main function
//main() function defines where kotlin code gets executed
//the {} defines the scope of your executable code


fun main() {
//    println(): prints content with a new line at the end
//    print(): prints content with a continous line
    println("Hello World")
    println("Hello World")
    println("Hello World")
    print("HELLO WORLD")
    print("HELLO WORLD")
    print("HELLO WORLD")
    println()



//    Explicitly defining the type of variable
    val country:String ="Kenya" //CONSTANT
    var county:String ="Nairobi"
    var age: Int =23
    var gender :String
    gender= "Male"





    county = "Uganda"


    println(country)
    println(county)
    println(age)
    println(gender)



//    implicitly defining the type of variables

    val name ="John Doe"
    var language ="kotlin"

    println(name)
    println(language)


//    kotlin ddatatypes

//    1. Numbers
//     1.1 Integers: Non-decimal numbers

        var my_age: Int =23
        println(my_age)
        my_age =my_age + 10
    println(my_age)

//     1.2. Float: Integers: decimal numbers
        val height =3.56F
        println(height)


//    2. Booleans: true or false
        val isloggedin: Boolean = true
        val isloggedout: Boolean = false
        println(isloggedin)
        println(isloggedout)


//    3. Strings
    var length: Int =25
    var ruler:String ="Oxford"
    println("The length of the " + ruler+" ruler is " +length + "cm")
    println("The length of the  $ruler ruler is  $length cm")

//    4. Characters: declared using single quotes
        val first_letter ='3'
        println(first_letter)

    /* Assingment: Create two variables num_1 and num_2 storing 10 and 20 respectively, and
    calculate the sum of the two numbers*/

        val num_1 =10
        val num_2 =20
        val sum =num_1 + num_2
        println(sum)




//    5. Arrays























}