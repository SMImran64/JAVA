package practicesession;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesSort {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter your limit ");

        int limit = b.nextInt();

        int[] myArray = new int[limit];

        for (int index = 0; index < myArray.length; index++) {

            System.out.println("Enter your array value");
            int userValue = b.nextInt();

            myArray[index] = userValue;

        }
        System.out.println(Arrays.toString(myArray) + " ");

        for (int r = 0; r < myArray.length - 1; r++) {

            for (int s = 0; s < myArray.length - 1 - r; s++) {

                if (myArray[s] > myArray[s + 1]) {

                    int temp = myArray[s];
                    myArray[s] = myArray[s + 1];
                    myArray[s + 1] = temp;

                }
            }
        }

        System.out.println("The bubbles Sort is :" + Arrays.toString(myArray));
    }
}
