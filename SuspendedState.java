public class SuspendedState implements AccountState{
    private Account account;
    @Override
    public void setState(Account account) {
        account.setState(new SuspendedState());
    }
    public void activate(Account account){
        System.out.println("Account is already activated");
        account.setState(new ActiveState());
    }
    public void suspend(Account account){
        System.out.println("Account is already suspended");
    }
    public void closed(Account account){
        System.out.println("Account is closed");
        account.setState(new ClosedState());
    }

    @Override
    public Double withdraw(Double amount, Double balance) {
        System.out.println("You cannnot withdraw on a closed account");
        System.out.println(account.toString());
               return amount;
    }

    @Override
    public Double deposit(Double amount, Double balance) {
        System.out.println("You cannnot withdraw on a closed account");
        System.out.println(account.toString());
               return amount;
    }

   
   
    
}
