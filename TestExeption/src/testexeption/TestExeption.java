
package testexeption;

import java.util.Scanner;


public class TestExeption {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter your first Number");
            int n = s.nextInt();
            System.out.println("Enter your Second Number");
            int n1 = s.nextInt();
            
            double output = n/n1;
            System.out.println(output);
            
        } catch (ArithmeticException e) {
            
            System.out.println(e);
        }
    }
    
}
