
package exceptionhandaling;


public class ExceptionHandaling {

 
    public static void main(String[] args) {
     
        int []values = {10,20,50,40,30};
        
        
        try {
            System.out.println(" "+values[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println(e);
        }
    }
    
}
