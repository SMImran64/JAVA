
package monthlyexam20.pkg05.pkg25;


public class CharValues implements Runnable{
    
    private String letters;
    
    private int times; 

    public CharValues(String letters, int times) {
        this.letters = letters;
        this.times = times;
    }
    

    @Override
    public void run() {

        for(int i = 0; i< this.times; i++){
        
            System.out.println(" "+letters);
        
        }


    }
    
    
    
    
}
