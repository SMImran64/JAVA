package usecontinueoparator;

import java.util.Scanner;

public class UseContinueOparator {

    public static void main(String[] args) {

        Scanner g = new Scanner(System.in);
        int targetValue = g.nextInt();

        int count = 1;

        while (count <= targetValue) {

            if (count % 10 == 0 && count % 5 == 0) {

                count++;
                continue;
            }
            System.out.println("The value is : " + count);

            count++;
        }
    }

}
