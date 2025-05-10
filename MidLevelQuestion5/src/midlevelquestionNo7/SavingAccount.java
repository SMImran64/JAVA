package midlevelquestionNo7;

public class SavingAccount extends AccountClass2 {

    private float interestRate;

    public SavingAccount() {
    }

    public SavingAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(float interestRate, String accountNumber, long balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

  
    
    public String sumInterest(){
    
        balance =(long) ((long) balance+(balance*interestRate));
    
    
        return "Balance after add interest: "+balance;
    }

    @Override
    public boolean deposit(long amount) {
        return super.deposit(amount);
    }

    @Override
    public String pintDetails() {
        return super.pintDetails()+"\n"+sumInterest();
    }

}
