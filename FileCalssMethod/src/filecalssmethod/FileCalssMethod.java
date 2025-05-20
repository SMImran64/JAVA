package filecalssmethod;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCalssMethod {

    public static void main(String[] args) {

        // File f = new File("C:\\Users\\Admin\\Deskto");
        try {

            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\Imran.txt");

            pw.print("Welcom to Java");
            pw.print("I'm the student of java");
            pw.print("Java is world best programing language");

            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCalssMethod.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
