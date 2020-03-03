package operators

//Arithmetic ops
//(+, -, *, /, %)


fun main(){
    var sum:Int //declare empty variable
    var height:Int =12
    val width: Int= 21
    sum = height + width  //addition operation
    println(sum)


    //comparison operators
//(<, <=, >=, !=, ==)  //return value is always a boolean(true or false)
    val isEqual:Boolean = height == width
    println(isEqual)  //returns false
    if(height > width){
        println("$height is > than $width")
    }else{
        println("$height is < than $width")

    }

//    Assignment ops
//    (+=, -=, *=, /=, %=)
    val newHeight:Int = 23
    height += newHeight
    println("Total height is $height")























}

