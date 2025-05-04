
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

    @Override
    public void withDraw(int amount) {
        super.withDraw(amount); 
       
        }
    }
    
    
    
}
