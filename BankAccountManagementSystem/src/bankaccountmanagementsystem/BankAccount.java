package bankaccountmanagementsystem;

public class BankAccount {

    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
    
        if(amount > 0){
        
            balance += amount;
            System.out.println("Deposit: "+amount +", New balance: "+balance);
        }else{
        
            System.out.println("Invalid deposit amount");
        
        }
    }
    
    public boolean withdraw(double amount){
    
        if(amount > 0 && balance >= amount){
        
            balance -= amount;
            System.out.println("Withdraw amount : "+ amount +", New balance after withdraw: "+balance);
            return true;
        }else{
        
            System.out.println("Insufficient balance");
            return false;
        }
    
    }
    public double getBalance(){
    
        return balance;
    
    }
    public String getAccountNumber(){
    
        return accountNumber;
    }
    
    
    
  
}
