package threadsmethodlearn;

public class PrintChar implements Runnable {

    private char charToPrint; 
    private int times;

   
    //  Construct a task with a specified character and number of times to print
     // the character
     
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    @Override    
     // Override the run() method to tell the system what task to perform
     
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}
