public interface AccountState {
    public void setState(Account account);
    public void activate();
    public void suspend();
    public void closed();
    public Double withdraw(Double amount, Double balance);
    public Double deposit(Double amount, Double balance);
}
