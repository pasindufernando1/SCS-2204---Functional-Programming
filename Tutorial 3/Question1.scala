//Question 01

object Q1 extends App{

    //Function to calculate the area when the radius is given
    def area(radius:Double) : Double ={
        math.Pi * radius * radius;
    }

    printf("The area of a disk with radius 5 is : %.2f",area(5));
    //Answer will be 78.54 when the radius is 5.
}