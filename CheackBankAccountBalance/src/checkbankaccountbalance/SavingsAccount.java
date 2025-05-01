package checkbankaccountbalance;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double interestRate, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    

    public double addInterest() {

        super.balance =  super.balance + (super.balance * interestRate);

        return super.balance;

    }

    @Override
    public double withdraw(double amount) {
        return super.withdraw(amount); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
