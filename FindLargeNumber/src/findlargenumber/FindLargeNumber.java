
package findlargenumber;

import java.util.Scanner;


public class FindLargeNumber {

   
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("Enter First Number");
        
        int input1= number.nextInt();
        
        System.out.println("Enter Second Number");
        
        int input2 = number.nextInt();
        
        if(input1>input2){
            System.out.println(input1+" is a large number");
        }
        else{
            System.out.println(input2+" is a large number");
        }
    }
    
}
