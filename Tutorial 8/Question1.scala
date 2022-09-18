//Question 1
case class Point(var x:Int,var y:Int){
   
    //Method to add 2 points
    def +(pt:Point) = new Point(this.x+pt.x,this.y +pt.y)

    //Method to move a point by a given distance dx and dy
    def move(dx:Int,dy:Int):Unit = {
        this.x=this.x + dx
        this.y=this.y + dy
    }


    // Method to return the distance between two given points
    def distance(pt:Point) : Double ={
        var diff_x = this.x - pt.x
        var diff_y = this.y - pt.y
        scala.math.sqrt((diff_x*diff_x) + (diff_y*diff_y))
    }

    // Method to invert(Switch x and y coordinates)
    def invert() : Unit={
        var hold = this.x
        this.x = this.y
        this.y = hold
    }

    
}

object Q1 extends App{
    var p1 = Point(1,2)
    var p2 = Point(2,3)

    //Printing tha additions of two points
    println("Addition of " + p1 +" and " + p2 + " is : "+ (p1+p2))

    // Moving p1 by 2 units along x and 4 units along y
    p1.move(2,4)
    println("p1 after moving 2 units along x and 4 units along y : "+p1)

    //Calculating the distance between 2 points
    var p3 = Point(9,7)
    var p4 = Point(5,4)
    println("Distance between "+ p3 +" and "+ p4 +" is : " + p3.distance(p4))

    //Inverting a point
    var p5 = Point(3,4)
    println("Before inverting the point p5")
    println(p5)
    p5.invert()
    println("After inverting the point")
    println(p5)

}