
package com.mycompany.threatmethod2;

/**
 *
 * @author Admin
 */
public class Number implements Runnable{
    
    private int numbers;

    public Number(int numbers) {
        this.numbers = numbers;
    }
    
    

    @Override
    public void run() {
        
        for(int i = 0; i< numbers; i++){
        
            System.out.print(" "+i);
        
        }

    }
    
}
