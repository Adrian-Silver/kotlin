package arrays

fun main(args: Array<String>) {

//Array is a collection of similar data types either of
//        Int,String etc. Array in Kotlin is mutable in
//        nature with fixed size which means we can perform
//        both read and write operations on elements of array

//You can declare an array explicitly or implicitly
//use the array function to create an array


//    Declaring an array implicitly
    val country ="Kenya"   //array declaration implicitly dec
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    val names = arrayOf("John","Mary","Paul","Mike")



//    NB: Always use array explicitly


    val county:String ="Nai"   //array declaration explicitly dec
    val nums = arrayOf<Int>(1,2,3,4,5,6,7,8)
    val majina = arrayOf<String>("John","Mary","Paul","Mike","Git")

//    accessing array items
//    use index numbers
    println(numbers[0])

//    2. use get(), takes the index number as an argument
    println(majina.get(2))


//    creating an array using factory functions
    val fruits = intArrayOf(1,3,5,6,7,8,9,5)
    val isTrue = booleanArrayOf(true,false)

//    changing array values: use set() method
//    set() method takes two argument: one is the index of the value you want to change,
//    the other arg is the value to replace with

    majina.set(1, "Konny")
    println(majina.get(1))

    val num_names:Int = majina.size
    println(num_names)

//    loping through an array loop
//    use (n-1) so as to specify no. of items based on index
//    can also use [..]the square brackets as a substitute for .get



    for(i in 0..num_names-1){
        println(majina.get(i))
        println(majina[i])
    }

    //    or
//    for(i in 0..3){
//        println(majina[i])
//    }


    println(majina[1].length)  //.length function used to get the no. of characters in a string



    /*NB:___  */
//    Task: show if name has less or more than 3 characters in an array


//    for (x in 0..num_names-1){
//        if (majina[0..num_names-1].length > 3){
//            println("$x has more than 3 characters")
//        }else{
//            println("$x is less than 3 characters")
//        }
//
//    }





















}