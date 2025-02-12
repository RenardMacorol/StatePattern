public class ActiveState implements AccountState{
    private Account account;
    @Override
    public void setState(Account account) {
        this.account = account;
        account.setState(new ActiveState());
    }
    public void activate(){
        System.out.println("Account is already activated");
    }
    public void suspend(){
        account.setState(new SuspendedState());
        System.out.println("Account is already suspended");
    }
    public void closed(){
        System.out.println("Account is closed");
        account.setState(new ClosedState());
    }

    @Override
    public Double withdraw(Double amount, Double balance) {
        return balance-amount;
    }

    @Override
    public Double deposit(Double amount, Double balance) {
        return balance+amount;
    }


   
    
}