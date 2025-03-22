package org.example.sandbox.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {

        // try-catch
        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }

        // do something else

        // try-catch-catch - order of catch blocks matters per hierarchy
        try {
            // do something awesome
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // finally do something
        }

        try {
            // do something
        } finally {
            // do something
        }

        // java 7 multi-try-catch
        try {
            // do something
        } catch (ArithmeticException | NullPointerException | SecurityException e) {
            e.printStackTrace();
        }

        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)){
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }
    }
}
