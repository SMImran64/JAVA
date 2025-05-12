
package midlevelquestion12;


public class RegularAccountHolder extends AccountHolder{

    public RegularAccountHolder() {
    }

    public RegularAccountHolder(String name, String accountNumber) {
        super(name, accountNumber);
    }

    @Override
    public double calculateTransactionFee(double amount) {

        double tFee = amount*0.02;
        return tFee;

    }

    @Override
    public String toString() {
        return "RegularAccountHolder{" + '}';
    }

    
    
    
}
