
package practicesession;

import java.util.Scanner;


public class ActualAndDiscoutAmountCal {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter your Price Amount");
        
        float price = d.nextFloat();
        
        if(price > 200){      
            
            float sum = 0;            
            sum = price *(5/100f);            
            float result = price - sum;
            
            System.out.println("The amout you will pay "+result+"BDT");
            System.out.println("The discout amount that you have got " +sum+"BDT");
        
        }
        else{
            System.err.println("You cannot get discount");
        }
        
    }
    
}
