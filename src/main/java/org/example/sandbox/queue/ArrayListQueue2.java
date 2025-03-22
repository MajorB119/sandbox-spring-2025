package org.example.sandbox.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue2<E> implements Queue2<E> {

    private final List<E> queue;

    public ArrayListQueue2() {
        queue = new ArrayList<>();
    }

    @Override
    public boolean add(E e) throws FailedOperationException {

        if(e == null) {
            throw new FailedOperationException("Input is null");
        }

        boolean success = this.queue.add(e);

        if(!success) {
            throw new FailedOperationException("Failed to add");
        }

        return success;
    }

    @Override
    public E remove() throws FailedOperationException {

        E element = null;
        try {
            element = this.queue.remove(0);
            if(element == null) {
                throw new FailedOperationException("Failed to remove");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new FailedOperationException("List is empty");
        }

        return element;
    }

    @Override
    public E element() throws FailedOperationException {

        E element = null;
        try {
            element = this.queue.get(0);
            if(element == null) {
                throw new FailedOperationException("Failed to remove");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new FailedOperationException("List is empty");
        }

        return element;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(queue);
        return sb.toString();
    }
}
