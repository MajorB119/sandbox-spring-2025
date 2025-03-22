package org.example.sandbox.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");
        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");

        System.out.println(linkedList);

        linkedList.pollFirst();

        System.out.println(linkedList);

        System.out.println(linkedList.contains("fifth"));
        System.out.println(linkedList.contains("fourth"));

        System.out.println("Size: " + linkedList.size());
        linkedList.clear();
        System.out.println("Size: " + linkedList.size());

        System.out.println(linkedList.contains("fifth"));
        System.out.println(linkedList.contains("fourth"));

    }
}
