object SCS2204{
    
    def main(args:Array[String]): Unit ={

        //Question 1 and Question 2
        var (k,i,j) = (2,2,2);
        var (m,n) = (5,5);
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        //Question 3
        println( k + 12*m);         // 2 + (12*5) = 2 + 60 = 62
        println( m/j );             // 5/2= 2 (As this is an integer division, .5 is disregarded) 
        println( n%j );             // 5%2 = 1 
        println( m/j*j );           // (5/2)*2 = 2*2 = 4
        println( f + 10*5 + g );    // 12.0 + 50 + 4.0 = 66.0 
        //println(++i * n);         // This cannot be evaluated in scala as ++ operator is not valid in scala

        
        //Converting given java statements to scala
        var (a:Int , b:Int , c1:Int , d:Int) = (2,3,4,5);   //Here I used c1 instead of c as c was declared earlier
        var k1:Float = 4.3f;                                //Here I used k1 instead of k as k was declared earlier

        //println(--b * a+c1 *d --);
        /*  This expression cannot be evaluated as -- operator is not supported in scala
            But in Java it will result 24
            --3 * 2+4 *5-- ==> --3 * 2+4 * (5--) ==> --3 * 2+4 * (5)
            ==> (--3) * 2+4 * 5 ==> 2 * 2+4 * 5 ==> (2*2) + (4*5)
            ==> 4 + 20 ==> 24
            b will be 2
            d will be 4
            */
        
        
        //println(a++);
        /*  This expression cannot be evaluated as ++ operator is not supported in scala
            But in Java it will result 2
            2++ ==> 2
            a will be 3
            */
        
        println(-2 * (g-k1) +c1);
        /* Will result 4.6000004 (Works in Scala as well as java)
           -2 * (4.0 - 4.3) + 4 ==> (-2 * -0.3) + 4 ==>0.6 + 4 ==> 4.6
            */
        
        //println(c1=c1++);
        /*  This expression cannot be evaluated as ++ operator is not supported in scala
            But in Java it will result 4
            Here as c1 bears value 4 initially, then it post increments to 5, but then it is assigned to itself 
            once again. Therefore as still c1 bears value 4 due to the postfix nature c1 will continue to hold the value 4

            c1 will be 4
            */
        
        //println(c1=++c1*a++);
        /*  This expression cannot be evaluated as ++ operator is not supported in scala
            But in Java it will result 15
            ++4 * 3++ ==> 5 * 3 ==> 15
            a will be 4
            c1 will be 15
            */

    }
}