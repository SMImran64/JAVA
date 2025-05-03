
package bankaccountmanagementsystem;


public class SavingAccount extends BankAccount{
    
    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(double interestRate, String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

   public void addInterest(){
   
       double interest = balance * interestRate;
       balance+= interest;
       
       System.out.println("Interest amount : "+interest +", New balance after adding Interest: "+balance);
   
   }

    @Override
    public boolean withdraw(double amount) {
         if(amount > 0 && balance >= amount){
        
            balance -= amount;
            System.out.println("Withdraw amount : "+ amount +", New balance after withdraw: "+balance);
            return true;
        }else{
        
            System.out.println("Insufficient balance");
            return false;
        }
        
    }
   
   
}   
