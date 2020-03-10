package oop

class Calculator{
    fun num(num_1:Int , num_2:Int){
        var sum= num_1 + num_2
        println("Sum of num_1 and num_2 is:")
        println(sum)
        var sub = num_1 - num_2
        println("Difference between num_1 and num_2 is:")
        println(sub)
        var multi = num_1 * num_2
        println("Multiplication of num_1 and num_2 is:")
        println(multi)
        var div = num_1 / num_2
        println("Division by num_1 and num_2 is:")
        println(div)
        var mod = num_1 % num_2
        println("Modulus of num_1 and num_2 is:")
        println(mod)

    }

}

//      Answer #2.0
class Calculator2(num1:Int, num2:Int){
//    creating empty variables for this class
    var moja:Int
    var mbili:Int

    init {
        this.moja = num1
        this.mbili = num2
    }

    fun sum_of_two(){
        println("The sum of $moja and $mbili is ${moja + mbili}")
    }

    fun diff_of_two(){
        println("The diff of $moja and $mbili is ${moja - mbili}")
    }

    fun prod_of_two(){
        println("The prod of $moja and $mbili is ${moja * mbili}")
    }

    fun div_of_two(){
        println("The div of $moja and $mbili is ${moja / mbili}")
    }

    fun mod_of_two(){
        println("The modulus of $moja and $mbili is ${moja % mbili}")
    }
}

fun main(args: Array<String>) {
    val calc = Calculator()
    println("Enter num_1 :")
//    val num_1: String = readline()!!
//    num1 ==("")
    println("Enter num_2 :")
//    val num_2: String = readline()!!
//    num2 == ("")

    calc.num(15,6)


//    val for answer #2.0

    val fx82 = Calculator2(56, 12)
    fx82.sum_of_two()
    fx82.diff_of_two()
    fx82.prod_of_two()
    fx82.div_of_two()
    fx82.mod_of_two()



}