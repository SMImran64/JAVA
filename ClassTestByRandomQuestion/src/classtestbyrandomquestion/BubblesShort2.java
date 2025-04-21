package classtestbyrandomquestion;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesShort2 {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.println("Enter your limit");

        int limit = b.nextInt();

        int[] userArray = new int[limit];

        for (int index = 0; index < userArray.length; index++) {

            System.out.println("Enter your Array value");
            int userValue = b.nextInt();

            userArray[index] = userValue;

        }
        System.out.println(" " + Arrays.toString(userArray));

        for (int r = 0; r < userArray.length - 1; r++) {
            for (int s = 0; s < userArray.length - r - 1; s++) {
                if (userArray[s] > userArray[s + 1]) {

                    int temp = userArray[s];
                    userArray[s] = userArray[s + 1];
                    userArray[s + 1] = temp;

                }
            }
        }
        System.out.println(" " + Arrays.toString(userArray));
    }

}
