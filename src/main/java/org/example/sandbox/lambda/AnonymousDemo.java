package org.example.sandbox.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnonymousDemo {

    public static void main(String[] args) {


        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> myList2 = new ArrayList<>(){

            @Override
            public String toString() {
                return "My List 2";
            }

        };
        myList2.add("a1");
        myList2.add("a2");
        myList2.add("b1");
        myList2.add("c2");
        myList2.add("c1");

        System.out.println(myList);
        System.out.println(myList2);


    }
}
