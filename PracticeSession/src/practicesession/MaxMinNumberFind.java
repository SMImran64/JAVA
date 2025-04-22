
package practicesession;

import java.util.Arrays;
import java.util.Scanner;


public class MaxMinNumberFind {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter your limit");
        int limit = l.nextInt();       
      
        int [] numbers = new int[limit];
        
        for(int i = 0 ; i < numbers.length; i++){
        
            System.out.println("Enter your value");
            
            int userValue = l.nextInt();
            numbers[i]=userValue;            
        
        }
        System.out.println(" "+Arrays.toString(numbers));
        
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        
        for(int value : numbers){
        
         if( value > maxNumber){
            
                maxNumber = value;
            
            }
            if(value < minNumber){
            
                minNumber = value;
            
            }
        }
     
        System.out.println("The maxNumber is : "+maxNumber);
        System.out.println("The minNumber is : "+minNumber);
    }
    
}
