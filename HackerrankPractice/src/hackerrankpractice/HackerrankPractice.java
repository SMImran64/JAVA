
package hackerrankpractice;

import java.util.Arrays;
import java.util.Scanner;


public class HackerrankPractice {

  
    public static void main(String[] args) {
      
         Scanner scanner = new Scanner(System.in);
        
       
        int n = scanner.nextInt();
        int v []= new int[n];
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            v[i]=num;
        }
        System.out.println(Arrays.toString(v));
        
        System.out.println("The first value "+v[0]);
        System.out.println("The second value "+v[1]);
        System.out.println("The third value "+v[2]);
        scanner.close();
    }
    
}
