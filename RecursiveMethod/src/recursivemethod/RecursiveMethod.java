
package recursivemethod;


public class RecursiveMethod {

   
    public static void main(String[] args) {
       
        System.out.println(factorial(5));
        
    }
    
    public static long factorial(int n){
    
        if(n == 0){
        
        return 1;
        }else{
        
            System.out.println(n);
            return n*factorial(n-1);
        
        }
    
    }
    
}
