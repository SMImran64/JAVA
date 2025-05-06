package realbankaccountsystem;

public class AccountClass {

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

    public void deposit(int amount) {

        if (amount > 0) {

            balance += amount;

        }
    }
    public boolean withdrew(int amount) {

        return true;

    }

    public String printDetails() {

        return "\n Account Number: " + accountNumber + "\n Final Balance: " + balance;

    }

}
