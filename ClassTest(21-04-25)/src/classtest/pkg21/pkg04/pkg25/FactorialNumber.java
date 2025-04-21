
package classtest.pkg21.pkg04.pkg25;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        
        System.out.println("Enter your number");
        
        int value = f.nextInt();
        int fact = 1;
        
        for(int i = 1 ; i <=value; i++){
        
            fact *= i;
        
        }
        System.out.println("The factorial Number is: "+fact);
    }
}
