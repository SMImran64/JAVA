
package midlevelquestionNo7;


public class AccountClass2 {
    
    protected String accountNumber;
    protected long balance;

    public AccountClass2() {
    }

    public AccountClass2(String accountNumber, long balance) {
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
    
    public boolean deposit(long amount){
    
      if(amount>0){
          
          balance += amount;
          System.out.println("The deposit amount: "+amount);
          System.out.println("Balace after deposit: "+balance);
           return true;
      }else{
      
          System.out.println("Invalid deposit amount!!");
      return false;
      }
    
    }
    
    public boolean withdraw(int amount){
    
    return true;
    }
    
    public  String pintDetails(){
    
            return "\n Account Number: "+accountNumber+"\n Balance: "+balance;
    
    
    }
    
    
}
