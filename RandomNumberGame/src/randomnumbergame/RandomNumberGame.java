package randomnumbergame;

import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {

        Scanner g = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);

        int count = 0;

        while (count <= 3) {
            System.out.println("Enter Your Guess Number b2in 0-9 max three times");
            int value = g.nextInt();

            if (value == randomNumber) {

                System.out.println("Tumi Jitta Gecho");
                break;
            } else {
                System.err.println("Tumi Hairra Gecho");
                count++;
                if (value > randomNumber) {
                    System.out.println("Tumi randomNumber theke boro Number decho");
                } else {
                    System.out.println("Tumi randomNumber Theke sodo Number dechO");
                }

            }
        }

    }

}
