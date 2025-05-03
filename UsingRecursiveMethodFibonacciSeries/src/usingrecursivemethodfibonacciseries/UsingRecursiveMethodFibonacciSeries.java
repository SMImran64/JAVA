package usingrecursivemethodfibonacciseries;

public class UsingRecursiveMethodFibonacciSeries {

    public static void main(String[] args) {

        System.out.println(fibonacciSeries(7));
    }

    public static long fibonacciSeries(int n) {

        if (n <= 1) {
            return n;
        } else {
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        }

    }

}
