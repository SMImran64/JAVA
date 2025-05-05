package realbankaccountsystem;

public class RealBankAccountSystem {

    public static void main(String[] args) {

        CurrentAccount c = new CurrentAccount();

        c.setAccountNumber("Imran12");
        c.setBalance(50000);

        System.out.println(" Account Number: " + c.getAccountNumber());
        c.deposit(50000);
        c.setOverdraftLimit(20000);
        System.out.println("overdraft limit amount: " + c.getOverdraftLimit());
        c.withdrew(80000);

        System.out.println("Final Balance: " + c.getBalance());
        
//        SavingAccount s = new SavingAccount();
//        
//        s.setAccountNumber("Imran29");
//        System.out.println(s.getAccountNumber());
//        s.setBalance(50000);
//        System.out.println("Balance before adding Interest: "+s.getBalance());
//        s.deposit(25000);
//        System.out.println("Deposite Amount: "+s.getBalance());
//        s.setInterestRate(0.10);
//        s.addInterestAmount();
//        System.out.println("Final Amount After Adding Interest: "+s.printDetails());

    }

}
