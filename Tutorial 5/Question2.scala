//Question 02
 
object Q2 extends App{

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

    //Function to print all prime numbers less than n
    def primeSeq(n:Int) : Any ={
        if(n>1){
            primeSeq(n-1)
            if(prime(n)){
                println(n)
            }
        }
    }
    //Sample output
    primeSeq(10)

}