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
    
    public String addInterestAmount(){
    
        double interest = balance * interestRate;
        
        balance += interest;
    
        return "Interest Amount: "+interest+"New balance after interest: "+balance;
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount); 
    }
    
    
  
}
