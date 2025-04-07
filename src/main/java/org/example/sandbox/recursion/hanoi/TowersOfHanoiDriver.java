package org.example.sandbox.recursion.hanoi;

import java.math.BigInteger;

public class TowersOfHanoiDriver {

    public static void main(String[] args) {


        for (int n = 3; n <= 32; n++) {
            TowersOfHanoi.counter = BigInteger.ZERO;
            System.out.println("Steps to solve the Tower of Hanoi with " + n + " disks:");
            TowersOfHanoi.solve(n, 'A', 'B', 'C');
            System.out.println("Total number of moves: " + TowersOfHanoi.counter.toString());
            System.out.println();
        }
    }
}
