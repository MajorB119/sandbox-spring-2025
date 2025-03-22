package org.example.sandbox.linkedlist;


import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(E element) {

        Node node = new Node(element, head); // 1,2

        if(head == null) { // 3
            head = node;
            tail = node;
        } else {
            head = node;
        }

        size++;

    }

    @Override
    public void addLast(E element) {

        Node node = new Node(element, null); // 1,2

        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node; // 3
            tail = node; // 4
        }

        size++;
    }

    @Override
    public E pollFirst() {

        E element;

        if (head == null) {
            element = null; // 1
        } else {

            element = head.element;  // 1

            if (head == tail) { // 4
                head = null;
                tail = null;
            } else {
                Node next = head.next; // 2
                head.next = null; // 3
                head = next; // 4
            }
        size--;
        }

        return element;
    }

    @Override
    public E pollLast() {

        E element;
        if (tail == null) {
            element = null;
        } else {
             element = tail.element; // 1

            if (head == tail) { // 3
                head = null;
                tail = null;
            } else {
                Node current = head;
                Node previous = head;
                while (current.next != null) {
                    previous = current; // 2
                    current = current.next; // 2
                }
                tail = previous; // 3
                tail.next = null; // 4
            }
            size--;
        }

        return element;
    }

    @Override
    public E peekFirst() {
        E element;
        if (head == null) {
            element = null;
        } else {
            element = head.element;
        }
        return element;
    }

    @Override
    public E peekLast() {
        E element;
        if (tail == null) {
            element = null;
        } else {
            element = tail.element;
        }
        return element;
    }

    @Override
    public void clear() {

        Node current = head;
        while (current.next != null) {
            Node next = current.next;
            current.next = null; // break links
            current = next;
        }

        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(E element) {

        boolean contains = false;

        Node current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                contains = true;
                break;
            }
            current = current.next;
        }

        return contains;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");

        Node current = head;
        if (current != null) {

            while (current != null) {
                joiner.add(current.element.toString());
                current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }


    private class Node {

        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
