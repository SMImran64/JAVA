
package monthlyexam20.pkg05.pkg25;


public class ThreatTest {

   
    public static void main(String[] args) {
        
        Runnable r = new NumbersValues(50);
        
        Runnable r1 = new CharValues("V", 100);
        
        Runnable r2 = new CharValues("M", 100);
        
        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t.start();
        t1.start();
        t2.start();
       
    }
    
}
