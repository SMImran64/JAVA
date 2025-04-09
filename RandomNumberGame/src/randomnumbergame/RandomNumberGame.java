package randomnumbergame;

import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {

        Scanner g = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        System.out.println("" + randomNumber);

        int count = 0;

        while (count < 3) {
            System.out.println("Enter Your Guess");
            int value = g.nextInt();

            if (value == randomNumber) {
                System.out.println("You Win");
                break;
            } else if (value > randomNumber && count < 2) {

                System.out.println("You input large Number");

            } else if (randomNumber > value && count < 2) {
                System.out.println("You input Small Number");
            }
            if (count == 2) {
                System.err.println("You lost the game");
            }
            count++;
        }
    }

}
