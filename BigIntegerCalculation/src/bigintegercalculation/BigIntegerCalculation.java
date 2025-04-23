
package bigintegercalculation;

import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegerCalculation {

  
    public static void main(String[] args) {
     
        Scanner f = new Scanner(System.in);
        
        System.out.println("Enter your number");
        
        int userValue = f.nextInt();     
       
        BigInteger factorial = BigInteger.ONE;
       
        for( int j = 1 ;  j <= userValue ; j++){
        
            factorial = factorial.multiply( BigInteger.valueOf(j));
       
        }
        System.out.println(factorial);
        
      
        
           
        
        
       
        
    }
    
}
