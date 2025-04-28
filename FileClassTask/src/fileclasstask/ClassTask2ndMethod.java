package fileclasstask;


import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ClassTask2ndMethod {

    public static void main(String[] args) throws FileNotFoundException {
        
                     //2nd method
        
         PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\ClassTest.txt");      {

//         System.out.println("Even numbers from 1 to 50:");
         
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
           
                    pw.println(i);
                   
                }   
            }
             pw.close();
        }
         
                    //         1st method

//        try {
//            Scanner s = new Scanner(System.in);
//            System.out.println("Enter your number");
//
//            int number = s.nextInt();
//
//            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\Abdullah.txt");
//            for (int i = 1; i < number; i++) {
//
//                if (i % 2 == 0) {
//
//                    pw.println(i);
//
//                }
//            }
//
//            pw.close();
//
//        } catch (Exception e) {
//        }
        
                    

   
    }
    

}
