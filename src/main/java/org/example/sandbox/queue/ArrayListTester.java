package org.example.sandbox.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTester {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list);

    }
}
