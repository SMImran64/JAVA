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

        String vMonth = dateMonthLeapYear(date, month, year);

        System.out.println(vMonth);

    }

    public static String dateMonthLeapYear(int date, int month, int year) {

        String vMonth = "";
        
        

        String result = "";

        switch (month) {
            case 1:
                vMonth = "January";
                break;
            case 2:
                vMonth = "February";
                break;
            case 3:
                vMonth = "March";
                break;
            case 4:
                vMonth = "April";
                break;
            case 5:
                vMonth = "May";
                break;
            case 6:
                vMonth = "June";
                break;
            case 7:
                vMonth = "July";
                break;
            case 8:
                vMonth = "August";
                break;
            case 9:
                vMonth = "September";
                break;
            case 10:
                vMonth = "October";
                break;
            case 11:
                vMonth = "November";
                break;
            case 12:
                vMonth = "December";
                break;

            default:
                vMonth = "Invalid Month";

                System.exit(0);
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            if (month == 1 && date < 31
                    || month == 2 && date < 29
                    || month == 3 && date < 31
                    || month == 4 && date < 30
                    || month == 5 && date < 31
                    || month == 6 && date < 30
                    || month == 7 && date < 31
                    || month == 8 && date < 31
                    || month == 9 && date < 30
                    || month == 10 && date < 31
                    || month == 11 && date < 30
                    || month == 12 && date < 31) {

                result = "Invalid date";

            } else {
                result = date + "";
            }

        } else { 
                if(month == 1 && date < 31
                || month == 2 && date < 28
                || month == 3 && date < 31
                || month == 4 && date < 30
                || month == 5 && date < 31
                || month == 6 && date < 30
                || month == 7 && date < 31
                || month == 8 && date < 31
                || month == 9 && date < 30
                || month == 10 && date < 31
                || month == 11 && date < 30
                || month == 12 && date < 31) {
            
            result = "Invalid date";

        }
        }
        
        result = vMonth +" " + date +","+year ;

        return result;
    }

}
