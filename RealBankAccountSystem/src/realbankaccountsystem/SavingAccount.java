
package realbankaccountsystem;


public class SavingAccount extends AccountClass{
    protected double interestRate;

    public SavingAccount() {
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    

   public void addInterest() {

        double interest = balance * interestRate;
        balance += interest;

        System.out.println("Interest amount : " + interest + ", New balance after adding Interest: " + balance);

    }

    @Override
    public boolean withDraw(int amount) {
        return super.withDraw(amount); 
    }
   
}
