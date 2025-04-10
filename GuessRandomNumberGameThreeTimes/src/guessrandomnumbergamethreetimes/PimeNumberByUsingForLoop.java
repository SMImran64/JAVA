      

package guessrandomnumbergamethreetimes;

import java.util.Scanner;



public class PimeNumberByUsingForLoop {

   
    public static void main(String[] args) {
      
        Scanner p = new Scanner(System.in);
        
        System.out.println("Enter a number");
        
        int prime = p.nextInt();
        
        
         int count = 0;
        
        for(int i = 1 ; i<= prime ; i++){
            
            if(prime % i == 0){
                count ++;            
            }            
        }
        
        if(count == 2){
            System.out.println(prime +" is Prime Number");
        }
        else{
            System.out.println(prime+ " is not a prime Number");
        }
        
        
    }
    
}
