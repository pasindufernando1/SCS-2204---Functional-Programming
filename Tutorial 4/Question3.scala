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
    def formatNames(name:String)(index_list:Int*)(function:String =>String):String={
        if(index_list.isEmpty){
            function(name)
        }else{
            var str = ""
            var i = 0
            while(i<name.length()){
                if(index_list.contains(i)){
                    str = str + function(name.charAt(i).toString())
                }else{
                    str = str + name.charAt(i).toString()
                }
                i=i+1
            }
            str
        }
    }

    printf("Printing the sample outputs given\n")
    println(formatNames("Benny")()(toUpper(_)))
    println(formatNames("Niroshan")(0,1)(toUpper(_)))
    println(formatNames("Saman")()(toLower(_)))
    println(formatNames("Kumara")(5)(toUpper(_)))

}