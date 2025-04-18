

package preparationfor1stmonthlyexamincorejava;

import java.util.Scanner;



public class FibonacciSeries2 {
    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in);
        
        System.out.println("Enter Numbers limit");
        
        int value = f.nextInt();
        
        System.out.println("The fiboncci numbers is : ");
        
        int no1 = 0;
        int no2 = 1;
        
        int sum = 0;
        
        System.out.println(no1);
        System.out.println(no2);
        
        for(int i = 3 ; i<= value ; i++){
        
            sum = no1+no2;
            
            System.out.println(sum);
            
            no1 = no2;
            
            no2 = sum;
        
        }
    }
    
}
