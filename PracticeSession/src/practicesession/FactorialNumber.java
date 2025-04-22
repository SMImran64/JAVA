
package practicesession;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        
        System.out.println("Enter your number");
        
        long number = f.nextInt();
        
        long factorial = 1;
        
        for(long i = 1 ; i <=number ; i++){
        
            factorial *= i ;
        
        }
        System.out.println("The Factorial is :"+factorial);
    }
}
