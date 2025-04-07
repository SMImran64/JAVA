package gradecalculation;

import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {
        
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter Your Obtain marks");

        int totalMarks = marks.nextInt();

        if (totalMarks <= 100 && totalMarks > 89) {
            System.out.println("You have got A");
        } else if (totalMarks > 79) {
            System.out.println("You have got B");
        } else if (totalMarks > 69) {
            System.out.println("You have got C");
        } else if (totalMarks > 59) {
            System.out.println("You have got D");
        } else {
            System.out.println("You have got F");
        }

    }

}
