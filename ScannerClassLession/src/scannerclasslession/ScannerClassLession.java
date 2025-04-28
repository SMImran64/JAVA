package scannerclasslession;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScannerClassLession {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\USER\\Desktop\\sm.txt");

        try {
            Scanner s = new Scanner(f);

//            System.out.println(s.nextLine());
            while (s.hasNext()) {
                String s1 = s.nextLine();

                String myArray[] = s1.split(" ");

                System.out.println(Arrays.toString(myArray));

            }

//            while (s.hasNext()){
//                
//                System.out.println(s.next());
//            
//            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScannerClassLession.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
