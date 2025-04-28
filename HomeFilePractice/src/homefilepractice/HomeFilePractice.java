package homefilepractice;

import java.io.PrintWriter;

public class HomeFilePractice {

    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\USER\\Desktop\\sm.txt");          
            pw.print("Assalmualikum dear friends");
            pw.print("Here we are gonna to talk about File class in java. This is really essential for all of the student who is begainer of the study of java  ");

            pw.close();
            
        } catch (Exception e) {
            
        }
    }

}
