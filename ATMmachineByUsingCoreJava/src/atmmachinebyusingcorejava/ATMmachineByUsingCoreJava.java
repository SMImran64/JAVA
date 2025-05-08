package atmmachinebyusingcorejava;

import java.util.Scanner;

public class ATMmachineByUsingCoreJava {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ATMMachine atm = new ATMMachine("Md.Imran Mia", "I1287829N", 11000000, 1287829);
     
        boolean status = true;

        while (status) {
            System.out.println("\n=== Menu ===\n1.check Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Change Pin\n5.Exit");        
            System.out.print("Choose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your PIN: ");
                    int pin = s.nextInt();
                    atm.checkBalance(pin);
                    status = false;
                    break;
                case 2:
                    System.out.print("Enter your PIN: ");
                    pin = s.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = s.nextDouble();
                    atm.withdraw(pin, withdrawAmount);
                    status = false;
                    break;
                case 3:
                    System.out.print("Enter your PIN: ");
                    pin = s.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = s.nextDouble();
                    atm.deposit(pin, depositAmount);
                    status = false;
                    break;
                case 4:
                    System.out.print("Enter your PIN: ");
                    pin = s.nextInt();
                    System.out.print("Enter new PIN: ");
                    int newPin = s.nextInt();
                    atm.changePin(pin, newPin);
                    status = false;
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    status = false;
                    break;
                default:
                    s.close();
                    System.out.println("Invalid option. Please try again.");
                    status = false;
            }
        }

    }
}
