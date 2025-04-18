
import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Enter a number");
        int value = p.nextInt();

        int occur = 0;

        for (int j = 1; j <= value; j++) {

            if (value % j == 0) {
                occur++;

            }

        }

        if (occur == 2) {

            System.out.println(value + " is a prime number");
        } else {
            System.out.println(value + " is not a prime number");
        }
    }

}
