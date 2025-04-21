package preparationfor1stmonthlyexamincorejava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter a Number");
        int numbers = p.nextInt();

        int count = 0;

        for (int i = 1; i <= numbers; i++) {

            if (numbers % i == 0) {

                count++;

            }

        }
        if (count == 2){
            System.out.println(numbers + " is a prime number");
        } else {
            System.out.println(numbers + " is not a prime number");
        }

    }

}
