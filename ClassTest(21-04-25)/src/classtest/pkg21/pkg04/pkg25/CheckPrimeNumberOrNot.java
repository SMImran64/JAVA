package classtest.pkg21.pkg04.pkg25;

import java.util.Scanner;

public class CheckPrimeNumberOrNot {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Enter your number");

        int userValue = p.nextInt();

        int occur = 0;

        for (int i = 1; i <= userValue; i++) {

            if (userValue % i == 0) {

                occur++;
            }
        }
        if (occur == 2) {

            System.out.println(userValue + " is a prime number");

        } else {
            System.out.println(userValue + " is not a prime number");

        }
    }

}
