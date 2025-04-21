package classtest.pkg21.pkg04.pkg25;

import java.util.Scanner;

public class PositiveNegativeAndZero {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter a number");

        int userValue = n.nextInt();

        if (userValue > 0) {

            System.out.println(userValue + " is a positive Number");
        } else if (userValue < 0) {
            System.out.println(userValue + " is a Negative Number");
        } else {
            System.out.println(userValue + " is a Zero ");
        }
    }
}
