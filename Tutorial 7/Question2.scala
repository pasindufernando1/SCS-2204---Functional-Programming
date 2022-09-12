//Question 02

class Rational(x:Int,y:Int){
    //Condition for the denominator
    require(y>0,"Denominator should be positive")

    def numerator   = x/gcd(x,y)
    def denominator = y/gcd(x,y)

    //Method neg
    def neg = new Rational(-(this.numerator),this.denominator)

    //Method +
    def +(r:Rational) ={
        new Rational(this.numerator*r.denominator + r.numerator*this.denominator,denominator*r.denominator)
    }

    // Method - 
    def -(r:Rational)={
        this+r.neg
    }

    //GCD method
    private def gcd(a:Int,b:Int) : Int={
        if(b==0) 
            a
        else
            gcd(b,a%b)
        }

    //Overiding the toString function to get outputs as needed
    override def toString() : String = s"$numerator/$denominator"
}


object Q1 extends App{
    //Printing some sample outputs to check
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    println(x-y-z)
}