package preparationfor1stmonthlyexamincorejava;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargeNumberAmongUserInput {

    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.println("Enter your limit");

        int limit = m.nextInt();

        int numbers[] = new int[limit];

        for (int index = 0; index < limit; index++) {
            System.out.println("Enter your value " + (index + 1));

            int userValue = m.nextInt();

            numbers[index] = userValue;

        }

        System.out.println((" \n My Arrays : " + Arrays.toString(numbers)) + ("\n"));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        for (int index = 0; index < numbers.length; index++) {

            maxNumber = (numbers[index] > maxNumber) ? numbers[index] : maxNumber;
            minNumber = (numbers[index] < minNumber) ? numbers[index] : minNumber;

        }

        System.out.println("The Max Number is " + maxNumber);
        System.out.println("The Min Number is " + minNumber);

    }
}
