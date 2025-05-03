 
package bankaccountmanagementsystem;


public class BankAccountManagementSystem {

  
    public static void main(String[] args) {
       
        SavingAccount s = new SavingAccount(0.10, "imran7829", "Md. Imran Mia", 5000000);
        System.out.println("Saving Account: "+s.getAccountNumber());
        System.out.println("Account Holder Name: "+s.getAccountHolderName());        
        s.deposit(100000);
        s.withdraw(1000000);
        s.addInterest();
        System.out.println("Final Balance: "+s.getBalance());
        
    }
    
}
