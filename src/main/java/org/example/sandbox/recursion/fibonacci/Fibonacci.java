package org.example.sandbox.recursion.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static Map<Integer, Integer> map = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return memo(n - 1) + memo(n - 2);
    }

    private static int memo(int n) {

        if (n <= 1) {
            return n;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int fib = memo(n - 1) + memo(n - 2);
        map.put(n, fib);

        return fib;
    }
}