
package exceptionhandlingquestionno2;

import java.util.Scanner;


public class ExceptionHandlingQuestionNo2 {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.println("Enter your First Value");
            
            int value1 = s.nextInt();
            
            System.out.println("Enter your Second Value");
            
            int value2 = s.nextInt();
            
            double output = value1/value2;
            
        } catch (ArithmeticException e) {
            
            System.out.println(e);
        }
    }
    
}
