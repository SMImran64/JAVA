package insertvaulein2darrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertVauleIn2DArrays {

    public static void main(String[] args) {
        
         Scanner arrays = new Scanner(System.in);
         
         System.out.println("Enter row limit");
         
         int rowLimit = arrays.nextInt();
         
         System.out.println("Enter col Limit");
         
         int colLimit = arrays.nextInt();
         
          int[][] x = new int[rowLimit][colLimit];

          System.out.println("Enter value for X");

        for (int row = 0; row < rowLimit; row++) {
            for (int col = 0; col < colLimit; col++) {

                System.out.printf("X [%d][%d]= ", row, col);

                x[row][col] = arrays.nextInt();

            }

        }
          System.out.println(" X = ");
        
        for (int row = 0; row < rowLimit; row++) {
            for (int col = 0; col < colLimit; col++) {

                System.out.print(" " + x[row][col]);

            }
            System.out.println("");

        }
        

//        int rows = 3, cols = 3;
//        int[][] arr = new int[rows][cols];
//
//        System.out.println("Enter 9 elements:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("2D Array:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
    }

}
