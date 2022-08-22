//Question 5
import scala.io.StdIn.readInt

object Q5 extends App{
    
    //Function to get the addition of all even numbers with regard to a given n
    def addEven(n:Int) : Int = n match {
        case 0 => 0
        case x if (x%2==0) => n + addEven(n-1)
        case x => addEven(n-1)
    } 

    //Printing sample output
    printf("Enter the value n : ")
    var n = readInt()
    printf("The sum of the even numbers less than %d is : %d",n,addEven(n-1))
}

