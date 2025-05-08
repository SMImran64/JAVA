package atmmachinebyusingcorejava;

public class BankAccountClass {

    protected double balance;
    protected int pin;

    public BankAccountClass(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    protected boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

//      checkBalance amount
    
    public void checkBalance(int enteredPin) {
        if (verifyPin(enteredPin)) {
            System.out.println("Your current balance: " + balance);
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }

    //       withdraw amount
    public void withdraw(int enteredPin, double amount) {
        if (verifyPin(enteredPin)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdra successful! Amount withdrawn: " + amount);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("insufficient balance.");
            }
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }

    //  deposit amount
    public void deposit(int enteredPin, double amount) {
        if (verifyPin(enteredPin)) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful! Amount deposited: " + amount);
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Invalid amount. Please enter a positive amount.");
            }
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }
}
