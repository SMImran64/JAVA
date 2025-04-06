
package practicesession;

 


import java.util.Scanner;
public class PracticeSession {

   
    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter your Interest");
//        
//        double interestRate = input.nextDouble();
//        double monthlyInterestRate = interestRate/1200;
//        
//        System.out.println("Enter Number of Years");
//        
//        int numbersOfYear = input.nextInt();
//        
//        System.out.println("Enter number of years");
//        
//        double loanAmount = input.nextDouble();
//        
//        double monthlyPayment = loanAmount*monthlyInterestRate/
//                (1-1/Math.pow(1+monthlyInterestRate,numbersOfYear*12));
//        
//        double totalPayment = monthlyPayment*numbersOfYear*12;
//        
//        System.out.println("The monthly payment: $"+monthlyPayment);
//        System.out.println("The Total payment: $"+totalPayment);
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter interest rate");
        
        double interestRate = s.nextDouble();
        
        double monthlyInterestRate = interestRate/1200;
        
        System.out.println("Enter number of Years");
        
        int numberOfYears = s.nextInt();
        
        System.out.println("Enter loan Amount");
        double loanAmount = s.nextDouble();
        
        double monthlyPayment = loanAmount*monthlyInterestRate/(1-1/Math.pow(1+ monthlyInterestRate,numberOfYears*12));
        
        double totalPayment = monthlyPayment* numberOfYears*12;
        
        System.out.println("The Monthly Payment: $"+(int)monthlyPayment);
        System.out.println("The Total Payment: $"+(int)totalPayment);
                
        
        
        
         
         
        
        
    }
    
}
