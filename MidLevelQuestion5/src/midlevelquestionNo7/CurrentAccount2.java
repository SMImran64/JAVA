
package midlevelquestionNo7;


public class CurrentAccount2 extends AccountClass2{
    
    private double overdraftLimit;

    public CurrentAccount2() {
    }

    public CurrentAccount2(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount2(double overdraftLimit, String accountNumber, long balance) {
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
    public boolean withdraw(int amount) {
        
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {

            balance -= amount;

            System.out.println("\n Withdrew amount: " + amount);

            System.out.println("\n New Balance After withdrew: " + balance);
            return true;
        } else {

            System.out.println("Withdrew amount exceeds overdraft limit");
            return false;
        }
    }

    @Override
    public String pintDetails() {
        return super.pintDetails()+"\n OverDraft Limit: "+overdraftLimit+"\n Final Balance after overdraft: "+balance; 
    }
    
    
    
}
