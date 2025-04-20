package classexampremonthly;

import java.util.Scanner;

public class ClassExamPreMonthly {

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

            System.out.println(number + " is a prime Number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

}
