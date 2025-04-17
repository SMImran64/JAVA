package sumofdiagonalupperlowerelementmatrix;

import java.util.Scanner;

public class SumOfDiagonalUpperlowerElementMatrix {

    public static void main(String[] args) {

        Scanner matrix = new Scanner(System.in);

        int[][] myArrays = new int[3][3];

        int diagonalSum = 0;
        int upperSum = 0;
        int lowerSum = 0;

        
//        getting input of myArrays

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("value of myArrays [%d][%d] ", row, col);

                myArrays[row][col] = matrix.nextInt();

            }

        }
//        output of myArrays

        System.out.println("\n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + myArrays[row][col]);

            }
            System.out.println("");

        }
//        Start sum of diagonal , upper and lower triangle

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    diagonalSum = diagonalSum + myArrays[row][col];

                }
                if (row < col) {
                    upperSum = upperSum + myArrays[row][col];

                }
                if (row > col) {
                    lowerSum = lowerSum + myArrays[row][col];

                }

            }
        }
        
//        result of the sums

        System.out.println("The sum Of diagonal Element "+diagonalSum);
        System.out.println("The sum Of upper Element "+upperSum);
        System.out.println("The sum Of lower Element "+lowerSum);

    }

}
