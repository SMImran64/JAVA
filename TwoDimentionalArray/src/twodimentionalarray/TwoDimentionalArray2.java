package twodimentionalarray;

import java.util.Scanner;

public class TwoDimentionalArray2 {

    public static void main(String[] args) {

        Scanner arrays = new Scanner(System.in);

        int[][] x = new int[2][3];
        int[][] y = new int[2][3];

        System.out.println("Enter value for X");

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                x[row][col] = arrays.nextInt();

            }

        }
        System.out.println("Enter value for Y ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                y[row][col] = arrays.nextInt();

            }

        }
        System.out.println(" X = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(" "+ x [row][col]);

            }
            System.out.println("");

        }
        System.out.println(" Y = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(" "+ y [row][col]);

            }
            System.out.println("");

        }

    }

}
