//Question 1
import scala.io.StdIn.readDouble

object Q1 extends App{

    //Function to calculater the interest
    def interest(amount:Double):Double = amount match{
        case x if x<=20000 => x*0.02
        case x if x<=200000 => x*0.04
        case x if x<=2000000 => x*0.035
        case x if x>2000000 => x*0.065
    }

    printf("Enter the deposit amount : ")
    var deposit = scala.io.StdIn.readDouble()
    printf("The interest for the deposited amount is : %.2f",interest(deposit))

}