//Question 04

object Q4 extends App{
    
    //Function to calculate the total cost for coverprice
    def coverprice(num:Int) : Double ={
        24.95 * num;
    }

    //Function to calculate the discount
    def discount(amount:Double) : Double ={
        amount * 0.4;
    }

    //Function to calculate the shipping cost
    def shipcost(num:Int) : Double = {
        if(num<=50){
            num * 3;
        }else{
            50*3 + (num-50)*0.75;
        }
    }

    //Function to calculate the wholesale cost
    def wholesale(num:Int) : Double ={
        coverprice(num) - discount(coverprice(num)) + shipcost(num);
    }

    printf("Total wholesale cost for 60 copies is : %.2f",wholesale(60));
    //Wholesale cost for 60 books will be 1055.70
}