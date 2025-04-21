
package classtest.pkg21.pkg04.pkg25;

import java.util.Scanner;


public class FindDiscoutAndActualPrice {
    
    public static void main(String[] args) {
        
        Scanner d = new Scanner(System.in);
        
        System.out.println("Enter your Price");
        
        float price = d.nextFloat();
        
        if(price>200){
        
            float discount;
            float actual;
            
            discount = price * 0.05f; 
            
            actual = price - discount;
            
            System.out.println("The actual price is :"+ actual+" BDT");
            System.out.println("The discout Value is :"+ discount+" BDT");
        }
        else{
        
            System.out.println("Your Price is lower than the discount Price");
        
        }
    }
    
}
