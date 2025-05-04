
package realbankaccountsystem;


public class AccountClass {
    
    protected String accountNumber;
    protected long balance;

    public AccountClass() {
    }

    public AccountClass(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    public void deposit(int amount){
     if(amount > 0){
        
            balance += amount;
            System.out.println("Deposit: "+amount +", New balance: "+balance);
        }else{
        
            System.out.println("Invalid deposit amount");
        
        }
    }
    
    public boolean withDraw(int amount){
    
       if(amount > 0 && balance >= amount){
        
            balance -= amount;
            System.out.println("Withdraw amount : "+ amount +", New balance after withdraw: "+balance);
            return true;
        }else{
        
            System.out.println("Insufficient balance");
            return false;
        }
    
    }
    
    public void accountDetails(){
    
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance  : "+balance);
        
    
    }
}
