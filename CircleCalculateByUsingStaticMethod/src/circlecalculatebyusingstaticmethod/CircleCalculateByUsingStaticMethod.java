
package circlecalculatebyusingstaticmethod;

import java.util.Scanner;


public class CircleCalculateByUsingStaticMethod {

  
    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
        
        System.out.println("Enter redious Value");
        
        float rediousValue = c.nextFloat();
        
        double areOfCircle = AreaOfCircle(rediousValue);
        
        System.out.println(areOfCircle);
       
    }
    
    public static double AreaOfCircle(float rediousValue){
    
        double areOfCircle;
        
        areOfCircle = (double)Math.PI*Math.pow(rediousValue, 2);
    
    return areOfCircle;
    }
    
}
