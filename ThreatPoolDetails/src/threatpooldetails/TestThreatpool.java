package threatpooldetails;

public class TestThreatpool implements Runnable {

    private int testitem;

    public TestThreatpool() {
    }

    public TestThreatpool(int testitem) {
        this.testitem = testitem;
    }

    @Override
    public void run() {

        System.out.println("Task " + testitem + " is running on threats " + Thread.currentThread().getName());

        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {

            System.out.println("Task " + testitem + " is interruptes");

        }

        System.out.println("Task " + testitem + " completed by " + Thread.currentThread().getName());

    }

}
