
import java.util.Scanner;


public class FactorialNumberUsingForloop {
    
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter limit");
        
        long input = f.nextInt();
        
        long factorial = 1;
        
        for(long i = 1 ; i <= input ; i++){
            
            factorial*=i;
        
        }
        System.out.println("The factorila Number is "+ input +" is "+ factorial);        
        
    }
    
}
