//Question 04
class Account(id:String,ac_no:Int,bal:Double){
    val nic:String  = id
    val account_num = ac_no
    var balance     = bal

    //Overiding the toString method to get the output as needed
    override def toString = "[ NIC : " + nic + " | Account number : " + account_num + " | Balance : " + balance +" ]"

}

object Q4 extends App{

    val ac1 = new Account("200018104566",1,10000)
    val ac2 = new Account("200018104567",2,1000)
    val ac3 = new Account("200018104568",3,-500)
    val ac4 = new Account("200018104569",4,3000)
    val ac5 = new Account("200018104570",5,-200)
    
    //Defining the bank
    var bank:List[Account] = List(ac1,ac2,ac3,ac4,ac5)
    
    //List of accounts with negative balances
    val overdraft = (account_list:List[Account]) => account_list.filter(x=>x.balance<0.0)

    //Sum of all account balances
    val totalBalance = (account_list:List[Account]) => account_list.foldLeft(0.0)((x,y)=> x+y.balance)

    //Function to calculate the interest and to calculate the final balance and print it
    val interest = (account_list:List[Account]) => 
        account_list.map(account => 
            if(account.balance>=0) 
                account.balance = account.balance + account.balance*0.05 
                println(account)
            else 
                account.balance = account.balance + account.balance*0.1
                println(account)
            ) 

    println("Accounts with negative balances")
    println(overdraft(bank))
    println("\nSum of all account balances : "+totalBalance(bank) + "\n")
    println("Final balances of bank accounts after applying interests")
    interest(bank)
  
    


}