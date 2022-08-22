//Question 4

object Q4 extends App{

     
    def isEven(x:Int) : Boolean = x match{
        case 0 => true
        case _ => isOdd(x-1)
    }

    def isOdd(x:Int) : Boolean = (!isEven(x))

    //Sample outputs
    println(isEven(2))
    println(isEven(5))
}