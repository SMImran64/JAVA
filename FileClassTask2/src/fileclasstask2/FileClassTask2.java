package fileclasstask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClassTask2 {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Admin\\Desktop\\test.txt");

        try {
            Scanner s = new Scanner(f);

            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }

//            System.out.println(s.nextLine());
            try (PrintWriter pw = new PrintWriter(f)) {
                pw.println("Today we wanna to talk about recursion of core java");
                pw.println("The Lecture will be taken by our honourable teacher");
                pw.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClassTask2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
