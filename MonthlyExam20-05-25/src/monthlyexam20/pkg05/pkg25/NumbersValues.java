
package monthlyexam20.pkg05.pkg25;


public class NumbersValues implements Runnable{
    
    private int numbers;

    public NumbersValues(int numbers) {
        this.numbers = numbers;
    }
    
    

    @Override
    public void run() {

        for(int i = 0; i <numbers ; i++){
        
        
            System.out.println(" "+i);
        }

    }
    
    
}
