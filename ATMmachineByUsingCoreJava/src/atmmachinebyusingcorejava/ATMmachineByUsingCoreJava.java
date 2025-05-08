package atmmachinebyusingcorejava;

import java.util.Scanner;

public class ATMmachineByUsingCoreJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ATMMachine atm = new ATMMachine(1000.00, 1234);

        while (true) {
            System.out.println("\n=== Menu ===\n1.check Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Change Pin\n5.Exit");
//           
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance(pin);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(pin, withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(pin, depositAmount);
                    break;
                case 4:
                    System.out.print("Enter new PIN: ");
                    int newPin = scanner.nextInt();
                    atm.changePin(pin, newPin);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();      
    }
}
