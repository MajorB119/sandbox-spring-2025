package org.example.sandbox.exception;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(3, 3));
        try {
            System.out.println(calc.divide(2.0f, 0.0f));
        } catch (DivideByZeroException e) {
            System.err.println("Can't divide by zero");
        }
    }

    public int divide(int a, int b) {
        int returnValue = 0;

        try {
            returnValue = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Can't divide by zero buddy");
        }

        return returnValue;
    }

    public float divide(float a, float b) throws DivideByZeroException {

        if (b == 0.0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}
