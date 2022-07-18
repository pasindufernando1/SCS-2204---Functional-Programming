//Question 05

object Q5 extends App{

    //Function to calculate the time taken to run at easy pace
    def easy(km:Int) : Int ={
        8 * km;
    }

    //Function to calculate the time taken to run at Tempo
    def tempo(km:Int) : Int ={
        7 * km;
    }

    printf("The total running time is : %d",easy(2)+tempo(3)+easy(2));
    //The total time taken for 2km at easy pace, 3km at tempo and another 2km at easy is : 53
}