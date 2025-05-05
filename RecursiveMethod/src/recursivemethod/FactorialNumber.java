package recursivemethod;

public class FactorialNumber {
    
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
        FibonacciSeries f = new FibonacciSeries();
        System.out.println(f.fibonacci(7));
        
    }    
    public static long factorial(int n) {
        
        if (n == 0) {
            
            return 1;
        } else {
            
            System.out.println(n);
            return n * factorial(n - 1);
            
        }
        
    }
    
}
