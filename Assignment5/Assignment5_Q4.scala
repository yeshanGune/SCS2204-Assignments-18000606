import List._

class account(x:String, y:Double){
    val acNumber = x;
    var balance = y;

}

object Assignment5_Q4{
    def accountSum(bank:List[account])={
        var sum = 0.0;

        println("\n--- Balances of each account ---");
        for(acc <- bank){
            sum += acc.balance;
            println("Account No.: " + acc.acNumber + " ==> Balance: " + acc.balance);
        }
        println("\nSum of all account balances: " + sum);
    }

    def interestSum(bank:List[account])={
        var sum = 0.0;

        
        for(acc <- bank){
            if(acc.balance > 0){
                acc.balance += 0.05 * acc.balance;
            }
            else if(acc.balance < 0){
                acc.balance += 0.1 * acc.balance;
            }
        }
        println("\n--- Balances of each account after ineterest ---");
        accountSum(bank)
    }
    
    def main(args:Array[String]):Unit={
        var ac1 = new account("1",2.2);
        var ac2 = new account("2",-3.4);
        var ac3 = new account("3",5.5);
        var ac4 = new account("4",-8.2);
        var ac5 = new account("5",12.5);

        var bank:List[account] = List(ac1, ac2, ac3, ac4, ac5);
        accountSum(bank);
        interestSum(bank);
    }
    

}