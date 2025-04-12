package overloading2;

import java.util.Arrays;

public class OverLoading2 {

    public static void main(String[] args) {

        sum(10, 50, 30, 50, 80);

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
