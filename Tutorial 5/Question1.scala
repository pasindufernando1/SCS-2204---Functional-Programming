//Question 01

object Q1 extends App{

    //Function to calculate the GCD of 2 numbers
    def GCD(a:Int,b:Int) : Int = b match{
        case 0 => a
        case x if x>a => GCD(x,a)
        case _ => GCD(b,a%b)
    }

    //Function to check whether a number is prime
    def prime(a:Int,n:Int=2) : Boolean = n match{
        case x if(x==a) => true
        case x if GCD(a,x)>1 =>false
        case x => prime(a,x+1)
    }

    //Some sample outputs
    println(prime(5))
    println(prime(8))

}