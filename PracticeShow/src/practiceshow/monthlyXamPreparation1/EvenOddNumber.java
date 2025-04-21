package practiceshow.monthlyXamPreparation1;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int userInput = n.nextInt();

        if (userInput % 2 == 0) {

            System.out.println(userInput + " is a even number");
        } else {
            System.out.println(userInput + " is a odd number");
        }

    }
}
