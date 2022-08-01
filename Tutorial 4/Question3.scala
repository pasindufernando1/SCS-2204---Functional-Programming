//Question 3
object Q5 extends App{

    //Function to convert to uppercase
    def toUpper(x:String) : String={
        x.toUpperCase()
    }

    //Function to convert to lowercase
    def toLower(x:String) : String={
        x.toLowerCase()
    }

    //formatNames function
    def formatNames(name:String)(function:String =>String):String={
        function(name)
    }

    printf("Printing the sample outputs given\n")
    println(formatNames("Benny")(toUpper(_)))
    println(formatNames("Niroshan".substring(0,2))(toUpper(_)) + formatNames("Niroshan".substring(2))(toLower(_)))
    println(formatNames("Saman")(toLower(_)))
    println(formatNames("Kumara".substring(0,1))(toUpper(_)) + formatNames("Kumara".substring(1,5))(toLower(_)) + formatNames("Kumara".substring(5))(toUpper(_)))

}