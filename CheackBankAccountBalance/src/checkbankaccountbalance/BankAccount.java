package checkbankaccountbalance;

public class BankAccount {

    private String accountNumber;
    double balance;

   
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {

        this.balance += amount;
        return this.balance;
    }
   
    public double withdraw(double amount) {

       if (balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Minimum balance of 100 required.");
        }
        return balance;
    }

}
