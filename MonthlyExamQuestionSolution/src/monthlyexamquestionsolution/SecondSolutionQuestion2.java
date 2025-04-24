package monthlyexamquestionsolution;

import java.util.Scanner;

public class SecondSolutionQuestion2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;
        int ngvalue = 0;
        while (true) {
            System.out.println("Enter Number");
            int numbers = s.nextInt();

            if (numbers < 0) {

                ngvalue = numbers;
//                    System.out.println("The ngnumber"+ngvalue);
                break;
            } else {
                sum += numbers;
            }

        }

        System.out.println("the sum of the integer number " + (sum + ngvalue));

    }

}
