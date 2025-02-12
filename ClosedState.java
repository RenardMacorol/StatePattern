public class ClosedState implements AccountState{
    Account account;
    @Override
    public void setState(Account account) {
        account.setState(new ClosedState());
        this.account = account;
    }
    public void activate(Account account){
        System.out.println("You cannot activate a closed account");
    }
    public void suspend(Account account){
        System.out.println("You cannot suspend a closed account");
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
        System.out.println("You cannnot withdraw on a cloed account");
        System.out.println(account.toString());
        return amount;
    }

    

   
    
}