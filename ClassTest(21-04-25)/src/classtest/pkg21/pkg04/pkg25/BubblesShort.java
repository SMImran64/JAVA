 package classtest.pkg21.pkg04.pkg25;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesShort {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.println("Enter Arrays limit");

        int size = b.nextInt();

        int myArrays[] = new int[size];

        for (int index = 0; index < myArrays.length; index++) {
            System.out.println("Enter Arrays Value"+(index+1));

            int userInput = b.nextInt();

            myArrays[index] = userInput;

        }
        System.out.println(Arrays.toString(myArrays));

        for (int r = 0; r < myArrays.length - 1; r++) {

            for (int s = 0; s < myArrays.length - r - 1; s++) {

                if (myArrays[s] > myArrays[s + 1]) {

                    int temp = myArrays[s];

                    myArrays[s] = myArrays[s + 1];

                    myArrays[s + 1] = temp;
                }

            }

        }
        System.out.println("The bubbles Shorting :" + Arrays.toString(myArrays));

    }

}
