package findprimenumberusingstaticmethod;

import java.util.Scanner;

public class FindPrimeNumberUsingStaticMethod {

    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        System.out.println("Enter a number");

        int input = p.nextInt();
        
        String output =primeNumber(input);
        
        System.out.println(output);

        String result = EvenOddNumber(input);

        System.out.println(result);

    }

    public static String primeNumber(int inputValue) {

        int count = 0;

        String output = "";

        for (int i = 1; i <= inputValue; i++) {

            if (inputValue % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            output = inputValue + " is Prime Number";
        } else {
            output = inputValue + " is not Prime Number";
        }

        return output;
    }
    
    public static String EvenOddNumber(int inoput){
        
        
        String result = "";
         if(inoput % 2==0){
            result = inoput +" is Even number";
        }
        else {
             result = inoput +" is odd number";
        }
         
         return result;
    
    }

}
