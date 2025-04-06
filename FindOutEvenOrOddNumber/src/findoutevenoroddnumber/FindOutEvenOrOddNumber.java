
package findoutevenoroddnumber;

import java.util.Scanner;


public class FindOutEvenOrOddNumber {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = input.nextInt();
        
        if(num % 2==0){
            System.out.println(num +" is Even number");
        }
        else {
            System.out.println(num+" is Odd number");
        }
       
    }
    
}
