//Question 5
import scala.io.StdIn.readInt

object Q5 extends App{
    
    //Function to get the addition of all even numbers less than n
    def addEven(n:Int) : Int = n match {
        case n if n<=2 => 0
        case n if (n-1)%2==0 => (n-1) + addEven(n-1)
        case n => addEven(n-1)
    } 

    //Printing sample output
    printf("Enter the value n : ")
    var n = readInt()
    printf("The sum of the even numbers less than %d is : %d",n,addEven(n))
}

