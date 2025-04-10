package factorialnumberinstaticmethod;

import java.util.Scanner;

public class FactorialNumberInStaticMethod {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.println("Enter value");

        int value = f.nextInt();

        String result = factorialNumberInStaticMethod(value);

        System.out.println(result);

    }

    public static String factorialNumberInStaticMethod(int value) {

        String result = "";

        long factorial = 1;
        int count = 1;

        if (value <= 0) {

            result = "Mathmatical Erorr";

        } else {
            do {
                long givenResult = factorial *= count;
                count++;
                result = "The Factorial Number is " + givenResult;

            } while (count <= value);

        }

//       result = "The Factorial Number is: " + factorial;
        return result;

    }
}
