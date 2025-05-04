package realbankaccountsystem;

public class SavingAccount extends AccountClass {

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
    public double addInterestAmount(){
        
       balance = (long) (balance+(balance*this.interestRate));
        
    
        return balance;
    
    }

    @Override
    public String deposit(double amount) {

        if (amount > 0) {

            balance += amount;
            return "\n deposited :"+amount+"\n New balance:"+balance;

        } else {

            return "\n Invalid Deposit Amount";
        }
    }

    @Override
    public String withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;
            return "\n Withdrew Amount :"+amount+"\n New balance:"+balance;
        }
        else{        
            return "\n Invalid withdraw or Insufficient balance";
        }
    }

    @Override
    public String printDetails() {
        
        return "\n Account Number : "+accountNumber+
                "\n Balance:"+balance+"\n Final Amount After Adding Interest Amount: "+balance;
               
    }

}
