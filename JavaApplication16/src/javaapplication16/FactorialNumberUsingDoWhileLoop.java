package javaapplication16;

import java.util.Scanner;

public class FactorialNumberUsingDoWhileLoop {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);

        int input;
        int count = 1;
        long factorial = 1;

         System.out.println("Enter Input value");

        input = f.nextInt();

        if (input < 0) {

            System.out.println("Enter positive Number ");
        } else {

            do {
                factorial *= count;
                count++;

            } while (count <= input);

        }

        System.out.println("The Factorial Number is: " + factorial);

    }

}
