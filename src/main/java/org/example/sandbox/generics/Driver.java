package org.example.sandbox.generics;

public class Driver {

    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>(42);
        Box<Double> box2 = new Box<>(42d);
        Box<Character> box3 = new Box<>('k');
        Box<String> box4 = new Box<>("forty-two");
        Box<Integer> box5 = new Box<>(32);
        Box<Integer> box6 = new Box<>(22);

        Crate<Box<? extends Number>> crate = new Crate<>();

        crate.addBox(box1);
        crate.addBox(box2);
        //crate.addBox(box3);
        //crate.addBox(box4);
        crate.addBox(box5);
        crate.addBox(box6);

        System.out.println(crate);

    }
}
