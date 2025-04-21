package classtest.pkg21.pkg04.pkg25;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinNumber {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Enter your limit");

        int limit = l.nextInt();

        int arrayValues[] = new int[limit];

        for (int item = 0; item < arrayValues.length; item++) {

            System.out.println("Enter your Array Value" + (item + 1));

            int userInput = l.nextInt();

            arrayValues[item] = userInput;

        }

        System.out.println(Arrays.toString(arrayValues));

        int largeNumber = arrayValues[0];
        int smallNumber = arrayValues[0];

        for (int number : arrayValues) {

            if (number > largeNumber) {

                largeNumber = number;

            }
            if (number < smallNumber) {

                smallNumber = number;

            }

        }

        System.out.println(largeNumber + " is a large number");
        System.out.println(smallNumber + " is a Small number");
    }

}
