package com.mycompany.threatmethod2;

public class PrintChar implements Runnable {

    private String letter;
    private int times;

    public PrintChar(String letter, int times) {
        this.letter = letter;
        this.times = times;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.times; i++) {

            System.out.print(letter);

        }
    }

}
