package org.example.sandbox.lambda;

import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {

        // anonymous function
        // x -> x * 2

        // 4 classes
        // Predicate - takes 1 value return a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - take 1 value and return a value
        Function<Integer, Integer> function = x -> {
            x = x + 5;
            return x * 2;
        };
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;

        // Supplier - takes nothing returns 1 value
        Supplier<String> supplier = () -> "Hello World!";

        // Consumer - takes 1 value returns nothing
        Consumer<String> consumer = x -> System.out.println(x);
        Consumer<String> consumer2 = System.out::println;
    }



}
