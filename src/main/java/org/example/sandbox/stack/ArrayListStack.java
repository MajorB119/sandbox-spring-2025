package org.example.sandbox.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T>{

    private List<T> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public T peek() {
        int index = stack.size() - 1;
        return stack.get(index);
    }

    @Override
    public T pop() {
        int index = stack.size() - 1;
        return stack.remove(index);
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public int search(T t) {
        int indexOfElement = stack.lastIndexOf(t);
        if (indexOfElement == -1) {
            return -1;
        }
        int topOfStack = stack.size() - 1;
        return topOfStack - indexOfElement;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stack ");
        sb.append(stack);
        return sb.toString();
    }
}
