package midtrumexam2;

import java.util.Scanner;

public class FibonacciSeriesQuestion3 {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.println("Enter limit");

        int numbers = f.nextInt();

        System.out.println("The fibonacci Series is : ");

        int number1 = 0;
        int number2 = 1;

        int sum = 0;

        System.out.println(number1);
        System.out.println(number2);

        for (int i = 3; i <= numbers; i++) {

            sum = number1 + number2;

            System.out.println(sum);

            number1 = number2;
            number2 = sum;

        }

    }

}
