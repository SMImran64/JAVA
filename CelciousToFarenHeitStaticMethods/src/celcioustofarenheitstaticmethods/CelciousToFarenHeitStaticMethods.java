
package celcioustofarenheitstaticmethods;

import java.util.Scanner;


public class CelciousToFarenHeitStaticMethods {

   
    public static void main(String[] args) {
        
        Scanner  f  = new Scanner(System.in);
        
        System.out.println("Enter positive Number");
        
        int celcious = f.nextInt();
        
        String result = celciousTofarenheit(celcious);
        
        System.out.println(result);
      
    }
    
    public static String celciousTofarenheit(int celcious){
    
        String result = "";
        
       
        
        if (celcious>0){
             
            result = "The Farenheit is = "+ celcious * 9 / 5 + 32;
            
            } else {
        result = " Please Enter Positive Number";
        }
        
        return result;
    
    }
    
}
