package bankaccountmanagementsystem;

public class CheckingAccount extends BankAccount {

    private double transactionFee;

    public CheckingAccount(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public CheckingAccount(double transactionFee, String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {

            balance -= amount;
            System.out.println("Withdraw amount : " + amount + ", New balance after withdraw: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

}
