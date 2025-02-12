public interface AccountState {
    public void setState(Account account);
    public void activate(Account account);
    public void suspend(Account account);
    public void closed(Account account);
    public Double withdraw(Double amount, Double balance);
    public Double deposit(Double amount, Double balance);
}
