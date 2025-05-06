package realbankaccountsystem;

public class SavingAccount extends AccountClass{

    protected double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(double interestRate, String accountNumber, long balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    
    public double addInterestAmount(){
    
        balance = (long) (balance+(balance*interestRate));
    
        return balance;
    }

    @Override
    public void deposit(int amount) {
        
        balance += amount;
    }

    @Override
    public boolean withdrew(int amount) {
        return super.withdrew(amount); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
  
}
