package webpagetaker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Webpagetaker {

    public static void main(String[] args) {

        try {
            Scanner w = new Scanner(System.in);

            System.out.println("Enter your web address");

            String weblink = w.next();

            System.out.println("Enter your file name");

            String file = w.next();

            URL url = new URL("https://" + weblink);

            String result = " ";

            try {
                Scanner link = new Scanner(url.openStream());

                while (link.hasNext()) {

                    result += link.nextLine();
                }

                File f = new File("C:\\Users\\USER\\Desktop\\ " + file + " .html");

                try (PrintWriter pw = new PrintWriter(f)) {
                    
                    pw.println(result);

                    System.out.println("Your Web Page create successfully");

                    pw.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(Webpagetaker.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Webpagetaker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
