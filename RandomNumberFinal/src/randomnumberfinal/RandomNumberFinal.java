package randomnumberfinal;

import java.util.Scanner;

public class RandomNumberFinal {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        int randomNumber = (int) Math.random() * 10;
        System.out.println("Random Number ;" + randomNumber);

        int count = 0;
        while (count < 3) {
            System.out.println("Enter your lucky Number");
            int userValue = r.nextInt();

            if (userValue == randomNumber) {

                System.out.println("You Win the day");
                
                break;
            } else if (userValue > randomNumber && count < 2) {
                System.out.println("Guess Number is larger");
            } else if (userValue < randomNumber && count < 2) {

                System.out.println("Guess Number is Lower");
            }
            if (count == 2) {

                System.err.println("Opps!! Unlucky try latter");

            }
            count++;
        }

    }

}
