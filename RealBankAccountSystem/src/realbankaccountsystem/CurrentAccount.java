package realbankaccountsystem;

public class CurrentAccount extends AccountClass {

    protected double overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(double overdraftLimit, String accountNumber, long balance) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdrew(int amount) {

        if (amount > 0 && (balance - amount) >= -overdraftLimit) {

            balance -= amount;

            System.out.println("Withdrew amount: " + amount);

            System.out.println("New Balance After withdrew: " + balance);
            return true;
        } else {

            System.out.println("Withdrew amount exceeds overdraft limit");
            return false;
        }
    }

    @Override
    public void deposit(int amount) {

        double deposit = amount;

        balance += amount;

        System.out.println("Balance after deposit: " + balance);

    }

    @Override
    public void printDetails() {
        super.printDetails();
        super.deposit()
    }

    

}
