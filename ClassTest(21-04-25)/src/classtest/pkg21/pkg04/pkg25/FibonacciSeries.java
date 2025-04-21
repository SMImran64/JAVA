package classtest.pkg21.pkg04.pkg25;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);

        System.out.println("Enter your number");

        int number = f.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 3; i <= number; i++) {

            sum = num1 + num2;

            num1 = num2;

            System.out.println(sum);
            num2 = sum;

        }

    }

}
