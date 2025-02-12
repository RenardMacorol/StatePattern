public class Main{
    public static void main(String[] args) {
       Account myAccount = new Account("1234", 10000.0); //set acct to active state
                       myAccount.activate(); // displays "Account is already activated!"
                       myAccount.suspend();
                       myAccount.deposit(1000.0);
                       myAccount.withdraw(100.0);
                       myAccount.close();
                       myAccount.activate();
                       myAccount.activate();
                       myAccount.withdraw(500.0);
                       myAccount.deposit(1000.0);

                     
    }
}