
package filereadwritesuperdynamicmethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReadWriteSuperDynamicMethod {

   
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        System.out.println("What can you do");
        String s1 = s.next();
        System.out.println("Enter your file name");
        String file = s.next();
       
        File f = new File("C:\\Users\\Admin\\Desktop\\ "+file+" .txt");
        
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println("Assalamualikum to all of you.");
            
            while(s.hasNext()){
            
                System.out.println(s.nextLine());
                
                pw.close();
            
            }
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWriteSuperDynamicMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
    }
    
}
