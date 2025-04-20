
import java.util.Arrays;
import java.util.Scanner;

public class FindLargeNumber {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter limit");

        int limit = l.nextInt();

        int[] userArrays = new int[limit];

        for (int index = 0; index < userArrays.length; index++) {
            System.out.println("Enter arrays value");

            int userInput = l.nextInt();

            userArrays[index] = userInput;
        }

        System.out.println(Arrays.toString(userArrays));

        int maxNumber = userArrays[0];
        int minNumber = userArrays[0];

        for (int userInput : userArrays) {

            if (userInput > maxNumber) {

                maxNumber = userInput;
            }
            if (userInput < minNumber) {

                minNumber = userInput;
            }
        }
        System.out.println(maxNumber + " is a large Number");
        System.out.println(minNumber + " is a lower Number");
    }

}
