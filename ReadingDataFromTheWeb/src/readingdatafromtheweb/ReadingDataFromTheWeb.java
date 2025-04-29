package readingdatafromtheweb;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadingDataFromTheWeb {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://www.google.com/index.html");
            Scanner s = new Scanner(url.openStream());

            //Pattern to match HTML tags
            Pattern p = Pattern.compile("<[^>]+>");

            while (s.hasNext()) {

                String s1 = s.nextLine();
                Matcher m = p.matcher(s1);

                // Find and print all HTML tags in the line
                while (m.find()) {
                    System.out.println(m.group());

                }

            }
            s.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadingDataFromTheWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadingDataFromTheWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
