package org.example.sandbox.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<E> implements Queue<E> {

    private List<E> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }


    @Override
    public boolean offer(E e) {
        if(e == null) {
            throw new NullPointerException("Cannot add null element");
        }
        return queue.add(e);
    }

    @Override
    public E poll() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    @Override
    public E peek() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayListQueue ");
        sb.append(queue);
        return sb.toString();
    }
}
