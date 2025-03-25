
package calareaofcircle;

import java.util.Scanner;


public class CalAreaOfCircle {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Redius Value");
        
        float rediusValue = scanner.nextFloat();  
        
//                  1st method---01

//        float result =(rediusValue*rediusValue)*3.1416f;


                //second method--02
                
            double result= Math.PI*Math.pow(rediusValue, 2);
        
        System.out.println("The result is "+ result);
    }
    
}
