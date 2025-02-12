public class Account {
    private String accountNumber;
    private Double balance;
    public AccountState accountState;

    Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }
    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }
    public AccountState getState() {
        return accountState;
    }

    public void deposit(Double depositAmount){
        accountState.deposit(depositAmount,this.balance);
    }
    public void withdraw(Double withdrawAmount){
        accountState.withdraw(withdrawAmount,this.balance);
    }

    public void activate(){
        accountState.activate();
    }
    public void suspend(){
        accountState.suspend();
    }
    public void close(){
        accountState.closed();
    }

    public String toString(){
            return accountNumber + balance;
    }
    
}
