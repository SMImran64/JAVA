
package usescanner;

import java.util.Scanner;


public class UseScanner {

    
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your first number ");
//        int number1=input.nextInt();
//        System.out.println("Enter Your Second number ");
//        int number2=input.nextInt();
//        
//        float result=(float) number1 / number2;
//        System.out.println("Result is "+ result);

    Scanner input = new Scanner(System.in);
    
        System.out.println("Enter Your First Value");
        
        int num1 = input.nextInt();
        
        System.out.println("Enter Your Second Value");
        
        int num2 = input.nextInt();
        
        int result = num1 + num2 ;
        System.out.println("The Result is :"+ result);
        
        

        
  
    }
    
}
