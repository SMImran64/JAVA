package practiceshow.monthlyXamPreparation1;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesShort {

    public static void main(String[] args) {
        
        Scanner b = new Scanner(System.in);

        System.out.println("Enter row limit");

        int limit = b.nextInt();

        int[] arrayValue = new int[limit];

        for (int i = 0; i < arrayValue.length; i++) {

            System.out.println("Enter Array Value");

            int userInput = b.nextInt();

            arrayValue[i] = userInput;

        }

        System.out.println(Arrays.toString(arrayValue) + " ");

        for (int r = 0; r < arrayValue.length - 1; r++) {
            for (int s = 0; s < arrayValue.length - r - 1; s++) {

                if (arrayValue[s] > arrayValue[s + 1]) {

                    int temp = arrayValue[s];

                    arrayValue[s] = arrayValue[s + 1];

                    arrayValue[s + 1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(arrayValue) + " ");

    }

}
