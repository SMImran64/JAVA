
package arrayscalsstask3;

import java.util.Scanner;

public class ArraysCalssTask3 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter limit");
        
        int n = s.nextInt();
        
        String[]names = new String[n];
        
        int []passwords = new int[n];
        
        for(int i = 0; i<names.length; i++){
            
            System.out.println("Enter your name");
            
            String name = s.next();
            
            names[i]=name;
            
            if( names[i].equalsIgnoreCase(name)){
                
                
             
                
            
            }
        }
        
        
    }
    
}
