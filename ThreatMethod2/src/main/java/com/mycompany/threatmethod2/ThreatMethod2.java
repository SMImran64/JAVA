package com.mycompany.threatmethod2;

public class ThreatMethod2 {

    public static void main(String[] args) {

        Runnable r = new Number(50);

        Runnable r1 = new PrintChar("T", 50);
        Runnable r2 = new PrintChar("I", 50);

        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t.start();
        t1.start();
        t2.start();
    }
}
