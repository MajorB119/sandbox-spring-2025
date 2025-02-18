package com.sandbox.exception;

import java.util.Scanner;

public class ExceptionActivity {

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
            // do something we don't expect to throw exceptions
        } finally {
            // but if we do, always execute code here
        }
        // more stuff here

        // java 7 multi-try-catch
        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)){
            // do something with scanner1
        }
        // yep, you guessed it - more stuff

        // try-with-resources
        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }

        try (Scanner scanner3 = new Scanner(System.in)) {
            // do something with scanner3
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
}