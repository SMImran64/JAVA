package twodimentionalarray;

import java.util.Scanner;

public class TwoDimentionalArray2 {

    public static void main(String[] args) {

        Scanner arrays = new Scanner(System.in);

        int[][] x = new int[2][3];
        int[][] y = new int[2][3];
        int[][] result = new int[2][3];

//           input value for Array X
        System.out.println("Enter value for X");

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.printf("X [%d][%d]= ", row, col);

                x[row][col] = arrays.nextInt();

            }

        }
        //           input value for Array Y

        System.out.println("Enter value for Y ");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Y [%d][%d]= ", row, col);
                y[row][col] = arrays.nextInt();

            }

        }

//        output value of X Array
        System.out.println(" X = ");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(" " + x[row][col]);

            }
            System.out.println("");

        }
        //        output value of Y Array
        System.out.println(" Y = ");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(" " + y[row][col]);

            }
            System.out.println("");

        }
        
        System.out.println("\n\n");
        System.out.println(" X+Y = ");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                result[row][col] = (x[row][col] + y[row][col]);
                
                System.out.print(" \t"+(result[row][col]));

            }
            System.out.println("");

        }
        
        

      
        }

    }
