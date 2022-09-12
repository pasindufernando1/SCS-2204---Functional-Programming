//Question 03
class Account(id:String,ac_no:Int,bal:Double){
    val nic:String  = id
    val account_num = ac_no
    var balance     = bal

    //Overiding the toString method to get the output as needed
    override def toString = "[ NIC : " + nic + " | Account number : " + account_num + " | Balance : " + balance +" ]"

    //Method to update the withdrawals
    def withdraw(amount:Double) : Unit={
        this.balance = this.balance - amount
    }

    //Method to update the deposits
    def deposit(amount:Double) : Unit={
        this.balance = this.balance + amount
    }

    //Method to transfer
    def transfer(ac:Account,amount:Double) : Unit={
        if(amount>this.balance){
            println("Balance not enough to transfer")
        }else{
            this.withdraw(amount)
            ac.deposit(amount)
        }
    }
}

object Q3 extends App{
    val ac1 = new Account("200018104566",1,10000)
    val ac2 = new Account("200018104567",2,10000)
    println("Account details before transferring")
    println(ac1)
    println(ac2)
    //Transferring rs.500 from ac1 to ac2
    ac1.transfer(ac2,500)
    println("Account details after transferring")
    println(ac1)
    println(ac2)

}


