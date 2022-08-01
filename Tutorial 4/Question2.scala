//Question 2
import scala.io.StdIn.readInt

object Q4 extends App{

    //Function to print the respective output
    def PatternMatching(value:Int): Any = value match{
        case x if x<=0 => println("Negative/Zero is input")
        case x if x%2==0 => println("Even number is given")
        case _ => println("Odd number is given")
    }

    printf("Enter the number : ")
    var num = readInt()
    PatternMatching(num)
}