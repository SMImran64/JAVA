package realbankaccountsystem;

public abstract class AccountClass {

    protected String accountNumber;
    protected long balance;

  
    public AccountClass() {
    }

    public AccountClass(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
 
    public abstract String deposit(double amount);
    public abstract String withdraw(double amount);
    public abstract String printDetails();
   
}
