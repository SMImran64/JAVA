
package learnobjectandclass;

import hashcodemethod.StudentStutus;
import java.util.Scanner;


public class LearnObjectAndClass {

   
    public static void main(String[] args) {
       
//        Circle cm = new Circle(5);
//        
//        System.out.println(cm.getArea());
//        System.out.println(cm.getParimeter());
        
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter Your obtain marks");
        
        int marks = k.nextInt();
        
        StudentStutus istiaq = new StudentStutus("Istiaq");
        
        istiaq.setMarks(marks);
        
        System.out.println(istiaq.getResult());
        
    }
    
}
