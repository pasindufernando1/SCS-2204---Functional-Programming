object SCS2204{
    def main(args:Array[String]) : Unit ={
        printf("Estimated profit at Rs.10 per ticket : %d\n",profit(10));
        printf("Estimated profit at Rs.15 per ticket : %d\n",profit(15));
        printf("Estimated profit at Rs.20 per ticket : %d\n",profit(20));
        printf("Estimated profit at Rs.25 per ticket : %d\n",profit(25));
        printf("Estimated profit at Rs.30 per ticket : %d\n",profit(30));

    }

    //Function to calculate the number of attendees when given the ticket price
    def attendees(ticketprice:Int):Int={
        120 + (15-ticketprice)/5 *20
    }

    //Function to calculate the total income from selling tickets
    def ticketincome(ticketprice:Int):Int={
        ticketprice * attendees(ticketprice);
    }

    //Function to calculate the total cost for the performance
    def cost(ticketprice:Int):Int={
        500 + 3*attendees(ticketprice);
    }

    //Function to calculate the final profit
    def profit(ticketprice:Int):Int={
        ticketincome(ticketprice) -  cost(ticketprice);
    }
}