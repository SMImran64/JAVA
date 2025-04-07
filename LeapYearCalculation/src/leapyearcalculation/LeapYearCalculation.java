package leapyearcalculation;

import java.util.Scanner;

public class LeapYearCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year to cheak leap Year or not");

        int year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a leap Year");
                }
            } else {
                System.out.println(year + " is a leap Year");
            }
        } else {
            System.out.println(year + " is not a leap Year");
        }
        
    }

}
