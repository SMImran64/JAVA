package preparationfor1stmonthlyexamincorejava;

import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);

        System.out.println("Enter Your obtain marks");

        int marks = g.nextInt();

        if (marks <= 100 && marks > 79) {
            System.out.println("You have got A+");
        } else if (marks <80 && marks >69) {
            System.out.println("You have got A");
        } else if (marks <70 && marks > 59) {
            System.out.println("You have got A-");
        } else if (marks <60 && marks> 49) {
            System.out.println("You have got B");
        } else if (marks <50 && marks > 39) {
            System.out.println("You have got C");
        } else if (marks<40 && marks >= 33) {
            System.out.println("You have got D");
        } else if (marks < 33) {
            System.err.println("You have got F");
        } else {
            System.err.println("Marks Error");
        }
    }

}
