
package monthlyexamquestionsolution;

import java.util.Scanner;


public class SirTamplateOrmethod {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number");
        int numbers = s.nextInt();

        int sum = 0;

        while (numbers > 0) {

            sum += numbers;

            System.out.println("Enter value");
            numbers = s.nextInt();

        }

        System.out.println("Total sum number " + sum);
        System.out.println("Total sum number "+ (sum+numbers));
    }
}
