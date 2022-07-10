object SCS2204{

    def main(args:Array[String]) : Unit ={
        printf("The Take Home salary of an employee who worked 40 normal hours and 30 OT hours is :  %.2f",TakeHomeSalary(40,30));
    }

    //Function to calculate the total pay for normal hours
    def PayForNormalHours(hours:Int) : Int = {
        250 * hours;
    }

    //Function to calculate total pay for OT hours
    def PayForOTHours(hours:Int) : Int = {
        85 * hours;
    }

    //Function to calculate the total pay from both normal and OT hours
    def TotalIncome(normal:Int,ot:Int) : Int ={
        PayForNormalHours(normal) + PayForOTHours(ot);
    }

    //Function to calculate the tax to be paid
    def Tax(income:Int) : Double = {
        income * 0.12;
    }

    //Function to calculate the final salary taken home after deducting the tax
    def TakeHomeSalary(normal_hours:Int,ot_hours:Int) : Double = {
        TotalIncome(normal_hours,ot_hours) - Tax(TotalIncome(normal_hours,ot_hours));
    }
}