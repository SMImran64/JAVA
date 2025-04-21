package classtestbyrandomquestion;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesShort2 {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.println("Enter your limit");

        int limit = b.nextInt();

        int arrayValues[] = new int[limit];

        for (int item = 0; item < arrayValues.length; item++) {

            System.out.println("Enter your Array Value" + (item + 1));

            int userInput = b.nextInt();

            arrayValues[item] = userInput;

        }

        System.out.println(Arrays.toString(arrayValues));

        for (int r = 0; r <= arrayValues.length - 1; r++) {
            for (int s = 0; s <= arrayValues.length - r - 1; s++) {

                if (arrayValues[s] > arrayValues[s + 1]) {

                    int temp = arrayValues[s];

                    arrayValues[s] = arrayValues[s + 1];

                    arrayValues[s + 1] = temp;

                }

            }
        }
        
        System.out.println("The bubbles Shot is : "+Arrays.toString(arrayValues));
    }

}
