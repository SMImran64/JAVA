package classtestbyrandomquestion;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);

        System.out.println("Enter your number");

        int userInput = f.nextInt();

        int number1 = 0;
        int number2 = 1;
        int sum = 0;

        System.out.println(number1);
        System.out.println(number2);

        for (int i = 3; i <= userInput; i++) {

            sum = number1 + number2;
          
            number1 = number2;
            System.out.println(sum);
            number2 = sum;

        }

    }
}
