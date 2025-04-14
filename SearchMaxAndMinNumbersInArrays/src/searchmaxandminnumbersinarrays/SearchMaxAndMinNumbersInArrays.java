
package searchmaxandminnumbersinarrays;


public class SearchMaxAndMinNumbersInArrays {

   
    public static void main(String[] args) {
       
        int[] numbers = {20,80,40,60,70,10,50,90};
        
        int max = numbers[0];
        int min = numbers[0];
        
        for (int i = 0; i< numbers.length; i++){
        
            max = (numbers[i]>max)? numbers[i]: max;
            min = (numbers[i]<min)? numbers[i]: min;
           
        }
        
        System.out.println("Maximimum Number is "+ max +", Minimum Number is "+ min);
    }
    
}
