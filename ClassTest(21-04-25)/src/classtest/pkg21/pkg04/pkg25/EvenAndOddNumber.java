package classtest.pkg21.pkg04.pkg25;

import java.util.Scanner;

public class EvenAndOddNumber {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Enter a number");

        int numbers = e.nextInt();

        if (numbers % 2 == 0) {

            System.out.println(numbers + "is a even number");
        } else {
            System.out.println(numbers + "is a odd number");
        }

    }

}
