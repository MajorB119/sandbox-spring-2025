package org.example.sandbox.recursion.fibonacci;

public class Driver {

    public static void main(String[] args) {
        int n = 50;
        for(int x = 0; x<= n; x++) {
            System.out.println("Fibonacci(" + x + ") = " + Fibonacci.fibonacci(x));
        }
    }
}
