//Question 01

class Rational(x:Int,y:Int){
    //Condition for the denominator
    require(y>0,"Denominator should be positive")

    def numerator   = x
    def denominator = y

    //Method neg
    def neg = new Rational(-(this.numerator),this.denominator)

    //Overiding the toString function to get outputs as needed
    override def toString() : String = s"$numerator/$denominator"
}


object Q1 extends App{
    //Printing some sample outputs to check
    val num1 = new Rational(1,2)
    println(num1)
    val num2 = num1.neg
    println(num2)
}