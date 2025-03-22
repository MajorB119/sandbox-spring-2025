package org.example.sandbox.queue;

public interface Queue2<E> {

    boolean add(E e) throws FailedOperationException;
    E remove() throws FailedOperationException;
    E element() throws FailedOperationException;
    boolean isEmpty();
}
