
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.println("Enter optimum Number");

        int userInput = f.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 3; i <= userInput; i++) {

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);

        }

    }

}
