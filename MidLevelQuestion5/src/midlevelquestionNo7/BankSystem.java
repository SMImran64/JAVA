
package midlevelquestionNo7;


public class BankSystem {
    
    public static void main(String[] args) {
        
//        SavingAccount s = new SavingAccount();
//        
//        s.setAccountNumber("Imran78");
//        s.setBalance(500000);
//        s.setInterestRate(0.10f);
//        s.deposit(10000);
//       
//        
//        System.out.println(s.pintDetails());
        
        CurrentAccount2 c = new CurrentAccount2(25000, "Imran78", 100000);
        
        c.withdraw(120000);
        
        System.out.println(c.pintDetails());
        
        
        
    }
    
}
