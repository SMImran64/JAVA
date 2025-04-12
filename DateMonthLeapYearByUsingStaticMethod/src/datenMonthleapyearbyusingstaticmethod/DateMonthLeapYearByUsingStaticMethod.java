package datenMonthleapyearbyusingstaticmethod;

import java.util.Scanner;

public class DateMonthLeapYearByUsingStaticMethod{
    
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Enter a Year");

        int year = l.nextInt();

        System.out.println("Enter nMonth");

        int nMonth = l.nextInt();

        System.out.println("Enter date");

        int date = l.nextInt();

        String result = datenMonthLeapYear(date, nMonth, year);

        System.out.println(result);

    }

    public static String datenMonthLeapYear(int date, int nMonth, int year) {


        String nnMonth = "";
        String result = "";

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            if (nMonth == 1 && date > 31
                    || nMonth == 2 && date > 29
                    || nMonth == 3 && date > 31
                    || nMonth == 4 && date > 30
                    || nMonth == 5 && date > 31
                    || nMonth == 6 && date > 30
                    || nMonth == 7 && date > 31
                    || nMonth == 8 && date > 31
                    || nMonth == 9 && date > 30
                    || nMonth == 10 && date > 31
                    || nMonth == 11 && date > 30
                    || nMonth == 12 && date > 31) {

                result = "Invalid date";

                System.exit(0);

            } else {
                result = nMonth + "" + date + "," + year;
            }

        } else if (nMonth == 1 && date > 31
                || nMonth == 2 && date > 28
                || nMonth == 3 && date > 31
                || nMonth == 4 && date > 30
                || nMonth == 5 && date > 31
                || nMonth == 6 && date > 30
                || nMonth == 7 && date > 31
                || nMonth == 8 && date > 31
                || nMonth == 9 && date > 30
                || nMonth == 10 && date > 31
                || nMonth == 11 && date > 30
                || nMonth == 12 && date > 31) {

            result = "Invalid Date";
        } else {
            result = nMonth + "" + date + "," + year;
        }

        switch (nMonth) {
            case 1:
                nnMonth = "January";
                break;
            case 2:
                nnMonth = "February";
                break;
            case 3:
                nnMonth = "March";
                break;
            case 4:
                nnMonth = "April";
                break;
            case 5:
                nnMonth = "May";
                break;
            case 6:
                nnMonth = "June";
                break;
            case 7:
                nnMonth = "July";
                break;
            case 8:
                nnMonth = "August";
                break;
            case 9:
                nnMonth = "September";
                break;
            case 10:
                nnMonth = "October";
                break;
            case 11:
                nnMonth = "November";
                break;
            case 12:
                nnMonth = "December";
                break;

            default:
                nnMonth = "Invalid Month";

                System.exit(0);
        }

        result = nnMonth + " " + date + "," + year;

        return result;
    }

}
