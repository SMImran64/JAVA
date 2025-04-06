
package posnegzero;

import java.util.Scanner;


public class PosNegZero {

   
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter Positive or Negative or Zero");
        
        int input = num.nextInt();
        
        if(input>0){
            System.out.println(input+" is a positive Number");
        }
        else if(input<0){
            System.out.println(input+" is a Negative Number");
        }
        else {
            System.out.println(input+" is a Zero");
        }
    }
    
}
