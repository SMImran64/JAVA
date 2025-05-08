package atmmachinebyusingcorejava;

public class BankAccountClass {

    protected String accountHolderName;
    protected String accountNumber;
    protected long balance;
    protected int pin;

    public BankAccountClass() {
    }

    public BankAccountClass(String accountHolderName, String accountNumber, long balance, int pin) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
        //Pin Number Verify
    
    protected boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

//      checkBalance amount
    
    public void checkBalance(int enteredPin) {
        if (verifyPin(enteredPin)) {
            System.out.println("\n Account Number: "+accountNumber+"\n Account Holder Name: "+accountHolderName+"\n Your current balance: " + balance);
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }

    //       withdraw amount
    public void withdraw(int enteredPin, double amount) {
        if (verifyPin(enteredPin)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw successful! Amount withdrawn: " + amount);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
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
                System.out.println("Deposit successful!Deposite Amount: " + amount);
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Invalid Deposit Amount.");
            }
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }

    @Override
    public String toString() {
        return "BankAccountClass{" + "accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance=" + balance + ", pin=" + pin + '}';
    }
    
    
    
}
