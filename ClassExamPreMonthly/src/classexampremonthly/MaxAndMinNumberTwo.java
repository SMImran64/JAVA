package classexampremonthly;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinNumberTwo {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("Enter limit");

        int limit = n.nextInt();

        int[] numbers = new int[limit];

        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Enter value" + (index + 1));

            int userInput = n.nextInt();

            numbers[index] = userInput;

        }

        System.out.println(Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            maxNumber = (numbers[i] > maxNumber) ? numbers[i] : maxNumber;
            minNumber = (numbers[i] < minNumber) ? numbers[i] : minNumber;

        }
        System.out.println(maxNumber + " is max Number");
        System.out.println(minNumber + " is min number");
    }

}
