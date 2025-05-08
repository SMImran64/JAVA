package atmmachinebyusingcorejava;

public class ATMMachine extends BankAccountClass {

    public ATMMachine(double balance, int pin) {
        super(balance, pin);
    }

    // Method to change the  PIN Number
    public void changePin(int oldPin, int newPin) {
        if (verifyPin(oldPin)) {
            this.pin = newPin;
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }

    @Override
    public void deposit(int enteredPin, double amount) {
        super.deposit(enteredPin, amount);
    }

    @Override
    public void withdraw(int enteredPin, double amount) {
        super.withdraw(enteredPin, amount);
    }

    @Override
    public void checkBalance(int enteredPin) {
        super.checkBalance(enteredPin);
    }

    @Override
    protected boolean verifyPin(int enteredPin) {
        return super.verifyPin(enteredPin);
    }

}
