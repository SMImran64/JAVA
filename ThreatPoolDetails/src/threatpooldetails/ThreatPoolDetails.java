package threatpooldetails;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreatPoolDetails {

    public static void main(String[] args) {

        ExecutorService e = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {

            Runnable r = new TestThreatpool(i);

            e.submit(r);
        }

        e.shutdown();
    }

}
