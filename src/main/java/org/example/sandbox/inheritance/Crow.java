package org.example.sandbox.inheritance;

public class Crow extends Bird {

    public Crow() {
        count++;
    }

    public void fly() {
        System.out.println("I am a crow and I am flying");
    }

    public void count() {
        System.out.println("There are " + count + " birds");
    }

    @Override
    public void tweet() {
        System.out.println("This Crow is tweeting");
    }
}
