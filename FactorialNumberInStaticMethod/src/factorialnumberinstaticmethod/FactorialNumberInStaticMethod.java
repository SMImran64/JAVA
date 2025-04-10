
package factorialnumberinstaticmethod;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;


public class FactorialNumberInStaticMethod {
    
    

  
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        
        System.out.println("Enter value");
        
        int value = f.nextInt();
        
        String result = FactorialNumberInStaticMethod(value);
        
        System.out.println(result);
    
        }
    public static String FactorialNumberInStaticMethod(int value){
    
        String result = "";
        
        long factorial = 1;
           int count = 1;
        
        if (value < 0) {
            
            
            System.err.println("Mathmatical Erorr");
            System.exit(0);
        } else {

            do {
                factorial *= count;
                count++;

            } while (count <= value);

        }

       result = "The Factorial Number is: " + factorial;

    return result;
    
    }
}           

