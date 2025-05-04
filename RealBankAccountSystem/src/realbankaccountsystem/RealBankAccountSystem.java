package realbankaccountsystem;

public class RealBankAccountSystem {

    public static void main(String[] args) {

        SavingAccount savings = new SavingAccount(0.10, "Imran29", 500);
//        CurrentAccount current = new CurrentAccount("CA1002", 500.0, 2000.0);
//
        // Demonstrate SavingsAccount operations
        System.out.println("=== Savings Account Operations ===");
       
        System.out.println(savings.deposit(500.0));
        savings.setInterestRate(0.10);
        
        System.out.println(savings.addInterestAmount());
        System.out.println(savings.withdraw(200.0));
        System.out.println(savings.withdraw(2000.0)); // Should fail
        System.out.println(savings.printDetails());
//
//        System.out.println("\n=== Current Account Operations ===");
//        System.out.println(current.printDetails());
//        System.out.println(current.deposit(1000.0));
//        System.out.println(current.withdraw(2000.0)); // Within overdraft limit
//        System.out.println(current.withdraw(1000.0)); // Should fail
//        System.out.println(current.printDetails());

       
       

    }

}
