package classtestbyrandomquestion;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesShort {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter your limit");

        int limit = b.nextInt();

        int[] myArray = new int[limit];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter your value");
            int userInput = b.nextInt();

            myArray[i] = userInput;
        }

        System.out.println(" " + Arrays.toString(myArray));

        for (int round = 0; round < myArray.length - 1; round++) {

            for (int step = 0; step < myArray.length - round - 1; step++) {

                if (myArray[step] > myArray[step + 1]) {

                    int temp = myArray[step];
                    myArray[step] = myArray[step + 1];
                    myArray[step + 1] = temp;
                }
            }
        }

        System.out.println("The bubbles Sort is : " + Arrays.toString(myArray));

    }

}
