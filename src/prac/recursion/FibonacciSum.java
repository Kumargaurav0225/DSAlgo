package prac.recursion;

public class FibonacciSum {
    public static void main(String[] args) {
        var n = 5;
        var result = fib(6);
        System.out.println(result);
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
