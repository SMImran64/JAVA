package makecalculatorusingswitch;

import java.util.Scanner;

public class MakeCalculatorUsingSwitch {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Enter First Value");

        double value1 = c.nextDouble();

        System.out.println("Enter Second value");

        double value2 = c.nextDouble();

        System.out.println("Enter your choice +,-,*,/");

        String choice = c.next();

        double result = 0;

        switch (choice) {
            case "+":
                result = value1 + value2;

                break;
            case "-":
                result = value1 - value2;

                break;
            case "*":
                result = value1 * value2;

                break;
            case "/":
                result = value1 / value2;

                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("The result :" + result);

    }

}
