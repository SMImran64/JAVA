package guesingluckynumberforgame;

import java.util.Scanner;

public class GuesingLuckyNumberForGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ranNum = (int) (Math.random() * 10);
        int count = 1;

        while (count < 4) {
            System.out.println("Enter your guess number like as 0-9 into three times");

            int value = input.nextInt();

            if (value == ranNum) {
                System.out.println("Congrats You won game");
                break;
            } else {
                count++;
                System.out.println("Opps!! You lost the game");
                if (value > ranNum) {
                    System.out.println("Your value is greater than the ranNum value");
                } else {
                    System.out.println("Your value is lower than the ranNum value");
                }
            }
        }

    }

}
