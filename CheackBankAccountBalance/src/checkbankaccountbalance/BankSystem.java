package checkbankaccountbalance;

public class BankSystem {
    
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(0.10, "Imran7829", 40000);

        System.out.println("Account Number: " + s.getAccountNumber());
        System.out.println("Initial Balance: " + s.getBalance());
        s.deposit(5000);
        System.out.println("After Deposit of 5000: " + s.getBalance());
        s.addInterest();
        System.out.println("After Interest Added: " + s.getBalance());
        s.withdraw(10000);
        System.out.println("After Withdrawal of 10000: " + s.getBalance());
        s.withdraw(40000); 
        System.out.println("Final Balance: " + s.getBalance());
       
    }
    
}
