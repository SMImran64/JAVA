
package realbankaccountsystem;


public class CurrentAccount extends AccountClass{
    
    protected double overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(double overdraftLimit, String accountNumber, long balance) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String deposit(double amount) {
         if (amount > 0) {

            balance += amount;
            return"deposited : "+amount+"New balance: "+ balance;

        } else {

            return "Invalid Deposit Amount";
        }
    }

    @Override
    public String withdraw(double amount) {
        
        if(amount > 0 && (balance-amount)>= -overdraftLimit){
        
            balance -= amount;
            
            return"Withdrew: "+amount+"New Balance: "+balance;
        
        }
        
        return "Withdrew is over from the overDraft Limit";
    }

    @Override
    public String printDetails() {
        
        return "Account Number: "+accountNumber+"Balance : "+balance+"OverDraft Limit: "+overdraftLimit;
    }
    

    

    

    
}
