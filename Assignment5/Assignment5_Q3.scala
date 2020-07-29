class account(x:String, y:Double){
    val acNumber = x;
    var balance = y;

    def transfer(ac:account, t:Double)={
        if(this.balance > t){
            this.balance -= t;
            ac.balance += t;
        }
        else{
            println("Account balance is insufficient");
        }
    }

    def printBalance()={
        println("Account No.: " + this.acNumber + " ==> Balance: " + this.balance);
    }
}

object Assignment5_Q3{
    def main(args:Array[String]):Unit={
        var ac1 = new account("1",5.5);
        var ac2 = new account("2",6.5);

        println("\n--- Before Transfer ---");
        ac1.printBalance();
        ac2.printBalance();

        ac1.transfer(ac2 , 2.5); // Transfers money from ac1 to ac2

        println("\n--- After Transfer ---");
        ac1.printBalance();
        ac2.printBalance();
    }
}