package insertvaulein2darrays;

import java.util.Arrays;
import java.util.Scanner;

public class ValueInsertIntwoDimentionalArrays {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter row limit");

        int rowValue = a.nextInt();

        System.out.println("Enter column value");

        int colValue = a.nextInt();

        int[][] myArrays = new int[rowValue][colValue];

        for (int row = 0; row < myArrays.length; row++) {

            for (int col = 0; col < myArrays[row].length; col++) {

                System.out.println("Enter value [%d][%d] ");

                int userInput = a.nextInt();

                myArrays[row][col] = userInput;
            }

        }

        for (int row = 0; row < myArrays.length; row++) {

            for (int col = 0; col < myArrays[row].length; col++) {
                
                System.out.print(" "+myArrays[row][col]);

            }
            System.out.println();
        }

       

    }
}
