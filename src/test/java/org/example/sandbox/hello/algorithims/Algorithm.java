package org.example.sandbox.hello.algorithims;

public class Algorithm {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // recursive approach
    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        //System.out.println(fibonacci(10));
        //System.out.println(fibonacciRecursive(10));
        for (int x = 0; x <= 50; x++){
            System.out.println("Fibonacci(" + x + ") = " + fibonacci(x));
        }
    }
}
