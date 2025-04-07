package mojargame;

import java.util.Scanner;

public class MojarGame {

    public static void main(String[] args) {

        Scanner g = new Scanner(System.in);

        System.out.println("Enter your Lucky Number into 0-9");

        int game = (int) (Math.random() * 10);

        int lucky = g.nextInt();

        if (lucky == game) {

            System.out.println("Your are Win");
        } else {
            System.out.println(lucky + " Your are  Unlucky");
        }

    }

}
