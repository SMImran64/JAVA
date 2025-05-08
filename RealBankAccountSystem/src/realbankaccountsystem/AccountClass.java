package realbankaccountsystem;

public class AccountClass {

    protected String accountNumber;
    protected long balance;
    protected long amount;

    public AccountClass(String accountNumber, long balance, long amount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
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

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
    
    

    public long deposit() {

        if (amount > 0) {

           return balance += amount;
        }
        else{
            return balance;
        }
    }
    public boolean withdrew(int amount) {
        return true;
    }

  
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
 

}

