package oop
//below is the parent class


//abstract class cannot be instantiated(you can't create an object but
// you can inherit subclasses from them)
abstract class Player(open val  name:String, open var club:String, open var jazNum:Int){
//    open in class: means that the class can be inherited from
//    open in constructor: variables ie name, club, jazzNum can be changed
//    val jina:String
//    var klabu:String
//    var jezi:Int
//
//    init {
//        this.jina = name
//        this.klabu = club
//        this.jezi = jazNum
//
//    }

    open fun run(){
        println("I can runvery fast")
    }
    open fun dribble(){
        println("I am the best dribbler")
        }

    open fun printDetails()
    {
        println("This is ${name}")
        println("From ${club}")
        println("my jersey number is ${jazNum}")
   }

}
//    SoccerPlayer is a subclass, inheritng from Player class
class SoccerPlayer(override val name:String, override var club:String, override var jazNum:Int):Player(name, club , jazNum) {

    override fun run(){
        println("I run as a soccer player")
    }

}
class RugbyPlayer(override  val name: String, override var club: String,override var  jazNum: Int):Player(name, club, jazNum){
    override fun run(){
        println("I run as a rugby player")
    }


}


fun main(args: Array<String>) {
//    val generalPlayer = Player("Any Player ", "Any Club", 7)

    val messi = SoccerPlayer("Messi", "Barca", 10)
    val cris = SoccerPlayer("Messi","Barca",10)

    messi.printDetails()

    messi.run()
    messi.dribble()

    val injera = RugbyPlayer("Collins Injera", "Shujaa", 15)

    println()
    injera.printDetails()

    injera.run()




}