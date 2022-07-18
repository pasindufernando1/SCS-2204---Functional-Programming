//Question 02

object Q2 extends App{

    //Function to convert celcius to fahrenheit
    def CelToFah(cel:Double) : Double ={
        cel * 1.8 + 32;
    }

    printf("The fahrenheit conversion of 35 celcius is : %.2f",CelToFah(35));
    //Fahrenheit conversion of 35 celcius will be 95 fahrenheits

}