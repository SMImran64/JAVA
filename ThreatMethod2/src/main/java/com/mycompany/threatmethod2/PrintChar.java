
package com.mycompany.threatmethod2;


public class PrintChar implements Runnable{
    
    private String letter;

    public PrintChar() {
    }

    public PrintChar(String letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
