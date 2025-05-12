
package midlevelquestion12;


public class AccountCategory {
    
    public static void main(String[] args) {
        
        
        RegularAccountHolder regular = new RegularAccountHolder();
        regular.setAccountNumber("Imran29");
        regular.setName("Muhammad Imran Hossain");
        System.out.println("\n "+regular.getAccountNumber()+"\n "+regular.getName());
     
        System.out.println(" The transaction Fee: "+regular.calculateTransactionFee(20000));
        
        
        PremiumAccountHolder primium = new PremiumAccountHolder("Faruk Ahmed", "F124K");
        
        System.out.println("\n "+primium.getAccountNumber()+"\n "+primium.getName());
        System.out.println(" The Transaction Fee After Discount: "+primium.calculateTransactionFee(20000));
    }

   
    
}
