package classexampremonthly;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNumberFromUserInput {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Enter limit");

        int limit = l.nextInt();

        int[] userArray = new int[limit];

        for (int index = 0; index < userArray.length; index++) {

            System.out.println("Enter row value");

            int userValue = l.nextInt();

            userArray[index] = userValue;
        }

        System.out.println(Arrays.toString(userArray));

        int max = userArray[0];
        int min = userArray[0];

        for (int userValue : userArray) {

            if (userValue > max) {

                max = userValue;
            }
            if (userValue < min) {
                min = userValue;
            }

        }
        System.out.println(max + " is the max number");
        System.out.println(min + " is the min number");

    }

}
