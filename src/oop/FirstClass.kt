package oop

//to create a class use the "class" keyword
//After the class keyword, add the name of the
// class with the starting letter in uppercase

//properties show what a class contains
//action: / methods show what a class can do (action it does)
//a class can be considered as a blueprint. hence
// diff. instances of the class will have the same properties




class Car{
//    properties: var kt variables
    var color:String = "Red"
    var num_sits:Int = 4
    var onGear :Boolean = false
    var stear_wheel : String ="leather"
    var number_plate :String ="yellow"
    val year_of_production:Int = 2019

//    method: is a function inside a class
    fun printDetails():Unit{
        println("Color: $color")
        println("Number 0f sits: $num_sits")
        println("On gear?: $onGear")
    }

//    methods that take args
    fun accelerate(speed: Int){
    println("This car has a speed of $speed kmh")
    }

    fun production_year(): Int{
        return year_of_production
    }



}


fun main(args: Array<String>) {
//    object/instance : is an example of a blueprint
//    to create an object, declare if its val, var
//    then give a name, then assign it to the class==blueprint
    val car1 =Car()
    val car2 =Car()
//    car1: object/instance
//    Car(): class/blueprint

//    accessing properties in an object and methods,
//    use the "." operator

//    a method is a function (any) inside a class


    println(car1.color)
    println(car1.num_sits)
    println(car1.onGear)
    println(car1.number_plate)
    println(car1.stear_wheel)

//    calling a method
    car1.printDetails()

//    changing object properties
//    refer to object,
//      then use dot operator to access the property that needs change

    car2.color ="green"
    car2.num_sits =5
    car2.onGear = true

    car1.printDetails()
    car2.printDetails()

    car1.accelerate(120)
    car2.accelerate(250)

    car1.production_year()
    car2.production_year()

//    To get the year,
//    1. Store the returned value in a variable and print
    val yop: Int =car1.production_year()
    println(yop)

//    2.print result directly
    println(car1.production_year())







}
