package classexampremonthly;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.println("Enter number");

        int input = f.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 3; i <= input; i++) {

            sum = num1 + num2;

            System.out.println(sum);

            num1 = num2;
            num2 = sum;

        }
    }

}
