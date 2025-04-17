package findmaxandminnumberamongfivevalue;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxAndMinNumberAmongFiveValue {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("Enter limit");

        int size = n.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {

            System.out.println("Enter numbers " + (index + 1));
            int userValue = n.nextInt();

            numbers[index] = userValue;

        }

        System.out.println("Arrays input Value " + Arrays.toString(numbers));

        int maxNUmber = numbers[0];
        int minNUmber = numbers[0];

        for (int number : numbers) {

            if (number > maxNUmber) {

                maxNUmber = number;
            }

            if (number < minNUmber) {

                minNUmber = number;
            }

        }

        System.out.println("The Max Number = " + maxNUmber);
        System.out.println("The Min Number = " + minNUmber);

    }

}
