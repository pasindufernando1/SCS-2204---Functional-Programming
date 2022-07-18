//Question 03

object Q3 extends App{

    //Function to calculate the volume when the radius is given
    def volume(radius:Double) : Double ={
        (4 * math.Pi * radius * radius * radius)/3;
    }

    printf("The volume of a sphere with radius 5 is : %.2f",volume(5));
    //Answer will be 523.60 when the radius is 5.
}