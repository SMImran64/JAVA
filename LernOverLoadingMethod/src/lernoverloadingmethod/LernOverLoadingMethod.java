package lernoverloadingmethod;

import java.util.Arrays;
import java.util.Scanner;

public class LernOverLoadingMethod {

    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.println("How many times do you want input value");

        int n = m.nextInt();

        int[] arrays = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value");

            int inputValue = m.nextInt();

            arrays[i] = inputValue;
        }

        sum(arrays);

    }

    public static int sum() {

        int sum = 50 + 30;
        return sum;
    }

    public static int sum(int a) {

        int sum = a + 30;
        return sum;
    }

    public static int sum(int a, int b) {

        int sum = 50 + 30;
        return sum;
    }

    public static void sum(int... a) {

        int sum = 0;

        for (int item : a) {

            sum += item;

        }
        System.out.println(Arrays.toString(a));

        System.out.println(sum);
    }

}
