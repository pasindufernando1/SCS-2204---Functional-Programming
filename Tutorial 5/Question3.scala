//Question 3

object Q3 extends App{
    
    //Function to get the sum of numbers from 1 to n
    def sum(n:Int) : Int ={
        if(n<=1){
            return n
        }
        return n + sum(n-1)
    }

    //Sample output
    println(sum(5))
}