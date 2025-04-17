
import java.util.Arrays;
import java.util.Scanner;




public class FindMaxNumberMinNumberUsingOverLoadingMethod {
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        System.out.println("Enter limit");

        int size = n.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {

            System.out.println("Enter numbers " + (index + 1));
            int userValue = n.nextInt();

            numbers[index] = userValue;

        }
        System.out.println("The Array Value "+ Arrays.toString(numbers));
                
        
    }
    
//    public static int maxMinNumber(){
//        
//       
//        
//       
//       return null;
//    
   
    
}
