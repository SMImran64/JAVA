package midlevelquestion12;

public class PremiumAccountHolder extends AccountHolder {

    public PremiumAccountHolder() {
    }

    public PremiumAccountHolder(String name, String accountNumber) {
        super(name, accountNumber);
    }

    @Override
    public double calculateTransactionFee(double amount) {

        double tFee = amount * 0.05;
        double discount = tFee * 0.7;
        double actualFee = tFee - discount;
        return actualFee;

    }

    @Override
    public String toString() {
        return "PremiumAccountHolder{" + '}';
    }

}
