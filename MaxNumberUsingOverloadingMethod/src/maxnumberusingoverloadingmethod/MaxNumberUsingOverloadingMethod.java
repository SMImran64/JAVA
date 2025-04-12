package maxnumberusingoverloadingmethod;

import java.util.Scanner;

public class MaxNumberUsingOverloadingMethod {

    public static void main(String[] args) {

        System.out.println(maxNumber(100, 30, 20));

    }

    public static int maxNumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {

            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

}
