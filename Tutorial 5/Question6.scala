//Question 6

object Q6 extends App{
    
    //Function to calculate nth fibonacci number
    def fibonacci(n:Int) : Int = n match {
        case x if x==0 => 0
        case x if x==1 => 1
        case _ => fibonacci(n-1) + fibonacci(n-2)

    }

    //Function to print first n fibonacci numbers
    def printFibonacci(n:Int) : Unit={
        if(n>0){
            printFibonacci(n-1)
            println(fibonacci(n-1))  
        }    
    }

    //Sample outputs
    printFibonacci(5)
}