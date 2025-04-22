
package monthlyexamquestionsolution;

import java.util.Scanner;


public class SumOfPositiveNumber {

   
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        
        int sum = 0 ;
        int ng = 0;
        int result = 0;
        
        while(true){
            System.out.println("Enter a Positive Number");
            
            int numbers = i.nextInt();
            
            if(numbers<0){
                
                 ng = numbers;
                
                break;            
            }
           
            else{
            
                sum += numbers;
             result = sum - ng;
            }    
           
            
        }        
        System.out.println("The sum of the integer number "+ result);       
    }
    
}
