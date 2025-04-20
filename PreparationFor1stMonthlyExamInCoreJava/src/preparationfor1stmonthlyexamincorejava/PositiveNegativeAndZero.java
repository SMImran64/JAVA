package preparationfor1stmonthlyexamincorejava;

import java.util.Scanner;

public class PositiveNegativeAndZero {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a value");
        int number = n.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is Negative number");
        } else {
            System.out.println(number + " is a Zero");
        }
    }

}
