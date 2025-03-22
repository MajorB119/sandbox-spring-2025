package org.example.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

public class Crate<T extends Box<? extends Number>> {

    private List<T> contents;

    public Crate() {
        contents = new ArrayList<>();
    }

    public void addBox(T box) {
        this.contents.add(box);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Crate ");
        sb.append(contents);
        return sb.toString();
    }
}
