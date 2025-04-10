
package leapyearbyusingstaticmehtod;

import java.util.Scanner;


public class LeapYearByUsingStaticMehtod {

    
    public static void main(String[] args) {
        
        Scanner y = new Scanner(System.in);
        
        System.out.println("Enter a year");
        
        int customerValue = y.nextInt();
        
        String outFlow = LeapYearByUsingStaticMehtod(customerValue);
        
        System.out.println(outFlow);
       
    }
    
    public static String LeapYearByUsingStaticMehtod(int year){
    
        String outFlow = "";
        
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
        
        outFlow = year + " is a Leap Year";
        }
        else{
        outFlow = year + " is not a Leap Year";
        }
        
        return outFlow;
    }
    
}
