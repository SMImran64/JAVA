package practicesession;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Enter your number");

        int prime = p.nextInt();

        int occur = 0;

        for (int i = 1; i <= prime; i++) {

            if (prime % i == 0) {
                occur++;

            }
        }
        if (occur == 2) {

            System.out.println(prime + " is a prime number");

        } else {
            System.out.println(prime + " is not a prime number");

        }
    }
}
