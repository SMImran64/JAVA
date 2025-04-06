
package calculateinterest;

import java.util.Scanner;




public class CalculateInterest {

   
    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter your interest rate");
//        
//        double interestRate = input.nextDouble();
//        
//        double monthlyInterestRate = interestRate/1200;
//        
//        System.out.println("Enter number of year ");
//        
//        int numberOfYears = input.nextInt();
//        
//        System.out.println("Enter loan amount");
//        
//        double loanAmount = input.nextDouble();
//        
//        double monthlyPayment = loanAmount*monthlyInterestRate /(1-
//                1/Math.pow(1+ monthlyInterestRate,numberOfYears*12));
//        
//        
//        double totalPayment = monthlyPayment*  numberOfYears * 12;
//        
//        System.out.println("Monthly Payment "+ monthlyPayment);
//        System.out.println("Total Payment "+ totalPayment);
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter optimum Interest Rate");
        
        float interestRate = s.nextFloat();
        
        float monthlyInterestRate = interestRate/1200;
        
        System.out.println("Enter Number of Years");
         
        int numberOfYears = s.nextInt();
        
        System.out.println("Enter Loan Amount");
        
        float loanAmount = s.nextInt();
        
        float monthlyPayment = loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
        
        
        
        
        
    }
    
}
