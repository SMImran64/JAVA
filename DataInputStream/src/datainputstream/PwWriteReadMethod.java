
package datainputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class PwWriteReadMethod {

    
    public static void main(String[] args) {
        
        
        try { 
            PrintWriter pw = new PrintWriter("C:\\Users\\USER\\Desktop\\PreExam");
            
            pw.println("Welcome to java Class");
            pw.println("we are talk about Print Read and write");
            
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PwWriteReadMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
       
    }
    
}
