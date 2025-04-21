package practiceshow.monthlyXamPreparation1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinNumber {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("Enter your number limit");

        int limit = m.nextInt();

        int myArrays[] = new int[limit];

        for (int index = 0; index < myArrays.length; index++) {

            System.out.println("Enter your number value" + (index + 1));

            int userValue = m.nextInt();

            myArrays[index] = userValue;

        }

        System.out.println(Arrays.toString(myArrays));

        int largeNumber = myArrays[0];
        int smallNumber = myArrays[0];

        for (int number : myArrays) {

            if (number > largeNumber) {

                largeNumber = number;
            }

            if (number < smallNumber) {

                smallNumber = number;
            }

        }

        System.out.println(largeNumber + " is large Number");
        System.out.println(smallNumber + " is Small Number");
    }

}
