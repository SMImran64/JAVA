package realbankaccountsystem;

public class RealBankAccountSystem {

    public static void main(String[] args) {

        CurrentAccount c = new CurrentAccount();

        c.setAccountNumber("Imran12");
        c.setBalance(50000);

        System.out.println(" Account Number: " + c.getAccountNumber());
        System.out.println("Beginning Balance: " + c.getBalance());
        c.deposit(50000);
        System.out.println("Balance after adding deposit: "+c.getBalance());
        c.setOverdraftLimit(20000);
        System.out.println("overdraft limit amount: " + c.getOverdraftLimit());
        c.withdrew(120000);

        System.out.println("Final Balance: " + c.getBalance());


    }

}
