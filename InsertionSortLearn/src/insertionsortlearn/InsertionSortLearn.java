
package insertionsortlearn;

import java.util.Arrays;


public class InsertionSortLearn {

  
    public static void main(String[] args) {
      
        int[] numbers = {10,50,40,20,15};
        
         insertionSort(numbers);
        
    }
    
    public static void insertionSort(int [] list) {
        
        for(int i = 1; i<list.length;i++){
        
            int currentElement = list[i];            
            int k ;
            for( k = i -1; k >= 0 && list[k]>currentElement ; k--){            
                list[k+1] = list[k];            
            }            
            list[k+1] = currentElement;        
        }        
       System.out.println(Arrays.toString(list));
    }
}
