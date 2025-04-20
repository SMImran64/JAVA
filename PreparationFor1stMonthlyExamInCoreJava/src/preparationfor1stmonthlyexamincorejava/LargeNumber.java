package preparationfor1stmonthlyexamincorejava;

import java.util.Arrays;
import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter your limit");

        int limit = l.nextInt();

        int[] arrays = new int[limit];

        for (int index = 0; index < arrays.length; index++) {
            System.out.println("Enter Array Value" + (index + 1));

            int userValue = l.nextInt();

            arrays[index] = userValue;

        }

        System.out.println(Arrays.toString(arrays));

        int maxValue = arrays[0];
        int minValue = arrays[0];

        for (int number : arrays) {

            if (number > maxValue) {

                maxValue = number;

            }
            if (number < minValue) {

                minValue = number;
            }

        }
        System.out.println(maxValue + " is the large Number");
        System.out.println(minValue + " is the Lower Number");
    }

}
