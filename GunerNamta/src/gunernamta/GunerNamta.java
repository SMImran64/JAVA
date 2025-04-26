package gunernamta;

import java.util.Scanner;

public class GunerNamta {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = s.nextInt();

        if (number == 2) {

            System.out.println("The dubplex is given below ");
            System.out.println(" 2*1 = " + (number * 1) + "\n 2*2 = " + (number * 2) + "\n 2*3 = " + (number * 3) + "\n 2*4 = "
                    + (number * 4) + "\n 2*5 = " + (number * 5) + "\n 2*6 = " + (number * 6) + "\n 2*7 = " + (number * 7) + "\n 2*8 = "
                    + (number * 8) + "\n 2*9 = " + (number * 9) + " \n 2*10 = " + (number * 10));
        }

    }

}
