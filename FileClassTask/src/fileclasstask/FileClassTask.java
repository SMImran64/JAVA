package fileclasstask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClassTask {

    public static void main(String[] args) {

        try {
            
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a value");
            int number = s.nextInt();
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\ClassTask.txt");

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    pw.println(i);

                }
            }
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClassTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
