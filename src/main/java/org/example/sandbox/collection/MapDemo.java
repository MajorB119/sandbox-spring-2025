package org.example.sandbox.collection;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Map<Integer, List<String>> map2 = new HashMap<>();
        Map<Integer, String> map3 = new LinkedHashMap<>();
        Map<Integer, String> map4 = new TreeMap<>();

        map.put(1, "One");
        map.put(1, "Fifteen");
        map.put(2, Integer.toString(2));
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "One");

        System.out.println("map: " + map);

        System.out.println("map.get(1): " + map.get(1));
        System.out.println("map.get(5): " + map.get(5));
    }
}
