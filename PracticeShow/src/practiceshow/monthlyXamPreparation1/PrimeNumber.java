package practiceshow.monthlyXamPreparation1;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = p.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " is prime number");

        } else {
            System.out.println(number + " is not prime number");
        }

    }

}
