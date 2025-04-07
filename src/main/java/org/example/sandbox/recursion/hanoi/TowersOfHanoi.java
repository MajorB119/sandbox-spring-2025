package org.example.sandbox.recursion.hanoi;

import java.math.BigInteger;

public class TowersOfHanoi {

    public static BigInteger counter = BigInteger.ZERO;

    public static void solve(int n, char source, char auxiliary, char destination) {

        // base case
        if (n <= 1) {
            //System.out.println("Move disk 1 from " + source + " to " + destination + " *");
            counter = counter.add(BigInteger.ONE);
            return;
        }

        // Move n-1 disks from source to auxiliary using destination as temporary
        solve(n - 1, source, destination, auxiliary);

        //System.out.println("Move disk " + n + " from " + source + " to " + destination);
        counter = counter.add(BigInteger.ONE);

        // Move the n-1 disks from auxiliary to destination using source as temporary
        solve(n - 1, auxiliary, source, destination);
    }
}
