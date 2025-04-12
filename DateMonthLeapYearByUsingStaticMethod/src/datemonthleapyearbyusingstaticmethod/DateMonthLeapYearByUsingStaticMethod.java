package datemonthleapyearbyusingstaticmethod;

import java.util.Scanner;

public class DateMonthLeapYearByUsingStaticMethod {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Enter a Year");

        int year = l.nextInt();
        
        System.out.println("Enter month");
        
        int month = l.nextInt();
        
        System.out.println("Enter date");
        
        int date = l.nextInt();

        String result = dateMonthLeapYear(date, month, year);

        System.out.println(result);

    }

    public static String dateMonthLeapYear(int date, int month, int year) {

//        String result = "";
        
        

        String result = "";
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            if (month == 1 && date > 31
                    || month == 2 && date > 29
                    || month == 3 && date > 31
                    || month == 4 && date > 30
                    || month == 5 && date > 31
                    || month == 6 && date > 30
                    || month == 7 && date > 31
                    || month == 8 && date > 31
                    || month == 9 && date > 30
                    || month == 10 && date > 31
                    || month == 11 && date > 30
                    || month == 12 && date > 31) {

                result = "Invalid date";
                
                System.exit(0);

            } else {
                result = result +"" + date +","+year;
            }

        } else if(month == 1 && date > 31
                || month == 2 && date > 28
                || month == 3 && date > 31
                || month == 4 && date > 30
                || month == 5 && date > 31
                || month == 6 && date > 30
                || month == 7 && date > 31
                || month == 8 && date > 31
                || month == 9 && date > 30
                || month == 10 && date > 31
                || month == 11 && date > 30
                || month == 12 && date > 31){        
        
                result = "Invalid Date";
        }
        
        else{
        result = result +"" + date +","+year;
        }


        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;

            default:
                result = "Invalid Month";

                System.exit(0);
        }

        
        return result;
    }

}
